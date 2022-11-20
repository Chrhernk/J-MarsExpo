package com.company;

public class C_Labs extends C_Pod{

    private boolean isLocked;
    private int SecLevel;

    void SetSecLevel(int LevelSec)//setter
    {
       SecLevel = LevelSec;
    }

    int GetSecLevel()// getter
    {
     return SecLevel;
    }

    void SetisLocked(boolean Locked)//setter
    {
        isLocked = Locked;
    }
    boolean GetisLocked()// getter
    {
        return isLocked;
    }
    C_Labs(String Name, String Type, int LevelSec, boolean IsSafe, boolean Locked ){ // builds our class
        this.SecLevel = LevelSec;
        this.isLocked = Locked;
        this.isBuildingSafe = IsSafe;
        this.BuildingName = Name;
        this.BuildingType = Type;
    }

    public void RunLabsReport() // prints report
    {
        System.out.println( BuildingName + " : Building : " + BuildingType);
        System.out.println( BuildingName + " : Locked? : " + isLocked);
        System.out.println( BuildingName + " : Security Level : " + SecLevel);
        System.out.println( BuildingName + " : Safe? : " + isBuildingSafe);
    }
}
