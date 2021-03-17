package enams;

import java.util.Arrays;

public class Enum1 {
    public static void main(String[] args) {
        Today today = new Today(WeeksDays.MONDAY);
        //today.daysInfo();
        //System.out.println(today.weeksDay);
        WeeksDays w15 = WeeksDays.valueOf("SUNDAY");
        System.out.println(w15);
        WeeksDays [] array = WeeksDays.values();
        System.out.println(Arrays.toString(array));
    }
}
enum WeeksDays{
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("so-so"),
    THURSDAY("so-so"),
    FRIDAY("good"),
    SATURDAY("great"),
    SUNDAY("good");

    private String mood;

    WeeksDays(String mood) {
        this.mood = mood;
    }

    public String getMood(){
        return mood;
    }
}

class Today{
    WeeksDays weeksDay;

    public Today(WeeksDays weeksDay){
        this.weeksDay = weeksDay;
    }

    void daysInfo(){
        switch (weeksDay){
            case MONDAY:
            case THURSDAY:
            case WEDNESDAY:
            case TUESDAY:
            case FRIDAY:
                System.out.println("Idi na raboty");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Mojno otdohnut");
                break;
        }
       // System.out.println("Nastroenie v etot den: "+ weeksDay.getMood());
    }
}