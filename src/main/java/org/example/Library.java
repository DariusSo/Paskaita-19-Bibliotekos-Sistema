package org.example;

import javax.xml.crypto.dsig.keyinfo.KeyName;
import java.util.Scanner;

public class Library {
    int sarasoDydis = 0;
    String[] knyguSarasas = new String[sarasoDydis];
    public void addBook(String pavadinimas, String autorius){
        sarasoDydis++;
        String[] temp = new String[sarasoDydis];
        Book knyga = new Book(pavadinimas, autorius);
        for(int i = 0; i < knyguSarasas.length; i++){
            temp[i] = knyguSarasas[i];
        }
        temp[sarasoDydis - 1] = knyga.toString();
        knyguSarasas = temp;
    }
    public void removeBook(Book knyga) throws TokiosKnygosNeraException {
        if (knyga == null){
            throw new TokiosKnygosNeraException();
        }
        for(int i = 0; i < knyguSarasas.length; i++){
            if (knyguSarasas[i].equals(knyga.toString())){
                knyguSarasas[i] = "";
                System.out.println("////////////////////////////////////");
                System.out.println("Knyga pasalinta:");
                System.out.println(knyga.toString());
                System.out.println("////////////////////////////////////");
                sarasoDydis--;
                String[] temp = new String[sarasoDydis];
                int m = 0;
                for(int j = 0; j < knyguSarasas.length; j++){
                    if (knyguSarasas[j].equals("")){
                        continue;
                    }
                    temp[m] = knyguSarasas[j];
                    m++;
                }
                knyguSarasas = temp;
            }
        }
    }
    public Book findBook(String pavadinimas){
        for(int i = 0; i < knyguSarasas.length; i++){
            String[] k = knyguSarasas[i].split(" ");
            if (k[2].equals(pavadinimas)){
                System.out.println("////////////////////////////////////");
                System.out.println("Knyga rasta:");
                System.out.println(knyguSarasas[i]);
                System.out.println("////////////////////////////////////");
                Book book = new Book(k[2], k[5]);
                return book;
            }
        }
        return null;
    }
    public void  spausdintiSaras(){
        for(int i = 0; i < knyguSarasas.length; i++){
            System.out.println(knyguSarasas[i]);
        }
    }
}
