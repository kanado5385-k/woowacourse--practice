package racingcar.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import camp.nextstep.edu.missionutils.Randoms;

public class Racing {
    private ArrayList<Car> cars = new ArrayList<>();

    public Racing(ArrayList<Car> cars){
        this.cars = cars;
    }

    public static Racing makeCars(String[] CarsName){
        ArrayList<Car> cars = new ArrayList<>();
        for(String carName: CarsName){
            Car car = new Car(carName);
            cars.add(car);
        }
        return new Racing(cars);
    }

    public void goOrStop(){
        for(Car car : cars){
            int randomNumber = Randoms.pickNumberInRange(0, 9);
            if (randomNumber >= 4){
                car.upRanking();
            }
        }
    }

    public String roundResult(){
        StringBuilder sb = new StringBuilder();
        for(Car car: cars){
            sb.append(car.getName()).append(" : ");
            int numOfRank = car.getRanking();
            while (numOfRank > 0) {
                sb.append("-");
                numOfRank--;
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public String finalWinner(){
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> cars2 = new HashMap<>();
        for (Car car : cars){
            cars2.put(car.getName(),car.getRanking());
        }

        int maxValue = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : cars2.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                sb.setLength(0);
                sb.append("최종 우승자 : ").append(entry.getKey());
            } else if (entry.getValue() == maxValue) {
                sb.append(", ").append(entry.getKey());
            }
        }

        return sb.toString();
    }

}
