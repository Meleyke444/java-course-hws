package app.lesson07;

import java.util.Scanner;

public class hw_4_array_define_initialize {
    /*Define and initialize an array. Find:
    1) size of array
    2) max element of array
    3) min element of array
    4) sum of all elements of array
    5) average of array (sum of all elements) / (count of all elements)
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println(" Enter 4 elements of array: ");

        int [] array= new int[4];
        int sum_elements=0;
        for (int i=0; i<4;i++){
            int element= scan.nextInt();
            array[i]=element;
            sum_elements=sum_elements+array[i];
        }
        int size_array= array.length;
        double avarage_of_array=(sum_elements)/(size_array);

        System.out.println("size of array: "+size_array);
        System.out.println("sum of all elements of array: "+ sum_elements);
        System.out.println("average of array: "+ avarage_of_array);





    }

}
