package repository;

import acl.BeverlyDynamoDB;
import domain.Compra;

public class InventarioRepository {

    public Compra save(Compra compra) {
        return BeverlyDynamoDB.putItem("compras", compra);
    }
}
