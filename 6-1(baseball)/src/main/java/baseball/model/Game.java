package baseball.model;

public class Game {
    private String game;

    public Game(){ //게임 시작
        this.game = "start";
    }

    public boolean isEnd(){ //게임 진행즁인지 확인
        return this.game == "end";
    }

    public void End(){// 게임 끝
        this.game = "end";
    }
    
}
