package org.example;

public abstract class Hincha {
    private String nombre = "Hincha Popular";
    private String cedula;
    private String celular;
    private String correo;
    private String direccion;
    private final Double IVA = 0.19;



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getIVA() {
        return IVA;
    }

    public abstract Double calcularValorNeto(Integer cantidad);
    public abstract Double calcularDescuentoTribuna();

    public Double obtenerDescuentoFecha(String dia) {
        if (dia == "Martes") {
            return 0.05;
        } else if (dia == "Miercoles") {
            return 0.02;
        } else if (dia == "Jueves") {
            return 0.015;
        } else if (dia == "Viernes"){
            return 0.01;
        }else{
            System.out.println("Este día no tiene descuento");
        }return 0.0;
    }


}
