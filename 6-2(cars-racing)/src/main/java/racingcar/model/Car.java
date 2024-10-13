package racingcar.model;

public class Car {
    private final String name;
    private int ranking = 0;

    public Car(String name){
        this.name = name;
    }

    public void upRanking(){
        ranking ++;
    }

    public String getName(){
        return name;
    }

    public int getRanking(){
        return ranking;
    }


}
