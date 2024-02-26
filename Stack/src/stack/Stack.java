package stack;
import java.util.Scanner;

/**
 *
 * @author Atif Malik
 */
public class Stack <anytype> {
    Node head;
    Node tail;
    
    public Stack(){
        head=null;
        tail=null;
    }
    private class Node{
        anytype data;
        Node next;
        
        public Node(anytype data, Node next){
            this.data=data;
            this.next=next;
        }
    }
    //Adding first............
    public void Push(anytype data){
        
        if(head==null)
        {
            Node temp=new Node(data,null);
            head=temp;
            tail=temp;
        }
        else{
            Node temp=new Node(data,head);
           // temp.next=head;
            head=temp;
            
        }
    }
    //Delete Middle Node......
    public Node DltMdl(){
       if(head==null)
       {
           return null;
       }
       Node fast=head.next.next;
       Node slow=head;
       while(fast!=null&&fast.next!=null){
           fast=fast.next.next;
           slow=slow.next;
       }
       slow.next=slow.next.next;
       return head;
    }
    //Delete...........
    public anytype Pop(){
        Node temp=head;
        if(head==null)
        {
            System.out.println("no List");
            return null;
        }
        else
        {
            anytype var=head.data;
            head=head.next;
            
            return var;
        }
        
    }
    
    //Add Node at Middle......
    public void FindMiddle(){
        
        Node temp=head;
        if(temp!=null){
            int length=GetSize();
            int middle=length/2;
            while(middle!=0){
                temp=temp.next;
                middle--;
            }
            System.out.println("data: "+temp.data);
        }   
    }
    //Size
    public int GetSize(){
        int count=0;
        Node temp=head;
        if(temp!=null){
            while(temp!=null){
            ++count;
            temp=temp.next;
        }
            return count;
        }
        return -1;
    }
    //Empty...
    public boolean isEmpty(){
        if(head==null)
            return true;
        else{
            return false;
        }
    }
    public void Clear(){
        head=null;
        tail=null;
    }
    
    //Merge................
    public Stack Merge(Stack s1, Stack s2)
    {
        Stack s3=s1;
        s3.tail.next=s2.head;
        return s3;
        
    }
    //peek/top..........
public anytype peek(){
    if(head==null)
    {
        return null;
    }
    else{
    return head.data;
        
    }
}    
//Remove at index..
public void RemoveAtIndex(int index){
      }
  
    public boolean Palindrom(){
        //find middle Node 1st
        Node fast=head.next.next;
        Node slow=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node curr=slow;
        Node pre=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        Node temp=head;
        Node left=head;
        Node rigth=pre;
        while(left!=null&&rigth!=null){
            if(left.data!=rigth.data){
            return false;    
            
            }
            rigth=rigth.next;
            left=left.next;
            
        }
        return true;
    }
    
    //Delete Node which you want ......
    
    public boolean DltNode(anytype data){
        if(head==null)
        {
            return false;
        }
        if(head.data==data){
            head=head.next;
            return true;
            
        }
        Node pre=head;
        Node current=head.next;
        while(current!=null)
        {
            if(current.data==data)
            {
                pre.next=current.next;
                return true;
            }
            pre=current;
            current=current.next;
        }
        return false;
    }
    //Delete Even Nodes......

public void deleteEvenNodes() {
    if (head == null) {
        return;
    }

    int count = GetSize();
    Node curr = head;
    while (curr.next != null) {
        if (count % 2 == 0) {
            curr.next = curr.next.next;
        } else {
            curr = curr.next;
        }
        count++;
    }
}

    //Search Node and count........
    public int Search(anytype data){
        int count=-1; //when there's no node it return -1
        Node temp=head;
        if(head==null)
        {
            return -1;
        }
        else{
            while(temp!=null)
            { ++count;
            if(temp.data==data)
            {
                return count;
                
            }
            temp=temp.next;
            }
            
            System.out.println(count);
        }
        return -1;
    }
    
    
    //search Nodes with two parameters............
    
    
    public void SearchTwo(anytype data1,anytype data2){
        if(head==null)
        {
            System.out.println("Empty");
        }
        else{
            Node temp=head;
            boolean notfind1=false,notfind2=false;
            
            for(int i=0; temp!=null; temp=temp.next, i++)
            {
                if(temp.data==data1)
                {
                    System.out.println("Your data 1 is:"+data1+" index:"+i);
                    notfind1= false;
                }
               else if(temp.data==data2)
                {
                    System.out.println("Your data 2 is:"+data2+" index:"+i);
                    notfind2= false;
                }
            }
                if(notfind1&&notfind2)
               {
                   System.out.println("Empty list.......");
               }  
                   else if(notfind1)
                           {
                               System.out.println("your data 1 is not find"+data1);
                           }
                   else if(notfind2)
                   {
                       System.out.println("Empty list");
                       System.out.println("Your data 2 is not find"+data2);
                   }
               
        }
    }
    public Node RemoveNth(int n){
        Node p=head;
        for(int i=1; i<n; i++){
            p=p.next;
        }
        Node q=head;
        if(p!=null){
            while(p.next!=null){
                p=p.next;
                q=q.next;
            }
            
            Node temp=q.next;
            q.next=q.next.next;
            temp=null;
        }
          else  {
            Node temp=head;
            head=head.next;
            temp=null;
                  
                    }
        return head;
        
        }
    //Delete Duplicates Nodes........
    public void DltDupicates(){
        Node current=head,temp=null,index=null;
        if(head==null){
            return;
        }
        else{
            while(current!=null){
                temp=current;
                index=current.next;
                
                while(index!=null){
                    if(current.data==index.data){
                        temp.next=index.next;
                    }
                    else{
                        temp=index;
                    }
                    index=index.next;
                }
                current=current.next;
            }
        }
       
    }
    //Reverse...............
    public Node reverse(){
        Node temp=head;
        
        Node pre=null;
        Node next=null;
        if(head==null)
        {
            System.out.println("No lISt");
            return null;
        }
        else{
            while(temp!=null)
            {
                next=temp.next;
                temp.next=pre;
                pre=temp;
                temp=next;
            }
            head=pre;
            return head;
        }
        
    }
    //Swap Nodes..............
    public void Swap(anytype n1, anytype n2){
        if(n1==n2)
            return;
        
        Node pre=null,current=head;
        while(current!=null&&current.data!=n1){
            pre=current;
            current=current.next;
        }
        Node pre2=null,current2=head;
        while(current2!=null&&current2.data!=n2){
            pre2=current2;
            current2=current2.next;
        }
        if(current==null||current2==null)
            return;
        if(pre!=null)
            pre.next=current2;
        else
            head=current2;
        
        if(pre2!=null)
        pre2.next=current;
        
        else
            head=current;
            
        Node temp=current.next;
        current.next=current2.next;
        current2.next=temp;
    }
    //Print All..................
    public void PrintAll()
    {
         Node temp = head;
    int count = 0;
     if(head==null){
             
         return;
                    }
     
     else{
          while(temp!=null){
              //++count;
              System.out.println(temp.data+" "); 
             temp = temp.next;  
               }
         //System.out.println(count);
           }
 
    }
    

   
    public static void main(String[] args) {
        Stack <String> st=new Stack();
        st.Push("a");
        st.Push("b");
        st.Push("c");
        st.Push("d");
        st.deleteEvenNodes();
        st.PrintAll();

    }
    
}
