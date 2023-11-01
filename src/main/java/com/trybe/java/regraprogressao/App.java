package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Digite a quantidade de atividades para cadastrar:");
    int quantityActivities = Integer.parseInt(input.nextLine());

    String[] names = new String[quantityActivities];
    int[] weights = new int[quantityActivities];
    int[] grades = new int[quantityActivities];

    for (int i = 0; i < quantityActivities; i++) {
      System.out.println("Digite o nome da atividade " + (i + 1) + ":");
      names[i] = input.nextLine();

      System.out.println("Digite o peso da atividade " + (i + 1) + ":");
      weights[i] = Integer.parseInt(input.nextLine());

      System.out.println("Digite a nota obtida para " + names[i] + ":");
      grades[i] = Integer.parseInt(input.nextLine());
    }

    input.close();
  }
}