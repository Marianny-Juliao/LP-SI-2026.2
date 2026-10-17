package br.ufpb.dcx.marianny.TestaPessoa;
import java.util.ArrayList;
import java.util.Scanner;
public class ProgramaTestaPessoa {
    public static void main(String [] args){
       Scanner entrada = new Scanner(System.in);
       ArrayList<Pessoa> pessoas = new ArrayList<>();
     int cont = 0;
     while (cont < 5){
        System.out.println("Digite o nome da pessoa:");
        String nome = entrada.nextLine();
         System.out.println("Digite a idade:");
         int idade = Integer.parseInt(entrada.nextLine());
         Pessoa pessoa = new Pessoa(nome,idade);
         pessoas.add(pessoa);
         cont ++;
     }
        for (Pessoa p : pessoas) {
            if (p.ehDeMaior()){
                System.out.println(p.getNome() +" é de maior.");

            }else{
                System.out.println(p.getNome() +" é de menor.");
            }

        }









       entrada.close();

    }
}
