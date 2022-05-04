package domain;

import acl.types.BeverlyAttrib;

import java.util.List;

public class Compra {

    @BeverlyAttrib(type = "S")
    private String id;

    @BeverlyAttrib(type = "N")
    private String fecha;

    @BeverlyAttrib(type = "L")
    private List<Item> items;

    public Compra(String id, String fecha, List<Item> items) {
        this.id = id;
        this.fecha = fecha;
        this.items = items;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
