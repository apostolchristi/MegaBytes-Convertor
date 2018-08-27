package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        printMegaBtesAndKilloBytes(454545);
        printMegaBtesAndKilloBytes(0);

    }

    public static void printMegaBtesAndKilloBytes(int kiloBytes) {
        int megabytes = kiloBytes / 1024;
        int remainder = kiloBytes % 1024 ;

        if (kiloBytes <= 0){
            System.out.println("invalid Value");
        }else {
            System.out.println(kiloBytes + " KB = " + megabytes +
                    " MB and " + remainder + " KB");
        }
    }
}
