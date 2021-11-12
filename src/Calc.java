import java.util.Scanner;

public class Calc {

    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var n1 = new Numero();
        Numero n2 = new Numero();
        Numero res = new Numero();
        String opc = "S";

        while (opc.equals("s") || opc.equals("S")) {
            System.out.printf("%nDigite o Valor 1: ");
            n1.setValor(scanner.nextInt());
            System.out.printf("%nDigite o valor 2: ");
            n2.setValor(scanner.nextInt());
            res.setValor(n1.getValor() + n2.getValor());
            System.out.printf("%nA soma de %d com %d e igual a %d", n1.getValor(), n2.getValor(), res.getValor());
            System.out.printf("%nDeseja somar outro valor? Tecle s para sim, ou qualquer outra tecla para fechar ");
            opc = scanner.next();
            System.out.printf("%n%n%n");

        }
    }
}