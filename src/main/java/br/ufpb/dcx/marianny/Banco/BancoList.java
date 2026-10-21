package br.ufpb.dcx.marianny.Banco;

import java.util.ArrayList;

public class BancoList {
    private String nome;
    private String cnpj;
    private ArrayList<Conta> contas;

    public BancoList(String nome, String cnpj, ArrayList<Conta> contas) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.contas = contas;
    }

    public String toString() {
        return "Banco " + this.nome + " de CNPJ " + this.cnpj + " e que tem " + this.contas.size() + " contas";
    }

    public void transferir(String numContaO, String numAgenciaO, String numContaD, String numAgenciaD, double valor) {

    }

    public void abrirConta(String cpfTitular, String numConta, String numAgencia, double saldoInicial) {

       Conta novaConta = new Conta (cpfTitular,numConta,numAgencia,saldoInicial);
       this.contas.add(novaConta);

    }

    public ArrayList<Conta> pesquisarContasComSaldoNegativo() {
       ArrayList<Conta> contasNegativas = new ArrayList<>();
       for(Conta c: this.contas){
           if (c.getSaldo()<0){
               contasNegativas.add(c);
           }
       }
        return contasNegativas;
    }

    public double consultarSaldoDeConta(String numConta, String numAgencia) {
        double saldo = 0;
        for (Conta c : this.contas) {
            if (c.getNumeroConta().equals(numConta) && c.getNumeroAgencia().equals(numAgencia)) {
                saldo = c.getSaldo();
            }
        }
        return saldo;
    }

    public double sacarDeConta(String numConta, String numAgencia, double valor) {
        for (Conta c : this.contas) {
            if (numConta.equals(c.getNumeroConta()) && numAgencia.equals(c.getNumeroAgencia())) {
                if (c.getSaldo() >= valor) {
                    double novoSaldo = c.debitar(valor);
                    return novoSaldo;
                }else{
                    return c.getSaldo();
                }


            }
        }
        return 0.0;
    }

    public double depositarEmConta(String numConta, String numAgencia, double valor) {
        for (Conta c : this.contas) {
            if (numConta.equals(c.getNumeroConta()) && numAgencia.equals(c.getNumeroAgencia())) {
                    double novoSaldo = c.creditar(valor);
                    return novoSaldo;



            }


        }
        return 0.0;
    }

    public ArrayList<Conta> pesquisarContasDoCliente(String cpf) {
        ArrayList<Conta>contasDoCliente = new ArrayList<>();
        for(Conta c: this.contas){
            if (c.getCpfTitular().equals(cpf)){
                contasDoCliente.add(c);

            }

        }

        return contasDoCliente;
    }
}
