package se.lexicon;

public class StringExamples {

    public static void main(String[] args) {
        String greeting = "Hello"; // Hello
        greeting = greeting.concat(" World"); // Hello World
        System.out.println(greeting);  // Hello World

        String str = "Hello, World!";
        System.out.println("Length: " + str.length()); // returns the number ofr chars in the string
        System.out.println("Character at index 2: " + str.charAt(2));
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i)); // returns the character at the specified index (0-based)
        }



    }


    public static void ex1(){
        String string = "Hello Strings";
        // returns the index of the first or last occurrence of a specified substring
        int index1 = string.indexOf("llo");
        System.out.println("index1 = " + index1); // 2
        int index2 = string.indexOf('H');
        System.out.println("index2 = " + index2); // 0

        int index3 = string.indexOf("Hell", 1);
        System.out.println("index3 = " + index3); // -1 (not found)
    }

    public static void ex2(){
        String str1 = "java";
        String str2 = "Java";

        System.out.println(str1.equals(str2)); // false
        System.out.println(str1.equalsIgnoreCase(str2)); // true

    }

    // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html

}
