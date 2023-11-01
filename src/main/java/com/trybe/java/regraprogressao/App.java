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

    int sumWeights = 0;
    int sumGrades = 0;

    for (int i = 0; i < quantityActivities; i++) {
      System.out.println("Digite o nome da atividade " + (i + 1) + ":");
      names[i] = input.nextLine();

      System.out.println("Digite o peso da atividade " + (i + 1) + ":");
      weights[i] = Integer.parseInt(input.nextLine());
      sumWeights += weights[i];

      System.out.println("Digite a nota obtida para " + names[i] + ":");
      grades[i] = Integer.parseInt(input.nextLine());
      sumGrades += weights[i] * grades[i];
    }

    if (sumWeights != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
    }

    double approvalPercentage = (double) sumGrades / sumWeights;

    if (approvalPercentage >= 85.0) {
      System.out.println("Parabéns! Você alcançou " + approvalPercentage
          + "%! E temos o prazer de informar que você obteve aprovação!");
    } else {
      System.out.println("Lamentamos informar que, com base na sua pontuação"
          + "alcançada neste período, " + approvalPercentage
          + "%, você não atingiu a pontuação mínima necessária para sua aprovação.");
    }

    input.close();
  }
}