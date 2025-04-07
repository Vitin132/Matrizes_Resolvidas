/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrizes_Resoluções;

/**
 *
 * @author Vitor
 */
public class Identidade {

    public static void main(String[] args) {
        int[][] matriz = { // Declara e inicializa uma matriz 3x3
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}

        };
        
        
        boolean identidade = true;
        for (int linha = 0; linha < 10; linha++) {
            for (int coluna = 0; coluna < 10; coluna++) {
                if (linha == coluna && matriz[linha][coluna] != 1) {
                    identidade = false;
                }else if (linha != coluna && matriz[linha][coluna] != 0){
                    identidade = false;
                }
                
            }
            
        }
        if(identidade) {
            System.out.println("A matriz é uma matriz identidade.");
            
        }else{
            System.out.println("A matriz não é uma matriz identidade.");
        }
        
    }
}
