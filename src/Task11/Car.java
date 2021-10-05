package Task11;

public class Car {
    private String model;
    private String color;
    private int number;
    private int places = 3;
    private Driver driver;

    Car(String model, String color, int number){
        this.model = model;
        this.color = color;
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public int getNumber() {
        return number;
    }

    public String getColor() {
        return color;
    }

    public int getPlaces() {
        return places;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }

    @Override
    public boolean equals(Object o){
        if (o == this)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Car car = (Car) o;

        return model == car.model &&
                color == car.color &&
                driver == car.driver &&
                places == car.places &&
                number == car.number;
    }

    @Override
    public int hashCode(){
        int hash = 7;
        hash = 31 * hash + (model == null ? 0 : model.hashCode());
        hash = 31 * hash + (color == null ? 0 : color.hashCode());
        hash = 31 * hash + number;
        hash = 31 * hash + (driver == null ? 0 : driver.hashCode());
        hash = 31 * hash + places;
        return hash;
    }

    @Override
    public String toString(){
        return "Car : " +
                "model = " + model +
                "; color = " + color +
                "; number = " + number +
                "; places = " + places;
    }
}
