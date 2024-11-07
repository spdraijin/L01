/*Multiplicação de Vetores com Condicional de Paridade
Receba dois vetores com 5 números inteiros cada. 
Crie um terceiro vetor onde cada elemento será o produto dos números correspondentes nos dois vetores, 
mas apenas se ambos os números forem pares. Caso contrário, o valor deve ser zero. 
Utilize estruturas de repetição e condicionais.
*/

package Formativa2;

import java.util.Scanner;

public class F2EX22 {
    public static void main(String[] args) {
        int vetor1[] = new int[5];
        int vetor2[] = new int[5];
        int vetor3[] = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.print("Informe os 5 números do primeiro vetor: ");
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = input.nextInt();
        }
        System.out.print("Informe os 5 números do segundo vetor: ");
        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = input.nextInt();
        }
        for (int i = 0; i < vetor3.length; i++) {
            if (vetor1[i] % 2 == 0 && vetor2[i] % 2 == 0) {
                vetor3[i] = vetor1[i] * vetor2[i];
            } else {
                vetor3[i] = 0;
            }
        }
        System.out.print("vetor 1: ");
        for (int c = 0; c < vetor1.length; c++) {
            System.out.print("[" + vetor1[c] + "]");
        }
        System.out.println();
        System.out.print("vetor 2: ");
        for (int c = 0; c < vetor2.length; c++) {
            System.out.print("[" + vetor2[c] + "]");
        }
        System.out.println();
        System.out.print("vetor 3: ");
        for (int c = 0; c < vetor3.length; c++) {
            System.out.print("[" + vetor3[c] + "]");
        }
    }
}
