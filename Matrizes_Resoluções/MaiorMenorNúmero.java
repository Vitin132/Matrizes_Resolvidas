/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrizes_Resoluções;

/**
 *
 * @author Vitor
 */
public class MaiorMenorNúmero {

    public static void main(String[] args) {

        int[][] matriz = { // Declara e inicializa uma matriz 4x4
            {10, 5, 12, 3},
            {15, 2, 9, 8},
            {1, 16, 7, 14},
            {4, 13, 11, 6}
        };
        int maior = matriz[0][0];
        int menor = matriz[0][0];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
        System.out.println("Maior elemento: " + maior);
        System.out.println("Menor elemento: " + menor);
    }
}
