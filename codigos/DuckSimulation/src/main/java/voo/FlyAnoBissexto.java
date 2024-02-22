package voo;

import java.time.LocalDate;

public class FlyAnoBissexto implements FlyBehavior {

    @Override
    public void fly() {
        int ano = LocalDate.now().getYear();
        if (ano % 4 == 0 || (ano % 100 != 0 && ano % 400 == 0)){
            System.out.println("estou voando..."+ano + " eh bissexto");
        } else {
            System.out.println("não posso voar... só voo em anos bissextos!");
        }
    }
    
}
