public class HollowRhombus {
     public void hollowRhombus(int toRow) {
        
         for (int i = 1;i <= toRow; i++) {
             for (int k = 1; k <= toRow - i+1; k++) {
                System.out.print(" ");
             }
            for (int j = 1; j <= toRow; j++) {
                if (i == 1 || i == toRow || j == 1 || j == toRow) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    
}
