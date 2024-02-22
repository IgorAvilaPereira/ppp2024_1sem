/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package som;

/**
 *
 * @author iapereira
 */
public class Mute implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Ai Meu Deus, tomei um tiro na garganta... Perdi a capacidade de emitir som.");
    }
    
}
