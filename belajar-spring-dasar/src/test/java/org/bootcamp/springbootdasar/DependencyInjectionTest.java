package org.bootcamp.springbootdasar;

import org.bootcamp.springbootdasar.data.Bar;
import org.bootcamp.springbootdasar.data.Foo;
import org.bootcamp.springbootdasar.data.FooBar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionTest {
    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(DependencyInjectionConfiguration.class);
    }

    // saat kita membuat object, sudah pasti kita sering membuat object yang tergantung dengan object lain

    // Dependency injection adalah teknik dimana kita bisa mengotomatisasi proses pembuatan object yang tergantung dengan onject lain
    // atau kita sebut dependency

    // dependencies akan secara otomatis di-inject atau di masukkan ke dalam object yang membutuhkannya

    @Test
    void testDi() {
        Foo foo = applicationContext.getBean("fooSecond", Foo.class);
        Bar bar = applicationContext.getBean(Bar.class);
        FooBar fooBar = applicationContext.getBean(FooBar.class);

        // melakukan dependency injection atau mengambil istilahnya melakukan inject memasukkan data ke dalam data yang lain
        //konsep dependency injection secara otomatis

        Assertions.assertSame(foo, fooBar.getFoo());
        Assertions.assertSame(bar, fooBar.getBar());
    }

    @Test
    void testNoDi() {

        var foo = new Foo();
        var bar = new Bar();

        // melakukan dependency injection atau mengambil istilahnya melakukan inject memasukkan data ke dalam data yang lain
        //konsep dependency injection secara manual
        var fooBar = new FooBar(foo, bar);

        Assertions.assertSame(foo, fooBar.getFoo());
        Assertions.assertSame(bar, fooBar.getBar());

    }
}
