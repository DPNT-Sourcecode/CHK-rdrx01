package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        int number_A = 0;
        int number_B = 0;
        int all_B = 0;
        int number_E = 0;
        int price = 0;
        for (int c=0; c < skus.length(); c++) {
            if (skus.charAt(c) == 'A') {
                number_A++;
                price += 50;
                if (number_A == 3) {
                    price -= 150;
                    price += 130;
                }
                if (number_A == 5) {
                    price -= 230;
                    price += 200;
                    number_A = 0;
                }
            }
            else if (skus.charAt(c) == 'B') {
                all_B ++;
                number_B++;
                price += 30;
                if (number_B == 2) {
                    price -= 60;
                    price += 45;
                    number_B = 0;
                }
            }
            else if (skus.charAt(c) == 'C') {
                price += 20;
            }
            else if (skus.charAt(c) == 'D') {
                price += 15;
            }
            else if (skus.charAt(c) == 'E') {
                number_E ++;
                price += 40;
                if (number_E == 2) {
                    if (all_B > 0) {
                        all_B--;
                        price -= 30;
                    }
                }
            }
            else {
                return -1;
            }
        }
        return price;
    }
}




