/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.queue;

import javax.sound.midi.Soundbank;

/**
 *
 * @author muzamil
 */
public class Students {
    
    
    String name, cms, GPA;
    
    
    public Students(String name, String cms, String gpa){
    
    
        this.name
                 = name;
        this.cms = cms;
        this.GPA = gpa;
    
    
    }
    
    
    
    public void printInfo(){
    
    
        System.out.println("Name :"+ this.name);
        System.out.println("CMS : "+ this.cms);
        System.out.println("GPA  : "+ this.GPA);
    
    }
    
    
    
    
}
