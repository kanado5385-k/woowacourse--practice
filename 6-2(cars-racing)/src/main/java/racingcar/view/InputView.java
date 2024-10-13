package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final String NAME_OF_CARS = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String NUM_OF_RACING = "시도할 회수는 몇회인가요?";

    public String[] inputNameOfCars(){
        System.out.println(NAME_OF_CARS);
        String names = Console.readLine();
        String[] nameArray = names.split(",");
        return nameArray;
    }

    public String inputNumOfRacing(){
        System.out.println(NUM_OF_RACING);
        return Console.readLine();
    }

    public static void validateNames(String[] Names){
        for (String name : Names) {
            if (name.contains(" ")) {
                throw new IllegalArgumentException("이름이 공백을 포함하고 있습니다.");
            }
            if (name.length() > 5){
                throw new IllegalArgumentException("이름은 5자 이하만 가능합니다.");
            }
        }
    }

    public static void validateRacingNum(String Num) {
        if (Num.contains(" ")) {
            throw new IllegalArgumentException("시도할 회수가 공백을 포합하고 있으면 안됩니다.");
        }
        if (!Num.matches("[1-9]")) {
            throw new IllegalArgumentException("숫자가 아닙니다.");
        }
    }
}
