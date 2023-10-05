package com.workintech.StackChallenge;

import java.util.*;

public class PalindromeSandQ {
    public static boolean isPalindrome(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }

        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (char c : cleanedInput.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        while (!stack.isEmpty() && !queue.isEmpty()) {
            char stackChar = stack.pop();
            char queueChar = queue.poll();

            if (stackChar != queueChar) {
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
        System.out.println("Palindrome (Stack & Queue)\n");
        for (String text : texts) {
            boolean isPalindrome = isPalindrome(text);
            System.out.println("\"" + text + "\" => " + (isPalindrome ? "palindrome" : "not palindrome"));
        }
    }
}
