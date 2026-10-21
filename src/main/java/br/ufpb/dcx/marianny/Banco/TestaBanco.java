package br.ufpb.dcx.marianny.Banco;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaBanco {
    public static void main(String [] args) {
        BancoList meuBanco = new BancoList("Ayla's Bank","123/321",new  ArrayList<Conta>());
        meuBanco.abrirConta("111.111.111-11", "222-2", "333-3",100);
        System.out.println(meuBanco.consultarSaldoDeConta("222-2", "333-3"));
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o cpf do titular da nova conta ?");
        String cpf = entrada.nextLine();
        System.out.println("Qual o número da conta (ex: xxx-x) ?");
        String numConta = entrada.nextLine();
        System.out.println("Qual o número da agencia (ex: xxx-x) ?");
        String numAgencia = entrada.nextLine();
        System.out.println("Qual o valor inicial da cont (ex: xxx-x) ?");
        Double saldo = Double.parseDouble(entrada.nextLine());






    }


}
