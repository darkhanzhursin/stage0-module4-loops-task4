package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int sum = 0;
        int skippedSum = 0;
        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
        } else if (numberToSkip < 0) {
            System.out.println("last number in row is negative");
        } else if (numberToSkip == lastInRow) {
            for (int j = 0; j <= numberToSkip; j ++) {
                skippedSum += j;
            }
            System.out.println("skipped sum is " + skippedSum);
            System.out.println("counted sum is " + sum);
        } else {
            for (int i = 0; i < lastInRow; i++) {
                if (i == numberToSkip) {
                    continue;
                }
                sum += i;
            }
            for (int j = 0; j <= numberToSkip; j ++) {
                skippedSum += j;
            }
            System.out.println("skipped sum is " + skippedSum);
            System.out.println("counted sum is " + sum);
        }
    }
}
