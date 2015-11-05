/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author FOLFO
 */
public class numeroPar {
 
    public int pedirNum(){
        int num;
        String res = JOptionPane.showInputDialog("numero");
        num = Integer.parseInt(res);
        return num;   
    }
    
    public void numPar(int num){
        if(num%2==0){
            System.out.println("O numero"+num+"e par");
        }else{
            System.out.println("O numero"+num+"e impar");
        }
    
    }
}
