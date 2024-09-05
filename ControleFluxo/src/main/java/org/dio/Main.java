package org.dio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        Integer parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        Integer parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        }catch(ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    public static class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException(String msg){
            super(msg);
        };
    }

    static void contar(Integer parametroUm, Integer parametroDois) throws ParametrosInvalidosException{

        if (parametroUm > parametroDois)
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");

        Integer contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}