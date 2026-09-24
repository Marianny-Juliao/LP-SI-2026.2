import java.util.Scanner;
public class SistemaDeNotas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("CALCULANDO NOTAS DA TURMA");
        System.out.println("Quantos alunos há na turma?");
        int numAlunos = Integer.parseInt(leitor.nextLine());
        String[] listaNomes = new String[numAlunos];
        double[] listaNotas = new double[numAlunos];
        for (int k = 0; k < numAlunos; k++) {
            System.out.println("Qual o nome do aluno [" + (k + 1) + "]");
            listaNomes[k] = leitor.nextLine();
            System.out.println("Qual a nota do aluno [" + (k + 1) + "]");
            listaNotas[k] = Double.parseDouble(leitor.nextLine());
        }
        double maiorNota = listaNotas[0];
        String maiorNome = "";
        for(int k = 0; k<listaNotas.length;k++ ){
            if(listaNotas[k]>=maiorNota){
                maiorNota = listaNotas[k];
                maiorNome = listaNomes[k];

            }

        }
        int alunosComNotasBaixas = 0;
        for(int  k =0; k < listaNotas.length;k++ ){
            if(listaNotas[k] < 7.0){
                alunosComNotasBaixas ++;

            }


        }

        System.out.printf("A maior nota é: %.2f de %s\n ", maiorNota, maiorNome);
        System.out.printf("Quantidade de notas baixas é: %d\n", alunosComNotasBaixas);
        System.out.println("Fim do programa! Até a próxima!");
        leitor.close();
    }


}
