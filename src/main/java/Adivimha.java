import java.util.Scanner;
public class Adivimha {
    public static int sorteiaNumeroInteiro(int maximo) {
        int x = (int) (Math.random() * (maximo + 1)); //gera número inteiro aleatório entre [0-maximo]
        return x;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int maxNum = 10;
        int pontos = 100;
        int y = sorteiaNumeroInteiro(maxNum);
        boolean acertou = false;
        int tentativas = 0;
        while (!acertou) {
            System.out.println("Tente adivinhar y [0-100]:");
            int numLido = Integer.parseInt(leitor.nextLine());
            tentativas++;
            if (numLido == y) {
                System.out.println("Parabéns! Você acertou. Número de tentativas:" + tentativas);
                acertou = true;
            } else if (numLido != y) {
                pontos = pontos - 2;
                if (y > numLido) {
                    System.out.println("O número é um pouco maior do que este, tente novamente!");
                } else {
                    System.out.println("O número é um pouco menor do que este, tente novamente!");
                }
            }

            }
            System.out.printf("Seus pontos finais são: %d\n", pontos);
            System.out.println("Até a próxima");
            leitor.close();
        }

    }

