class HollowRectangle {
    public void hollowRectangle(int toRow, int toCol) {
        for(int i = 1;i<=toRow;i++){
            for (int j = 1; j <= toCol; j++) {
                if (i == 1 || i == toRow || j == 1 || j == toCol) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}


public class ImplementationOfCode {
    public static void main(String[] args) {
        // HollowRectangle c = new HollowRectangle();
        // InvertedAndRotatedHalfPyramid i = new InvertedAndRotatedHalfPyramid();
        // c.hollowRectangle(10, 5);
        // i.invertedAndRotatedHalfPyramid(10);
        // InvertedHalfPyramid n = new InvertedHalfPyramid();
        // n.invertedHalfPyramidNumber(5);
        // n.invertedHalfPyramid(5);
        // Rhombus r = new Rhombus();
        // r.rhombus(5, 6);
        // HollowRhombus h = new HollowRhombus();
        // h.hollowRhombus(7);
        // HollowMirroredRightTriangle s7 = new HollowMirroredRightTriangle();
        // s7.hollowMirroredRT(7);
        HollowPyramid s8 = new HollowPyramid();
        s8.printHollowPyramid(5);
        HalfDiamond s9 = new HalfDiamond();
        s9.printHalfDiamond(5);
        XPattern s10 = new XPattern();
        s10.printXPattern(8);
        DiamondStarPattern s11 = new DiamondStarPattern();
        s11.printDiamond(8);
        NumberPyramid s12 = new NumberPyramid();
        s12.printNumberPyramid(8);
        
    }
}
