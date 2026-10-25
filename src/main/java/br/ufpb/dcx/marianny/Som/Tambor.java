package br.ufpb.dcx.marianny.Som;

public class Tambor implements EmissorDeSom {

   private String tamanho;
   private String marca;

   public Tambor(String tamanho, String marca){
       this.tamanho = tamanho;
       this.marca = marca;

   }

   public String getMarca(){
      return this.marca;
   }
    public String getTamanho(){
        return this.tamanho;
    }

    @Override
    public String emitirSom() {
        return "TUM TUM TUM";
    }


    public String toString(){
        return "Tambor da marca "+ this.marca+
                " com tamanho "+ this.tamanho;
    }


}
