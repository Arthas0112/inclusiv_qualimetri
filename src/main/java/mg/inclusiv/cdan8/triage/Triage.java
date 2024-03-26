/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mg.inclusiv.cdan8.triage;

import java.util.Scanner;

public class Triage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tailleTableau;

        System.out.print("Taille du tableau : ");
        tailleTableau = scanner.nextInt();

        int[] tableau = new int[tailleTableau];

        System.out.print("Saisissez " + tailleTableau + " nombres : ");
        try {
             for (int i = 0; i < tailleTableau; i++) {
            tableau[i] = scanner.nextInt();
            
        }
        for (int i = 0; i < tailleTableau - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < tailleTableau; j++) {
                if (tableau[j] < tableau[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = tableau[i];
            tableau[i] = tableau[minIndex];
            tableau[minIndex] = temp;
            
        }

        System.out.print(" Ordre croissant: ");
        for (int entier : tableau) {
            System.out.print(entier + " ");
        }
        } catch (Exception e) {
            System.out.println("Erreur");   
        }
        
    }

}
