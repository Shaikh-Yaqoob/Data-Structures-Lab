package final_project;

/**
 *
 * @author Atif Malik
 */
public class Checkup {
    
    Doctor doctor;
    Patient patient;
    int Priority;
    String Recommendation,Date;

    public Checkup(Doctor doctor, Patient patient, int Priority, String Recommendation, String Date) {
        this.doctor = doctor;
        this.patient = patient;
        this.Priority = Priority;
        this.Recommendation = Recommendation;
        this.Date = Date;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public int getPriority() {
        return Priority;
    }

    public void setPriority(int Priority) {
        this.Priority = Priority;
    }

    public String getRecommendation() {
        return Recommendation;
    }

    public void setRecommendation(String Recommendation) {
        this.Recommendation = Recommendation;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    @Override
    public String toString() {
        return "Checkup{" + "doctor=" + doctor.toString() + ", patient=" + patient.toString() + ", Priority=" + Priority + ", Recommendation=" + Recommendation + ", Date=" + Date + '}';
    }
    
    
}
