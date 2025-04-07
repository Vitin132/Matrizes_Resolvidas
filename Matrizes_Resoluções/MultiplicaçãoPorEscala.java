/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrizes_Resoluções;

import java.util.Scanner;

/**
 *
 * @author Vitor
 */
public class MultiplicaçãoPorEscala {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner
        int[][] matriz = { // Declara e inicializa uma matriz 3x3
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.print("Digite um número escalar para multiplicar a matriz: ");
        int escalar = scanner.nextInt();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] *= escalar;
            }
        }
        System.out.println("Matriz resultante:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
