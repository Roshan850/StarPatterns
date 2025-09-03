class Code {
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
        Code c = new Code();
        c.hollowRectangle(10,5);
        
    }
}
