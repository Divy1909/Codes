package Divy.Recursions;

import com.sun.source.tree.BreakTree;

public class Recursion {
    public static void main(String[] args) {
       int ans = fibonacci(3);
        System.out.println(ans);
    }
    static int fibonacci (int n){
        if (n < 2){
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    static void fun(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        fun(n - 1);
    }
    static void revFun(int n){
        if (n == 0){
            return;
        }
        revFun(n - 1);
        System.out.println(n);
    }
    static void FunBoth(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        FunBoth(n - 1);
        System.out.println(n);
    }
    static int Fact(int n){
        if (n <= 1){
            return 1;
        }
        return n * Fact(n - 1);

    }
    static int sumdigit(int n){
        if (n == 0){
            return 0;
        }
        return n %10 + sumdigit(n / 10);
    }
    static void reverse(int n) {
        int sum = 0;
        if (n == 0){
            return ;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
         reverse(n / 10);
    }
    public int numberOfSteps(int num) {
        return helper(num, 0);
    }
    private int helper(int num, int steps){
        if (num == 0){
            return steps;
        }
        if (num % 2 == 0){
            return helper(num / 2, steps + 1);
        }
        return helper(num - 1, steps + 1);
    }







}
