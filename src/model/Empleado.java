package model;

public class Empleado extends Persona {
    private String cargo;

    //Constructor

    public Empleado(String rut, String nombre, Direccion direccion, String cargo) {
        super(rut, nombre, direccion);
        this.cargo = cargo;
    }


    //Getter y Setter

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    //ToString

    @Override
    public String toString() {
        return super.toString() + " || Cargo: " + cargo;
    }
}
