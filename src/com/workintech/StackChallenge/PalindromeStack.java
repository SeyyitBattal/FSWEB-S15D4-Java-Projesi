package com.workintech.StackChallenge;

import java.util.Stack;

public class PalindromeStack {
    public static boolean isPalindrome(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }

        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        for (char c : cleanedInput.toCharArray()) {
            stack.push(c);
        }
        for (char c : cleanedInput.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] texts = {
                "I did, did I?",
                "Racecar",
                "hello",
                "Was it a car or a cat I saw ?"
        };

        for (String text : texts) {
            boolean isPalindrome = isPalindrome(text);
            System.out.println("\"" + text + "\" => " + (isPalindrome ? "palindrome" : "not palindrome"));
        }

    }

}
