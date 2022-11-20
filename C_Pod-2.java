package com.company;

public class C_Pod {

    String BuildingName;
    String BuildingType;

    boolean isBuildingSafe;

    void SetisSafe(boolean isSafe){ // setter
        isBuildingSafe = isSafe;
    }

    boolean GetisSafe(){ // getter
        return isBuildingSafe;
    }
}
