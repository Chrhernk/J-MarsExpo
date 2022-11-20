package com.company;

public class C_Command extends C_Pod{

    private boolean isOnline;

    void SetisOnline(boolean Online)//setter
    {
        isOnline = Online;
    }

    boolean GetisOnline()//getter
    {
        return isOnline;
    }

// Constructors are the easiest, They have two rules

    //1 . They must have the same name and Case as the Class Name
    //2 . They cant return anything.

    C_Command(String Name, String Type, boolean IsOnline,boolean IsSafe){ // Builds the class
        this.isOnline = IsOnline;
        this.isBuildingSafe = IsSafe;
        this.BuildingName = Name;
        this.BuildingType = Type;
    }

    public void RunCommandReport() // Prints our Report
    {
        System.out.println( BuildingName + " : Building : " + BuildingType);
        System.out.println( BuildingName + " : Online? : " + isOnline);
        System.out.println( BuildingName + " : Safe? : " + isBuildingSafe);
    }


}
