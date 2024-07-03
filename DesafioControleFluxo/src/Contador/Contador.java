package Contador;
import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();

            Contador contador = new Contador(); 

            try {
                contador.contar(parametroUm, parametroDois);
            } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro parâmetro.");
            }
        }
    }

    public static class ParametrosInvalidosException extends Exception { }

    void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        for (int controle = 1; controle <=contagem; controle++) {
            System.out.println("Imprimindo o número " + controle);
        }
    }
}

