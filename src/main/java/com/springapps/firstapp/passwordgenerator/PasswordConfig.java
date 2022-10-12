package com.springapps.firstapp.passwordgenerator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PasswordConfig {
    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMBERS = "0123456789";

    @Bean
    public PasswordAlphabet allCharacters() {
        return new PasswordAlphabet(CHARACTERS + NUMBERS);
    }

    @Bean
    public PasswordAlphabet numberCharacters() {
        return new PasswordAlphabet(NUMBERS);
    }
}