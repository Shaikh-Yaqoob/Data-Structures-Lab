package final_project;

import java.util.Scanner;

/**
 * @author Atif Malik and Ali
 * 
 */
public class Final_Project {

    
    public static void main(String[] args) {
    Patient_list plist=new Patient_list();   
    DoctorList dlist=new DoctorList();
    Scanner sc=new Scanner(System.in);
    String username = "Atif";
    String password="Ali";
    String choice;
    Search:
    choice=sc.nextLine();
    
  
    
    
    
    
    while(true)
    {
        
        MainMenu();
        choice=sc.nextLine();
        if(choice.equals("1"))
        { System.out.println("Enter username and password");
          
  if(username!="Atif"&&password!="Ali"){
      System.out.println("pls check your username or password");
  }
          else{
        if(choice.equals("2"))
        {
            System.out.println("Doctor ID:");
            String id=sc.nextLine();
            
            System.out.println("Doctor Name:");
            String name=sc.nextLine();
            
            System.out.println("Doctor Contact:");
            String contact=sc.nextLine();
            
            System.out.println("Doctor Speciality:");
            String speciality=sc.nextLine();
            
            System.out.println("Doctor Fees:");
            int fees=sc.nextInt();
            sc.nextLine();
            
            Doctor d=new Doctor(id,name, contact, speciality,fees);
            dlist.Insert(d);
            
        }
        else if(choice.equals("3"))
        {
            System.out.println("Patient ID:");
            String id=sc.nextLine();
            
            System.out.println("Patient Name:");
            String name=sc.nextLine();
            
            System.out.println("Patient Contact:");
            String contact=sc.nextLine();
            
            Patient p=new Patient(id,name,contact);
            plist.Insert(p);
            
        }
        else if(choice.equals("4"))
        {
            System.out.println("");
            System.out.println("//////////......All Doctors Information...........////");
            dlist.AllDoctorInfo();
        }
        else if(choice.equals("5"))
        {
            System.out.println("");
            System.out.println("///////.......All Patient Information......//////");
            plist.AllPatientInfo();
        }
        
        else if(choice.equals("0"))
        {
            break;
        }
        else{
            System.out.println("Enter correct Number");
        }
        
    }
    
    }
    
    }  
    }
    
    public static void MainMenu(){
        System.out.println("::Hostpital Managment System::");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("//......Main Menu........||");
        System.out.println("press 1 for login id");
        System.out.println("Press 2 for new Doctor..");
        System.out.println("Press 3 for insert new Patient info..");
        System.out.println("Press 4 for All Doctors info..");
        System.out.println("Press 5 for All Patients info..");
     
        System.out.println("Press 0 for Exit info..");
        
        
        
    }
}