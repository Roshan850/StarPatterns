public class InvertedAndRotatedHalfPyramid {
    public void invertedAndRotatedHalfPyramid(int toRow) {
        for (int i = 1; i <= toRow; i++) {
            for (int k = 1; k <= toRow - i; k++) { // printing Row - i space 
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) { //print total i star 
                System.out.print("*");
                }
            System.out.println("");
        }

    }
    
}
