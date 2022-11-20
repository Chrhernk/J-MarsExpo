package com.company;

public class C_Dorms extends C_Pod{


    int NumberofBeds;
    private int NumberofLavitories;
    int NumberofShowers;

    void SetBathroomNumber(int NumberofBath)//setter
    {
        NumberofLavitories = NumberofBath;
    }
    int GetBathroomNumber()//getter
    {
        return NumberofLavitories;
    }
    C_Dorms(String Name, String Type, int BedNumbers, int numberofLavitories, int numberofShowers, boolean IsSafe ){ //  Builds our class
        this.NumberofBeds = BedNumbers;
        this.NumberofLavitories = numberofLavitories;
        this.NumberofShowers = numberofShowers;
        this.isBuildingSafe = IsSafe;
        this.BuildingName = Name;
        this.BuildingType = Type;
    }

    public void RunDormReport() // Prints report
    {
        System.out.println( BuildingName + " : Building : " + BuildingType);
        System.out.println( BuildingName + " : Beds : " + NumberofBeds);
        System.out.println( BuildingName + " : Showers : " + NumberofShowers);
        System.out.println( BuildingName + " : Lavatories : " + NumberofLavitories);
        System.out.println( BuildingName + " : Safe? : " + isBuildingSafe);
    }
}
