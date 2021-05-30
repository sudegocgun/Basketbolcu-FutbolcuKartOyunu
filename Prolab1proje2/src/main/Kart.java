package main;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author sude yağmur
 */
public class Kart extends JButton{
    String isim;
     int penalti;
     int serbestVurus;
     int serbestAtis;
     int kaleciKarsiKarsiya;
     int ikilik;
    int ucluk;
     boolean kartOrtayaAtildiMi;
     ImageIcon acikresim= new ImageIcon();
     ImageIcon kapaliresim= new ImageIcon();
     int x,y;
     
     
     public Kart (String isim,int penalti,int serbestVurus,int kaleciKarsiKarsiya,ImageIcon acikresim,ImageIcon kapaliresim,boolean kartOrtayaAtildiMi,int x,int y){
         this.acikresim=acikresim;
         this.kapaliresim=kapaliresim;
    this .isim=isim;
     this.penalti=penalti;
    this.serbestVurus= serbestVurus;
   this.kaleciKarsiKarsiya=kaleciKarsiKarsiya;
    this.kartOrtayaAtildiMi=kartOrtayaAtildiMi;
    this.x=x;
    this.y=y;
}
     public  Kart(int ikilik, int ucluk,int serbestAtis,String isim,ImageIcon acikresim,ImageIcon kapaliresim,boolean kartOrtayaAtildiMi,int x,int y){
         this.acikresim=acikresim;
         this.kapaliresim=kapaliresim;
         this.serbestAtis=serbestAtis;
         this.ikilik=ikilik; 
         this. ucluk=ucluk;
         this.kartOrtayaAtildiMi=kartOrtayaAtildiMi;
         this.isim=isim;
         this.x=x;
         this.y=y;
     }

    public boolean isKartOrtayaAtildiMi() {
        return kartOrtayaAtildiMi;
    }
     
     
     
}