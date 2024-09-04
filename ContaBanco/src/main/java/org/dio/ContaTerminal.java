package org.dio;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        Integer agencia = terminal.nextInt();

        System.out.println("Por favor, digite o número da Conta !");
        Integer numero = terminal.nextInt();

        System.out.println("Por favor, digite seu Nome !");
        String nome = terminal.next();

        System.out.println("Por favor, digite seu Saldo !");
        Integer saldo = terminal.nextInt();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");
    }
}