import java.util.Scanner;
public class Problema1134Beecrowd {
    public static void main (String []args){
        Scanner entrada = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (true){
            int codigo = Integer.parseInt(entrada.nextLine());
            if (codigo == 1){
                alcool++;
            }else if (codigo ==2){
                gasolina++;

            }else if(codigo==3){
                diesel++;
            }else if(codigo==4){
                break;
            }

        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        entrada.close();


    }
}
