/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118013.latihan19saldo;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author Rifian
 * Nama : Rifian Joe Premilenio
 * Kelas : IF-1
 * NIM : 10118013
 * Deskripsi Program : Menghitung Saldo
 */
public class IF110118013Latihan19Saldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float saldoAwal = 2500000;
        float bunga = (float)0.15;
        float saldoBungaAwal = (saldoAwal*bunga);
        float saldoAkhir = saldoAwal + saldoBungaAwal;
        int bulan = 6;
        
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol(" Rp. ");
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        for(int i = 1; i <= bulan; i++, saldoAkhir += (saldoAkhir * bunga)){
            System.out.println("Saldo di bulan ke-" + (i) + kursIndonesia.format(saldoAkhir));
        }
        
        System.out.println("(Developed by : Rifian Joe Premilenio)");
    }
    
}
