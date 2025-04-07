/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrizes_Resoluções;

/**
 *
 * @author Vitor
 */
public class ProdutoDeMatrizes2x2 {

    public static void main(String[] args) {

        int[][] matrizA = { // Declara e inicializa a matriz A 2x2
            {1, 2},
            {3, 4}
        };

        int[][] matrizB = { // Declara e inicializa a matriz B 2x2
            {5, 6},
            {7, 8}
        };
        int[][] produto = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    produto[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
        System.out.println("Matriz Produto:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(produto[i][j] + " ");
            }
            System.out.println();
        }
    }
}
