package CursoJava;

import java.util.ArrayList;

public class ContaBancaria {
    private long numero;
    private String titular;
    private double saldo;

    //Construtores
    public ContaBancaria (long numero, String titular, double saldoInicial){
    this.numero = numero;
    this.titular = titular;
    this.saldo = saldoInicial;
    }

    //getters
    public Long getNumero(){
        return numero;
    }

    public String getTitular(){
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }

    //metodos
    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
        }
    }

    public boolean sacar(double valor){
        if (valor <= saldo && valor > 0){
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void exibirDados() {
        System.out.println("Conta n: " + numero);
        System.out.println("Titular: " + titular);
        System.out.printf("Saldo: R$ %.2f%n", saldo);
    }


    }

