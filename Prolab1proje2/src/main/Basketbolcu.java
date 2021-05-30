
package main;

import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;


public class Basketbolcu extends Sporcu {

   
    private int ikilik;
    private int ucluk;
    private int serbestAtis;
    private boolean kullanim;
    private boolean kartOrtayaAtildiMi;
    public Basketbolcu(String sporcuIsim, String sporcuTakim,ImageIcon acikresim,ImageIcon kapaliresim,int ikilik,int ucluk,int serbestAtis) {
        super(sporcuIsim, sporcuTakim,acikresim,kapaliresim);
        this.ikilik=ikilik;
        this.ucluk=ucluk;
        this.serbestAtis=serbestAtis;
       
    }
   public Basketbolcu() {
    }
 
    @Override
    public void sporcuPuaniGoster() {
        super.sporcuPuaniGoster(); 
        System.out.println("ikilik atış: "+this.ikilik);
        System.out.println("üçlük atış: "+this.ucluk);
        System.out.println("serbest atış: "+this.serbestAtis);
    }
 public void setKullanim(int kullanım){
        this.kullanim=true;
    }
   
    public boolean kartKullanildiMi(){
        return kullanim;
    }
    public int getIkilik() {
        return ikilik;
    }

    public void setIkilik(int ikilik) {
        this.ikilik = ikilik;
    }

    public int getUcluk() {
        return ucluk;
    }

    public void setUcluk(int ucluk) {
        this.ucluk = ucluk;
    }

    public int getSerbestAtis() {
        return serbestAtis;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }

    public boolean isKartOrtayaAtildiMi() {
        return kartOrtayaAtildiMi;
    }
    
}