package org.bootcamp.springbootdasar.cyclic;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class CyclicB {

    private CyclicC cyclicC;
}
