/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class DvdPlayerOn implements Command {

    private DvdPlayer dvdPlayer;
    
    public DvdPlayerOn(DvdPlayer dvdPlayer){
        this.dvdPlayer = dvdPlayer;
    }

    @Override
    public void execute() {
        this.dvdPlayer.on();
    }
    
}
