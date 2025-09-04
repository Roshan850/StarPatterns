public class HalfDiamond {
    public void printHalfDiamond(int toRows) {
        // upper half (increasing stars)
        for (int i = 1; i <= toRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower half (decreasing stars)
        for (int i = toRows - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}