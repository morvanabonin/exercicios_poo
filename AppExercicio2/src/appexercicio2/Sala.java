/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appexercicio2;

/**
 *
 * @author morvana.bonin
 */
public class Sala {
    
    private int tamanho;
    private String cor;
    String[] tipos_comodos = new String[3];
    String comodo;

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String[] getTiposComodos() {
        return tipos_comodos;
    }

    public void setTiposComodos(String[] tipos_comodos) {
        this.tipos_comodos = tipos_comodos;
    }
    
    //Metódo para aprendizado
    public void imprimeTiposComodos (String[] tipos_comodos) {
        for(String comodo : tipos_comodos) {
            System.out.println(comodo);
        }
    }
    
}
