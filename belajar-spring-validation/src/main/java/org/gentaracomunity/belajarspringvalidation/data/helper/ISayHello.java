package org.gentaracomunity.belajarspringvalidation.data.helper;

import jakarta.validation.constraints.NotBlank;

public interface ISayHello {
    String sayHello(@NotBlank String name);
}
