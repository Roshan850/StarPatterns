public class Rhombus {
    public void rhombus(int toRow ,int toCol ) {
         for (int i = 1; i <= toRow; i++) {
            for (int k = 1; k <= toRow - i; k++) { // printing Row - i space 
                System.out.print(" ");
            }
            for (int j = 1; j <= toCol; j++) { //print total i star 
                System.out.print("*");
                }
            System.out.println("");
        }
        
    }
    
}
