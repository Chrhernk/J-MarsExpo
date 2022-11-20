package com.company;

public class C_Cafeteria extends C_Pod{
// Props, AKA Attributes - the data of the class.
    int Stations;
    boolean isOpen;
    int NumberofTables;
    private boolean isClean;
// these are your Methods
    // Currently these are Getters and setters
    void SetisClean(boolean Clean)// setter
    {
        isClean = Clean;
    }

    boolean GetisClean()//getter
    {
        return isClean;
    }

    // Constructors are the easiest, They have two rules

    //1 . They must have the same name and Case as the Class Name
    //2 . They cant return anything.

    C_Cafeteria(String Name, String Type,int stations, boolean IsOpen, int numberofTables, boolean IsClean, boolean IsSafe ){ // this allows us to put in all of the information that is needed for the Class to Function.
        this.Stations = stations;
        this.isOpen = IsOpen;
        this.isClean = IsClean;
        this.NumberofTables = numberofTables;
        this.isBuildingSafe = IsSafe;
        this.BuildingName = Name;
        this.BuildingType = Type;

    }

    public void RunCafeReport() //Prints back the input data in a report
    {
        System.out.println( BuildingName + " : Building : " + BuildingType);
        System.out.println( BuildingName + " : Stations : " + Stations);
        System.out.println( BuildingName + " : Tables : " + NumberofTables);
        System.out.println( BuildingName + " : Clean? : " + isClean);
        System.out.println( BuildingName + " : Safe? : " + isBuildingSafe);
    }





}
