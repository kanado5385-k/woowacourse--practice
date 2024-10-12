package baseball.controller;

import baseball.model.Game;
import baseball.model.Random;
import baseball.model.Round;
import baseball.view.InputView;
import baseball.view.OutputView;

public class MainComtroller {
    private Game game;
    private InputView inputView;
    private OutputView outputView;

    public MainComtroller(){
        this.game = new Game();
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void GameStart(){
        outputView.gameStart();
        while(!game.isEnd()){
            gameRound();
            gameRestart();
        }
    }

    public void gameRound(){
        Random computer = new Random();
        String RandomNum = computer.GetRandomNum();
        Round round;
        do{
            String MyNumber = inputView.inputThreeNum();
            inputView.validatePlayerNumber(MyNumber);
            round = Round.CheckTwoNumber(MyNumber, RandomNum);
            String relult = round.generateResult();
            outputView.resultOfRound(relult);
        }while (!round.isThreeStrike());
    }

    public void gameRestart(){
        outputView.gameEnd();
        String user = inputView.inputOneOrTwo();
        inputView.isOneOrTwo(user);
        if(user.equals("2")){
            game.End();
        }

    }
}
