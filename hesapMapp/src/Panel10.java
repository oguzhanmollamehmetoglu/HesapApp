import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class Panel10 extends JPanel {
    JButton b1;
    JTextField t1, t2;
    JLabel e1, e2, e3;
    JComboBox<String> kutu;
    Timer timer;
    DecimalFormat df = new DecimalFormat("#.##");

    public Panel10() {
    	Font font = new Font("Arial", Font.PLAIN, 20);
    	Font font2 = new Font("Arial", Font.PLAIN, 12);
        t1 = new JTextField();
        t1.setFont(font);
    	t1.setHorizontalAlignment(SwingConstants.CENTER);
    	t1.setForeground(Color.DARK_GRAY);
    	t1.setBackground(Color.lightGray);
    	// Köşeleri kavisli bir kenarlık oluşturma
        t1.setBorder(BorderFactory.createBevelBorder(10));
        t2 = new JTextField();
        t2.setFont(font);
    	t2.setHorizontalAlignment(SwingConstants.CENTER);
    	t2.setForeground(Color.DARK_GRAY);
    	t2.setBackground(Color.lightGray);
    	  t2.setBorder(BorderFactory.createBevelBorder(10));
        kutu = new JComboBox<String>();
        kutu.setFont(font2);
        kutu.setForeground(Color.DARK_GRAY);
    	kutu.setBackground(Color.lightGray);
    	  kutu.setBorder(BorderFactory.createBevelBorder(10));
        e1 = new JLabel("Km Verisini Girin");
        e1.setForeground(Color.white);
        e2 = new JLabel("Yaşınızı Girin");
        e2.setForeground(Color.white);
        e3 = new JLabel("Yolculuk Tipini Seçiniz");
        e3.setForeground(Color.white);
        b1 = new JButton("Hesapla");
        b1.setBackground(Color.gray);
    	b1.setForeground(Color.white);
    	 b1.setBorder(BorderFactory.createLineBorder(Color.black));
    	 b1.addMouseListener(new MouseAdapter() {
    		    @Override
    		    public void mouseClicked(MouseEvent e) {
    		        // Mouse tıklama olayı gerçekleştiğinde yapılacak işlemler
    		    }

    		    @Override
    		    public void mouseEntered(MouseEvent e) {
    		        // Mouse butonun üzerine gelindiğinde yapılacak işlemler
    		    	b1.setBackground(Color.LIGHT_GRAY);
    		    	b1.setForeground(Color.black);
    		    }

    		    @Override
    		    public void mouseExited(MouseEvent e) {
    		        // Mouse butondan çıkıldığında yapılacak işlemler
    		    	b1.setBackground(Color.gray);
    		    	b1.setForeground(Color.white);
    		    }
    		});
    	kutu.addItem("");
        kutu.addItem("Gidiş");
        kutu.addItem("Dönüş");
        kutu.addItem("Gidiş-Dönüş");
        timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("");
                t2.setText("");
                kutu.setSelectedItem("");
                timer.stop();
            }
        });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String kmStr = t1.getText();
                String yasStr = t2.getText();

                if (kmStr.isEmpty() || yasStr.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Lütfen tüm alanları doldurun.", "Uyarı", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                else {
                	try {
                	 double km = Double.parseDouble(kmStr);
                     int yas = Integer.parseInt(yasStr);
                     String yolculukTipi = (String) kutu.getSelectedItem();

                     double fiyat = km * 0.8; // Km başına fiyat

                     if (yas < 12) {
                         fiyat = km * 0.6; // Yaşa göre fiyat indirimi yap
                     } else if (yas >= 12 && yas <= 24) {
                         fiyat = km * 0.7; // Yaşa göre fiyat indirimi yap
                     } else if (yas > 65) {
                         fiyat = km * 0.8; // Yaşa göre fiyat indirimi yap
                     }

                     if (yolculukTipi.equals("Gidiş-Dönüş")) {
                         fiyat *= 2; // Gidiş-dönüş seçildiğinde fiyatı iki katına çıkar
                     }
                     JOptionPane.showMessageDialog(null, "Toplam Ödenecek Tutar: " + df.format(fiyat) + " TL","Sonuç",JOptionPane.INFORMATION_MESSAGE);
                     timer.restart();
                	}
                     catch (NumberFormatException ex) {
                         JOptionPane.showMessageDialog(null, "Geçersiz değerler girdiniz.", "Hata", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        setLayout(null);
        e1.setBounds(229, 80, 150, 30);
    	e2.setBounds(240, 150, 130, 30);
    	e3.setBounds(215, 200, 170, 70);
    	t1.setBounds(230, 110, 100, 30);
    	t2.setBounds(230, 180, 100, 30);
    	kutu.setBounds(230, 250, 100, 30);
    	b1.setBounds(230, 320, 100, 30);
        add(e1);
        add(e2);
        add(e3);
        add(t1);
        add(t2);
        add(kutu);
        add(b1);
    }
}