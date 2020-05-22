/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.util.Scanner;

/**
 *
 * @author Nahdya
 */
public class main {
    public static void main(String[] args) {
        int pilihan;
        int data;
        Stack result= new Stack();
        System.out.println("1,PUSH");
        System.out.println("2,POP ITEM");
        do{
            Scanner input=new Scanner(System.in);
            System.out.print("pilih data:\t");
            pilihan=input.nextInt();
            if(pilihan==1){
                System.out.print("data yang ditambahkan adalah:\t");
                data=input.nextInt();
                result.push(data);
                result.display();
            }
            else if(pilihan==2){
                result.pop();
                result.display();
            }else{
                System.out.println("pilihan tidak ada");
                System.exit(0);
            }
        }while (pilihan!=0);
        
    }
    
}
