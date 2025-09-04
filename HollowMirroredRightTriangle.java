public class HollowMirroredRightTriangle {
    public void hollowMirroredRT(int toRow) {
        for (int i = 1; i <= toRow; i++) {
            for (int k = 1; k <= toRow-i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (i == toRow || j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    
}
