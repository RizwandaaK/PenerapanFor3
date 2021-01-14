/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penerapaanfor3;

/**
 *
 * @author rizwa
 */
public class PenerapaanFor3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 5 - 1 || j == 5 - 1 - i) {
                    System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
}