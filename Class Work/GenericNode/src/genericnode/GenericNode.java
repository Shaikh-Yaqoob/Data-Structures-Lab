
package genericnode;


public class GenericNode <anytype> {

    int size=3;
    int top=0;
    private Node arr[]=new Node[size];
    
   
    
    public void Push(anytype data){
        if(top!=size){
            arr[top++]=new Node(data);
        }
    }
    public anytype Pop(){
        if(arr[0]!=null){
            anytype data=(anytype) arr[top-1].data;
            arr[top-1]=null;
            top=top-1;
            return data;
        }
        return null;
    }
    
   public anytype Peek(){
      return (anytype) arr[top-1].data;
   }
   
  /* public GenericNode Merge(GenericNode a, GenericNode b){
       GenericNode  newStack=new GenericNode();
       newStack.size=a.size+b.size;
       
       for(int i=0; i<=a.top+1; i++){
           newStack.Push(a.Pop());
       }
       
         for(int i=0; i<=b.top+1; i++){
           newStack.Push(b.Pop());
       }
         return newStack;
   } */
   
   public boolean Merge(GenericNode stack2){
       if(stack2!=null){
           int count=stack2.top;
       for(int i=0; i<count; i++){
           this.Push((anytype) stack2.Pop());
       }
       
       return true;
   }
       return false;
   }
    
    public void print(){
        for(int i=top-1; i>=0; i--){
            System.out.println("Index: "+i+"  "+arr[i].data);
        }
    }
    
    
    private class Node<anytype>{
        anytype data;

        public Node(anytype data) {
            this.data = data;
        }
        
    }

    
    public static void main(String[] args) {
       GenericNode <Integer> obj1=new GenericNode();
       obj1.Push(3);
       obj1.Push(65);
      // obj1.print();
       //obj.GetSize();
      // obj1.Pop();
      //  System.out.println(obj1.Peek());
      
      GenericNode <Integer> obj2=new GenericNode();
      obj2.Push(53);
      obj2.Push(653);
      obj2.Push(6);
      obj2.Push(7);
      obj2.Push(4);
      obj2.Push(12);
       
      GenericNode obj3=new GenericNode();
     // obj3.Merge(obj1, obj2);
      obj1.Merge(obj2);
      obj3.print();
       
    }
    
}
