public class NumberPyramid {
    public void printNumberPyramid(int N) {
        for (int i = 1; i <= N; i++) {
            // print numbers for each row
            for (int j = 1; j <= (i * 2 - 1); j++) {
                System.out.print(j);
            }
            System.out.println(); // move to next line
        }
    }
}