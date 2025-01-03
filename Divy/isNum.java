package Divy;

import java.sql.SQLOutput;

public class isNum {
    public static void main(String[] args) {
        String str = "12342";
        boolean num = isNumber(str);
        System.out.println(num);
    }
        public static boolean isNumber(String s) {

            for (int i = 0; i <= s.length() -1; i++){
                char c = s.charAt(i);
                if (!Character.isDigit(c)){
                    return false;

                }
            }

            return true;// Write code here
        }
    }

