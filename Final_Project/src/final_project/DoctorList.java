package final_project;
/**
 *
 * @author Atif Malik
 */
class DNode
{
    Doctor doctor;
    DNode next,previous;

    public DNode() {
    }

    public DNode(Doctor doctor) {
        this.doctor = doctor;
        next=null;
        previous=null;
    }
    
}

public class DoctorList {
    
    DNode head,tail;
    
    public DoctorList(){
        head=null;
        tail=null;
    }
        public void Insert(Doctor doctor)
    {
        DNode node=new DNode(doctor);
        
        if(head==null||tail==null)
        {
            head=node;
            tail=node;
        }
        else
        {
            head.next=node;
            node.previous=head;
            head=node;
        }
                
    }
          public Doctor SearchById(String id)
    {
        DNode temporary=head;
        while(temporary!=null)
                {
                    if(temporary.doctor.getId().equals(id))
                    {
                        return temporary.doctor;
                    }
                    
                    temporary=temporary.previous;
                }
        return null;
        
    }
    
     public Doctor SearchByContact(String contact)
    {
        DNode temporary=head;
        while(temporary!=null)
                {
                    if(temporary.doctor.getContact().equals(contact))
                    {
                        return temporary.doctor;
                    }
                    
                    temporary=temporary.previous;
                }
        return null;
        
    }
     
     public Doctor getAtIndex(int index){
         DNode temp=head;
         for(int i=0; i<index; i++)
         {
             temp=temp.previous;
             
         }
         return temp.doctor;
         
     }
     
     public int size(){
         DNode temp=head;
         int count=0;
         while(temp!=null){
             count++;
             temp=temp.previous;
         }
         return count;
     }
     
     
     public void AllDoctorInfo()
    {
        DNode temporary=head;
        while(temporary!=null)
                {
                    System.out.println("Doctor Id: "+temporary.doctor.getId());
                    System.out.println(" Speciality: "+temporary.doctor.getSpeciality());
                    System.out.println("Doctor Name: "+temporary.doctor.getName());
                    System.out.println("Contact: "+temporary.doctor.getContact());
                    temporary=temporary.previous;
                }
        
        
    }
  

}
