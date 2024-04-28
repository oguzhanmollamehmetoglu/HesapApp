import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.UIManager;

public class Merkez {

	public static void main(String[] args) {
		JFrame pencere=new JFrame();
		pencere.setBackground(Color.DARK_GRAY);
		JRootPane rootPane = pencere.getRootPane();
	        rootPane.setBorder(new LineBorder(Color.DARK_GRAY,5));
	    // Merkez paneli ve CardLayout oluşturma
        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        CardLayout cl= new CardLayout();
        panel.setLayout(cl);
        // Panel1, Panel2, Panel3 gibi örnek paneller oluşturma
        Panel0 panel0=new Panel0();
        panel0.setBackground(Color.DARK_GRAY);
        Panel1 panel1=new Panel1();
        panel1.setBackground(Color.DARK_GRAY);
        Panel2 panel2=new Panel2();
        panel2.setBackground(Color.DARK_GRAY);
        Panel3 panel3=new Panel3();
        panel3.setBackground(Color.DARK_GRAY);
        Panel4 panel4=new Panel4();
        panel4.setBackground(Color.DARK_GRAY);
		Panel5 panel5=new Panel5();
		panel5.setBackground(Color.DARK_GRAY);
		Panel6 panel6=new Panel6();
		panel6.setBackground(Color.DARK_GRAY);
		Panel7 panel7=new Panel7();
		panel7.setBackground(Color.DARK_GRAY);
		Panel8 panel8=new Panel8();
		panel8.setBackground(Color.DARK_GRAY);
		Panel9 panel9=new Panel9();
		panel9.setBackground(Color.DARK_GRAY);
		Panel10 panel10=new Panel10();
		panel10.setBackground(Color.DARK_GRAY);
		Panel11 panel11=new Panel11();
		panel11.setBackground(Color.DARK_GRAY);
		Panel12 panel12=new Panel12();
		panel12.setBackground(Color.DARK_GRAY);
		Panel13 panel13=new Panel13();
		panel13.setBackground(Color.DARK_GRAY);
		Panel14 panel14=new Panel14();
		panel14.setBackground(Color.DARK_GRAY);
		Panel15 panel15=new Panel15();
		panel15.setBackground(Color.DARK_GRAY);
		Panel16 panel16=new Panel16();
		panel16.setBackground(Color.DARK_GRAY);
		Panel17 panel17=new Panel17();
		panel17.setBackground(Color.DARK_GRAY);
		Panel18 panel18=new Panel18();
		panel18.setBackground(Color.DARK_GRAY);
		Panel19 panel19=new Panel19();
		panel19.setBackground(Color.DARK_GRAY);
		Panel20 panel20=new Panel20();
		panel20.setBackground(Color.DARK_GRAY);
		Panel21 panel21=new Panel21();
		panel21.setBackground(Color.DARK_GRAY);
		PanelA1 panela1=new PanelA1();
        panela1.setBackground(Color.DARK_GRAY);
        // Menü çubuğunu oluşturma
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(Color.gray);
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            // Menü çubuğunun kenar rengini ayarlamak için bir renk kullanabilirsiniz
            UIManager.put("MenuBar.borderColor", Color.DARK_GRAY);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Menüyü oluşturun
        JMenu hesaplam = new JMenu("Hesaplamalar");
        JMenu AS = new JMenu("Ana Sayfa");
        hesaplam.setForeground(Color.WHITE);
        AS.setForeground(Color.WHITE);
        // Menü öğelerini oluşturma
        JMenuItem p1 = new JMenuItem("Not Hesaplama");
    	p1.setBackground(Color.LIGHT_GRAY);
        JMenuItem p2 = new JMenuItem("KDV Hesaplama");
        p2.setBackground(Color.LIGHT_GRAY);
        JMenuItem p3 = new JMenuItem("Hipotenüs Hesaplama");
        p3.setBackground(Color.LIGHT_GRAY);
        JMenuItem p4 = new JMenuItem("Vücut Kitle İndeksi Hesaplama");
        p4.setBackground(Color.LIGHT_GRAY);
        JMenuItem p5 = new JMenuItem("Manav Sepet Hesaplama");
        p5.setBackground(Color.LIGHT_GRAY);
        JMenuItem p6 = new JMenuItem("Daire Alan-Çevre Hesaplama");
        p6.setBackground(Color.LIGHT_GRAY);
        JMenuItem p7 = new JMenuItem("Taksimetre Hesaplama");
        p7.setBackground(Color.LIGHT_GRAY);
        JMenuItem p8 = new JMenuItem("Hesap Makinesi");
        p8.setBackground(Color.LIGHT_GRAY);
        JMenuItem p9 = new JMenuItem("Sıcaklık Değerine Göre Etkinlik Önerme");
        p9.setBackground(Color.LIGHT_GRAY);
        JMenuItem p10 = new JMenuItem("Otobüs Bilet Fiyatı Hesaplama");
        p10.setBackground(Color.LIGHT_GRAY);
        JMenuItem p11 = new JMenuItem("Çin Zodyağı Hesaplama");
        p11.setBackground(Color.LIGHT_GRAY);
        JMenuItem p12 = new JMenuItem("Burç Hesaplama");
        p12.setBackground(Color.LIGHT_GRAY);
        JMenuItem p13 = new JMenuItem("Tek-Çift Sayılar Hesaplama");
        p13.setBackground(Color.LIGHT_GRAY);
        JMenuItem p14 = new JMenuItem("Üs Alma");
        p14.setBackground(Color.LIGHT_GRAY);
        JMenuItem p15 = new JMenuItem("Faktöriyel Hesaplama");
        p15.setBackground(Color.LIGHT_GRAY);
        JMenuItem p16 = new JMenuItem("Harmonik Seri Hesaplama");
        p16.setBackground(Color.LIGHT_GRAY);
        JMenuItem p17 = new JMenuItem("Armstrong Sayılar Hesaplama");
        p17.setBackground(Color.LIGHT_GRAY);
        JMenuItem p18 = new JMenuItem("Metin Karakter Sayısı Hesaplama");
        p18.setBackground(Color.LIGHT_GRAY);
        JMenuItem p19 = new JMenuItem("Ebob-Ekok Hesaplama");
        p19.setBackground(Color.LIGHT_GRAY);
        JMenuItem p20 = new JMenuItem("Mükemmel Sayı Hesaplama");
        p20.setBackground(Color.LIGHT_GRAY);
        JMenuItem p21 = new JMenuItem("Asal Sayı Hesaplama");
        p21.setBackground(Color.LIGHT_GRAY);
        JMenuItem as = new JMenuItem("Ben Kimim?");
        as.setBackground(Color.LIGHT_GRAY);
        JMenuItem as2 = new JMenuItem("İletişim");
    	as2.setBackground(Color.LIGHT_GRAY);
        // Panelleri merkez panele ekleme
        panel.add(panel0,"panel0");
        panel.add(panel1,"panel1");
        panel.add(panel2,"panel2");
        panel.add(panel3,"panel3");
        panel.add(panel4,"panel4");
        panel.add(panel5,"panel5");
        panel.add(panel6,"panel6");
        panel.add(panel7,"panel7");
        panel.add(panel8,"panel8");
        panel.add(panel9,"panel9");
        panel.add(panel10,"panel10");
        panel.add(panel11,"panel11");
        panel.add(panel12,"panel12");
        panel.add(panel13,"panel13");
        panel.add(panel14,"panel14");
        panel.add(panel15,"panel15");
        panel.add(panel16,"panel16");
        panel.add(panel17,"panel17");
        panel.add(panel18,"panel18");
        panel.add(panel19,"panel19");
        panel.add(panel20,"panel20");
        panel.add(panel21,"panel21");
        panel.add(panela1,"panela1");
        // Menü öğelerine ActionListener ekleme
        as.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.show(panel, "panel0");
            }
        });
        p1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.show(panel, "panel1");
            }
        });
        p2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.show(panel, "panel2");
            }
        });

        p3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cl.show(panel, "panel3");
			}
        });
        p4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cl.show(panel, "panel4");
			}
        });
        p5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cl.show(panel, "panel5");
			}
        });
        p6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cl.show(panel, "panel6");
			}
        });
        p7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cl.show(panel, "panel7");
			}
        });
        p8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cl.show(panel, "panel8");
			}
        });
        p9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cl.show(panel, "panel9");
			}
        });
        p10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cl.show(panel, "panel10");
			}
        });
        p11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cl.show(panel, "panel11");
			}
        });
        p12.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cl.show(panel, "panel12");
			}
        });
        p13.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cl.show(panel, "panel13");
			}
        });
        p14.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cl.show(panel, "panel14");
			}
        });
        p15.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cl.show(panel, "panel15");
			}
        });
        p16.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cl.show(panel, "panel16");
			}
        });
        p17.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cl.show(panel, "panel17");
			}
        });
        p18.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cl.show(panel, "panel18");
			}
        });
        p19.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cl.show(panel, "panel19");
			}
        });
        p20.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cl.show(panel, "panel20");
			}
        });
        p21.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cl.show(panel, "panel21");
			}
        });
        as2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.show(panel, "panela1");
            }
        });
        // Menü öğelerini menüye ekleme
        AS.add(as);
        AS.add(as2);
        hesaplam.add(p1);
        hesaplam.add(p2);
        hesaplam.add(p3);
        hesaplam.add(p4);
        hesaplam.add(p5);
        hesaplam.add(p6);
        hesaplam.add(p7);
        hesaplam.add(p8);
        hesaplam.add(p9);
        hesaplam.add(p10);
        hesaplam.add(p11);
        hesaplam.add(p12);
        hesaplam.add(p13);
        hesaplam.add(p14);
        hesaplam.add(p15);
        hesaplam.add(p16);
        hesaplam.add(p17);
        hesaplam.add(p18);
        hesaplam.add(p19);
        hesaplam.add(p20);
        hesaplam.add(p21);
        // Menüyü menü çubuğuna ekleme
        menuBar.add(AS);
        menuBar.add(hesaplam);
		// Menü çubuğunu pencereye ekleyin
        pencere.setJMenuBar(menuBar);
        // Merkez paneli pencereye ekleme
        pencere.add(panel);
        //pencere.setDefaultLookAndFeelDecorated(false);
        //pencere.setUndecorated(true);
        Image logo= Toolkit.getDefaultToolkit().getImage("./img/logo.jpg");
		pencere.setTitle("Hesaplamalar-Aplication");
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pencere.setSize(600,600);
		pencere.setResizable(false);
		pencere.setIconImage(logo);
		pencere.setLocation(400, 100);
		pencere.setVisible(true);
	}
	
}