package Task11;

public class Main {
    public static void main(String[] args){
        Car car1 = new Car("Audi", "red", 65414);
        Driver dr1 = new Driver("Mike", 54267, 5);
        Passenger ps1 = new Passenger("Karl", 48972);
        Order or1 = new Order(2, "Munk's str.", "Kopernikas str.", 20);

        System.out.println(car1);
        System.out.println(dr1);
        System.out.println(ps1);
        System.out.println(or1);
    }
}
