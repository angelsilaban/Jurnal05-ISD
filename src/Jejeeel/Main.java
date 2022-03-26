package Jejeeel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner laptop = new Scanner(System.in);
        String hasil;

        if (laptop.equals("")) {
            System.out.println("Masukan kembali Infix !");
        } else {
            Penghitungan theTrans = new Penghitungan(laptop.next());
            hasil = theTrans.doTrans();
            System.out.println(hasil);
        }
    }
}
