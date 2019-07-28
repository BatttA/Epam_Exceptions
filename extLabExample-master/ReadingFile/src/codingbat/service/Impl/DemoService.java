package codingbat.service.Impl;

public class DemoService {
    CodingBatServiceImpl codingBat = new CodingBatServiceImpl();

    int number1 = 12;
    int number2 = 11;
    int number3 = 17;

    public void run() {

        System.out.println("Logic2, roundSum: ");
        System.out.println("For this problem, we'll round an int value up to the next multiple of 10 if its " +
                "rightmost digit is 5 or more, so 15 rounds up to 20. Alternately, round down to the previous multiple " +
                "of 10 if its rightmost digit is less than 5, so 12 rounds down to 10. Given 3 ints, a b c, return the sum of their " +
                "rounded values. To avoid code repetition, write a separate helper \" public int round10(int num) {\" " +
                "and call it 3 times. Write the helper entirely below and at the same indent level as roundSum().");
        int roundSum = codingBat.roundSum(number1, number2, number3);
        System.out.println("Sum " + number1 + " " + number2 + " " + number3 + " = " + roundSum);

        System.out.println("Logic2, luckySum: ");
        System.out.println("Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count towards the sum " +
                "and values to its right do not count. So for example, if b is 13, then both b and c do not count.");
        int luckySum = codingBat.luckySum(number1, number2, number3);
        System.out.println("Sum " + number1 + " " + number2 + " " + number3 + " = " + luckySum);

        System.out.println("Logic2, loneSum: ");
        System.out.println("Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, " +
                "it does not count towards the sum.");
        int loneSum = codingBat.loneSum(number1, number2, number3);
        System.out.println("Sum " + number1 + " " + number2 + " " + number3 + " = " + loneSum);
    }
}
