package baseball.utils;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomUtils {

    public static int[] getRandomNumbers() {
        int[] numbers = new int[3];
        boolean flag = false;

        for(int i=0; i<3;) {
            int randNum = Randoms.pickNumberInRange(1,9);
            if(checkDuplicated(randNum,numbers)) {
                numbers[i++]=randNum;
            }
        }
        return numbers;
    }

    public static boolean checkDuplicated(int randNum, int[] numbers) {
        for(int j=0; j<numbers.length; j++) {
            if(numbers[j] == randNum) {
                return false;
            }
        }
        return true;
    }
}