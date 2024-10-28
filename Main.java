2/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algotithms;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[] = new int[8];
        Scanner sc = new Scanner(System.in);
        
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter Number "+(i+1)+" :");
            arr[i] = sc.nextInt();
        }
        
       BubbleSort bubble = new BubbleSort();
        System.out.println("Assending :");
       bubble.assending(arr);
        System.out.println();
        System.out.println("Dessending :");
       bubble.dessending(arr);
       
    }
    
    
}
