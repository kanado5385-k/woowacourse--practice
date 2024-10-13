package racingcar.view;

public class OutputView {
    private static final String RESULT = "실행 결과";

    public void result(){
        System.out.println(RESULT);
    }

    public void finalWinner(String result){
        System.out.println(result);
    }

    public void roundResult(String result){
        System.out.println(result);
    }
}
