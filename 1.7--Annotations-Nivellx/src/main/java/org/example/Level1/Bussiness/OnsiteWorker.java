package org.example.Level1.Bussiness;

public class OnsiteWorker extends Worker{
    private static float gas = 1.25f;

    public OnsiteWorker(String name, String surname, double pricePerHour) {
        super(name, surname, pricePerHour);
    }
    @Override
    public double calculateSalary(float hours) {
        return super.calculateSalary(hours * gas);
    }
    @Deprecated
    public static void deprecatedOnsiteMethod(){
        System.out.println("Deprecated method onsite worker");

    }
}
