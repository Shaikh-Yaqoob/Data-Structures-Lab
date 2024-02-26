package doublylist;

/**
 *
 * @author aa
 */
public class L_List<anytype>{
 
     
     Node head;  
     Node tail;
     
     
    public L_List() {
      head = null;
      tail = null;
    }
        
     //private class
     private class Node{
     
      anytype data;
      Node next;

        public Node(anytype data, Node next) {
            this.data = data;
            this.next = next;
        }
 
     }
         public void addFirst(anytype data){
            
             if(head==null){
             
               Node temp = new Node(data,null);             
               head = temp;
               tail = temp;
             }
             else {
             Node temp = new Node(data,head);
             head = temp;
             }
         }
      
     
    
     //addlast
     public void addLast(anytype data){
       
         if(head==null){
           
             addFirst(data);
           
         }
         else{
             
             Node temp = new Node(data,null);
             tail.next=temp;
             tail = tail.next;
         }
     }
     
     //Delete at First
     public void dltFirst(){
         if(head==null)
             return;
         
         Node temp= head;
         temp=head;
         head=head.next;
         
         
         return;
     }
     //Delete Last..........
     public void dltLast()
     {
         if(head==null)
         {System.out.println("No");
         }
         else if(head.next==null)
         {
             System.out.println("noooo");
         }
         else{
             Node temp=head;
             while(temp.next!=null)
             {
                 temp=temp.next;
                 temp.next=null;
                 
             }
             System.out.println("done");
         }
        
        
     }
     
     //addprint
     
     public void print(){
     
        Node temp  = head;
        if(temp==null){
            System.out.println("Not available");
            return;
        }
        while(temp!=null){
        
            System.out.println(temp.data+" , ");
            temp = temp.next;
           }
               
        }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
public static void main(String[] args){
            
             L_List obj = new L_List();   
             obj.addFirst("ali");
             obj.addFirst("khan");
             obj.addFirst("magsi");
             obj.addFirst("dilbar");
            
            // obj.addLast("hi");
             //obj.dltFirst(obj);
        //   obj.add("atif");
          // obj.addLast("yaqii");
           //obj.addLast("haha");
           obj.dltFirst();
          obj.dltLast();
             obj.print();
           
       }
     }
     
     
     
     
     

