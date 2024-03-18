package org.gentaracomunity.belajarspringvalidation.data.helper;

import org.springframework.stereotype.Component;

@Component
public class StringHelper {
    public boolean isPalindrome(String value){
        String reverse = new StringBuilder(value).reverse().toString();
        return value.equals(reverse); // dikompersi dari return value equals dengan reverse
    }
}
