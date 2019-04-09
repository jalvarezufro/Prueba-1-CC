/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1cc;

/**
 *
 * @author JAVIER
 */
public class Prueba1CC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.print(binSum("00000000000000000000000000011110","00000000000000000000000000010111"));
        binSum("00000000000000000000000000011110", "00000000000000000000000000010111");
    }

    public static String parseBin(int dec) {

        dec = Math.abs(dec);
        int resto;
        String transformada = "";
        while (dec > 0) {
            resto = dec % 2;
            //System.out.println(dec);
            dec = dec / 2;

            transformada = resto + transformada;

        }

        return transformada;
    }

    public static String thirtyTwoBits(String numero) {

        while (numero.length() < 32) {

            numero = "0" + numero;
        }
        return numero;
    }

    public static String binSum(String binA, String binB) {
        String sumaBin = "";
        int suma;
        int temp = 0;

        for (int i = 31; i > -1; i--) {
            suma = (Integer.parseInt("" + binA.charAt(i)) + Integer.parseInt("" + binB.charAt(i)) + temp);
            if (suma > 1) {
                sumaBin = "0" + sumaBin;
                temp = 1;
            } else {
                sumaBin = suma + sumaBin;
                temp = 0;
            }
            System.out.print(sumaBin);

        }
        return sumaBin;
    }

    public static boolean isOverflowinTest(int num1, int num2) {
        String bin1 = parseBin(num1);
        String bin2 = parseBin(num2);
        bin1 = thirtyTwoBits(bin1);
        bin2 = thirtyTwoBits(bin2);

        String suma = binSum(bin1, bin2);

        return suma.length() > 32;

    }

}
