package doublylist;

public class DoublyList <Anytype> {
    Node head;
    Node tail;
    
    public DoublyList(){
        head=null;
        tail=null;
    }
    private class Node{
        Anytype data;
        Node next;
        Node pre;

        public Node(Anytype data, Node next, Node pre) {
            this.data = data;
            this.next = next;
            this.pre = pre;
        }
        
    }
    //Add in First...........
    public void addFirst(Anytype data){
        if(head==null)
        {
            Node temp=new Node(data,null,null);
            tail=temp;
            head=temp;
            
        }
        else{
            Node temp=new Node(data,head,null);
          //  temp.next=head;
            head.pre=temp;
            head=temp;
        }
    }
    //Add in Last............
    public void addLast(Anytype data){
        if(head==null)
        {
            addFirst(data);
        }
        else{
            Node temp=new Node(data,null,tail);
            tail.next=temp;
            tail=temp;
        }
    }
    //Add at any index..........
    public void addAtIndex(Anytype data, int index){
        Node temp=head;
 
        if(index==0){
            addFirst(data);
            return;
        }
        for(int i=1; i<index; i++){
            temp=temp.next;
        }
        Node newNode=new Node(data,null,null);
        newNode.next=temp.next;
        temp.next=newNode;
    }
    
    public int Size(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    
    public void Clear(){
        head=null;
        tail=null;
    }
    
    public boolean Empty(){
        if(head==null){
            System.out.println("Nhaye...");
            return true;
        }
        else{
            return false;
        }
    }
    
    public int Search(Anytype data){
        Node temp=head;
        int count=0;
        if(head==null){
            System.out.println("Nhaye");
            return -1;
        }
        else{
            while(temp!=null){
                ++count;
                if(temp.data==data){
                    return count;
                }
                temp=temp.next;
            }
            System.out.println(count);
        }
        return -1;
        
        
    }
     //search Nodes with two parameters............
    
    public void SearchTwo(Anytype data1,Anytype data2){
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
    
    //Delete First.................
    public void deleteFirst(){
        Node temp=head;
        if(head==null)
        {
            System.out.println("Empty.......");
        }
        else{
            temp=temp.next;
            head=temp;
            head.pre=null;
            
        }
    }
    //Delete Middle Node..........
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
    //Delete Last............
    public void deleteLast(){
        Node temp=tail;
        if(head==null)
        {
            System.out.println("Empty.........");
        }
        else{
            temp=temp.pre;
            tail=temp;
            temp.next=null;
        }
    }
    //Dlt given Node
     public boolean DltNode(Anytype data){
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

    
    //Remove at any index......
public void RemoveAtIndex(int index){
      Node temp=head;
      int po=index;
      if(temp==null){
          return;
      }
      else{
          for(int i=0; i<po; i++){
              temp=temp.next;
          }
          if(temp==head){
              head=temp.next;
          }
          else if(temp==tail){
              tail=tail.pre;
          }
          else{
              temp.pre.next=temp.next;
              temp.next.pre=temp.pre;
          }
          temp=null;
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
//remove N-1th Node..............
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
    //Reverse............
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
    public void Swap(Anytype n1, Anytype n2){
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

      
   
    
    //Print Forward.................
    public void printFwd(){
        Node temp=head;
        if(head==null){
            System.out.println("List nhaye......");
        }
        else{
            while(temp!=null)
            {
                System.out.println(temp.data);
                temp=temp.next;
            }
            
        }
    }
    
    //Print BackWard..............
    public void printBwd(){
        Node temp=tail;
        if(head==null)
        {
            System.out.println("List nhaye....");
        }
        else{
            while(temp!=null)
            {
                System.out.println(temp.data);
                temp=temp.pre;
            }
            System.out.println("BackWard.....");
        }
        
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
    DoublyList <String> list=new DoublyList();
    
    list.addLast("a");
    list.addLast("b");
    list.addLast("c");
    list.addLast("d");
    list.deleteEvenNodes();
    list.printFwd();
   
    
    }
    
}
