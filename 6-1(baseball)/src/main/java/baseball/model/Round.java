package baseball.model;

public class Round {
    private final int Strikes;
    private final int Bolls;

    public Round(int Strikes, int Bolls){
        this.Strikes = Strikes;
        this.Bolls = Bolls;
    }

    public static Round CheckTwoNumber(String MyNumber, String RandomNumber){
        int strikeNum = 0;
        int bollNum = 0;
        for(int i = 0; i < MyNumber.length(); i++){
            if (MyNumber.charAt(i) == RandomNumber.charAt(i)){
                strikeNum++;
            }
            else if(RandomNumber.indexOf(MyNumber.charAt(i)) != -1){
                bollNum ++;
            }
        }
        return new Round(strikeNum, bollNum);
    }

    public String generateResult() {
        StringBuilder result = new StringBuilder();

        if (Bolls > 0) {
            result.append(Bolls);
            result.append("볼");
        }
        if (Bolls > 0 && Strikes > 0) {
            result.append(" ");
        }
        if (Strikes > 0) {
            result.append(Strikes);
            result.append("스트라이크");
        }
        if (result.isEmpty()) {
            result.append("낫싱");
        }

        return result.toString().trim();
    }

    public boolean isThreeStrike(){
        return Strikes == 3;
    }

}
