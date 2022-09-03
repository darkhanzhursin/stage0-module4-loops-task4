package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int sum = 0;
        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
        } else if (numberToSkip < 0) {
            System.out.println("last number in row is negative");
        } else {
            for (int i = 0; i < lastInRow; i++) {
                if (i == numberToSkip) {
                    continue;
                }
                sum += i;
            }
            //sum -= numberToSkip;
            int number = numberToSkip + lastInRow;
            System.out.println("skipped sum is " + number);
            System.out.println("counted sum is " + sum);
        }
    }
}
