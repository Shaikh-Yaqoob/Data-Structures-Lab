package singly_list;

public  class  Singly_list <anytype> {
    Node head;
    Node tail;

    public Singly_list() {
        this.head = null;
        this.tail = null;
    }
    
    
    //Node class.....
    private class Node{
        anytype data;
        Node next;

        public Node(anytype data, Node next) {
            this.data = data;
            this.next = next;
        }

        private Node(int i) {
        }
        
    }
    
    //Add First..........
    public void addFirst(anytype data){
        Node temp=head;
        if(head==null)
        {
             temp=new Node(data,null);
            head=temp;
            tail=temp;
        }
        else{
             temp=new Node(data,head);
            head=temp;
        }
    }
    //Add Last........
    public void addLast(anytype data){
        if(head==null)
        {
            addFirst(data);
        }
        else{
            Node temp=new Node(data,null);
            tail.next=temp;
            tail=temp;
            
        }
    }
    //Add At Second last...
    public void addFirst(anytype data){
        Node temp=head;
        if(head==null)
        {
             temp=new Node(data,null);
            head=temp;
            tail=temp;
        }
        else{
             temp=new Node(data,head);
            head=temp;
        }
    }
    //Add Last........
    public void addLast(anytype data){
        if(head==null)
        {
            addFirst(data);
        }
        else{
            Node temp=new Node(data,null);
            tail.next=temp;
            tail=temp;
            
        }
    }
    //Add At Second last...
    public void addAtSecondLast(int data) {
        Node newNode = new Node(data);

        // If the linked list is empty, add the new node as the head
        if (head == null) {
            head = newNode;
            return;
        }

        // Find the second last node
        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }

        // Add the new node after the second last node
        newNode.next = secondLast.next;
        secondLast.next = newNode;
    }
    //Find Middle Node......
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
    //Add nodes in mid with two parameters.......
   void addMid(anytype data,anytype data1){
    int mid=GetSize()/2;
       addAtIndex(data, mid);
     //  addAtIndex(data1, mid);
       addLast(data1); //add one in mid and one in last......
   }
    
    
    
    //Add at any given index......
    public void addAtIndex(anytype data, int index){
        Node temp=head;
 
        if(index==0){
            addFirst(data);
            return;
        }
        for(int i=1; i<index; i++){
            temp=temp.next;
        }
        Node newNode=new Node(data,null);
        newNode.next=temp.next;
        temp.next=newNode;
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
    
    //Delete First...........
    public anytype DltFirst(){
        if(head==null)
        {
            System.out.println("Empty");
            return null;
        }
        else{
     //       Node temp=head;
            anytype d=head.data;
           head=head.next;
           return d;
        }
        
    }
    //Delete Middle Node...
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
    //Delete Half Node list...........
    void deleteHalf(){
        
        Node temp=head;
        int mid=0;
        if(temp==null){
            return;
        }
        while(temp!=null){
            if(temp.next!=null&&temp.next.next!=null){
                temp.next=null;
            }
            temp=temp.next;
        }
        
    }
    
    //Delete Last................
    public void DltLast(){
        if(head==null)
        {
            System.out.println("Empty");
            return;
        }
        if(head.next==null)
        {
            DltFirst();
            return;
        }
        else{
            Node temp=head;
            while(temp.next.next!=null)
            {
                
            temp=temp.next;
            
            }
            temp.next=null;
            temp=tail;
        }
        
    }
    //Remove at any index.......
  public void RemoveAtIndex(int index){
      if(head==null){
          return;
      }
     if(index == 0){
          DltFirst();
          return;
      }
      Node temp=head;
      Node pre=null;
      int count=0;
      while(temp!=null){
          if(index==count){
              pre.next=temp.next;
          }
          pre=temp;
          temp=temp.next;
          count++;
      }
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
        

public void deleteEvenNodes() {
    if (head == null) {
        return;
    }

    
    Node curr = head;
    int count=GetSize();
    while (curr.next != null) {
        if (count % 2 == 0) {
            curr.next = curr.next.next;
        } else {
            curr = curr.next;
        }
        count++;
        
    }
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
    //Search Node in 3D Arrays...........
    
   //Reverse LinkedList..........
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
    //Palindrom...........
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
    
    public Singly_list Merge(Singly_list list1,Singly_list list2){
        Singly_list list3=list1;
        list3.tail.next=list2.head;
        return list3;
    }
    
    
    
    
  //Print all Node's data
    public void PrintAll(){
    
        Node temp = head;
        
        if(head !=  null){
        
        while(temp != null)
        {
        
            System.out.println(temp.data);
            
            temp = temp.next;
        
        }
      //  System.out.println("End of LinkedList . . .");
        
        }
        else {System.out.println("No Nodes in LinkedList");}
    }

    
    public static void main(String[] args) {
       Singly_list <String> list1=new Singly_list();
       Singly_list <Integer> list2=new Singly_list();
       list2.addFirst(6);
       list2.addFirst(5);
       list2.addFirst(4);
       list2.addFirst(3);
       list2.addFirst(2);
       list2.addFirst(1);
       list2.addMid(9, 10);
       list2.PrintAll();
       //For time and space complexity....
        /*Runtime rt=Runtime.getRuntime();  
        
        long start=System.currentTimeMillis();
        
        
        for(int i=0; i<=100000; i++)
        {
            list.addFirst("NOde: "+i);
        }
        long end=System.currentTimeMillis();
        
        long timeCom=end-start;
        System.out.println("Time: "+timeCom);
       // rt.gc();
        rt.gc();
       long spaceComplexity=rt.totalMemory()-rt.freeMemory();
       
        System.out.println("Space: "+spaceComplexity/1024);
        System.out.println(list);
    //    System.out.println(list.Search("Node : 2"));
        list.PrintAll();
        */
        
        //Merge,Search,Delete methods...................
        /*
         System.out.println("Delet Node "+l1.Delete("Ahsan"));
        System.out.println("Searching two nodes..................");
        l1.searchData("Atif", "Yaqoob");
        Singlylist l3=l1.Merge(l1, l2);
        l3.PrintAll();

        */
    }
    
}
