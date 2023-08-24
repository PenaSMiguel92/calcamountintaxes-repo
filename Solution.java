public class Solution {
    public double calculateTax(int[][] brackets, int income) {
        int remaining = income;
        double tax = 0;
        for (int i = 0; i < brackets.length; i++) {
            if (remaining <= 0)
                break;
            int taxable = (i - 1 >= 0) ? brackets[i][0] - brackets[i - 1][0] : brackets[i][0];
            if (remaining - taxable >= 0) {
                remaining -= taxable;
                tax += taxable * ((double) brackets[i][1] / 100);
            } else {
                tax += remaining * ((double) brackets[i][1] / 100);
                remaining = 0;
            }
        }
        return tax;
    }
}
