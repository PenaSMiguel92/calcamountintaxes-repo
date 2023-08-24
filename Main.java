public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] bracket1 = new int[][] { { 3, 50 }, { 7, 10 }, { 12, 25 } };
        int[][] bracket2 = new int[][] { { 1, 0 }, { 4, 25 }, { 5, 50 } };
        int[][] bracket3 = new int[][] { { 2, 50 } };

        System.out.println(sol.calculateTax(bracket1, 10));
        System.out.println(sol.calculateTax(bracket2, 2));
        System.out.println(sol.calculateTax(bracket3, 0));
    } 
}
