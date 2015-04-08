/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appexercicio3;

/**
 *
 * @author morvana.bonin
 */
public class Lampada {
    
    private boolean estado;
    
    public boolean getEstado() {
        return estado;
    }
    
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public void acendeLuz(boolean estado){
        this.setEstado(estado);
        if (this.getEstado() == true) {
            System.out.println("está ligada!");
        } else {
            System.out.println("está desligada!");
        }
    }
}
