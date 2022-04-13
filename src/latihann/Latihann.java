/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihann;

import java.util.Scanner;

/**
 *
 * @author shandy
 */
public class Latihann {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a;
        int b;
     
        System.out.println("masukan bilangan ke-1");
        a = input.nextInt();
        System.out.println("masukan bilangan ke-2");
        b = input.nextInt();

        if (a < b) {
            System.out.println("dari kedua bilangan tersebut yang lebih besar adalah " + b);
        } else {
            System.out.println("dari bilangan tersebut yang lebih besar adalah" + a);
        }

    }
}
