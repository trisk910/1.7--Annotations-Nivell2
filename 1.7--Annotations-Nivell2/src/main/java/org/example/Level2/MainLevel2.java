package org.example.Level2;

import org.example.Level2.Bussiness.ObjectT;
import org.example.Level2.Persistance.ObjectTDAO;

import java.io.IOException;

public class MainLevel2 {
    public static void main(String[] args) {
        System.out.println("----------Ex1----------");
        ObjectT obj = new ObjectT(10, 20);
        try {
            ObjectTDAO.writeJson(obj);
        } catch (IOException e) {
            System.getLogger(e.getMessage());
        }

    }
}