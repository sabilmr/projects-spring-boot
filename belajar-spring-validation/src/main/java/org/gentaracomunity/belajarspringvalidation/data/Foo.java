package org.gentaracomunity.belajarspringvalidation.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.gentaracomunity.belajarspringvalidation.validation.Palindrome;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Foo {

    @Palindrome
    private String bar;
}
