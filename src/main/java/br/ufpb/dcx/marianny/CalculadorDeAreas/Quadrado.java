package br.ufpb.dcx.marianny.CalculadorDeAreas;

public class Quadrado implements Figura {
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea() {

        return this.lado*this.lado;
    }
    public double gatLado(){
        return this.lado;

    }
    public void setBase(double novoLado){
        this.lado= novoLado;
    }
    public String toString(){
        return "Quadrado com lados de "+ this.lado+ "e área de "
                + this.calcularArea();
    }


    public void setLado(double novoLado ) {
        this.lado = novoLado;
    }

    public double getLado() {
        return this.lado;
    }
}
