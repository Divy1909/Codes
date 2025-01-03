package Divy;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12,4,6,34,7,8};
        int target = 34;
        System.out.println(LinearSearch(arr, target,1,4));
    }
    static int LinearSearch(int[] arr, int target, int start, int end){
        if (arr.length == 0){
            return -1;
        }
        for (int index = start; index <= end; index++){
            int element = arr[index];
                    if (element == target)
                        return index;


        }
    return -1;
    }
}
