package org.example;

public class NoAbonado extends Hincha{

    private Double costoBoletaPopular = 40000D;
    private Double getCostoBoletaOriental = 80000D;
    private Double getCostoBoletaOccidental = 150000D;
    private Double valorNeto;
    private Double valorDescuentoFecha;
    private Double valorIVA;

    Integer compraBoleta; //Popular = 2 / Oriental=2 / Occidental = 3


    public Double comprarBoletosNoAbonado(){
        
    }

    @Override
    public Double calcularValorNeto(Integer cantidad) {
        if (cantidad > 5) {
            System.out.println(this.getNombre() +" sólo puede comprar 5 boleta");
        } else {
            this.valorNeto = this.costoBoleta * cantidad;
        }return valorNeto;
    }

    @Override
    public Double calcularDescuentoTribuna() {
        this.valorDescuentoTribuna = this.valorNeto - (this.valorNeto * this.valorDescuento);
        return valorDescuentoTribuna;
    }

    public Double calcularDescuentoFecha(){
        this.valorDescuentoFecha = this.valorNeto - (this.valorNeto * this.obtenerDescuentoFecha("Martes"));
        return valorDescuentoFecha;
    }

    public Double calcularIVA(){
        this.valorIVA = this.valorNeto + (this.valorNeto * this.getIVA());
        return valorIVA;
    }

    public Double calcularValorTotal(){
        Double total = this.valorNeto - this.valorDescuentoTribuna - this.valorDescuentoFecha + this.valorIVA;
        return total;
    }



}
