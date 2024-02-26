public class Sort  {
    Node head;
    Node tail;
    
    public void Sort(){
        head=null;
        tail=null;
    }
    private class Node{
       int data;
       Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
       
    }
    public void AddLast(int data){
        if(head==null)
        {
            head=new Node(data,null);
            tail=head;
            return;
                    }
        else{
            Node temp=new Node(data,null);
            tail.next=temp;
            tail=temp;
        }
    }
    public static Sort Merge(Sort s1, Sort s2)
    {
        Node f=s1.head;
        Node sf=s2.head;
        Sort result=new Sort();
        
        while(f!=null&&sf!=null)
        {
            if(f.data<sf.data)
            {
                result.AddLast(f.data);
                f=f.next;
            }
            else{
                result.AddLast(sf.data);
                sf=sf.next;
            }
        }
        while(f!=null)
        {
            result.AddLast(f.data);
            f=f.next;
        }
        while(sf!=null)
        {
            result.AddLast(sf.data);
            sf=sf.next;
        }
        return result;
        
    }
    public void print(){
        if(head==null)
        {
            System.out.println("Empty");
        }
        else{
            Node temp=head;
            while(temp!=null)
            {
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
    public static void main(String args[])
    {
        Sort list=new Sort();
        Sort list1=new Sort();
        list.AddLast(1);
        list.AddLast(2);
        list.AddLast(3);
        System.out.println("list 2...");
        list1.AddLast(1);
        list1.AddLast(3);
        list1.AddLast(4);
        
        list.print();
        System.out.println(".............");
        list1.print();
         System.out.println("Sorted.............");
        Sort list2=Sort.Merge(list1, list);
        list2.print();
    }
    
}
