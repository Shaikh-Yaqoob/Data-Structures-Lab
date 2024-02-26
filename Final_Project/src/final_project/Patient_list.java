package final_project;

/**
 *
 * @author Atif Malik
 */
class PNode
{
    Patient patient;
    PNode next,previous;

    public PNode() {
    }

    public PNode(Patient patient) {
        this.patient = patient;
        next=null;
        previous=null;
    }
    
}
public class Patient_list {
    PNode head,tail;

    public Patient_list() {
   head=null;
   tail=null;
    }
    public void Insert(Patient patient)
    {
        PNode node=new PNode(patient);
        
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
    public Patient SearchById(String id)
    {
        PNode temporary=head;
        while(temporary!=null)
                {
                    if(temporary.patient.getId().equals(id))
                    {
                        return temporary.patient;
                    }
                    
                    temporary=temporary.previous;
                }
        return null;
        
    }
    
     public Patient SearchByContact(String contact)
    {
        PNode temporary=head;
        while(temporary!=null)
                {
                    if(temporary.patient.getContact().equals(contact))
                    {
                        return temporary.patient;
                    }
                    
                    temporary=temporary.previous;
                }
        return null;
        
    }
     
     
     public Patient SearchByName(String name)
    {
        PNode temporary=head;
        while(temporary!=null)
                {
                    if(temporary.patient.getName().equals(name))
                    {
                        return temporary.patient;
                    }
                    
                    temporary=temporary.previous;
                }
        return null;
        
    }
      public void AllPatientInfo()
    {
        PNode temporary=head;
        while(temporary!=null)
                {
                    System.out.println("Pateint Id:"+temporary.patient.getId());
                    System.out.println("Patient Name:"+temporary.patient.getName());
                    System.out.println("Patient Conctact:"+temporary.patient.getContact());
                    temporary=temporary.previous;
                }
        
        
    }
  
   
    
}
