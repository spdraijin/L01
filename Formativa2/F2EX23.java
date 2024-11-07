/*Verificação de Números Perfeitos em Vetores
Solicite ao usuário 5 números inteiros e armazene-os em um vetor. 
Verifique se cada número é um número perfeito. Um número perfeito é aquele que é igual à soma de seus divisores próprios (excluindo ele mesmo). 
Exiba uma mensagem indicando quais números são perfeitos.
/* */

package Formativa2;

import java.util.Scanner;

public class F2EX23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vetorPerfeito[] = new int[5];
        boolean verPerfeito = false;
        System.out.print("Informe 5 números inteiros: ");
        for (int i = 0; i < vetorPerfeito.length; i++) {
            vetorPerfeito[i] = input.nextInt();
        }
        // encontrar divisores e somar eles
        for (int i = 0; i < vetorPerfeito.length; i++) {
            int somaDivisores = 0;
            for (int j = 1; j < vetorPerfeito[i]; j++) {
                if (vetorPerfeito[i] % j == 0) {
                    somaDivisores = somaDivisores + j;
                }
            }
            if (somaDivisores == vetorPerfeito[i]) {
                System.out.println("[" + vetorPerfeito[i] + "]" + " é um número perfeito");
                verPerfeito = true;
            }
        }
        if (!verPerfeito) {
            System.out.println("O vetor não possui numeros perfeitos");
        }
    }
}
