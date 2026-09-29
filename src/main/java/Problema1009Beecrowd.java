import java.util.Scanner;
public class Problema1009Beecrowd {
    public static void main(String []args){
        Scanner entrada = new Scanner (System.in);
        String nomeFuncionario = entrada.nextLine();
        double salario = Double.parseDouble(entrada.nextLine());
        double totalDeVendas = Double.parseDouble(entrada.nextLine());
        double totalParaReceber = salario + (totalDeVendas * 0.15);
        System.out.printf("TOTAL = R$ %.2f\n",totalParaReceber);

        entrada.close();
    }
}