/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolavl;

import Vista.Main;


import javax.swing.JOptionPane;

/**
 *
 * @author Desarrollo
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        ArbolAVL arbolAVL = new ArbolAVL();
        Main v=new Main();
        v.show();
      
       arbolAVL.insertar(2);
 arbolAVL.insertar(1); 
        arbolAVL.insertar(2); 
       arbolAVL.insertar(3);
       arbolAVL.insertar(4); 
       arbolAVL.insertar(1); 
       arbolAVL.insertar(2); 
       arbolAVL.insertar(3); 
        arbolAVL.insertar(4);
        arbolAVL.insertar(4); 
        arbolAVL.insertar(20); arbolAVL.insertar(2); arbolAVL.insertar(20); 
        arbolAVL.insertar(12); 
        arbolAVL.insertar(32); arbolAVL.insertar(2); arbolAVL.insertar(2); 
        arbolAVL.insertar(14); 
        arbolAVL.insertar(5); arbolAVL.insertar(5); arbolAVL.insertar(6); 
        arbolAVL.insertar(2); 
        
        
       
    arbolAVL.mostrarlistas(arbolAVL.raiz,v);
        
    }
    
    
    
}
