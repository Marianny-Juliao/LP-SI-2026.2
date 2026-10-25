package br.ufpb.dcx.marianny.CalculadorDeAreas;

public class Triangulo implements Figura{
    private double base;
    private double altura;

    public Triangulo(double base, double altura ){
        this.base = base;
        this.altura = altura;

    }
    public double getBase(){
        return this.base;
    }

    public double getAltura(){
        return this.altura;
    }

    public void setBase(double novaBase){
        this.base= novaBase;
    }

    public void setAltura(double novaAltura){
        this.altura= novaAltura;
    }


    @Override
    public double calcularArea() {

        return (base*altura)/2;
    }

    public String toString(){
        return "Triângulo com altura "+ this.altura+" e base "+ this.base+ ", com área de "+ this.calcularArea();

    }
}
