/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrizes_Resoluções;

/**
 *
 * @author Vitor
 */
public class Soma {

    public static void main(String[] args) {

        int[][] matriz = { // Declara e inicializa uma matriz 3x3
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int soma = 0; // Inicializa a variável soma com 0
        for (int i = 0; i < 3; i++) { // Itera sobre as linhas da matriz
            for (int j = 0; j < 3; j++) { // Itera sobre as colunas da
                soma += matriz[i][j]; // Adiciona o valor de cada elemento
                //à soma
            }
        }
        System.out.println("A soma de todos os elementos é: " + soma); //
        //Exibe a soma total
    }

}


