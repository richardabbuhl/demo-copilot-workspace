package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PalindromeControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testIsPalindrome() {
        String input = "madam";
        String url = "http://localhost:" + port + "/palindrome?input=" + input;
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        assertThat(response.getBody()).isEqualTo("The input string is a palindrome.");

        input = "hello";
        url = "http://localhost:" + port + "/palindrome?input=" + input;
        response = restTemplate.getForEntity(url, String.class);
        assertThat(response.getBody()).isEqualTo("The input string is not a palindrome.");
    }
}
