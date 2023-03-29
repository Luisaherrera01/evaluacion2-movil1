package org.example;

public class Popular extends Hincha{

    private Double valorDescuento = 0.35;
    private Double costoBoleta = 40000D;
    private Double valorNeto;
    private Double valorDescuentoTribuna;
    private Double valorDescuentoFecha;
    private Double valorIVA;


    @Override
    public Double calcularValorNeto(Integer cantidad) {
        if (cantidad > 1) {
            System.out.println(this.getNombre() +" sólo puede comprar 1 boleta");
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
