/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.queue;

/**
 *
 * @author muzamil
 */
public class Queue <AnyType>{

    private Node front, rare;//head and tail
    int length;
    
    public Queue(){
    
        front  = null;
        rare = null;
        length = 0;
    
    }
    
    
    
    
    public void Enqueue (AnyType data){
     Node temp = new Node(data, null);
        if(front == null){
        
           
            
            front = rare = temp;
           
            
        }
        
        else {
        
        
           rare.next = temp;
           rare = temp;
        
          
        
        
        }
    
     length++;}
    
    
        
        public AnyType Dequeue(){
        
        
        if(front == null){
        
            System.out.println("Queue is Empty ");
            
            return null;
        }
        
        
        else{
        
        
            AnyType data = front.data;
            
            front = front.next;
            
            
            length--;
            
            return data;
        
        
        
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        }
        
        
        
    
    
    
        
        public void printQueue(){
        
        
            Node temp = front;
            
            if(temp  == null)
                System.out.println("No Node in Queue");
            else{
            
            
                
                while(temp!=null){
                
                    System.out.println(temp.data);
                    temp = temp.next;
                
                }
            
            
            }
            
        
        
        
        }
        
        
    
    
    private class Node {

        
        Node next;
        AnyType data;
        
        Node(AnyType data, Node next){
        
            this.next = next;
            this.data = data;
        
        }
        



}
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        
        
        //Homogeneous Data in Queue,  Example 
        Queue <String> q = new Queue<>();
        
        q.Enqueue("Irfan");
        q.Enqueue("Ajay");
        q.Enqueue("Seth");



        q.printQueue();
         
        System.out.println("###############\n");
        q.Dequeue();
         
        q.printQueue();
        
        
        
        
        
        System.out.println("\n\n\n\n^^^^^^^^^^^^^^^^^^^^^^\n\n\n\n");
        
        
        System.out.println("Below are the Heterogeneous examples \n\n\n");
        
        
        //Heterogeneous Data in Queue,  Example
        
        
        
        Students obj =new Students("Muzamil", "05121", "4");
        
        
        Students obj2 =new Students("ALi", "05121", "4");
        
        
        Queue sq = new Queue();
        
        
        sq.Enqueue(obj);
        
        sq.Enqueue(obj2);
        
        sq.Enqueue("Welcome to Hitrogenouse");
        sq.Enqueue(125);
        
        
        Students s  = (Students) sq.Dequeue();
        
        Object s2  = (Students)sq.Dequeue();
        
        String s3 = (String) sq.Dequeue();
        
        int integer = (int) sq.Dequeue();
        
        
        System.out.println("This is String from Queue : "+ s3);
        System.out.println("This is integer from Queue : "+ integer);
        
        System.out.println("Following Data is from Student class object, from Queue \n\n");
        s.printInfo();
        
        
        
        
        
        
        
        
        
        
        
    }
}
