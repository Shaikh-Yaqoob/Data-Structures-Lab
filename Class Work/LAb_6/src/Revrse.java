public class Revrse <anytype> {
    Node head;
    Node tail;
    
    public void Reverse(){
        head=null;
        tail=null;
    }
    private class Node{
        anytype data;
        Node next;

        public Node(anytype data, Node next) {
            this.data = data;
            this.next = next;
        }
        
    }
    //AddFirst.......
    public void addFirst(anytype data){
        if(head==null)
        {Node temp=new Node(data,null);
        head=temp;
        tail=temp;
        }
        else{
            Node temp=new Node(data,head);
            head=temp;
            
        }
    }
    //Reverse..........
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
    
    public void PrintAll(){
    
        Node temp = head;
        
        if(head !=  null){
        
        while(temp != null)
        {
        
            System.out.println(temp.data);
            
            temp = temp.next;
        
        }
     
        
        }
        else {System.out.println("No Nodes in LinkedList");}
    }
    
    public static void main(String[] args) {
        Revrse <String> list=new Revrse();
        list.addFirst("Atif");
        list.addFirst("MAlik");
        list.PrintAll();
        list.Reverse();
        System.out.println("reverse");
        list.PrintAll();
    }

    
}
