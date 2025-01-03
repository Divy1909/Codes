package Divy;

public class InfiniteArray {
    public static void main(String[] args) {
        int target = 10;
        System.out.println(target);
    int[] arr = {3,5,7,9,10,90,100,130,160,170};
    }
    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;
        while (target > arr[end]){
            int newstart = end + 1;
            //end = previous end + size of the box * 2
            end = end + (end - start + 1) * 2;
            start = newstart;
        }
        return binarysearch(arr, target, start, end);
    }
    static int binarysearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}

