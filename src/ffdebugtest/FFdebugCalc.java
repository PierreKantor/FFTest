package ffdebugtest;

/**
 * Classe Java contenant les méthodes de comparaison des entiers dans une liste.
 * @author Pierre
 */
public class FFdebugCalc {
    
    /**
     * Trouve l'integer le plus grand dans une liste d'integer.
     * @param array liste d'integer.
     * @return integer le plus grand contenu dans la liste.
     */
    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }   
        }
        return max;
    }  
    
    /**
     * Trouve l'integer le plus petit dans une liste d'integer.
     * @param array liste d'integer.
     * @return integer le plus petit contenu dans la liste.
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }   
        }
        return min;
    } 
}
