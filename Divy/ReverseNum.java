package Divy;

public class ReverseNum {
    public static void main(String[] args) {
        int n = 45536;
        int count = 0;
        while (n>0) {
            int rem = n % 10;
            n = n / 10;
            count = count * 10 + rem;
        }
        System.out.println(count);
    }
}
