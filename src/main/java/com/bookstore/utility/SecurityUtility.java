package com.bookstore.utility;

import java.util.Random;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;




@Component
public class SecurityUtility {

	public static BCryptPasswordEncoder passwordEncoder() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Bean
	public static String generatingRandomAlphabeticString() {
	    int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 10;
	    Random random = new Random();

	    String generatedString = random.ints(leftLimit, rightLimit + 1)
	      .limit(targetStringLength)
	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	      .toString();

	    return generatedString;
	}
	
	
	
	
	/*
	 * // Method to generate a random alphanumeric password of a specific length
    public static String generateRandomPassword(int len, int randNumOrigin, int randNumBound)
    {
        SecureRandom random = new SecureRandom();
        return random.ints(randNumOrigin, randNumBound + 1)
                .filter(i -> Character.isAlphabetic(i) || Character.isDigit(i))
                .limit(len)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
    }
	 */
	
}
