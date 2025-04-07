/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrizes_Resoluções;

/**
 *
 * @author Vitor
 */
public class MediaDosElementosDaMatriz {

    public static void main(String[] args) {

        int[][] matriz = { // Declara e inicializa uma matriz 4x4
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int soma = 0;
        int totalElementos = 16;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                soma += matriz[i][j];
            }
        }
        double media = (double) soma / totalElementos;
        System.out.println("A média dos elementos é: " + media);
    }
}
