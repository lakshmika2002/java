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
public class lower_triangle {
    public static void main(String args[]){
        int rows,cols;
        int a[][]={{1,2,3},
                   {4,5,6},
                   {7,8,9}
        };
        rows = a.length;
        cols = a[0].length;
        if(rows!=cols){
            System.out.println("Matrix should be a square matrix");
        }
        else{
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i<j){//i>j for upper triangular matrix
                    System.out.print("0 ");
                }
                else{
                    System.out.print(a[i][j]+" ");
                }
            }
                            System.out.println();

        }
    }
}
}