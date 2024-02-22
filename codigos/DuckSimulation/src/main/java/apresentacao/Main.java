/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package apresentacao;

import cliente.MallardDuck;
import cliente.RedHeadDuck;
import cliente.RubberDuck;
import som.Quack;
import voo.FlyAnoBissexto;
import voo.FlyDiasPrimos;
import voo.FlyNoWay;
import voo.FlyWithWings;

/**
 *
 * @author iapereira
 */
public class Main {

    public static void main(String[] args) {

        MallardDuck patoTobias = new MallardDuck();
        patoTobias.setCor("Marrom");
        patoTobias.setNome("Tobias");
        // patoTobias.setPeso(20);
        patoTobias.setTamanho(100);

        patoTobias.setFlyBehavior(new FlyWithWings());
        patoTobias.setQuackBehavior(new Quack());

        System.out.println("Tobias no início:");
        // exibindo as propriedades do Pato
        System.out.println(patoTobias);

        // voando concretamente
        // patoTobias.performFly();
        // emitindo som concretamente
        // patoTobias.performQuack();

        System.out.println("Tobias tomou um tiro nas asas.! Irá perder a capacidade de voar");
        patoTobias.setFlyBehavior(new FlyNoWay());

        System.out.println("Tobias no fim:");
        // exibindo as propriedades do Pato
        System.out.println(patoTobias);

        // patoTobias.performFly();

        RubberDuck patoBorracha = new RubberDuck();
        patoBorracha.performQuack();

        patoBorracha.setFlyBehavior(new FlyWithWings());
        patoBorracha.performFly(); 

        RedHeadDuck patoVermelho = new RedHeadDuck();
        patoVermelho.setFlyBehavior(new FlyAnoBissexto());
        patoVermelho.performFly();

        MallardDuck teobaldo = new MallardDuck();
        teobaldo.setNome("teobaldo");
        teobaldo.setFlyBehavior(new FlyDiasPrimos());
        teobaldo.performFly();

    }
}
