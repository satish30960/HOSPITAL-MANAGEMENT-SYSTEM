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
public class HospitalManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HospitalOperations ho=new HospitalOperations();
        Scanner scan=new Scanner(System.in);
        int option;
        do{
            System.out.println("Menu");
            System.out.println("----");
            System.out.println("1. Add hospital");
            System.out.println("2. Remove hospital");
            System.out.println("3. Search hospital");
            System.out.println("4. List hospitals");
            System.out.println("5. Exit");
            System.out.println("Choose an option");
            option=scan.nextInt();
            switch(option){
                case 1:
                    ho.addHospital();
                    break;
                    
                case 2:
                    ho.removeHospital();
                    break;
                    
                case 3:
                    ho.searchHospital();
                    break;
                    
                case 4:
                    ho.printHospitals();
                    break;
            }
        }while(option<=4);
    }
    
}
