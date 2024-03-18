package org.bootcamp.springbootdasar;

import org.bootcamp.springbootdasar.service.MerchantServiceImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        MerchantServiceImpl.class
})
public class InheritanceConfiguration  {

    // jadi ini banyak digunakan ketika kita membuat aplikasi biasanya kita akan membuat interfacenya dan membuat implementnya
    // implementnya kita registersasikan sebagai bean nanti ketika mengaksesnya cukup sebutkan nama si interface nya
    // kegunaaknya adalah suatu saat kita ganti model"implement nya kita cukup ubah si class implement nya tanpa harus merubah dependency yang menggunakan class interfance
}
