package generic;

public class Generic <anytype> {
    public anytype arr[];
    public int size;
    public int index;

    public Generic(int size) {
        this.size = size;
        index=-1;
        arr=(anytype[]) new Object[size];
    }
    
    
    public  void Push(anytype data){
        if(index<size-1)
        {
            ++index;
            arr[index]=data;
            
        }
        
    }
    
    public anytype Pop(){
        anytype current_data=null;
        if(index>=0){
            current_data=arr[index];
            index--;
        }
     return current_data;   
    }
    
    public anytype Peek(){
        return arr[index];
    }
    
    public int GetSize(){
        return size;
        
    }
    
    public boolean Empty(){
        if(index<=0){
            return true;
        } 
        return false;
    }
    public void Clear(){
        index=-1;
        System.out.println("List clear");
    }
   //Merge.........
    public boolean Merge(Generic s2){
        if(s2!=null)
        {
            int count=s2.index;
            for(int i=0; i<count; i++){
                this.Push((anytype) s2.Pop());
            }
            return true;
        }
        return false;
    }
    
    public void Print(){
       
        for(int i=0; i<=index; i++){
            System.out.println(arr[i]);
        }
        
        
    }
    

    public static void main(String[] args) {
        Generic <Integer> st1=new Generic(5);
        Generic <String> st2=new Generic(3);
        st1.Push(3);
        st1.Push(5);
        st1.Push(12);
       
        st2.Push("Atif");
        st2.Push("Malik");
   //     System.out.println("Size:"+st1.GetSize());
       
     //System.out.println("Empty:"+st1.Empty());
       // st1.Print();
        //st1.Clear();
        st1.Print();
        System.out.println("List 2..");
        st2.Print();
        System.out.println("Merge...");
        Generic st3=new Generic(21);
        System.out.println(st1.Merge(st2));
        st1.Print();
        
      //  System.out.println("Delete data "+list.Pop());
    //    System.out.println("Top data: "+list.Peek());
        //System.out.println("In String ###############");
 //       list1.Push("Atif");
   //     list1.Push("Malik");
     //   list1.Push("CS");
    //    list1.Print();
     //   System.out.println(list1.Pop());
      //  System.out.println(list1.Peek());
    }
    
}
