package day.six.assignment;

public class FibonacciSeries {
    static void findSeries(int n, int first, int sec) {
        System.out.print (first + " " + sec + " ");
        int counter = 0, sum;

        while (counter < n-2) {
            sum = first + sec;
            System.out.print (sum + " ");
            first = sec;
            sec = sum;
            counter++;
        }
    }

    public static void main(String[] args) {
        int n = 5, first = 2, sec = 4;

        findSeries (n, first, sec);
    }
}
