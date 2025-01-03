package Divy;

public class mul {
    public static String mulWord(String s, int n) {
        String F = "";
        for (int i = 1; i<=n; i++){
             s = s + " ";
        }
        return s;// Write code here
    }

    public static void main(String[] args) {
        String sp = mulWord("cow",3);
        System.out.println(sp);
    }
}
