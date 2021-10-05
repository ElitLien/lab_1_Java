package Task10;

public class Day {
    Weather weather;
    String day;

    Day( String day, Weather wd){
        this.weather = wd;
        this.day = day;
    }

    public Weather getWeather(){
        return weather;
    }

    public String getDay(){
        return day;
    }

    @Override
    public String toString(){
        String a = "";

        if(weather.temp > 0){
            a += String.valueOf(weather.temp);
            return (day + ": " + weather.type + " " + "+" + a + " " + weather.per + "%");}
        else
            a += String.valueOf(weather.temp);{
            return (day + ": " + weather.type + " " + a + " " + weather.per + "%");}
    }
}


