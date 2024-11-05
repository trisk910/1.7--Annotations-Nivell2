package org.example.Level1;

import org.example.Level1.Bussiness.OnlineWorker;
import org.example.Level1.Bussiness.OnsiteWorker;

public class MainLevel1 {
    public static void main(String[] args) {
        System.out.println("----------Ex1----------");
        OnlineWorker onlineWorker1 = new OnlineWorker("Pepito", "Palotes", 6.7);
        System.out.println("Online worker: " + onlineWorker1);
        System.out.println("Sou(196h): " + onlineWorker1.calculateSalary(196));
        OnsiteWorker onsiteWorker1 = new OnsiteWorker("Margarita", "Morango", 12.6);
        System.out.println("\nOn site worker: " + onsiteWorker1);
        System.out.println("Sou(180h): " + onsiteWorker1.calculateSalary(180));

        System.out.println("\n----------Ex2----------");
        DepracatedMethods.depractedMethods();
    }
}