package com.company;

import java.util.List;
// primeros Pasos en Java , simulando app de registro de un Hotel
public class Main {

    public static void main(String[] args) {
	// primer uso de objetos en java
Huesped huesped1 = new Huesped();
        huesped1.id_huesp="h101";
        huesped1.nombre_huesp="Jose Eduardo Carrasco";
huesped1.nacionalidad="Ruso";
huesped1.fecha_nacimiento_huesp="12/feb/1968";
huesped1.habitacion=304;

Habitacion habit = new Habitacion();

        System.out.println( "Hotel Las 3 Martinas");
        System.out.println( "Sistema de registro de Huespedes");
        System.out.println( "Identificacion del huesped : "+ huesped1.id_huesp);
        System.out.println( "Nombre : "+ huesped1.nombre_huesp);
        System.out.println( "Nacionalidad : "+ huesped1.nacionalidad);
        System.out.println( "Fecha de nacimiento : "+ huesped1.fecha_nacimiento_huesp);
        System.out.println( "Hospedado en la habitacion : "+ huesped1.habitacion);
        System.out.println( " +++++++++FINAL DEL REGISTRO+++++++ ");

    }
}
 class Huesped {
String nombre_huesp;
String id_huesp;
String nacionalidad;
String fecha_nacimiento_huesp;// formato de fecha 12/mar/2021
 Integer habitacion;// formato: 103, piso/numero de habitacion
                  }

  class Habitacion{
      List habitacion;// formato: 103, piso/numero de habitacion
      boolean servicios_adicionales;
      boolean reservacion;// valores aun no decididos
      Integer cantidad_de_huespedes;
      String forma_de_reservacion;
      Float pago_total;
      Float descuento;


  }

  class Empleados{
    String id_empleado;
    String cargo;
    String nombre_emple;
    Integer Edad;
    Float salario;
  }