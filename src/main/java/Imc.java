import javax.swing.JOptionPane;

public class Imc {
    public static void main(String[] args) {
        String meuPeso = JOptionPane.showInputDialog("Digite o seu peso:");
        double peso = Double.parseDouble(meuPeso);
        String minhaAltura = JOptionPane.showInputDialog("Digite a sua altura:");
        double altura = Double.parseDouble(minhaAltura);
        double imc = peso/(altura*altura);
        JOptionPane.showMessageDialog(null, "Seu IMC é: " + imc);
    }
}
