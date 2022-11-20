package com.company;

public class C_Storage extends C_Pod{

    int Capacity;
    private double HumidityLevel;

    void SetHumidityLevel(double AirToWater) // setter
    {
        HumidityLevel = AirToWater;
    }
    double GetHumidityLevel() // getter
    {
        return HumidityLevel;
    }

    C_Storage(String Name, String Type, int storageHeld, double Humid, boolean IsSafe ){ // builds our class
        this.Capacity = storageHeld;
        this.HumidityLevel = Humid;
        this.isBuildingSafe = IsSafe;
        this.BuildingName = Name;
        this.BuildingType = Type;
    }

    public void RunStorageReport() // prints report
    {
        System.out.println(BuildingName + " : Building : " + BuildingType);
        System.out.println(BuildingName + " : Stations : " + Capacity);
        System.out.println(BuildingName + " : Humidity Level : " + HumidityLevel);
        System.out.println(BuildingName + " : Safe? : " + isBuildingSafe);
    }


}
