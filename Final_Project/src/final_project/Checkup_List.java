package final_project;
/**
 *
 * @author Atif Malik
 */

 class CNode{
    Checkup cu;
    CNode next,pre;
    
    public CNode(Checkup cu){
        next=pre=null;
        this.cu=cu;
        
    }
  public class Checkup_List{
      CNode head;
      CNode tail;
      
      public Checkup_List(){
          head=null;
          tail=null;
      }
    
  
  public void Enqueue(Checkup cu){
      CNode node=new CNode(cu);
      if(head==null||tail==null)
        {
            head=node;
            tail=node;
        }
      else if(head.cu.getPriority()<cu.getPriority()){
          head.next=node;
          node.pre=head;
          head=node;
      }
      else if(tail.cu.getPriority()>=cu.getPriority()){
          tail.next=node;
          node.pre=tail;
          tail=node;
      }
      else{
          CNode temporary=null;
          while(temporary!=null){
              if(temporary.cu.getPriority()>=cu.getPriority())
              {
                  break;
              }
              temporary=temporary.next;
          }
          node.next=temporary;
          node.pre=temporary.pre;
          temporary.pre.next=node;
          temporary.pre=node;
          
      }
      
  }
  public Checkup Dequeue(){
      if(head==null)
      {
          return null;
      }
      CNode Checkup=head;
      head=head.next;
      return Checkup.cu;
  }
  //Recomdendation.......
  public void addRecomendation(int index, String rec)
  {
      CNode temp=head;
      int i=0;
      if(head==null)
      {
          System.out.println("Empty");
      }
      else{
          while(temp!=null){
              if(index==i){
                  temp.cu.setRecommendation(rec);
                  break;
              }
              i++;
              temp=temp.pre;
          }
      }
  }
  public Patient getPatient(int index){
      CNode temp=head;
      int i=0;
     if(head==null)
      {
          System.out.println("Empty");
          return null;
      }
      else{
          while(temp!=null){
              if(index==i){
                  
                  break;
              }
              i++;
              temp=temp.pre;
              
          }
          return temp.cu.getPatient();
      }
  }
  
  public void Print(){
      CNode temporary=head;
      if(head==null){
          System.out.println("No List");
      }
      else{
          while(temporary!=null)
          {
              System.out.println(temporary.cu.getPriority()+" "+temporary.cu.getRecommendation());
              temporary=temporary.pre;
          }
      }
  }
}
 }
