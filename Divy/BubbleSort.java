package Divy;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,3,5,4,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++){
            swapped = false;
            for(int j = 1; j < arr.length - i; j++){
                if (arr[j] < arr[j-1]){
                        int temp = arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = temp;
                        swapped = true;
                }
                }
            if(!swapped){
                break;
            }
        }
    }
}

