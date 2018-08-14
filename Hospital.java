/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagement;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;

public class Hospital {
        
    private String hospitalName,speciality,location;
    private int nodoctors,hid;
    private long contact;
    

    public void readHospitalData(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the hostpital id, name, speciality, location, no of doctors and contant)");
        hid=scan.nextInt();
        hospitalName=scan.next();
        speciality=scan.next();
        location=scan.next();
        nodoctors=scan.nextInt();
        contact=scan.nextLong();
    }
    
    public void printHospitalData(){
        System.out.println("Hospital Id : "+hid);
        System.out.println("Hospital name : "+hospitalName);
        System.out.println("Location : "+location);
        System.out.println("No. of doctors : "+nodoctors);
        System.out.println("Speciality : "+speciality);
        System.out.println("Contact no : "+contact);
    }
    
    public int getHospitalId(){
        return hid;
    }
}
