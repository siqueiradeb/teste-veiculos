package com.teste;

public class Veiculos {

    public static void main(String[] args) {
        double distanciaTotal = 125.0;
        double velocidadeCarro = 90.0;
        double velocidadeCaminhao = 80.0;
        int numeroPedagios = 3;
        double tempoAdicionalCarro = (5.0 / 60.0) * numeroPedagios;

        double tempoEncontro = distanciaTotal / (velocidadeCarro + velocidadeCaminhao);
        double distanciaCarro = tempoEncontro * velocidadeCarro;
        double distanciaCaminhao = tempoEncontro * velocidadeCaminhao;
        double distanciaCarroComPedagios = distanciaCarro - (velocidadeCarro * tempoAdicionalCarro);

        System.out.printf("Distância percorrida pelo carro considerando pedágios: %.2f km%n", distanciaCarroComPedagios);
        System.out.printf("Distância percorrida pelo caminhão: %.2f km%n", distanciaCaminhao);

        if (distanciaCarroComPedagios < (distanciaTotal - distanciaCaminhao)) {
            System.out.println("O carro está mais próximo de Ribeirão Preto.");
        } else {
            System.out.println("O caminhão está mais próximo de Ribeirão Preto.");
        }
    }
}
