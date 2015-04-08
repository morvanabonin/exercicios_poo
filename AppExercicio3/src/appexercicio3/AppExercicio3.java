/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appexercicio3;

/**
 *
 * @author Morvana
 */
public class AppExercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Exercício 3
         * Modificar a classe do Exercício 2, incluindo na mesma um atributo 
         * “iluminação”, para isso, utilize o modelo de “lâmpada” criado no Exercício 1.
         */
        
        Sala objSala = new Sala();
        Lampada lampada = new Lampada();
        
        String[] comodos = {"Sofa", "Estante", "Mesa"};
        objSala.setCor("azul claro");
        objSala.setTamanho(30);
        objSala.setTiposComodos(comodos);
                
        System.out.println("Minha sala é de cor " + objSala.getCor() + " e tem o tamanho de " + objSala.getTamanho() + "m2");
        System.out.print("Ela tem os seguintes movéis: ");
        for (String comodo : objSala.getTiposComodos()){
            System.out.println(comodo);
        }  
        
        System.out.print("E a luz da sala ");
        lampada.acendeLuz(false);
        
    }
    
}
