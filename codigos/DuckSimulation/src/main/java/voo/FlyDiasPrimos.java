package voo;

import java.time.LocalDate;

public class FlyDiasPrimos implements FlyBehavior {

    @Override
    public void fly() {
        int dia = LocalDate.now().getDayOfMonth();
        if (dia == 2) {
            System.out.println("voa");
        }
        if (dia % 2 == 0) System.out.println("não voa");
        int divisor = 2;
        while (dia % divisor != 0 && dia != divisor){
            divisor++;
        }
        if (dia == divisor) { 
            System.out.println("voa");
        } else {
            System.out.println("nao voa");
        }
    }
    
}
