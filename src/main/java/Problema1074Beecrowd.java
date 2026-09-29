import java.util.Scanner;
public class Problema1074Beecrowd {
    public static void main(String [] args) {
        Scanner entrada = new Scanner(System.in);
        int N = Integer.parseInt(entrada.nextLine());
        for (int k = 0; k > N; k++) {
            int numero = Integer.parseInt(entrada.nextLine());
            if (numero == 0) {
                System.out.println("NULL");
            }
            else if(numero>0){
                if (numero%2==0){
                    System.out.println("EVEN POSITIVE");
                }else{
                    System.out.println("ODD POSITIVE");
                }
            }else{
                if(numero%2==0){
                    System.out.println("EVEN NEGATIVE");
                }else{
                    System.out.println("ODD NEGATIVE");
                }
            }

        }
        entrada.close();
    }
}