package com.romaintestard;

public class EmailApp {

    public static void main(String[] args){
        Email em1 = new Email("Romain", "Testard");
        System.out.println(em1.showInfo());
        em1.setAlternateEmail("romain.rtestard@gmail.com");
        System.out.println("You redirected your email to " + em1.getAlternateEmail());


    }
}
