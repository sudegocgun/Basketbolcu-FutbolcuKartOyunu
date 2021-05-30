package main;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Test extends JFrame implements ActionListener {

   Kart kart1;
    Kart kart2;
    Kart kart3;
    Kart kart4;
    Kart kart5;
    Kart kart6;
    Kart kart7;
    Kart kart8;
    Kart bkart1;
    Kart bkart2;
    Kart bkart3;
    Kart bkart4;
    Kart bkart5;
    Kart bkart6;
    Kart bkart7;
    Kart bkart8;
    JLabel kullanicininskoru = new JLabel();
    JLabel bilgisayarinskoru = new JLabel();
    int kullaniciskor, bilgisayarskor;
    Kart ortadakikart1;
    Kart ortadakikart2;
    ArrayList<Integer> sayideneme = new ArrayList<>();
    ArrayList<Integer> ozellikDeneme = new ArrayList<>();
    JButton sonrakitur = new JButton("sonrakitur");
    boolean berabereGeldi = false;
    JButton oyunubitir = new JButton();
    ArrayList<Futbolcu> kullanicifutbolculiste = new ArrayList<Futbolcu>();
    ArrayList<Futbolcu> bilgisayarfutbolculiste = new ArrayList<Futbolcu>();
    ArrayList<Basketbolcu> kullanicibasketbolculiste = new ArrayList<Basketbolcu>();
    ArrayList<Basketbolcu> bilgisayarbasketbolculiste = new ArrayList<Basketbolcu>();
    ArrayList<Kart> kullanicifutbolcukartlari = new ArrayList<Kart>();
    ArrayList<Kart> kullanicibasketbolcukartlari = new ArrayList<Kart>();
    boolean tumfutbolcukullanildimi, tumbasketbolcukullanildimi = false;

    public Test() {

        Futbolcu[] desteFutbolcu = new Futbolcu[8];
        Basketbolcu[] desteBasketbolcu = new Basketbolcu[8];

        ImageIcon acikfotof1 = new ImageIcon("C:\\Users\\sude yağmur\\Desktop\\Prolab1proje2\\src\\kartlar\\f1.png");
        ImageIcon acikfotof2 = new ImageIcon("C:\\Users\\sude yağmur\\Desktop\\Prolab1proje2\\src\\kartlar\\f2.png");
        ImageIcon acikfotof3 = new ImageIcon("C:\\Users\\sude yağmur\\Desktop\\Prolab1proje2\\src\\kartlar\\f3.png");
        ImageIcon acikfotof4 = new ImageIcon("C:\\Users\\sude yağmur\\Desktop\\Prolab1proje2\\src\\kartlar\\f4.png");
        ImageIcon acikfotof5 = new ImageIcon("C:\\Users\\sude yağmur\\Desktop\\Prolab1proje2\\src\\kartlar\\f5.png");
        ImageIcon acikfotof6 = new ImageIcon("C:\\Users\\sude yağmur\\Desktop\\Prolab1proje2\\src\\kartlar\\f6.png");
        ImageIcon acikfotof7 = new ImageIcon("C:\\Users\\sude yağmur\\Desktop\\Prolab1proje2\\src\\kartlar\\f7.png");
        ImageIcon acikfotof8 = new ImageIcon("C:\\Users\\sude yağmur\\Desktop\\Prolab1proje2\\src\\kartlar\\f8.png");
        ImageIcon acikfotob1 = new ImageIcon("C:\\Users\\sude yağmur\\Desktop\\Prolab1proje2\\src\\kartlar\\b1.png");
        ImageIcon acikfotob2 = new ImageIcon("C:\\Users\\sude yağmur\\Desktop\\Prolab1proje2\\src\\kartlar\\b2.png");
        ImageIcon acikfotob3 = new ImageIcon("C:\\Users\\sude yağmur\\Desktop\\Prolab1proje2\\src\\kartlar\\b3.png");
        ImageIcon acikfotob4 = new ImageIcon("C:\\Users\\sude yağmur\\Desktop\\Prolab1proje2\\src\\kartlar\\b4.png");
        ImageIcon acikfotob5 = new ImageIcon("C:\\Users\\sude yağmur\\Desktop\\Prolab1proje2\\src\\kartlar\\b5.png");
        ImageIcon acikfotob6 = new ImageIcon("C:\\Users\\sude yağmur\\Desktop\\Prolab1proje2\\src\\kartlar\\b6.png");
        ImageIcon acikfotob7 = new ImageIcon("C:\\Users\\sude yağmur\\Desktop\\Prolab1proje2\\src\\kartlar\\b7.png");
        ImageIcon acikfotob8 = new ImageIcon("C:\\Users\\sude yağmur\\Desktop\\Prolab1proje2\\src\\kartlar\\b8.png");

        ImageIcon kapalifoto = new ImageIcon("C:\\Users\\sude yağmur\\Desktop\\Prolab1proje2\\src\\kartlar\\kapalifotoo.jpg");


        Futbolcu futbolcu1 = new Futbolcu("Cengiz", "LEİCESTER CİTY", acikfotof1, kapalifoto, 70, 70, 65);
        desteFutbolcu[0] = futbolcu1;
        Futbolcu futbolcu2 = new Futbolcu("Karius", "BESİKTAS", acikfotof2, kapalifoto, 70, 70, 70);
        desteFutbolcu[1] = futbolcu2;
        Futbolcu futbolcu3 = new Futbolcu("Maradona", "MENCHESTER UNİTED", acikfotof3, kapalifoto, 70, 70, 60);
        desteFutbolcu[2] = futbolcu3;
        Futbolcu futbolcu4 = new Futbolcu("Volkan", "FENERBAHCE", acikfotof4, kapalifoto, 70, 70, 45);
        desteFutbolcu[3] = futbolcu4;
        Futbolcu futbolcu5 = new Futbolcu("Marco", "B.DORTMUND", acikfotof5, kapalifoto, 70, 70, 60);
        desteFutbolcu[4] = futbolcu5;
        Futbolcu futbolcu6 = new Futbolcu("Messi", "BARCELONA", acikfotof6, kapalifoto, 70, 70, 35);
        desteFutbolcu[5] = futbolcu6;
        Futbolcu futbolcu7 = new Futbolcu("Neymar", "BARCELONA", acikfotof7, kapalifoto, 70, 70, 75);
        desteFutbolcu[6] = futbolcu7;
        Futbolcu futbolcu8 = new Futbolcu("Ronaldo", "JUVENTUS", acikfotof8, kapalifoto, 70, 70, 95);
        desteFutbolcu[7] = futbolcu8;
        Basketbolcu basketbolcu1 = new Basketbolcu("Bird", "LAKERS", acikfotob1, kapalifoto, 100, 40, 60);
        desteBasketbolcu[0] = basketbolcu1;
        Basketbolcu basketbolcu2 = new Basketbolcu("Cedi", "CLEVELAND", acikfotob2, kapalifoto, 30, 100, 70);
        desteBasketbolcu[1] = basketbolcu2;
        Basketbolcu basketbolcu3 = new Basketbolcu("Ersan", "MİLWAUKEE BUCKS", acikfotob3, kapalifoto, 45, 50, 75);
        desteBasketbolcu[2] = basketbolcu3;
        Basketbolcu basketbolcu4 = new Basketbolcu("Harden", "ROCKETS", acikfotob4, kapalifoto, 50, 60, 25);
        desteBasketbolcu[3] = basketbolcu4;
        Basketbolcu basketbolcu5 = new Basketbolcu("Jordan", "LAKERS", acikfotob5, kapalifoto, 90, 80, 85);
        desteBasketbolcu[4] = basketbolcu5;
        Basketbolcu basketbolcu6 = new Basketbolcu("Kobe", "LAKERS", acikfotob6, kapalifoto, 95, 75, 90);
        desteBasketbolcu[5] = basketbolcu6;
        Basketbolcu basketbolcu7 = new Basketbolcu("Kyrie", "BROOKLYN NETS", acikfotob7, kapalifoto, 35, 55, 10);
        desteBasketbolcu[6] = basketbolcu7;
        Basketbolcu basketbolcu8 = new Basketbolcu("Lebron", "LAKERS", acikfotob8, kapalifoto, 80, 75, 100);
        desteBasketbolcu[7] = basketbolcu8;
        Kullanici kullanici = new Kullanici(1, "canberk", 0);
        Bilgisayar bilgisayar = new Bilgisayar(2, "sude", 0);
        
        

        kullanicifutbolculiste = kullanici.futbolcukart(desteFutbolcu, desteBasketbolcu);
        kullanicibasketbolculiste = kullanici.basketbolcukart(desteFutbolcu, desteBasketbolcu);
        bilgisayarfutbolculiste = bilgisayar.futbolcukart(desteFutbolcu, desteBasketbolcu);
        bilgisayarbasketbolculiste = bilgisayar.basketbolcukart(desteFutbolcu, desteBasketbolcu);

        kullanici.kartListesi(kullanicifutbolculiste, kullanicibasketbolculiste);
        bilgisayar.kartListesi(bilgisayarfutbolculiste, bilgisayarbasketbolculiste);


        JFrame jf = new JFrame();
        JFrame jf1 = new JFrame();

        int wt = 140, lt = 190, x = 50, y = 750, y1 = 50;

        JButton oyunabasla = new JButton();
        JButton kartlariDagit = new JButton();
        kartlariDagit.setBounds(550, 200, 200, 50);
        kartlariDagit.setText("Kartları Dagıt");
        jf1.add(kartlariDagit);
        oyunabasla.setText("OYUNA BASLA");
        oyunabasla.setBounds(650, 100, 200, 50);
        jf.add(oyunabasla);

        kart1 = new Kart(kullanicifutbolculiste.get(0).getSporcuIsim(), kullanicifutbolculiste.get(0).getPenalti(), kullanicifutbolculiste.get(0).getSerbestAtis(), kullanicifutbolculiste.get(0).getKaleciKarsiKarsiya(), kullanicifutbolculiste.get(0).acikresim,kullanicifutbolculiste.get(0).kapaliresim, false, 50, 750);
        kart1.setIcon(kullanicifutbolculiste.get(0).acikresim);
        kullanicifutbolcukartlari.add(kart1);
        kart1.setBounds(x, y, wt, lt);
        jf1.add(kart1);
        kart1.setVisible(false);
        kart1.addActionListener(this);
        kart1.setText("1");

        kart2 = new Kart(kullanicifutbolculiste.get(1).getSporcuIsim(), kullanicifutbolculiste.get(1).getPenalti(), kullanicifutbolculiste.get(1).getSerbestAtis(), kullanicifutbolculiste.get(1).getKaleciKarsiKarsiya(), kullanicifutbolculiste.get(1).acikresim,kullanicifutbolculiste.get(1).kapaliresim, false, 200, 750);
        kart2.setIcon(kullanicifutbolculiste.get(1).acikresim);
        kullanicifutbolcukartlari.add(kart2);
        kart2.setBounds(x + 150, y, wt, lt);
        jf1.add(kart2);
        kart2.setVisible(false);
        kart2.addActionListener(this);
        kart2.setText("2");

        kart3 = new Kart(kullanicifutbolculiste.get(2).getSporcuIsim(), kullanicifutbolculiste.get(2).getPenalti(), kullanicifutbolculiste.get(2).getSerbestAtis(), kullanicifutbolculiste.get(2).getKaleciKarsiKarsiya(), kullanicifutbolculiste.get(2).acikresim,kullanicifutbolculiste.get(2).kapaliresim, false, 350, 750);
        kart3.setIcon(kullanicifutbolculiste.get(2).acikresim);
        kullanicifutbolcukartlari.add(kart3);
        kart3.setBounds(x + 300, y, wt, lt);
        jf1.add(kart3);
        kart3.setVisible(false);
        kart3.addActionListener(this);
        kart3.setText("3");

        kart4 = new Kart(kullanicifutbolculiste.get(3).getSporcuIsim(), kullanicifutbolculiste.get(3).getPenalti(), kullanicifutbolculiste.get(3).getSerbestAtis(), kullanicifutbolculiste.get(3).getKaleciKarsiKarsiya(), kullanicifutbolculiste.get(3).acikresim,kullanicifutbolculiste.get(3).kapaliresim, false, 500, 750);
        kart4.setIcon(kullanicifutbolculiste.get(3).acikresim);
        kullanicifutbolcukartlari.add(kart4);
        kart4.setBounds(x + 450, y, wt, lt);
        jf1.add(kart4);
        kart4.setVisible(false);
        kart4.addActionListener(this);
        kart4.setText("4");

        kart5 = new Kart(kullanicibasketbolculiste.get(0).getIkilik(), kullanicibasketbolculiste.get(0).getUcluk(), kullanicibasketbolculiste.get(0).getSerbestAtis(), kullanicibasketbolculiste.get(0).getSporcuIsim(), kullanicibasketbolculiste.get(0).acikresim,kullanicibasketbolculiste.get(0).kapaliresim, false, 650, 750);
        kart5.setIcon(kullanicibasketbolculiste.get(0).acikresim);
        kullanicibasketbolcukartlari.add(kart5);
        kart5.setBounds(x + 600, y, wt, lt);
        jf1.add(kart5);
        kart5.setVisible(false);
        kart5.addActionListener(this);
        kart5.setEnabled(false);
        kart5.setText("5");

        kart6 = new Kart(kullanicibasketbolculiste.get(1).getIkilik(), kullanicibasketbolculiste.get(1).getUcluk(), kullanicibasketbolculiste.get(1).getSerbestAtis(), kullanicibasketbolculiste.get(1).getSporcuIsim(), kullanicibasketbolculiste.get(1).acikresim,kullanicibasketbolculiste.get(1).kapaliresim, false, 800, 750);
        kart6.setIcon(kullanicibasketbolculiste.get(1).acikresim);
        kullanicibasketbolcukartlari.add(kart6);
        kart6.setBounds(x + 750, y, wt, lt);
        jf1.add(kart6);
        kart6.setVisible(false);
        kart6.addActionListener(this);
        kart6.setEnabled(false);
        kart6.setText("6");

        kart7 = new Kart(kullanicibasketbolculiste.get(2).getIkilik(), kullanicibasketbolculiste.get(2).getUcluk(), kullanicibasketbolculiste.get(2).getSerbestAtis(), kullanicibasketbolculiste.get(2).getSporcuIsim(), kullanicibasketbolculiste.get(2).acikresim,kullanicibasketbolculiste.get(2).kapaliresim, false, 950, 750);
        kart7.setIcon(kullanicibasketbolculiste.get(2).acikresim);
        kullanicibasketbolcukartlari.add(kart7);
        kart7.setBounds(x + 900, y, wt, lt);
        jf1.add(kart7);
        kart7.setVisible(false);
        kart7.addActionListener(this);
        kart7.setEnabled(false);
        kart7.setText("7");

        kart8 = new Kart(kullanicibasketbolculiste.get(3).getIkilik(), kullanicibasketbolculiste.get(3).getUcluk(), kullanicibasketbolculiste.get(3).getSerbestAtis(), kullanicibasketbolculiste.get(3).getSporcuIsim(), kullanicibasketbolculiste.get(3).acikresim,kullanicibasketbolculiste.get(3).kapaliresim, false, 1100, 750);
        kart8.setIcon(kullanicibasketbolculiste.get(3).acikresim);
        kullanicibasketbolcukartlari.add(kart8);
        kart8.setBounds(x + 1050, y, wt, lt);
        jf1.add(kart8);
        kart8.setVisible(false);
        kart8.addActionListener(this);
        kart8.setEnabled(false);
        kart8.setText("8");

        bkart1 = new Kart(bilgisayarfutbolculiste.get(0).getSporcuIsim(), bilgisayarfutbolculiste.get(0).getPenalti(), bilgisayarfutbolculiste.get(0).getSerbestAtis(), bilgisayarfutbolculiste.get(0).getKaleciKarsiKarsiya(), bilgisayarfutbolculiste.get(0).acikresim,bilgisayarfutbolculiste.get(0).kapaliresim, false, 50, 50);
        bkart1.setIcon(kullanicifutbolculiste.get(0).kapaliresim);
        bkart1.setBounds(x, y1, wt, lt);
        jf1.add(bkart1);
        bkart1.setVisible(false);
        bkart1.setEnabled(true);
        bkart1.setText("b1");

        bkart2 = new Kart(bilgisayarfutbolculiste.get(1).getSporcuIsim(), bilgisayarfutbolculiste.get(1).getPenalti(), bilgisayarfutbolculiste.get(1).getSerbestAtis(), bilgisayarfutbolculiste.get(1).getKaleciKarsiKarsiya(), bilgisayarfutbolculiste.get(1).acikresim,bilgisayarfutbolculiste.get(1).kapaliresim, false, 200, 50);
        bkart2.setIcon(kullanicifutbolculiste.get(1).kapaliresim);
        bkart2.setBounds(x + 150, y1, wt, lt);
        jf1.add(bkart2);
        bkart2.setVisible(false);
        bkart2.setEnabled(true);
        bkart2.setText("b2");

        bkart3 = new Kart(bilgisayarfutbolculiste.get(2).getSporcuIsim(), bilgisayarfutbolculiste.get(2).getPenalti(), bilgisayarfutbolculiste.get(2).getSerbestAtis(), bilgisayarfutbolculiste.get(2).getKaleciKarsiKarsiya(), bilgisayarfutbolculiste.get(2).acikresim,bilgisayarfutbolculiste.get(2).kapaliresim, false, 350, 50);
        bkart3.setIcon(kullanicifutbolculiste.get(2).kapaliresim);
        bkart3.setBounds(x + 300, y1, wt, lt);
        jf1.add(bkart3);
        bkart3.setVisible(false);
        bkart3.setEnabled(true);
        bkart3.setText("b3");

        bkart4 = new Kart(bilgisayarfutbolculiste.get(3).getSporcuIsim(), bilgisayarfutbolculiste.get(3).getPenalti(), bilgisayarfutbolculiste.get(3).getSerbestAtis(), bilgisayarfutbolculiste.get(3).getKaleciKarsiKarsiya(), bilgisayarfutbolculiste.get(3).acikresim,bilgisayarfutbolculiste.get(3).kapaliresim, false, 500, 50);
        bkart4.setIcon(kullanicifutbolculiste.get(3).kapaliresim);
        bkart4.setBounds(x + 450, y1, wt, lt);
        jf1.add(bkart4);
        bkart4.setVisible(false);
        bkart4.setEnabled(true);
        bkart4.setText("b4");

        bkart5 = new Kart(bilgisayarbasketbolculiste.get(0).getIkilik(), bilgisayarbasketbolculiste.get(0).getUcluk(), bilgisayarbasketbolculiste.get(0).getSerbestAtis(), bilgisayarbasketbolculiste.get(0).getSporcuIsim(), bilgisayarbasketbolculiste.get(0).acikresim,bilgisayarbasketbolculiste.get(0).kapaliresim, false, 650, 50);
        bkart5.setIcon(kullanicibasketbolculiste.get(0).kapaliresim);
        bkart5.setBounds(x + 600, y1, wt, lt);
        jf1.add(bkart5);
        bkart5.setVisible(false);
        bkart5.setEnabled(true);
        bkart5.setText("b5");

        bkart6 = new Kart(bilgisayarbasketbolculiste.get(1).getIkilik(), bilgisayarbasketbolculiste.get(1).getUcluk(), bilgisayarbasketbolculiste.get(1).getSerbestAtis(), bilgisayarbasketbolculiste.get(1).getSporcuIsim(), bilgisayarbasketbolculiste.get(1).acikresim,bilgisayarbasketbolculiste.get(1).kapaliresim, false, 800, 50);
        bkart6.setIcon(kullanicibasketbolculiste.get(1).kapaliresim);
        bkart6.setBounds(x + 750, y1, wt, lt);
        jf1.add(bkart6);
        bkart6.setVisible(false);
        bkart6.setEnabled(true);
        bkart6.setText("b6");

        bkart7 = new Kart(bilgisayarbasketbolculiste.get(2).getIkilik(), bilgisayarbasketbolculiste.get(2).getUcluk(), bilgisayarbasketbolculiste.get(2).getSerbestAtis(), bilgisayarbasketbolculiste.get(2).getSporcuIsim(), bilgisayarbasketbolculiste.get(2).acikresim,bilgisayarbasketbolculiste.get(2).kapaliresim, false, 950, 50);
        bkart7.setIcon(kullanicibasketbolculiste.get(2).kapaliresim);
        bkart7.setBounds(x + 900, y1, wt, lt);
        jf1.add(bkart7);
        bkart7.setVisible(false);
        bkart7.setEnabled(true);
        bkart7.setText("b7");

        bkart8 = new Kart(bilgisayarbasketbolculiste.get(3).getIkilik(), bilgisayarbasketbolculiste.get(3).getUcluk(), bilgisayarbasketbolculiste.get(3).getSerbestAtis(), bilgisayarbasketbolculiste.get(3).getSporcuIsim(), bilgisayarbasketbolculiste.get(3).acikresim,bilgisayarbasketbolculiste.get(3).kapaliresim, false, 1100, 50);
        bkart8.setIcon(kullanicibasketbolculiste.get(3).kapaliresim);
        bkart8.setBounds(x + 1050, y1, wt, lt);
        jf1.add(bkart8);
        bkart8.setVisible(false);
        bkart8.setEnabled(true);
        bkart8.setText("b8");

        oyunubitir.setBounds(1260, 80, 200, 75);
        jf1.add(oyunubitir);
        oyunubitir.addActionListener(this);
        oyunubitir.setVisible(true);
        oyunubitir.setEnabled(true);
        oyunubitir.setText("Oyunu Bitir");
  
        kullanicininskoru.setBounds(1260, 680, 250, 200);
        jf1.add(kullanicininskoru);
        kullanicininskoru.setVisible(true);
        kullanicininskoru.setText(" Kullanicinin skoru: " + kullaniciskor);
        Font f = new Font("TimesRoman", Font.BOLD, 20);
        kullanicininskoru.setFont(f);
        kullanicininskoru.setForeground(Color.green);

        bilgisayarinskoru.setBounds(1260, 80, 250, 200);
        jf1.add(bilgisayarinskoru);
        bilgisayarinskoru.setVisible(true);
        bilgisayarinskoru.setText("Bilgisayarin skoru: " + bilgisayarskor);
        Font f1 = new Font("TimesRoman", Font.BOLD, 20);
        bilgisayarinskoru.setFont(f1);
        bilgisayarinskoru.setForeground(Color.blue);
      
        sonrakitur.setBounds(1260, 800, 200, 50);
        jf1.add(sonrakitur);
        sonrakitur.setVisible(true);
        sonrakitur.addActionListener(this);
        sonrakitur.setEnabled(false);

        GirisResmi girisresmi = new GirisResmi();
        OyunResmi oyunresmi = new OyunResmi();

        jf.add(girisresmi);
        jf.setTitle("SPORCU KART OYUNU");
        jf.setSize(1500, 1000);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);

        oyunabasla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jf.setVisible(false);

                jf1.add(oyunresmi);
                jf1.setTitle("OYUN BASLADİ");
                jf1.setSize(1500, 1000);
                jf1.setVisible(true);                
                jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            }
        });

        kartlariDagit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kartlariDagit.setVisible(false);
                kart1.setVisible(true);
                bkart1.setVisible(true);
                kart2.setVisible(true);
                bkart2.setVisible(true);
                kart3.setVisible(true);
                bkart3.setVisible(true);
                kart4.setVisible(true);
                bkart4.setVisible(true);
                kart5.setVisible(true);
                bkart5.setVisible(true);
                kart6.setVisible(true);
                bkart6.setVisible(true);
                kart7.setVisible(true);
                bkart7.setVisible(true);
                kart8.setVisible(true);
                bkart8.setVisible(true);

            }

        });

        kullaniciskor = 0;
        bilgisayarskor = 0;

    }

    public int ozelliksec(Kart kart1, Kart bkart, ArrayList<Integer> sayideneme, String sira) {
        int a = (int) (1 + Math.random() * 3);

        if (sayideneme.size() == 8) {
            ozellikDeneme.add(a);
        } else if (ozellikDeneme.contains(a)) {
            a = (int) (1 + Math.random() * 3);
        }

        int wt = 140, lt = 190, kp = 0, bp = 0, b = 0;
        if ("futbolcu".equals(sira)) {

            switch (a) {
                case 1:
                    if (kart1.penalti > bkart.penalti) {
                        berabereGeldi = false;
                        kp++;
                        JOptionPane.showMessageDialog(null, "turun kazananı kullanici,sonraki tura geçmek için sonraki tur butonuna tıklayınız");
                        kart1.kartOrtayaAtildiMi = true;
                        bkart1.kartOrtayaAtildiMi = true;
                    } else if (kart1.penalti < bkart.penalti) {
                        berabereGeldi = false;
                        bp++;
                        JOptionPane.showMessageDialog(null, "turun kazananı bilgisayar,sonraki tura geçmek için sonraki tur butonuna tıklayınız");
                        kart1.kartOrtayaAtildiMi = true;
                        bkart1.kartOrtayaAtildiMi = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "berabere,sonraki tura geçmek için sonraki tur butonuna tıklayınız");
                        berabereGeldi = true;
                        kart1.setBounds(kart1.x, kart1.y, wt, lt);
                        bkart.setIcon(bkart.kapaliresim);
                        bkart.setBounds(bkart.x, bkart.y, wt, lt);
                        enableDisableFutbolcu(false);
                        enableDisableBasketbolcu(false);
                        sonrakitur.setEnabled(true);
                      
                        kart1.kartOrtayaAtildiMi = false;
                        bkart1.kartOrtayaAtildiMi = false;

                    }
                    break;
                case 2:
                    if (kart1.serbestVurus > bkart.serbestVurus) {
                        berabereGeldi = false;
                        kp++;
                        JOptionPane.showMessageDialog(null, "turun kazananı kullanici,sonraki tura geçmek için sonraki tur butonuna tıklayınız");
                        kart1.kartOrtayaAtildiMi = true;
                        bkart1.kartOrtayaAtildiMi = true;

                    } else if (kart1.serbestVurus < bkart.serbestVurus) {
                        berabereGeldi = false;
                        bp++;
                        JOptionPane.showMessageDialog(null, "turun kazananı bilgisayar,sonraki tura geçmek için sonraki tur butonuna tıklayınız");
                        kart1.kartOrtayaAtildiMi = true;
                        bkart1.kartOrtayaAtildiMi = true;
                    } else {

                        kart1.setBounds(kart1.x, kart1.y, wt, lt);
                        bkart.setIcon(bkart.kapaliresim);
                        bkart.setBounds(bkart.x, bkart.y, wt, lt);
                        JOptionPane.showMessageDialog(null, "berabere,sonraki tura geçmek için sonraki tur butonuna tıklayınız");
                        berabereGeldi = true;
                        enableDisableFutbolcu(false);
                        enableDisableBasketbolcu(false);                    
                        sonrakitur.setEnabled(true);
                        kart1.kartOrtayaAtildiMi = false;
                        bkart1.kartOrtayaAtildiMi = false;

                    }
                    break;
                default:
                    if (kart1.kaleciKarsiKarsiya > bkart.kaleciKarsiKarsiya) {
                        berabereGeldi = false;
                        kp++;
                        JOptionPane.showMessageDialog(null, "turun kazananı kullanici,sonraki tura geçmek için sonraki tur butonuna tıklayınız");
                        kart1.kartOrtayaAtildiMi = true;
                        bkart1.kartOrtayaAtildiMi = true;

                    } else if (kart1.kaleciKarsiKarsiya < bkart.kaleciKarsiKarsiya) {
                        berabereGeldi = false;
                        bp++;
                        JOptionPane.showMessageDialog(null, "turun kazananı bilgisayar,sonraki tura geçmek için sonraki tur butonuna tıklayınız");
                        kart1.kartOrtayaAtildiMi = true;
                        bkart1.kartOrtayaAtildiMi = true;

                    } else {

                        kart1.setBounds(kart1.x, kart1.y, wt, lt);
                        bkart.setIcon(bkart.kapaliresim);
                        bkart.setBounds(bkart.x, bkart.y, wt, lt);
                        JOptionPane.showMessageDialog(null, "berabere,sonraki tura geçmek için sonraki tur butonuna tıklayınız");
                        berabereGeldi = true;
                        enableDisableFutbolcu(false);
                        enableDisableBasketbolcu(false);                      
                        sonrakitur.setEnabled(true);
                        kart1.kartOrtayaAtildiMi = false;
                        bkart1.kartOrtayaAtildiMi = false;

                    }
                    break;
            }

        } else {
            switch (a) {
                case 1:
                    if (kart1.ikilik > bkart.ikilik) {
                        berabereGeldi = false;
                        JOptionPane.showMessageDialog(null, "turun kazananı kullanici,sonraki tura geçmek için sonraki tur butonuna tıklayınız");
                        kart1.kartOrtayaAtildiMi = true;
                        bkart1.kartOrtayaAtildiMi = true;
                        kp++;
                    } else if (kart1.ikilik < bkart.ikilik) {
                        berabereGeldi = false;
                        kart1.kartOrtayaAtildiMi = true;
                        bkart1.kartOrtayaAtildiMi = true;
                        bp++;
                        JOptionPane.showMessageDialog(null, "turun kazananı bilgisayar,sonraki tura geçmek için sonraki tur butonuna tıklayınız");
                    } else {

                        kart1.setBounds(kart1.x, kart1.y, wt, lt);
                        bkart.setIcon(bkart.kapaliresim);
                        bkart.setBounds(bkart.x, bkart.y, wt, lt);
                        JOptionPane.showMessageDialog(null, "berabere,sonraki tura geçmek için sonraki tur butonuna tıklayınız");
                        berabereGeldi = true;
                        enableDisableFutbolcu(false);
                        enableDisableBasketbolcu(false);
                       
                        sonrakitur.setEnabled(true);
                        kart1.kartOrtayaAtildiMi = false;
                        bkart1.kartOrtayaAtildiMi = false;

                    }
                    break;
                case 2:
                    if (kart1.ucluk > bkart.ucluk) {
                        berabereGeldi = false;
                        kp++;
                        kart1.kartOrtayaAtildiMi = true;
                        bkart1.kartOrtayaAtildiMi = true;
                        JOptionPane.showMessageDialog(null, "turun kazananı kullanici,sonraki tura geçmek için sonraki tur butonuna tıklayınız");
                    } else if (kart1.ucluk < bkart.ucluk) {
                        kart1.kartOrtayaAtildiMi = true;
                        bkart1.kartOrtayaAtildiMi = true;
                        bp++;
                        berabereGeldi = false;
                        JOptionPane.showMessageDialog(null, "turun kazananı bilgisayar,sonraki tura geçmek için sonraki tur butonuna tıklayınız");
                    } else {

                        kart1.setBounds(kart1.x, kart1.y, wt, lt);
                        bkart.setIcon(bkart.kapaliresim);
                        bkart.setBounds(bkart.x, bkart.y, wt, lt);
                        JOptionPane.showMessageDialog(null, "berabere,sonraki tura geçmek için sonraki tur butonuna tıklayınız");
                        berabereGeldi = true;
                        enableDisableFutbolcu(false);
                        enableDisableBasketbolcu(false);
                     
                        sonrakitur.setEnabled(true);
                        kart1.kartOrtayaAtildiMi = false;
                        bkart1.kartOrtayaAtildiMi = false;

                    }
                    break;
                default:
                    if (kart1.serbestAtis > bkart.serbestAtis) {
                        kart1.kartOrtayaAtildiMi = true;
                        bkart1.kartOrtayaAtildiMi = true;
                        kp++;
                        JOptionPane.showMessageDialog(null, "turun kazananı kullanici,sonraki tura geçmek için sonraki tur butonuna tıklayınız");
                        berabereGeldi = false;

                    } else if (kart1.serbestAtis < bkart.serbestAtis) {
                        kart1.kartOrtayaAtildiMi = true;
                        bkart1.kartOrtayaAtildiMi = true;
                        bp++;
                        JOptionPane.showMessageDialog(null, "turun kazananı bilgisayar,sonraki tura geçmek için sonraki tur butonuna tıklayınız");
                        berabereGeldi = false;

                    } else {

                        kart1.setBounds(kart1.x, kart1.y, wt, lt);
                        bkart.setIcon(bkart.kapaliresim);
                        bkart.setBounds(bkart.x, bkart.y, wt, lt);
                        kart1.kartOrtayaAtildiMi = false;
                        bkart1.kartOrtayaAtildiMi = false;
                        JOptionPane.showMessageDialog(null, "berabere,sonraki tura geçmek için sonraki tur butonuna tıklayınız");
                        berabereGeldi = true;
                        enableDisableFutbolcu(false);
                        enableDisableBasketbolcu(false);
                       
                        sonrakitur.setEnabled(true);

                    }
                    break;
            }

        }

        if (kp > bp) {

          //  JOptionPane.showMessageDialog(null, "kullanici puani: " + kp + " bilgisayar puani: " + bp);

            b = 1;

        } else if (kp < bp) {
          //  JOptionPane.showMessageDialog(null, "kullanici puani: " + kp + " bilgisayar puani: " + bp);

            b = 2;
        } else {
          //  JOptionPane.showMessageDialog(null, "kullanici puani: " + kp + " bilgisayar puani: " + bp);

        }
        return b;
    }

    public void sifirla(Kart kart1, Kart kart2) {
        kart1.setVisible(false);
        kart2.setVisible(false);
        kart1.kartOrtayaAtildiMi = true;
        kart2.kartOrtayaAtildiMi = true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Oyuncu oyuncuu = new Oyuncu(1, "can", 0);
        Bilgisayar bilgisayar = new Bilgisayar(2, "sude", 0);

        int x;

        switch (e.getActionCommand()) {
            case "1":
                Kart kartdeneme = null;
               
                kart1.setBounds(250, 420, 140, 190);
                kartdeneme = oyuncuu.kartSec(bkart1, bkart2, bkart3, bkart4, bkart5, bkart6, bkart7, bkart8, "futbolcu", sayideneme);
                kartdeneme.setIcon(kartdeneme.acikresim);
                kartdeneme.setBounds(900, 420, 140, 190);
                kart1.kartOrtayaAtildiMi = true;
                kartdeneme.kartOrtayaAtildiMi = true;

                ortadakikart1 = kart1;
                ortadakikart2 = kartdeneme;
                x = ozelliksec(kart1, kartdeneme, sayideneme, "futbolcu");
                if (x == 1) {
                    kullaniciskor += 10;
                    kullanicininskoru.setText(" Kullanicinin skoru: " + kullaniciskor);
                    enableDisableFutbolcu(false);
                    enableDisableBasketbolcu(false);
                    ortadakikart1.setEnabled(true);
                    sonrakitur.setEnabled(true);

                } else if (x == 2) {
                    bilgisayarskor += 10;
                    bilgisayarinskoru.setText("Bilgisayarin skoru: " + bilgisayarskor);
                    enableDisableFutbolcu(false);
                    enableDisableBasketbolcu(false);
                    ortadakikart1.setEnabled(true);
                    sonrakitur.setEnabled(true);
                } else {
                    if (sayideneme.size() == 8) {
                        if (ozellikDeneme.size() != 3) {
                            x = ozelliksec(kart1, kartdeneme, sayideneme, "futbolcu");
                        } else {

                            sonrakitur.setEnabled(false);
                            JOptionPane.showMessageDialog(null, "Oyunu bitirmek için lütfen oyunu bitir butonuna tiklayiniz.");
                        }

                    } else {
                        enableDisableFutbolcu(false);
                        enableDisableBasketbolcu(false);
                        sonrakitur.setEnabled(true);
                    }

                }
                break;
            case "2":
               kart2.setBounds(250, 420, 140, 190);
                Kart kartdeneme1 = oyuncuu.kartSec(bkart1, bkart2, bkart3, bkart4, bkart5, bkart6, bkart7, bkart8, "futbolcu", sayideneme);
                kartdeneme1.setIcon(kartdeneme1.acikresim);
                kartdeneme1.setBounds(900, 420, 140, 190);
                kart2.kartOrtayaAtildiMi = true;
                kartdeneme1.kartOrtayaAtildiMi = true;

                ortadakikart1 = kart2;
                ortadakikart2 = kartdeneme1;
                x = ozelliksec(kart2, kartdeneme1, sayideneme, "futbolcu");
                if (x == 1) {
                    
                    enableDisableFutbolcu(false);
                    enableDisableBasketbolcu(false);
                    ortadakikart1.setEnabled(true);
                    sonrakitur.setEnabled(true);
                    kullaniciskor += 10;
                    kullanicininskoru.setText(" Kullanicinin skoru: " + kullaniciskor);
                } else if (x == 2) {
                    enableDisableFutbolcu(false);
                    enableDisableBasketbolcu(false);
                    ortadakikart1.setEnabled(true);
                    sonrakitur.setEnabled(true);
                    bilgisayarskor += 10;
                    bilgisayarinskoru.setText("Bilgisayarin skoru: " + bilgisayarskor);
                } else {
                    if (sayideneme.size() == 8) {
                        if (ozellikDeneme.size() != 3) {
                            x = ozelliksec(kart2, kartdeneme1, sayideneme, "futbolcu");
                        } else {

                            sonrakitur.setEnabled(false);
                            JOptionPane.showMessageDialog(null, "Oyunu bitirmek için lütfen oyunu bitir butonuna tiklayiniz.");
                        }

                    } else {
                        enableDisableFutbolcu(false);
                        enableDisableBasketbolcu(false);
                        sonrakitur.setEnabled(true);
                    }
                }
                break;
            case "3":
               kart3.setBounds(250, 420, 140, 190);
                Kart kartdeneme2 = oyuncuu.kartSec(bkart1, bkart2, bkart3, bkart4, bkart5, bkart6, bkart7, bkart8, "futbolcu", sayideneme);
                kartdeneme2.setIcon(kartdeneme2.acikresim);
                kartdeneme2.setBounds(900, 420, 140, 190);
                kart3.kartOrtayaAtildiMi = true;
                kartdeneme2.kartOrtayaAtildiMi = true;

                ortadakikart1 = kart3;
                ortadakikart2 = kartdeneme2;
                x = ozelliksec(kart3, kartdeneme2, sayideneme, "futbolcu");
                if (x == 1) {
                    enableDisableFutbolcu(false);
                    enableDisableBasketbolcu(false);
                    ortadakikart1.setEnabled(true);
                    sonrakitur.setEnabled(true);
                    kullaniciskor += 10;
                    kullanicininskoru.setText(" Kullanicinin skoru: " + kullaniciskor);
                } else if (x == 2) {
                    enableDisableFutbolcu(false);
                    enableDisableBasketbolcu(false);
                    ortadakikart1.setEnabled(true);
                    sonrakitur.setEnabled(true);
                    bilgisayarskor += 10;
                    bilgisayarinskoru.setText("Bilgisayarin skoru: " + bilgisayarskor);
                } else {
                    if (sayideneme.size() == 8) {
                        if (ozellikDeneme.size() != 3) {
                            x = ozelliksec(kart3, kartdeneme2, sayideneme, "futbolcu");
                        } else {

                            sonrakitur.setEnabled(false);
                            JOptionPane.showMessageDialog(null, "Oyunu bitirmek için lütfen oyunu bitir butonuna tiklayiniz.");
                        }

                    } else {
                        enableDisableFutbolcu(false);
                        enableDisableBasketbolcu(false);
                        sonrakitur.setEnabled(true);
                    }
                }
                break;
            case "4":
               
                kart4.setBounds(250, 420, 140, 190);
                Kart kartdeneme3 = oyuncuu.kartSec(bkart1, bkart2, bkart3, bkart4, bkart5, bkart6, bkart7, bkart8, "futbolcu", sayideneme);
                kartdeneme3.setIcon(kartdeneme3.acikresim);
                kartdeneme3.setBounds(900, 420, 140, 190);
                kart4.kartOrtayaAtildiMi = true;
                kartdeneme3.kartOrtayaAtildiMi = true;

                ortadakikart1 = kart4;
                ortadakikart2 = kartdeneme3;
                x = ozelliksec(kart4, kartdeneme3, sayideneme, "futbolcu");
                if (x == 1) {
                    enableDisableFutbolcu(false);
                    enableDisableBasketbolcu(false);
                    ortadakikart1.setEnabled(true);
                    sonrakitur.setEnabled(true);
                    kullaniciskor += 10;
                    kullanicininskoru.setText(" Kullanicinin skoru: " + kullaniciskor);
                } else if (x == 2) {
                    enableDisableFutbolcu(false);
                    enableDisableBasketbolcu(false);
                    ortadakikart1.setEnabled(true);
                    sonrakitur.setEnabled(true);
                    bilgisayarskor += 10;
                    bilgisayarinskoru.setText("Bilgisayarin skoru: " + bilgisayarskor);
                } else {
                    if (sayideneme.size() == 8) {
                        if (ozellikDeneme.size() != 3) {
                            x = ozelliksec(kart4, kartdeneme3, sayideneme, "futbolcu");
                        } else {

                            sonrakitur.setEnabled(false);
                            JOptionPane.showMessageDialog(null, "Oyunu bitirmek için lütfen oyunu bitir butonuna tiklayiniz.");
                        }

                    } else {
                        enableDisableFutbolcu(false);
                        enableDisableBasketbolcu(false);
                        sonrakitur.setEnabled(true);
                    }
                }
                break;
            case "5":
             
              
                kart5.setBounds(250, 420, 140, 190);
                Kart kartdeneme4 = oyuncuu.kartSec(bkart1, bkart2, bkart3, bkart4, bkart5, bkart6, bkart7, bkart8, "basketbolcu", sayideneme);
                kartdeneme4.setIcon(kartdeneme4.acikresim);
                kartdeneme4.setBounds(900, 420, 140, 190);
                kart5.kartOrtayaAtildiMi = true;
                kartdeneme4.kartOrtayaAtildiMi = true;

                ortadakikart1 = kart5;
                ortadakikart2 = kartdeneme4;
                x = ozelliksec(kart5, kartdeneme4, sayideneme, "basketolcu");
                if (x == 1) {
                    enableDisableFutbolcu(false);
                    enableDisableBasketbolcu(false);
                    ortadakikart1.setEnabled(true);
                    sonrakitur.setEnabled(true);
                    kullaniciskor += 10;
                    kullanicininskoru.setText(" Kullanicinin skoru: " + kullaniciskor);
                } else if (x == 2) {
                    enableDisableFutbolcu(false);
                    enableDisableBasketbolcu(false);
                    ortadakikart1.setEnabled(true);
                    sonrakitur.setEnabled(true);
                    bilgisayarskor += 10;
                    bilgisayarinskoru.setText("Bilgisayarin skoru: " + bilgisayarskor);
                } else {
                    if (sayideneme.size() == 8) {
                        if (ozellikDeneme.size() != 3) {
                            x = ozelliksec(kart5, kartdeneme4, sayideneme, "futbolcu");
                        } else {

                            sonrakitur.setEnabled(false);
                            JOptionPane.showMessageDialog(null, "Oyunu bitirmek için lütfen oyunu bitir butonuna tiklayiniz.");
                        }

                    } else {
                        enableDisableFutbolcu(false);
                        enableDisableBasketbolcu(false);
                        sonrakitur.setEnabled(true);
                    }
                }
                break;
            case "6":
               
                kart6.setBounds(250, 420, 140, 190);
                kart6.kartOrtayaAtildiMi = true;
                Kart kartdeneme5 = oyuncuu.kartSec(bkart1, bkart2, bkart3, bkart4, bkart5, bkart6, bkart7, bkart8, "basketbolcu", sayideneme);
                kartdeneme5.setIcon(kartdeneme5.acikresim);
                kartdeneme5.setBounds(900, 420, 140, 190);
                kart6.kartOrtayaAtildiMi = true;
                kartdeneme5.kartOrtayaAtildiMi = true;

                ortadakikart1 = kart6;
                ortadakikart2 = kartdeneme5;
                x = ozelliksec(kart6, kartdeneme5, sayideneme, "basketolcu");
                if (x == 1) {
                    enableDisableFutbolcu(false);
                    enableDisableBasketbolcu(false);
                    ortadakikart1.setEnabled(true);
                    sonrakitur.setEnabled(true);
                    kullaniciskor += 10;
                    kullanicininskoru.setText(" Kullanicinin skoru: " + kullaniciskor);
                } else if (x == 2) {
                    enableDisableFutbolcu(false);
                    enableDisableBasketbolcu(false);
                    ortadakikart1.setEnabled(true);
                    sonrakitur.setEnabled(true);
                    bilgisayarskor += 10;
                    bilgisayarinskoru.setText("Bilgisayarin skoru: " + bilgisayarskor);
                } else {
                    if (sayideneme.size() == 8) {
                        if (ozellikDeneme.size() != 3) {
                            x = ozelliksec(kart6, kartdeneme5, sayideneme, "futbolcu");
                        } else {

                            sonrakitur.setEnabled(false);
                            JOptionPane.showMessageDialog(null, "Oyunu bitirmek için lütfen oyunu bitir butonuna tiklayiniz.");
                        }

                    } else {
                        enableDisableFutbolcu(false);
                        enableDisableBasketbolcu(false);
                        sonrakitur.setEnabled(true);
                    }
                }
                break;
            case "7":
                            
                kart7.setBounds(250, 420, 140, 190);
                Kart kartdeneme6 = oyuncuu.kartSec(bkart1, bkart2, bkart3, bkart4, bkart5, bkart6, bkart7, bkart8, "basketbolcu", sayideneme);
                kartdeneme6.setIcon(kartdeneme6.acikresim);
                kartdeneme6.setBounds(900, 420, 140, 190);
                kart7.kartOrtayaAtildiMi = true;
                kartdeneme6.kartOrtayaAtildiMi = true;
                ortadakikart1 = kart7;
                ortadakikart2 = kartdeneme6;
                x = ozelliksec(kart7, kartdeneme6, sayideneme, "basketolcu");
                if (x == 1) {
                    enableDisableFutbolcu(false);
                    enableDisableBasketbolcu(false);
                    ortadakikart1.setEnabled(true);
                    sonrakitur.setEnabled(true);
                    kullaniciskor += 10;
                    kullanicininskoru.setText(" Kullanicinin skoru: " + kullaniciskor);
                } else if (x == 2) {
                    enableDisableFutbolcu(false);
                    enableDisableBasketbolcu(false);
                    ortadakikart1.setEnabled(true);
                    sonrakitur.setEnabled(true);
                    bilgisayarskor += 10;
                    bilgisayarinskoru.setText("Bilgisayarin skoru: " + bilgisayarskor);
                } else {
                    if (sayideneme.size() == 8) {
                        if (ozellikDeneme.size() != 3) {
                            x = ozelliksec(kart7, kartdeneme6, sayideneme, "futbolcu");
                        } else {

                            sonrakitur.setEnabled(false);
                            JOptionPane.showMessageDialog(null, "Oyunu bitirmek için lütfen oyunu bitir butonuna tiklayiniz.");
                        }

                    } else {
                        enableDisableFutbolcu(false);
                        enableDisableBasketbolcu(false);
                        sonrakitur.setEnabled(true);
                    }
                }
                break;
            case "8":
                             
                kart8.setBounds(250, 420, 140, 190);
                Kart kartdeneme7 = oyuncuu.kartSec(bkart1, bkart2, bkart3, bkart4, bkart5, bkart6, bkart7, bkart8, "basketbolcu", sayideneme);
                kartdeneme7.setIcon(kartdeneme7.acikresim);
                kartdeneme7.setBounds(900, 420, 140, 190);
                kart8.kartOrtayaAtildiMi = true;
                kartdeneme7.kartOrtayaAtildiMi = true;

                ortadakikart1 = kart8;
                ortadakikart2 = kartdeneme7;
                x = ozelliksec(kart8, kartdeneme7, sayideneme, "basketolcu");
                if (x == 1) {
                    enableDisableFutbolcu(false);
                    enableDisableBasketbolcu(false);
                    ortadakikart1.setEnabled(true);
                    sonrakitur.setEnabled(true);
                    kullaniciskor += 10;
                    kullanicininskoru.setText(" Kullanicinin skoru: " + kullaniciskor);
                } else if (x == 2) {
                    enableDisableFutbolcu(false);
                    enableDisableBasketbolcu(false);
                    ortadakikart1.setEnabled(true);
                    sonrakitur.setEnabled(true);
                    bilgisayarskor += 10;
                    bilgisayarinskoru.setText("Bilgisayarin skoru: " + bilgisayarskor);
                } else {
                    if (sayideneme.size() == 8) {
                        if (ozellikDeneme.size() != 3) {
                            x = ozelliksec(kart8, kartdeneme7, sayideneme, "futbolcu");
                        } else {

                            sonrakitur.setEnabled(false);
                            JOptionPane.showMessageDialog(null, "Oyunu bitirmek için lütfen oyunu bitir butonuna tiklayiniz.");
                        }

                    } else {
                        enableDisableFutbolcu(false);
                        enableDisableBasketbolcu(false);
                        sonrakitur.setEnabled(true);
                    }
                }
                break;
            case "Oyunu Bitir":

                BitisResmi bitisresmi = new BitisResmi();
                JFrame jf2 = new JFrame();

                kullanicininskoru.setVisible(true);
                bilgisayarinskoru.setVisible(true);
               

                jf2.add(bitisresmi);
                jf2.setTitle("OYUN BITTI");
                jf2.setSize(1500, 1000);
                jf2.setVisible(true);
                
                jf2.add(bilgisayarinskoru);
                jf2.add(kullanicininskoru);

                jf2.add(bitisresmi);

                jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                // JOptionPane.showMessageDialog(null, "kullanici skor: " + kullaniciskor + " bilgisayar skor: " + bilgisayarskor);
                if (kullaniciskor > bilgisayarskor) {
                    kullanicininskoru.setBounds(570, -100, 500, 500);
                    bilgisayarinskoru.setBounds(610, -50, 500, 500);
                  

                    Font f = new Font("TimesRoman", Font.BOLD, 30);
                    kullanicininskoru.setFont(f);
                    kullanicininskoru.setForeground(Color.PINK);

                    Font f2 = new Font("TimesRoman", Font.ITALIC, 30);
                   

                    Font f1 = new Font("TimesRoman", Font.BOLD, 30);
                    bilgisayarinskoru.setFont(f1);
                    bilgisayarinskoru.setForeground(Color.PINK);

                    bilgisayarinskoru.setText("  Bilgisayarin Skoru: " + bilgisayarskor);
                    kullanicininskoru.setText(" Kullanicinin Skoru: " + kullaniciskor);
                   
                    
                    JOptionPane.showMessageDialog(null, "Oyun bitti,Siz kazandınız");
                } else if (kullaniciskor < bilgisayarskor) {
                    kullanicininskoru.setBounds(570, -100, 500, 500);
                    bilgisayarinskoru.setBounds(610, -50, 500, 500);
                  

                    Font f = new Font("TimesRoman", Font.BOLD, 30);
                    kullanicininskoru.setFont(f);
                    kullanicininskoru.setForeground(Color.PINK);

                    Font f2 = new Font("TimesRoman", Font.ITALIC, 30);
                   

                    Font f1 = new Font("TimesRoman", Font.BOLD, 30);
                    bilgisayarinskoru.setFont(f1);
                    bilgisayarinskoru.setForeground(Color.PINK);

                    bilgisayarinskoru.setText("  Bilgisayarin Skoru: " + bilgisayarskor);
                    kullanicininskoru.setText(" Kullanicinin Skoru: " + kullaniciskor);
                   
                    
                    JOptionPane.showMessageDialog(null, "Oyun bitti,Bilgisayar oyunu kazandı");
                } else {
                    kullanicininskoru.setBounds(570, -100, 500, 500);
                    bilgisayarinskoru.setBounds(610, -50, 500, 500);
                  

                    Font f = new Font("TimesRoman", Font.ITALIC, 30);
                    kullanicininskoru.setFont(f);
                    kullanicininskoru.setForeground(Color.PINK);
  
                    Font f1 = new Font("TimesRoman", Font.ITALIC, 30);
                    bilgisayarinskoru.setFont(f1);
                    bilgisayarinskoru.setForeground(Color.PINK);

                    bilgisayarinskoru.setText("  Bilgisayarin Skoru: " + bilgisayarskor);
                    kullanicininskoru.setText(" Kullanicinin Skoru: " + kullaniciskor);
                   
                    
                     JOptionPane.showMessageDialog(null, "Oyun bitti,Sonuc berabere");
                }
                
                break;

            case "sonrakitur":
                if (sayideneme.get(sayideneme.size() - 1) > 4) {
//                    if (futbolcu kalmadıysa basket bolcuları açd) {
//                        
//                    }
//                    else

                    for (int i = 0; i < bilgisayarfutbolculiste.size(); i++) {
                        if (kullanicifutbolcukartlari.get(i).isKartOrtayaAtildiMi() == false) {
                            tumfutbolcukullanildimi = false;
                            break;
                        } else {
                            tumfutbolcukullanildimi = true;
                        }
                    }

                    if (!tumfutbolcukullanildimi) {
                        enableDisableFutbolcu(true);
                        enableDisableBasketbolcu(false);
                    } else {
                        enableDisableBasketbolcu(true);

                    }

                    //
                } else {

                    for (int i = 0; i < bilgisayarbasketbolculiste.size(); i++) {
                        if (kullanicibasketbolcukartlari.get(i).isKartOrtayaAtildiMi() == false) {
                            tumbasketbolcukullanildimi = false;
                            break;
                        } else {
                            tumbasketbolcukullanildimi = true;
                        }
                    }

                    if (!tumbasketbolcukullanildimi) {
                        enableDisableFutbolcu(false);
                        enableDisableBasketbolcu(true);
                    } else {

                        enableDisableFutbolcu(true);

                    }

//                    enableDisableFutbolcu(false);
//                    enableDisableBasketbolcu(true);
                }

                if (berabereGeldi) {
                    sayideneme.remove(sayideneme.size() - 1);
                } else {
                    sifirla(ortadakikart1, ortadakikart2);
                }

                break;
        }

    }

    public void enableDisableFutbolcu(boolean choice) {
        kart1.setEnabled(choice);
        kart2.setEnabled(choice);
        kart3.setEnabled(choice);
        kart4.setEnabled(choice);
    }

    public void enableDisableBasketbolcu(boolean choice) {
        kart5.setEnabled(choice);
        kart6.setEnabled(choice);
        kart7.setEnabled(choice);
        kart8.setEnabled(choice);
    }

}