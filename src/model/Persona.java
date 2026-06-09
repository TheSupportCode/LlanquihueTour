package model;

public class Persona {
    private String rut;
    private String nombre;
    private Direccion direccion;

    //Constructores

    //Vacio
    public Persona() {
    }

    //Todos los parametros
    public Persona(String rut, String nombre, Direccion direccion) {
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    //Getters y Setters

    //Rut
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    //Nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Direccion
    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    //ToString

    @Override
    public String toString() {
        return "Persona{" +
                "rut='" + rut + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion=" + direccion +
                '}';
    }
}
