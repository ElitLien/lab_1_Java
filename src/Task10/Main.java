package Task10;

public class Main {
    public static void main(String[] args){
        Weather wd1 = new Weather(8, "rainy" , 65);
        Weather wd2 = new Weather(15, "sunny", 10);
        Weather wd3 = new Weather(20, "sunny",  0);
        Weather wd4 = new Weather(-3, "snowly", 80);
        Weather wd5 = new Weather(10, "rainy", 49);
        Weather wd6 = new Weather(20, "sunny", 20);
        Weather wd7 = new Weather(-2, "snowly", 85);

        final Day[] days = new Day[7];

        days[0] = new Day("Mon", wd1);
        days[1] = new Day("Tue", wd2);
        days[2] = new Day("Wed", wd3);
        days[3] = new Day("Thu", wd4);
        days[4] = new Day("Fri", wd5);
        days[5] = new Day("Sat", wd6 );
        days[6] = new Day("Sun", wd7 );

        for(int d = 0; d < 7; d++)
            System.out.println(days[d].toString());
    }
}
