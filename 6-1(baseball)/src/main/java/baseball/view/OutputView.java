package baseball.view;

public class OutputView {
    private static final String GAME_START = "숫자 야구 게임을 시작합니다.";
    private static final String GAME_END = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";

    public void gameStart(){
        System.out.println(GAME_START);
    }

    public void gameEnd(){
        System.out.println(GAME_END);
    }

    public void resultOfRound(String result){
        System.out.println(result);
    }


}
