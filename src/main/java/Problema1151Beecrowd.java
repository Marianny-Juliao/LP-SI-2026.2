import java.util.Scanner;
public class Problema1151Beecrowd {
    public static void main(String []args){
        Scanner entrada= new Scanner (System.in);
        int ultimo= 1;
        int penultimo = 0;
        int n = Integer.parseInt(entrada.nextLine());
        if (n == 1){
            System.out.print("0");

        }else if (n>=2){
            System.out.print("0 1");
        }
        for(int k= 0; k<n-2; k++){
            int i = ultimo;
            ultimo = penultimo + ultimo;
            penultimo = i;
            System.out.print(" " + ultimo);
        }
        System.out.println();



        entrada.close();
    }
}

