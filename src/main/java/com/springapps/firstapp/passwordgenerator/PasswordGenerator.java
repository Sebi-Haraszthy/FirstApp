package com.springapps.firstapp.passwordgenerator;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class PasswordGenerator {
    private final PasswordAlphabet passwordAlphabet;
    private static final Random random = new Random();

    public PasswordGenerator(@Qualifier("allCharacters") PasswordAlphabet passwordAlphabet) {
        this.passwordAlphabet = passwordAlphabet;
    }

    public String generatePass(int length) {
        StringBuilder generatedPass = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomPosition = random.nextInt(passwordAlphabet.getCharacters().length());
            generatedPass.append(passwordAlphabet.getCharacters().charAt(randomPosition));

        }
        return generatedPass.toString();
    }
}