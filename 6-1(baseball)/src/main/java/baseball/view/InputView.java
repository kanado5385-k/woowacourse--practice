package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final String PLAYER_NUMBER_PROMPT = "숫자를 입력해주세요 :";
    private static final String CONTINUE_GAME_PROMPT = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    private static final int VALID_NUMBER_LENGTH = 3;
    private static final String VALID_NUMBER_PATTERN = "[1-9]{3}";

    public String inputThreeNum(){
        System.out.println(PLAYER_NUMBER_PROMPT);
        return Console.readLine();
    }

    public String inputOneOrTwo(){
        System.out.println(CONTINUE_GAME_PROMPT);
        return Console.readLine();
    }

    public static void validatePlayerNumber(String playerNumber) {
        if (playerNumber.length() != VALID_NUMBER_LENGTH) {
            throw new IllegalArgumentException("숫자의 길이가 3이 아닙니다.");
        }
        if (!playerNumber.matches(VALID_NUMBER_PATTERN)) {
            throw new IllegalArgumentException("1~9 사이의 숫자가 아닙니다.");
        }
        if (playerNumber.chars().distinct().count() != VALID_NUMBER_LENGTH) {
            //playerNumber.chars(): 문자열을 IntStream으로 변환. 각 문자는 정수로 처리
            //distinct(): 중복된 문자를 제거
            //count(): 중복된 문자를 제거한 후의 문자 수 반환
            throw new IllegalArgumentException("중복된 숫자가 있습니다.");
        }
    }

    public static void isOneOrTwo(String input) {
        if(!"1".equals(input) && !"2".equals(input)){
            throw new IllegalArgumentException("재시작/종료를 구분하는 1 또는 2의 숫자가 아닙니다.");
        }
    }



}
