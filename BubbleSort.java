/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algotithms;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class BubbleSort {
    public void assending(int arr[]){
     
        int i,j;
       int s1;
        
        for(i=0;i<arr.length-1;i++){
            for(j=0;j<arr.length-(i+1);j++){
      
               if(arr[j]<arr[j+1]){
                   s1 = arr[j];
                   arr[j]= arr[j+1];
                   arr[j+1]=s1;
                   
               }
        }   
    }
        for(i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
    public void dessending(int arr[]){
                int i,j;
       int s1;
        
        for(i=0;i<arr.length-1;i++){
            for(j=0;j<arr.length-(i+1);j++){
      
               if(arr[j]>arr[j+1]){
                   s1 = arr[j];
                   arr[j]= arr[j+1];
                   arr[j+1]=s1;
                   
               }
        }   
    }
        for(i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
   
}
