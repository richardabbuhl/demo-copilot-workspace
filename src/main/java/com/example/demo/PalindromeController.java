package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PalindromeController {

    @GetMapping("/palindrome")
    public String isPalindrome(@RequestParam String input) {
        String sanitizedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedInput = new StringBuilder(sanitizedInput).reverse().toString();
        if (sanitizedInput.equals(reversedInput)) {
            return "The input string is a palindrome.";
        } else {
            return "The input string is not a palindrome.";
        }
    }
}
