package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        int number_A = 0;
        int number_B = 0;
        int price = 0;
        for (int c=0; c < skus.length(); c++) {
            if (skus.charAt(c) == 'A') {
                number_A++;
                price += 50;
                if (number_A == 3) {
                    price -= 150;
                    price += 130;
                    number_A = 0;
                }
            }
            if (skus.charAt(c) == 'B') {
                number_B++;
                price += 30;
                if (number_B == 2) {
                    price -= 60;
                    price += 45;
                    number_B = 0;
                }
            }
            if (skus.charAt(c) == 'C') {
                price += 20;
            }
            if (skus.charAt(c) == 'D') {
                price += 15;
            }
            else {
                return -1;
            }
        }
        return price;
    }
}


