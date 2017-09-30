/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication2;

import java.util.Scanner;
/**
 *
 * @author Labin
 */
public class JavaApplication2 {
Scanner Sc= new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner Sc= new Scanner (System.in);
       int  A , B ;
       char [][] mapa ;
       System.out.println(" dame A ");
       A = Sc.nextInt();
       System.out.println(" dame B ");
       B = Sc.nextInt();
       mapa = new char[A][B];
       for(int i = 0 ; i < A ;i++)
         for(int j = 0; j < B;j++) 
             if(i==0 || i==A-1 || j== 0|| j==B-1){
            mapa[i][j]= 'x';
             }
      for(int i = 0 ; i < A ;i++)
      {
         for(int j = 0; j < B;j++)
             System.out.print(mapa[i][j]);
            System.out.println("");
      }
            // TODO code application logic here
    }
    
}
