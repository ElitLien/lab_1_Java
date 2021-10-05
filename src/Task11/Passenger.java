package Task11;

public class Passenger {
    private String nameP;
    private int numberP;

    Passenger(String nameP, int numberP){
        this.nameP = nameP;
        this.numberP = numberP;
    }

    public int getNumberP() {
        return numberP;
    }

    public String getNameP() {
        return nameP;
    }

    @Override
    public boolean equals(Object o){
        if (o == this)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Passenger passenger = (Passenger) o;

        return nameP == passenger.nameP &&
                numberP == passenger.numberP;
    }

    @Override
    public int hashCode(){
        return this.getNumberP() +
                this.getNameP().hashCode();
    }

    @Override
    public String toString(){
        return "Passenger : " +
                "name = " + nameP +
                "; number = " + numberP;
    }
}
