package com.sebastiandagostino;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Palindrome {

    /**
     * This method calculates a string palindrome in O(n) time - linear
     * @param string any non null string
     * @return true if non empty string is a palindrome; false in any other case
     */
    private static boolean isPalindrome(String string) {
        final int length = string.length() - 1;
        if (length == -1) {
            return false;
        }
        final int max = string.length() / 2;
        for (int i = 0; i < max; i++) {
            if (string.charAt(i) != string.charAt(length - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new File("resource/Palindrome.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.next();
                System.out.println("IsPalindrome=" + isPalindrome(line) + "\t" + line);
            }
        }
    }

}
