package org.gentaracomunity.belajarspringaop.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class HelloService {

    public String hello(String name){
        log.info("Call HelloService.hello()");
        return "Hello " + name;
    }

    public String bye(String name){
        log.info("Call HelloService.bye()");
        return "Bye " + name;
    }
}

//library adalah kumpulan kode yang telah ditulis sebelumnya (berisi function, class, modul)
//dan dapat digunakan kembali untuk menyelesaikan tugas-tugas tertentu.
//
//Tujuan utama dari library yaitu menyediakan solusi siap pakai,
//sehingga developer tidak perlu membangun segalanya dari awal.

//Library membantu meningkatkan efisiensi dalam pengembangan software dengan mengurangi waktu
//dan usaha yang diperlukan untuk mengembangkan aspek-aspek dasar sebuah aplikasi.


