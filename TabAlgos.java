/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c306activite1;
 
/**
 *
 * @author FServices
 */
public final class TabAlgos {

    private TabAlgos() {
        
    }
    /**
     * tableau index max.
     */
   

    /**
     * @param tab
     * @return valeur la plus grande d'un tableau.
     */
    public static int plusGrand(final int[] tab) {
        int max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        return max;
    }

    /**
     * @param tab
     * @return moyenne des valeurs du tableau.
     * @throw IllegalArgumentException si tab et null ou vide.
     *
     */
    public static double moyenne(final int[] tab) {
        int sum = 0;
        for (int i = 0; i < tab.length; i++) {
            sum += tab[i];
        }
        return (double) sum / tab.length;
    }

    /**
     * Compare le contenu de 2 tableaux en tenant compte de l'ordre.
     *
     * @param tab1
     * @param tab2
     * @return true si les 2 tableaux contiennent les mêmes éléments avec les
     * mêmes nombres d'occurences (avec les elements dans le meme ordre).
     */
    public static boolean egaux(final int[] tab1, final int[] tab2) {
        if (tab1.length != tab2.length) {
            return false;
        }
        for (int i = 0; i < tab1.length; i++) {
            if (tab1[i] != tab2[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Compare le contenu de 2 tableaux sans tenir compte de l'ordre.
     *
     * @param tab1
     * @param tab2
     * @return true si les 2 tableaux contiennent les mêmes éléments avec les
     * mêmes nombres d'occurrence (pas forcément dans le meme ordre).
     */
    public static boolean similaires(final int[] tab1, final int[] tab2) {
        final int MAX_TABLEAU = 256;
        
        if (tab1.length != tab2.length) {
            return false;
        }
        int[] count1 = new int[MAX_TABLEAU];
        int[] count2 = new int[MAX_TABLEAU];
        for (int i = 0; i < tab1.length; i++) {
            count1[tab1[i]]++;
            count2[tab2[i]]++;
        }
        for (int i = 0; i < MAX_TABLEAU; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }
        return true;
    }
}
