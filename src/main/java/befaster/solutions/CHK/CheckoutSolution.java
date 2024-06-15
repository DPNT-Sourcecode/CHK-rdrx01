package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        int number_A = 0;
        int number_B = 0;
        int all_B = 0;
        int number_E = 0;
        int price = 0;
        int number_F = 0;
        int number_H = 0;
        int number_K = 0;
        int number_N = 0;
        int all_M = 0;
        int number_P = 0;
        int number_Q = 0;
        int all_Q = 0;
        int number_R = 0;
        int number_U = 0;
        int number_V = 0;
        for (int c=0; c < skus.length(); c++) {
            if (skus.charAt(c) == 'B') {
                all_B++;
            }
            if (skus.charAt(c) == 'M') {
                all_M ++;
            }
            if (skus.charAt(c) == 'Q') {
                all_Q++;
            }
        }
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
                number_B++;
                price += 30;

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

            }
            else if (skus.charAt(c) == 'F') {
                price +=10;
                number_F ++;
                if (number_F > 2) {
                    price -= 10;
                    number_F = 0;
                }
            }
            else if (skus.charAt(c) == 'G' ) {
                price += 20;
            }
            else if (skus.charAt(c) == 'H' ) {
                number_H ++;
                price += 10;
                if (number_H == 5) {
                    price -= 50;
                    price += 45;

                }
                if (number_H == 10) {
                    price -= 95;
                    price += 80;
                    number_H = 0;
                }

            }
            else if (skus.charAt(c) == 'I' ) {
                price += 35;
            }
            else if (skus.charAt(c) == 'J') {
                price += 60;
            }
            else if (skus.charAt(c) == 'K' ) {
                number_K ++;
                price += 80;
                if (number_K == 2 ) {
                    price -= 160;
                    price += 150;
                    number_K = 0;
                }
            }
            else if (skus.charAt(c) == 'L') {
                price += 90;
            }
            else if (skus.charAt(c) =='M' ) {
                price += 15;
            }
            else if (skus.charAt(c) == 'N' ) {
                number_N ++;
                price += 40;
            }
            else if (skus.charAt(c) == 'O' ) {
                price += 10;
            }
            else if (skus.charAt(c) == 'P' ) {
                number_P ++;
                price += 50;
                if (number_P == 5) {
                    price -= 5*50;
                    price += 200;
                    number_P = 0;
                }
            }
            else if (skus.charAt(c) == 'Q' ) {
                number_Q ++;
                price += 30;


            }
            else if (skus.charAt(c) == 'R' ) {
                number_R ++;
                price += 50;
            }
            else if (skus.charAt(c) == 'S' ) {
                price += 30;
            }
            else if (skus.charAt(c) == 'T' ) {
                price += 20;
            }
            else if (skus.charAt(c) == 'U' ) {
                number_U ++;
                price += 40;
                if (number_U > 3) {
                    price -= 40;
                    number_U = 0;
                }
            }
            else if (skus.charAt(c) == 'V' ) {
                number_V ++;
                price += 50;
                if (number_V == 2) {
                    price -= 100;
                    price += 90;
                }
                if (number_V == 3) {
                    price -= 140;
                    price += 130;
                    number_V = 0;
                }
            }
            else if (skus.charAt(c) == 'W' ) {
                price += 20;
            }
            else if (skus.charAt(c) == 'X' ) {
                price += 90;
            }
            else if (skus.charAt(c) == 'Y' ) {
                price += 10;
            }
            else if (skus.charAt(c) == 'Z' ) {
                price += 50;
            }
            else {
                return -1;
            }
            if (number_E == 2) {
                if (all_B > 0) {
                    all_B--;
                    number_B--;
                    price -= 30;
                    number_E = 0;
                }
            }
            if (number_N == 3) {
                if (all_M > 0) {
                    all_M--;
                    price -= 15;
                    number_N = 0;
                }
            }
            if (number_R == 3) {
                if (all_Q > 0) {
                    all_Q --;
                    number_Q --;
                    price -=30;
                    number_R = 0;

                }
            }

            if (number_B >= 2 && c == skus.length()-1) {
                price -= 30*number_B;
                price += 45 * (number_B/2);
                price += 30 * (number_B - 2*(number_B/2));
                number_B = 0;
            }
            if (number_Q >= 3 && c == skus.length() - 1) {
                price -= 30 * number_Q;
                price += 80 * (number_Q / 3);
                price += 30 * (number_Q - 3 *(number_Q/3));
                number_Q = 0;
            }
        }
        return price;
    }
}
