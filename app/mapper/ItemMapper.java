package mapper;

import acl.BeverlyDynamoMapper;
import domain.Compra;
import domain.Item;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ItemMapper implements BeverlyDynamoMapper<Item> {

    public Item map(Map<String, AttributeValue> map) {
        return new Item(
                Optional.ofNullable(map.get("id")).map(AttributeValue::s).get(),
                Optional.ofNullable(map.get("fecha")).map(AttributeValue::n).get(),
                Optional.ofNullable(map.get("descripcion")).map(AttributeValue::s).get(),
                Optional.ofNullable(map.get("cantidad")).map(AttributeValue::s).get(),
                Optional.ofNullable(map.get("valor")).map(AttributeValue::n).get()
                );
    }

    @Override
    public List<Item> map(List<AttributeValue> list) {
        return list.stream().map(AttributeValue::m).map(this::map).collect(Collectors.toList());
    }
}
