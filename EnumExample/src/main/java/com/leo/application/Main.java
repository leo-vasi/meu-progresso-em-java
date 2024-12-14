package com.leo.application;

import entities.SandwichSize;

public class Main {
    public static void main(String[] args) {
        SandwichSize myOrder = SandwichSize.LARGE;
        System.out.println("Tamanho do lanche: " + myOrder);
        System.out.println("Preço do lanche: R$" + myOrder.getPrice());
        switch (myOrder) {
            case SMALL:
                System.out.println("Você escolheu um lanche pequeno.");
                break;
            case MEDIUM:
                System.out.println("Você escolheu um lanche médio.");
                break;
            case LARGE:
                System.out.println("Você escolheu um lanche grande.");
                break;
        }
    }
}


