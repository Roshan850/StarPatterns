public class HollowPyramid {
    public void printHollowPyramid(int toRows) {
        for (int i = 1; i <= toRows; i++) {
            // Print spaces (trailing spaces)
            for (int j = i; j < toRows; j++) {
                System.out.print(" ");
            }

            // Print hollow pyramid
            for (int j = 1; j <= (2 * i - 1); j++) {
                // Print * at boundaries or last row
                if (i == toRows || j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Move to next line
            System.out.println();
        }
    }
}
