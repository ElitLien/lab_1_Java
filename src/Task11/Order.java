package Task11;

public class Order {
    private Car car;
    private int price;
    private String place_departure;
    private String place_arrival;
    private int creation_time;

    Order(int price, String p_d, String p_a, int creation_time){
        this.price = price;
        this.place_departure = p_d;
        this.place_arrival = p_a;
        this.creation_time = creation_time;
    }

    public Car getCar(){
        return car;
    }

    public double getPrice(){
        return price;
    }

    public String getPlace_departure(){
        return place_departure;
    }

    public String getPlace_arrival(){
        return place_arrival;
    }

    public int getCreation_time(){
        return creation_time;
    }

    @Override
    public boolean equals(Object o){
        if (o == this)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Order order = (Order) o;

        return car == order.car &&
                price == order.price &&
                place_departure == order.place_departure &&
                place_arrival == order.place_arrival &&
                creation_time == order.creation_time;
    }

    @Override
    public int hashCode(){
        int hash = 7;
        hash = 31 * hash + (car == null ? 0 : car.hashCode());
        hash = 31 * hash + price;
        hash = 31 * hash + creation_time;
        hash = 31 * hash + (place_departure == null ? 0 : place_departure.hashCode());
        hash = 31 * hash + (place_arrival == null ? 0 : place_arrival.hashCode());
        return hash;
    }

    @Override
    public String toString(){
        return "Order : " +
                "price = " + price + " dollars" +
                "; place departure = " + place_departure +
                "; place arrival = " + place_arrival +
                "; creation time = " + creation_time + " minutes";
    }
}
