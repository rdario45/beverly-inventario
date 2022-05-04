package mapper;

import acl.BeverlyDynamoMapper;
import domain.Compra;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CompraMapper implements BeverlyDynamoMapper<Compra> {

    public Compra map(Map<String, AttributeValue> map) {
        return new Compra(
                Optional.ofNullable(map.get("id")).map(AttributeValue::s).get(),
                Optional.ofNullable(map.get("fecha")).map(AttributeValue::n).get(),
                Optional.ofNullable(map.get("items")).map(AttributeValue::l)
                        .map(attributeValues -> new ItemMapper().map(attributeValues))
                        .orElse(Collections.emptyList())
        );
    }

    @Override
    public List<Compra> map(List<AttributeValue> list) {
        return list.stream().map(AttributeValue::m).map(this::map).collect(Collectors.toList());
    }
}
