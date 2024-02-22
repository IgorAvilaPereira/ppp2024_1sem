package cliente;

import som.Squeak;
import voo.FlyBehavior;
import voo.FlyNoWay;

public class RubberDuck extends Duck {

    public RubberDuck(){
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Squeak();
    }

    @Override
    public void diplay() {
        System.out.println("Pato de Borracha!");
    }

    @Override
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        // this.flyBehavior = flyBehavior;
    }


    
}
