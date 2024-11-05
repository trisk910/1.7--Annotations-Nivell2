package org.example.Level1.Bussiness;

public class OnlineWorker extends Worker {
    private final static float internet = 1.25f;
    public OnlineWorker(String name, String surname, double pricePerHour) {
        super(name, surname, pricePerHour);
    }

    @Override
    public double calculateSalary(float hours) {
        return super.calculateSalary(hours * internet);
    }
    @Deprecated
    public static void deprecatedOnlineMethod(){
        System.out.println("Deprecated method online worker");
    }
}
