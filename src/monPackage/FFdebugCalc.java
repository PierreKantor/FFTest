package monPackage;

/**
 * Classe contenant les méthodes de comparaison des entiers dans une liste.
 *
 * @author Pierre
 */
public class FFdebugCalc {

/**
 * This is a method
 * @param array this is an array 
 * @return give the max value 
 */
    public static int trouverMaximum(int[] array) {
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
     *
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
