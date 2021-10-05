package Task10;

import java.util.Objects;

public class Weather {
    public int temp;
    public String type;
    public int per;

    Weather(int temp, String type, int per){
        this.temp = temp;
        this.type = type;
        this.per = per;
    }

    public int getTemp(){
        return temp;
    }

    public String getType(){
        return type;
    }

    public int getPer(){
        return per;
    }

    @Override
    public boolean equals(Object o){
        if (o == this)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Weather weather = (Weather) o;

        return temp == weather.temp &&
                type == weather.type &&
                per == weather.per;
    }

    @Override
    public int hashCode(){
        return Objects.hash(temp, type, per);
    }
}
