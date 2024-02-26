package generic_queue;

public class Generic_Queue <anytype> {
    private anytype arr[];
    private int size;
    private int index;

    public Generic_Queue(int size) {
        this.size = size;
        index=-1;
        arr=(anytype[]) new Object[size];
    }
    
    public anytype Enqueue(anytype data){
        if(index<size-1){
            ++index;
            arr[index]=data;
        }
        return data;
    }
    
    public anytype Dequeue(){
        anytype current_data=null;
        if(index>=0){
            current_data=arr[index];
            --index;
        }
        return current_data;
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
            System.out.println("Clear");
        
    }
    
    public void Print(){
       
        for(int i=0; i<=index; i++){
            System.out.println(arr[i]);
        }
        
        
    }
    
    

    public static void main(String[] args) {
        Generic_Queue <String> obj=new Generic_Queue(4);
        Generic_Queue <Integer> obj1=new Generic_Queue(4);
 
     obj1.Enqueue(45);
     obj1.Enqueue(34);
     obj1.Enqueue(65);
        System.out.println("Size: "+obj1.GetSize());
        System.out.println("Empty:"+obj1.Empty());
    
     obj1.Print();
     obj1.Clear();
    
     obj1.Print();
    }
    
}
