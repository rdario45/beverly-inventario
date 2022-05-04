package domain;

import acl.types.BeverlyAttrib;

public class Item {

    @BeverlyAttrib(type = "S")
    private String id;

    @BeverlyAttrib(type = "N")
    private String fecha;

    @BeverlyAttrib(type = "L")
    private String descripcion;

    @BeverlyAttrib(type = "N")
    private String cantidad;

    @BeverlyAttrib(type = "N")
    private String valor;

    public Item(String id, String fecha, String descripcion, String cantidad, String valor) {
        this.id = id;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.valor = valor;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
