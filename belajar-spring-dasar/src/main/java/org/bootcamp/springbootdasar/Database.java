package org.bootcamp.springbootdasar;

public class Database {

    //singgleton adalah salah satu design patterns untuk pembuatan object, dimana sebuah object di buat hanya satu kali saja
    //dan ketika kita membutuhkan object tersebut, kita hanya akan menggunakan object yang sama

    // ada banyak cara membuat singleton object di java
    // cara yng paling sering digunakan adalah membuat clas yng berisikan static method untuk membuat object dirinya sendiri
    // selanjutnya constructor nya yang dibuat private, agar tidak bisa diakses dari luar
    // sehingga user terpaksa menggunakan method static tersebut ketika ingin membuat object nya
    private Database(){

    }
}
