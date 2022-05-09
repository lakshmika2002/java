/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week.pkg5;

/**
 *
 * @author cisco
 */
public class matrix_add {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};//declaring and initializing first array 
        int b[][] = {{9,8,7},{6,5,4},{3,2,1}};//declaring and initializing second array
        int c[][]=new int[3][3];//declaring third array of [3]rows and [3]columns to store the result
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j]+" ");//result wiht spacing
            }
            System.out.println(); //to print new line
        }
    }
    
}
