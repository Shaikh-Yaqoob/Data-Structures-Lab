
package Genenric_Stack_Node;
public class Generic_Stack_Node<AnyType>{
    
    private class Node<AnyType>{
        AnyType data;
        Node(AnyType data){
            this.data = data;
        }
    }
    
    private Node [] stack;
    private int length , top;

    public Generic_Stack_Node(int length) {
        this.length = length; 
        stack =  new Node[length];
        this.top = -1;
    }
    
    public void push(AnyType data){
        if(top == length-1){
            System.out.println("Stack is full");
        }
        else{
            stack[++top] =  new Node(data);
        }
    }
    
    public AnyType pop(){
        if(top == -1){
       
            return null;
        }
        else{
            AnyType data = (AnyType) stack[top].data; 
            stack[top] = null;
            top --;
            return data;
        }
    }
    
    public void display(){
        if(top == -1){
            System.out.println("Empty Stack");
        }
        else{
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i].data + " , ");
            }
            System.out.println("null");
        }
    }
    
    public AnyType peek(){
        if(top == -1){
            return null;
        }
        else{
            return (AnyType)stack[top].data;
        }
    }
    
    public int getSize(){
        return length;
    }
    
    public void clear(){
        top = -1;
    }
    
     public boolean isEmpty(){
         return top<=0;
     } 
    
     
     
    public static void main(String[] args) {
        Generic_Stack_Node<Integer> stack = new Generic_Stack_Node(10);
        stack.push(432);
        stack.push(342);
        stack.push(432);
       // stack.clear();
        System.out.println("Size: "+stack.getSize());
        System.out.println("Empty: "+stack.isEmpty());

        System.out.println("Pop: "+stack.pop());
        
        stack.display();
        
        //System.out.println(stack.pop());
        System.out.println("Peek: "+stack.peek());
        
    }
    
}