package final_project;

/**
 * @author Atif Malik
 */
public class Patient {
   private String id,Name,Contact;

    public Patient(String id, String Name, String Contact) {
        this.id = id;
        this.Name = Name;
        this.Contact = Contact;
    }

    public Patient() {
        this.id="";
        this.Name="";
        this.Contact="";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String Contact) {
        this.Contact = Contact;
    }

    @Override
    public String toString() {
        return "Patient{" + "id=" + id + ", Name=" + Name + ", Contact=" + Contact + '}';
    }
    
   
   
    
}
