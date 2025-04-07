/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrizes_Resoluções;

/**
 *
 * @author Vitor
 */
public class Transposta {

    public static void main(String[] args) {

        int[][] matriz = { // Declara e inicializa uma matriz 3x3
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] transposta = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }
        System.out.println("Matriz Transposta:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }
    }
}
