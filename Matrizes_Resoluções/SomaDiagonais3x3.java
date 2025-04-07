/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrizes_Resoluções;

/**
 *
 * @author Vitor
 */
public class SomaDiagonais3x3 {

    public static void main(String[] args) {
        int[][] matriz = { // Declara e inicializa uma matriz 3x3
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int somaPrincipal = 0;
        int somaSecundaria = 0;
        for (int i = 0; i < 3; i++) {
            somaPrincipal += matriz[i][i];
            somaSecundaria += matriz[i][2 - i];
        }
        System.out.println("Soma da diagonal principal: " + somaPrincipal);
        System.out.println("Soma da diagonal secundária: "+ somaSecundaria);
    }
}
