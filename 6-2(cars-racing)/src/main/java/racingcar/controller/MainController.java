package racingcar.controller;


import racingcar.model.Racing;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class MainController {
    private InputView inputView;
    private OutputView outputView;

    public MainController(){
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void RacingStart(){
        String[] NameOfCars = inputView.inputNameOfCars();
        inputView.validateNames(NameOfCars);

        Racing racing;
        racing = Racing.makeCars(NameOfCars);

        String NumOfRacing = inputView.inputNumOfRacing();
        inputView.validateRacingNum(NumOfRacing);
        int number = Integer.parseInt(NumOfRacing);

        outputView.result();
        while(number > 0) {  
            racing.goOrStop();
            String result = racing.roundResult();
            outputView.roundResult(result);
            number --;
        }
        String finalWinner = racing.finalWinner();
        outputView.finalWinner(finalWinner);
    }
    
}
