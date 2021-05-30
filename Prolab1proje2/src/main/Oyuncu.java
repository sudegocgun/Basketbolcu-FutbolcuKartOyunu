
package main;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class Oyuncu {
    private int oyuncuID;
    private String oyuncuAdi;
    private int skor;

    public Oyuncu(int oyuncuID, String oyuncuAdi, int skor) {
        this.oyuncuID = oyuncuID;
        this.oyuncuAdi = oyuncuAdi;
        this.skor = skor;
    }
    public Oyuncu(){
    
    }
public void skorGoster(){
    System.out.println(this.oyuncuAdi+" isimli oyuncunun skoru: "+this.skor);
    
}
public Kart kartSec(Kart bkart1, Kart bkart2,Kart bkart3,Kart bkart4,Kart bkart5,Kart bkart6,Kart bkart7,Kart bkart8,String sira,ArrayList<Integer> sayikontrol){
    int a;
   
    if(sira.equals("futbolcu"))
    {
    a=(int)(1+Math.random()*4); 
    while(sayikontrol.contains(a)){
    a=(int)(1+Math.random()*4);
    
    }
      sayikontrol.add(a); 
   }
    else {  
    a=(int)(5+Math.random()*4); 
    while(sayikontrol.contains(a)){
    a=(int)(5+Math.random()*4);
    
   }
    sayikontrol.add(a);
    }
        
    
    if(a==1){
        
    return bkart1;
    } 
     else if(a==2){
        
    return bkart2;
    } 
     else if(a==3){
        
    return bkart3;
    } 
     else if(a==4){
       
      return bkart4;  
     } 
      else if(a==5){
        
        return bkart5;
        
        }
     else if(a==6){
        
        return bkart6;
        
        }
     else if(a==7){
       
        return bkart7;
        
        }
     else{
       
        return bkart8;
        
        }
    
    } 
    
    
    
     


public ArrayList<Futbolcu>futbolcukart(Futbolcu[]desteFutbolcu, Basketbolcu[]desteBasketbolcu) {
     int a,b=0;   
     
   
    ArrayList <Futbolcu>futbolcukart=new ArrayList<Futbolcu>();
    for(int i = 0; i<8; i+=2)
        {  
        a=(int)(Math.random()*8);

         
          
        if(desteFutbolcu[a].kartKullanildiMi()){
            i-=2;
           
                   }
        else {
            desteFutbolcu[a].setKullanim(1);
            
        
       futbolcukart.add(desteFutbolcu[a]);
         
          
         
       
           }
          
        }
    return futbolcukart;
    
    
}
public ArrayList<Basketbolcu>basketbolcukart(Futbolcu[]desteFutbolcu, Basketbolcu[]desteBasketbolcu) {
     int a,b=0;   
     
   
    ArrayList <Basketbolcu>basketbolcukart=new ArrayList<Basketbolcu>();
    for(int i = 0; i<8; i+=2)
        {  
        a=(int)(Math.random()*8);

         
          
        if(desteBasketbolcu[a].kartKullanildiMi()){
            i-=2;
           
                   }
        else {
            desteBasketbolcu[a].setKullanim(1);
           basketbolcukart.add(desteBasketbolcu[a]);
        
      
         
          
         
       
           }
          
        }
    return basketbolcukart;
    
    
}
public Sporcu[] kartListesi(ArrayList<Futbolcu>futbolculiste,ArrayList<Basketbolcu>basketbolculiste){
    
    Sporcu[] kullanicilistesi=new Sporcu[8];
    int i,j=0;
    for (i = 0; i <8; i+=2) {
        kullanicilistesi[i]=futbolculiste.get(j);
        kullanicilistesi[i+1]=basketbolculiste.get(j);
        j++;
    }
    for (i = 0;  i< kullanicilistesi.length; i++) {
       
       kullanicilistesi[i].sporcuPuaniGoster(); 
    }
    return kullanicilistesi;
    
}

    public int getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(int oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }
    
}