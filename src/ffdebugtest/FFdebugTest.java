package ffdebugtest;
import java.util.Scanner;

public class FFdebugTest {

    public static void main(String[] args) {
        int[] myArray = new int[3];
        FFdebugTest.getValue(myArray);
        System.out.println("La plus grande valeur est : " + findMax(myArray));     
    }
    
    public static void getValue(int[] array) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Entrer un nombre : ");
            array[i] = scan.nextInt();
        }
    }
    
    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }   
        }
        return max;
    }  
}
