package edu.sandiego.comp305;

public class StringUtils {
    private StringUtils(){}

    public static String reverseString(final String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
