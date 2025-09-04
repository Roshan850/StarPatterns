public class DiamondStarPattern {
    public void printDiamond(int rows) {
        // Top half
        for (int i = 1; i <= rows; i++) {
            // print spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Bottom half
        for (int i = rows - 1; i >= 1; i--) {
            // print spaces
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}