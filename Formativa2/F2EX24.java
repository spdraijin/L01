/*Matriz de Multiplicação de Números Ímpares
Receba uma matriz 3x3 de números inteiros. 
Percorra a matriz e multiplique apenas os números ímpares entre si, armazenando o resultado em uma variável.
Exiba o produto total dos números ímpares.
*/

package Formativa2;

import java.security.SecureRandom;
import java.util.Scanner;

public class F2EX24 {
    public static void main(String[] args) {
        final int LINHAS = 3;
        final int COLUNAS = 3;
        int matriz[][] = new int[LINHAS][COLUNAS];
        int impares = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite os números que vão compor a matriz 3x3: ");
        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                matriz[i][j] = input.nextInt();
                if (matriz[i][j] % 2 != 0) {
                    impares = impares * matriz[i][j];
                }
            }
        }
        System.out.println("Matriz: ");
        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("A multiplicação dos números impares dessa matriz é: " + impares);
    }
}
