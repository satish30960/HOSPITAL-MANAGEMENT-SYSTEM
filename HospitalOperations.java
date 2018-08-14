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
import java.util.*;

public class HospitalOperations {
    
    private ArrayList<Hospital>hospitals;
    private Hospital h;
    private Scanner scan;
    
    public HospitalOperations(){
        hospitals=new ArrayList<>();        
        scan=new Scanner(System.in);
    }
    
    public void addHospital(){
        h=new Hospital();
        h.readHospitalData();
        hospitals.add(h);
        System.out.println("Hospital data added");
    }
    
    public void removeHospital(){
        System.out.println("Enter the hospital id");
        int id=scan.nextInt();
        boolean status=false;
        for(Hospital h1:hospitals){
            if (h1.getHospitalId()==id){
                hospitals.remove(h1);        
                status=true;
                break;
            }
        }
        if (status){
            System.out.println("Hospital removed");
        }
        else{
            System.out.println("Hospital not found");
        }            
    }
    
    public void searchHospital(){
        System.out.println("Enter the hospital id");
        int id=scan.nextInt();
        boolean status=false;
        for(Hospital h1:hospitals){
            if (h1.getHospitalId()==id){
                h1.printHospitalData();
                status=true;
                break;
            }
        }
        if (!status){
            System.out.println("Hospital not found");
        }
    }
    
    
    public void printHospitals(){
        System.out.println("List of hospitals");
        for(Hospital h1:hospitals){
            h1.printHospitalData();
        }       
    }
    
    
}
