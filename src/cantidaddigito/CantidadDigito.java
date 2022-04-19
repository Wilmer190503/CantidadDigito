/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cantidaddigito;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class CantidadDigito 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Declaración de variable
        int N, i, c;
        
        //Input
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero aleatorio: "));
        
        //Processing
        c = 0;
        
        while(N>0)
        {
            System.out.println("N = "+N);
            System.out.println("c = "+c);
            N = N/10;
            c++;
        }
        System.out.println("N = "+N);
        System.out.println("c = "+c);
        
        JOptionPane.showMessageDialog(null, " La cantidad de digitos es: "+c);

        System.exit(0);        
    }
    
}
