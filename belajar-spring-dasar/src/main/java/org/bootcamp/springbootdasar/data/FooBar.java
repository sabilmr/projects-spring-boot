package org.bootcamp.springbootdasar.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FooBar {
    private Foo foo;
    private Bar bar;
}
