package Task11;

public class Driver {
    private String name;
    private int personal_number;
    private int exp;

    Driver(final String name, final int personal_number, final int exp){
        this.name = name;
        this.personal_number = personal_number;
        this.exp = exp;
    }

    public String getName() {
        return name;
    }

    public int getPersonal_number() {
        return personal_number;
    }

    public int getExp() {
        return exp;
    }

    @Override
    public boolean equals(Object o){
        if (o == this)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Driver driver = (Driver) o;

        return name == driver.name &&
                personal_number == driver.personal_number &&
                exp == driver.exp;
    }

    @Override
    public int hashCode(){
        return this.getPersonal_number() +
                this.getExp() +
                this.getName().hashCode();
    }

    @Override
    public String toString(){
        return "Driver : " +
                "name = " + name +
                "; personal number = " + personal_number +
                "; experience = " + exp + " years";
    }
}
