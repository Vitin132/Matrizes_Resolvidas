/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrizes_Resoluções;

/**
 *
 * @author Vitor
 */
public class SubtraçãoDeMatrizes {

    public static void main(String[] args) {

        int[][] matrizA = { // Declara e inicializa a matriz A 3x3
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int[][] matrizB = { // Declara e inicializa a matriz B 3x3
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] subtracao = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                subtracao[i][j] = matrizA[i][j] - matrizB[i][j];
            }
        }
        System.out.println("Matriz Subtração:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(subtracao[i][j] + " ");
            }
            System.out.println();
        }

    }
}
