package stackkkinarray;

public class StackkkinArray <anytype> {
    
    private anytype arr[];
    int num;
    int index;
    
    StackkkinArray(int num){
       arr=(anytype[]) new Object[num];
        index=0;
    }
    
    public void Push(anytype Object) throws FullStackException{
        if(index==num-1){
            throw new FullStackException("Stack is full");
        } 
        
         arr[index]=(anytype) new Object();
            arr[index]=Object;
            index++;
        
        
    }
    
 public anytype Pop() throws FullStackException{
        if(index==0){
            throw new FullStackException("stack is empty");
        }
        
            arr[index]=(anytype) new Object();
            anytype data=arr[index-1];
            arr[index-1]=null;
            index--;
            return data;
        
    }
    
    
     

    public static void main(String[] args) {
        StackkkinArray <Integer> list=new StackkkinArray(3);
        StackkkinArray <String> list1=new StackkkinArray(4);
      try{  list.Push(3);
        list.Push(4);
        list1.Push("Atif");
        list1.Push("tif");
          System.out.println(list.Pop());
        
    }
      catch (FullStackException e) {
           
            System.out.println("Runtime Exception : "+e);
           
        }
    }
}
    

    
    

