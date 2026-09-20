import java.util.Scanner;
public class Cores {
    public static void main (String [] args){
        String[] cores = new String[11];
        Scanner entrada = new Scanner(System.in);
        for (int k=0; k< 11; k++){
            System.out.println("Escolha uma cor entre azul e rosa: ");
            String corEscolhida = entrada .nextLine();
            cores[k] = corEscolhida;
        }
        int corRosa = 0;
        int corAzul = 0;
  for(int k=0;k < cores.length; k++){
      if (cores[k].equals("azul")) {
          corAzul += 1;
      }else {
          corRosa += 1;
      }
        }
    if(corRosa >corAzul){
     System.out.println("A cor que mais aparece é Rosa!");
    }else{
        System.out.println("A cor que mais aparece é Azul!");
    }
        entrada.close();
    }

}
