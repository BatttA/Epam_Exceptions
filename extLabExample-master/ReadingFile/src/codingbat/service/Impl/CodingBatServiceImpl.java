package codingbat.service.Impl;

import codingbat.service.CodingBatInterface;

public class CodingBatServiceImpl implements CodingBatInterface {
    @Override
    public int roundSum(int a, int b, int c) {
        a = roundTen(a);
        b = roundTen(b);
        c = roundTen(c);
        int sum = a + b + c;
        return sum;
    }

    private int roundTen(int number) {
        int mod = number % 10;
        int roundNumber;
        if (mod >= 5) {
            roundNumber = number + 10 - mod;
        } else {
            roundNumber = number - mod;
        }
        return roundNumber;
    }

    @Override
    public int luckySum(int a, int b, int c) {
        int sum;
        if (a != 13 && b != 13 && c != 13) {
            sum = a + b + c;
        } else {
            if (a == 13) {
                sum = 0;
            } else {
                if (b == 13) {
                    sum = a;
                } else {
                    sum = a + b;
                }
            }
        }
        return sum;
    }

    @Override
    public int loneSum(int a, int b, int c) {
        int sum = 0;
        if (a != b && b != c && a != c) {
            sum = a + b + c;
        }
        if (a == b && b == c) {
            sum = 0;
        } else {
            if (a == b) {
                sum = c;
            }
            if (a == c) {
                sum = b;
            }
            if (b == c) {
                sum = a;
            }
        }
        return sum;
    }
}
