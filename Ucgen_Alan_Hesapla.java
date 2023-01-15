package patika;

import java.util.Scanner;

public class Ucgen_Alan_Hesapla {
    public static void main(String[] args) {
        int a,b,c;
        double u,alan;
        Scanner scan=new Scanner(System.in);
        System.out.print("Birinci kenarı giriniz:");
        a=scan.nextInt();
        System.out.print("İkinci kenarı giriniz:");
        b=scan.nextInt();
        System.out.print("Üçüncü  kenarı giriniz:");
        c=scan.nextInt();
        u=(a+b+c)/2;
        alan=u*(u-a)*(u-b)*(u-c);
        System.out.println("Üçgenin alanı:"+alan);
    }
}
