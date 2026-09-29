import java.util.Scanner;
public class Problema1001Beecrowd {
    public static void main (String []args){
        Scanner entrada = new Scanner (System.in);
        int A = Integer.parseInt(entrada.nextLine());
        int B = Integer.parseInt(entrada.nextLine());
        int x = A+B;
        System.out.printf("X = %d\n",x);
        entrada.close();


    }
}