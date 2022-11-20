package com.company;

public class Main {

    public static void main(String[] args) {
        // Create the objects from our classes, and build the information within the classes
        C_Dorms O_Dormitory01 = new C_Dorms("The Sleep Center", "Dormitories",20,3,5,true);
        C_Dorms O_Dormitory02 = new C_Dorms("Long Term Sleep Assessment", "Dormitories", 10,2,3,true);
        C_Cafeteria O_Cafeteria01 = new C_Cafeteria("Red's Cafe","Cafeteria",3, false, 10, true, true);
        C_Command O_CommandCenter = new C_Command("Centeral Command","Command Pod",true, true);
        C_Labs O_DextersLab = new C_Labs("Dexter's Lab","Laboratory",3, true, false);
        C_Storage O_StorageRoom = new C_Storage("Storage Facility","Storage Facility",3000, 1.01, true);

        // Set the Properties of  the new objects within the class constructor


// from the main file, display a stat report from the base - Using the Constructor, we now have a super simple output for our Report
        System.out.println("BASE :: STATUS REPORT");
        System.out.println("\n\n");
        O_Dormitory01.RunDormReport();
        System.out.println("\n");
        O_Dormitory02.RunDormReport();
        System.out.println("\n");
        O_Cafeteria01.RunCafeReport();
        System.out.println("\n");
        O_CommandCenter.RunCommandReport();
        System.out.println("\n");
        O_DextersLab.RunLabsReport();
        System.out.println("\n");
        O_StorageRoom.RunStorageReport();
        System.out.println("\n\n");
        System.out.println(" STATUS REPORT PRINTED TO SCREEN :: PLEASE DOUBLE CHECK ALL STATUSES BEFORE CONTINUING WITH THE DAY");
    }
}
