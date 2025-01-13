package se.lexicon;

public class MathOperations {

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static long add(long num1, long num2) {
        return num1 + num2;
    }

    // varargs: the term varagrs is a shortened form of 'variable-length arguments'.
    // it allows a method to accept a variable number of arguments, making it flexible and adaptable to different input size
    public static int add(int... numbers){ // 1,2,3,4,5
        int sum = 0;
        for (int num: numbers ){
            sum = sum + num;
            //sum += num;
        }
        return sum;
    }


}
