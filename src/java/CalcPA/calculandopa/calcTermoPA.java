package CalcPA.calculandopa;

import javax.swing.JOptionPane;

/**
 *
 * @author alex Terça-Feira, 19 de Junho de 2018, 00:22
 * 
 * GUANABARA E O REI 
 */

public class calcTermoPA {

    public static void main(String[] args) {

        int a1 = Integer.parseInt(JOptionPane.showInputDialog("Informe 1º Razao da P.A:"));
        int a2 = Integer.parseInt(JOptionPane.showInputDialog("Informe 2º Razao da P.A:"));
        int a3 = Integer.parseInt(JOptionPane.showInputDialog("Informe 3º Razao da P.A:"));

        int r = a2 - a1;
        JOptionPane.showMessageDialog(null, "A Razao é :  " + r);

        int n = Integer.parseInt(JOptionPane.showInputDialog("Informa a posiçao do termo:\nEx: Centesimo Termo da P.A = 100."));

        int aN = a1 + (n - 1) * r;

        JOptionPane.showMessageDialog(
                null, "O valor do " + n + "º Termo é :  " + aN);

        JOptionPane.showMessageDialog(
                null, "1º Razao da P.A: " + a1
                + "\n2º Razao da P.A: " + a2
                + "\n3º Razao da P.A: " + a3
                + "\nValor da Razao: " + r
                + "\nPosiçao do Termo: " + n
                + "\nO valor do " + n + "º Termo é : " + aN);
    }
}
