package ffdebugtest;

import monPackage.FFdebugCalc;
import java.util.Scanner;

/**
 * Classe pour présenter NetBeans aux M1.
 *  
 * @author Pierre
 */
public class FFdebugTest {
    
    /**
     * Liste de trois entiers à comparer.
     */
    private int[] myArray;
    
    private int myInt;
    private boolean myBoolean;
    private String myString;

    public int[] getMyArray() {
        return myArray;
    }

    public int getMyInt() {
        return myInt;
    }

    public boolean isMyBoolean() {
        return myBoolean;
    }

    public void setMyBoolean(boolean myBoolean) {
        this.myBoolean = myBoolean;
    }

    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }

    public FFdebugTest(int[] myArray) {
        this.myArray = myArray;
    }
    
    /**
     * Exécute les méthodes du programme.
     *
     * @param args the command line argument
     */
    public static void main(String[] args) {
        FFdebugTest debug = new FFdebugTest(new int[3]);
        FFdebugTest.getValue(debug.myArray);
        System.out.println("La plus grande valeur est : "
                + FFdebugCalc.trouverMaximum(debug.myArray));
        System.out.println(FFdebugCalc.findMin(debug.myArray));
    }

    /**
     * Permet l'entrée des valeurs d'integer dans myArray par l'utilisateur.
     *
     * @param array liste d'entiers.
     */
    public static void getValue(int[] array) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Entrer un nombre : ");
            array[i] = scan.nextInt();
        }
    }
}
