package final_project;

/**
 *
 * @author Atif Malik
 */
public class Doctor {
    private String id,Name, Contact,speciality;
    int fees;

    public Doctor(String id, String Name, String Contact, String speciality, int fees) {
        this.id = id;
        this.Name = Name;
        this.Contact = Contact;
        this.speciality = speciality;
        this.fees = fees;
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

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "Doctor{" + "id=" + id + ", Name=" + Name + ", Contact=" + Contact + ", speciality=" + speciality + ", fees=" + fees + '}';
    }
    
    
    
}
