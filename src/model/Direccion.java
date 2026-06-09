package model;

public class Direccion {
    private String calle;
    private String ciudad;

    //Constructor vacio
    public Direccion() {
    }

    //Constructor ambos atributos
    public Direccion(String calle, String ciudad) {
        this.calle = calle;
        this.ciudad = ciudad;
    }

    //Getters y Setters

    //Calle
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    //Ciudad
    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    //ToString (Se escogió este formato para que no se repitiera en consola "direccion:direccion")
    @Override
    public String toString() {
        return " " + calle + ", " + ciudad;
    }
}
