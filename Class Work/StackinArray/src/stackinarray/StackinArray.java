package stackinarray;

public class StackinArray <E>  {
    
    private E arr[];
    int N;
    int i;

    
    StackinArray (int N){
         arr=(E[]) new Object[N];
        i=0;
    }
    
    public void Push(E Object)throws FullStackException{
        if(i==N-1)  {
        
             throw new FullStackException("stack is full");
        }
        
            arr[i]=(E) new Object();
            arr[i]=Object;
            i++;
        
    }
    
    public E Pop() throws FullStackException{
        if(i==0){
            throw new FullStackException("stack is empty");
        }
        
            arr[i]=(E) new Object();
            E data=arr[i-1];
            arr[i-1]=null;
            i--;
            return data;
        
    }
    
    
     

    public static void main(String[] args) {
        StackinArray <Integer> list=new StackinArray(3);
        StackinArray <String> list1=new StackinArray(3);
      try{  
          list.Push(4);
        System.out.println(list1.Pop());
    }
      catch (FullStackException e) {
           
            System.out.println("Runtime Exception : "+e);
           
        }
    }

    private static class FullStackException extends Exception {

        public FullStackException() {
        }

        private FullStackException(String stack_is_full) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
