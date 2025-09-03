public class InvertedHalfPyramid {
    public void invertedHalfPyramidNumber(int toRow) 
    {
        for (int i = 1; i <= toRow; i++) {
            for (int j = 1; j <= toRow - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
     public void invertedHalfPyramid(int toRow) 
    {
        for (int i = 1; i <= toRow; i++) {
            for (int j = 1; j <= toRow - i+1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
