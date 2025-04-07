/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrizes_Resoluções;

/**
 *
 * @author Vitor
 */
public class SomaLinhasEColunas4x4 {

    public static void main(String[] args) {
        int[][] matriz = { // Declara e inicializa uma matriz 4x4
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        for (int i = 0; i < 4; i++) {
            int somaLinha = 0;
            int somaColuna = 0;

            for (int j = 0; j < 4; j++) {
                somaLinha += matriz[i][j];
                somaColuna += matriz[j][i];
            }
            System.out.println("Soma da linha " + (i + 1) + ": " + somaLinha);
            System.out.println("Soma da coluna " + (i + 1) + ": " + somaColuna);
        }

    }
}
