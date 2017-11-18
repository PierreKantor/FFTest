package ffdebugtest;
import java.util.Scanner;

/**
 * Classe debug pour présenter NetBeans aux M1.
 * @author Pierre
 */
public class FFdebugTest {
    private int[] myArray;
    private int myInt;
    private boolean myBoolean;
    private String myString;

    /**
     * Constructeur pour la classe FFdebugTest.
     */
    public FFdebugTest() {
    }

    /**
     * Second constructeur avec myArray en paramètre
     * @param myArray Liste de trois entiers.
     */
    public FFdebugTest(int[] myArray) {
        this.myArray = myArray;
    }

    /**
     * Exécute les méthodes du programme.
     * @param args the command line argument
     */
    public static void main(String[] args) {
        FFdebugTest debug = new FFdebugTest(new int[3]);
        FFdebugTest.getValue(debug.myArray);
        System.out.println("La plus grande valeur est : " + FFdebugCalc.findMax(debug.myArray));
        System.out.println("La plus petite valeur est : " + FFdebugCalc.findMin(debug.myArray));
    }
    
    /**
     * Permet l'entrée des valeurs d'integer dans myArray par l'utilisateur.
     * @param array 
     */
    public static void getValue(int[] array) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Entrer un nombre : ");
            array[i] = scan.nextInt();
        }
    }
}
