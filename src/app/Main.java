package app;

import model.Direccion;
import model.Empleado;
import model.Persona;

public class Main {
    public static void main(String[] args) {

        //Se crean las 3 instancias de objetos solicitadas
        //--------------------------------------------------

        //Objetos Composición
        Direccion dir1 = new Direccion("Esmeralda 477", "Tocopilla");
        Direccion dir2 = new Direccion("Esperanza 2350", "La Ligua");
        Direccion dir3 = new Direccion("La Turbina 548", "Chimbarongo");


        //Tres instancias de objetos

        Persona cliente = new Persona("17939599-1", "Alexis Sanchez", dir1);
        Empleado guia = new Empleado("12345678-9", "JRoberto Astudillo", dir2, "Guía Kayaks");
        Empleado vendedor = new Empleado("24150000-3", "Esteban Garza", dir3, "Vendedor Telefónico");


        //Mostrar resultados por consola usando toString() [5, 8]
        System.out.println("---| DATOS DEL SISTEMA LLANQUIHUE TOUR | ---");
        System.out.println(cliente.toString());
        System.out.println(guia.toString());
        System.out.println(vendedor.toString());

    }
}
