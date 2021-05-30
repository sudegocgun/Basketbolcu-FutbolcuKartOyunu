package main;
import java.util.ArrayList;

public class Bilgisayar extends Oyuncu {
    
    public Bilgisayar(int oyuncuID, String oyuncuAdi, int skor) {
        super(oyuncuID, oyuncuAdi, skor);
        
    }
public Bilgisayar(){
}

    @Override
    public Sporcu[] kartListesi(ArrayList<Futbolcu> futbolculiste, ArrayList<Basketbolcu> basketbolculiste) {
        return super.kartListesi(futbolculiste, basketbolculiste); 
    }

    @Override
    public Kart kartSec(Kart bkart1, Kart bkart2, Kart bkart3, Kart bkart4, Kart bkart5, Kart bkart6, Kart bkart7, Kart bkart8, String sira, ArrayList<Integer> sayikontrol) {
        return super.kartSec(bkart1, bkart2, bkart3, bkart4, bkart5, bkart6, bkart7, bkart8, sira, sayikontrol); 
    }
}