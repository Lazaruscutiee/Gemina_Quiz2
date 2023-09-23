/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gemina_quiz2;

import java.util.Scanner;

class Node {
        
        int data;
        Node next;
        
        Node(int data){
        this.data = data;
        this.next = null;
   
    }
    }

public class Gemina_Quiz2 {

   public Node head;
    
    public Node insertNode(int data){
        
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
    
        return head;
    }
    
    public void display(){
        Node node = head;
        
        while (node != null) {            
            System.out.println(node.data + ",");
            node = node.next;
        }
        System.out.println("");
    }
     public int searchPosition(int target){
    Node current = head;
    int pos = 0;
    
        while (current != null) {            
            if (current.data == target) {
                return pos;
                
            }
            current = current.next;
            pos++;
        }
        return -1;
    }
     
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        int [] QuizTwo = {};
        
        
        System.out.println("Quiz 2");
        System.out.println("For number 1 press 1");
        System.out.println("For number 2 press 2");
        
        
        int input = scan.nextInt();
        
        switch (input) {
            case 1:
                NumeroOne(QuizTwo);
                break;
            case 2:
                NumeroTwo(QuizTwo);
                break;
            default:
                System.out.println("Nganung nangita paman kag lain nga naa naman ko (-_-)? eme lang");
                break;

    }
  }      
        
    public static void NumeroOne (int [] numeroone ){
        Gemina_Quiz2 list = new Gemina_Quiz2();
        Scanner scn = new Scanner(System.in);
        list.insertNode(20);
        list.insertNode(422);
        list.insertNode(42);
        list.insertNode(22);
        list.display();
        System.out.print("search number: ");
        int targerVal = scn.nextInt();
        
        int posi = list.searchPosition(targerVal);
        
        if (posi != -1) {
            System.out.println(targerVal + " Here in " + posi);
        } else {
            System.out.println(" The "+ targerVal + " is not here ");
        }
    }
    public static void NumeroTwo (int [] numerotwo ){
        System.out.println("heheh");
    }
}
