package firstTask;
import java.util.Scanner;


public class sortingAlgorithm {

    //Main
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        //Length of the array
        int length = 0;

        System.out.print("Enter the length of the array: ");

        length = input.nextInt();
        input.nextLine();
        int array[] = new int[length];

        //Numbers inside the array
        System.out.println("Enter the numbers: ");

        for (int i = 0; i < length; i++) {
            array[i] = input.nextInt();
            input.nextLine();
        }

        input.close();

        System.out.print("Before sorting: ");
        printArray(array);

        bubbleSort(array);
        System.out.print("After Bubble Sort: ");
        printArray(array);

    }

    //Print the array with brackets [//]
    public static void printArray(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            if (i + 1 == array.length) {
                System.out.print(array[i] + " ]");
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();
    }

    //Bubble Sort
    public static void bubbleSort(int[] array) {

        boolean swapped = true;

        while(swapped){

            swapped = false;

            for(int i = 0; i < array.length - 1; i++){

                if(array[i] > array[i + 1]){
                    swapped = true;

                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }


    }
}
