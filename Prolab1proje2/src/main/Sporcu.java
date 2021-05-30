package main;

import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

public class Sporcu {
    private String sporcuIsim;
    private String sporcuTakim;
 public ImageIcon acikresim;
  public ImageIcon kapaliresim;
  
   
  
    public Sporcu(String sporcuIsim, String sporcuTakim,ImageIcon acikresim,ImageIcon kapaliresim) {
        this.sporcuIsim = sporcuIsim;
        this.sporcuTakim = sporcuTakim;
        this.acikresim= acikresim;
        this.kapaliresim=kapaliresim;
    }
    public Sporcu(){
    
    }
public void sporcuPuaniGoster(){
       System.out.println(this.sporcuIsim+" kartının bilgileri..");
       
   } 
    public String getSporcuIsim() {
        return sporcuIsim;
    }

    public void setSporcuIsim(String sporcuIsim) {
        this.sporcuIsim = sporcuIsim;
    }

    public String getSporcuTakim() {
        return sporcuTakim;
    }

    public void setSporcuTakim(String sporcuTakim) {
        this.sporcuTakim = sporcuTakim;
    }
   
}