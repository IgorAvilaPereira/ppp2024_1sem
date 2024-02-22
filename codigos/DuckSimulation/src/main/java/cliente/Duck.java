/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente;

import som.QuackBehavior;
import voo.FlyBehavior;

/**
 *
 * @author iapereira
 */
public abstract class Duck {
    protected String nome;
    protected String cor;
    protected int tamanho;
    protected float peso;

    protected QuackBehavior quackBehavior;
    protected FlyBehavior flyBehavior;

    public Duck(){
        this.peso = 30;
    }

    public void swim(){
        System.out.println("Estou nadando...");
    }

    public void performQuack(){
        this.quackBehavior.quack();
    }

    public void performFly(){
        this.flyBehavior.fly();
    }

    
    
    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public String getCor() {
        return cor;
    }



    public void setCor(String cor) {
        this.cor = cor;
    }



    public int getTamanho() {
        return tamanho;
    }



    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }



    public float getPeso() {
        return peso;
    }



    public void setPeso(float peso) {
        this.peso = peso;
    }


    

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public abstract void diplay ();

    @Override
    public String toString() {
        return "Duck [nome=" + nome + ", cor=" + cor + ", tamanho=" + tamanho + ", peso=" + peso + ", quackBehavior="
                + quackBehavior.getClass().getSimpleName() + ", flyBehavior=" + flyBehavior.getClass().getSimpleName() + "]";
    }

    
}
