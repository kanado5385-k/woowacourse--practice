package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;

public class Random {
    private final String RandomNum;

    public Random(){
        this.RandomNum = createRandomNum();
    }

    private String createRandomNum(){
        StringBuilder computer = new StringBuilder();
        while (computer.length() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            String randomStr = String.valueOf(randomNumber);
            if (computer.indexOf(randomStr) == -1) {
                computer.append(randomStr);
            }
        }
        return computer.toString();

    }

    public String GetRandomNum(){
        return RandomNum;
    }
}
