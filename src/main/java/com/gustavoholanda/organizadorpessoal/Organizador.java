package com.gustavoholanda.organizadorpessoal;

public class Organizador {

      public static void main(String[] args) {
    
        Manga got = new Manga();
        got.ehOneShot();
        got.statusNoPaisDeOrigem_finalizado();
        got.setAutor("Keiji");
        System.out.println(got.getAutor());
    }
}
