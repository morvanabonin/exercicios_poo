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
public class AppExercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Exercício 2
         * Implementar uma classe que represente o cômodo de uma casa 
         * (quarto, sala, cozinha, banheiro). 
         * Esta classe deve ter os atributos tamanho e cor e tipo de cômodo.
         */
        Sala objSala = new Sala();
        
        String[] comodos = {"Sofa", "Estante", "Mesa"};
        objSala.setCor("verde claro");
        objSala.setTamanho(25);
        objSala.setTiposComodos(comodos);
                
        System.out.println("Minha sala é de cor " + objSala.getCor() + " e tem o tamanho de " + objSala.getTamanho() + "m2");
        System.out.println("Minha sala tem os seguintes movéis: ");
        for (String comodo : objSala.getTiposComodos()){
            System.out.println(comodo);
        }  
    }
    
}
