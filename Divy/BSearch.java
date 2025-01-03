package Divy;

import java.util.Scanner;

public class BSearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,9,10,14,15,17,22,53};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number you want to Search");
        int target = in.nextInt();
        int ans = binarysearch(arr, target);
        System.out.println(ans);

    }

    static int binarysearch(int[] letters, int target) {
        int start = 0;
        int end = letters.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else if (target > letters[mid]) {
                start = mid + 1;
            }
            else {
                return letters[mid];
            }
        }
        return letters[start];
    }
}
