package org.example.Level2.Bussiness;

import org.example.Level2.Persistance.JsonSerializable;

@JsonSerializable(directory = "./src/main/resources")
public class ObjectT {
    private int value1;
    private int value2;

    public ObjectT(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
}