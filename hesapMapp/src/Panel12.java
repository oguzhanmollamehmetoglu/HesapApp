import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class Panel12 extends JPanel {
    JButton b1;
    JTextField t1,t2;
    JLabel e1,e2,e3;
    Timer timer;
    
    public Panel12() {
    	Font font = new Font("Arial", Font.PLAIN, 20);
        t1=new JTextField();
        t1.setFont(font);
    	t1.setHorizontalAlignment(SwingConstants.CENTER);
    	t1.setForeground(Color.DARK_GRAY);
    	t1.setBackground(Color.lightGray);
    	// Köşeleri kavisli bir kenarlık oluşturma
        t1.setBorder(BorderFactory.createBevelBorder(10));
        t2=new JTextField();
        t2=new JTextField();
    	t2.setFont(font);
    	t2.setHorizontalAlignment(SwingConstants.CENTER);
    	t2.setForeground(Color.DARK_GRAY);
    	t2.setBackground(Color.lightGray);
    	  t2.setBorder(BorderFactory.createBevelBorder(10));
        e1=new JLabel("Doğum Tarihi Ay Olarak");
        e1.setForeground(Color.white);
        e2=new JLabel("Doğum Tarihi Gün Olarak");
        e2.setForeground(Color.white);
        e3=new JLabel("Burcunuz");
        e3.setForeground(Color.white);
        b1=new JButton("Hesapla");
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
        timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("");
                t2.setText("");
                e3.setText("Burcunuz"+"");
                timer.stop();
            }
        });
        
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ay ve günü tam sayı olarak alın
                String ayStr = t1.getText();
                String günStr = t2.getText();
                // Boş değer kontrolü yapın
                if (ayStr.isEmpty() || günStr.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Lütfen doğum tarihinizi girin.", "Hata", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                else {
                	try {
                		 int ay = Integer.parseInt(ayStr);
                         int gün = Integer.parseInt(günStr);

                         // Ay ve günü kullanarak burcu hesaplayın
                         String burc = burcHesapla(ay, gün);

                         // Hesaplanan burcu etiketle güncelleyin
                         e3.setText("<html><div style='text-align: center;'>Burcunuz<br><span style='font-size: 15px;'>" +""+ burc + "</span></div></html>");

                         // 3 saniye sonra metin kutularını ve etiketi temizlemek için zamanlayıcıyı başlatın
                         timer.start();
                	}
                    catch (NumberFormatException ex) {
                         JOptionPane.showMessageDialog(null, "Geçersiz değerler girdiniz.", "Hata", JOptionPane.ERROR_MESSAGE);
                     }
                 }
            }
        });
        
        setLayout(null);
        e1.setBounds(210, 70, 150, 30);
    	e2.setBounds(205, 140, 200, 30);
    	e3.setBounds(253, 200, 170, 70);
    	t1.setBounds(230, 100, 100, 30);
    	t2.setBounds(230, 170, 100, 30);
    	b1.setBounds(230, 300, 100, 30);
        add(e1);
        add(e2);
        add(e3);
        add(t1);
        add(t2);
        add(b1);
    }
    private String burcHesapla(int ay, int gün) {
        String[] burcArray = {"Koç", "Boğa", "İkizler", "Yengeç", "Aslan", "Başak", "Terazi", "Akrep", "Yay", "Oğlak", "Kova", "Balık"};
        
        if ((ay == 3 && gün >= 21) || (ay == 4 && gün <= 20)) {
            return burcArray[0]; // Koç Burcu
        } else if ((ay == 4 && gün >= 21) || (ay == 5 && gün <= 21)) {
            return burcArray[1]; // Boğa Burcu
        } else if ((ay == 5 && gün >= 22) || (ay == 6 && gün <= 21)) {
            return burcArray[2]; // İkizler Burcu
        } else if ((ay == 6 && gün >= 22) || (ay == 7 && gün <= 22)) {
            return burcArray[3]; // Yengeç Burcu
        } else if ((ay == 7 && gün >= 23) || (ay == 8 && gün <= 22)) {
            return burcArray[4]; // Aslan Burcu
        } else if ((ay == 8 && gün >= 23) || (ay == 9 && gün <= 22)) {
            return burcArray[5]; // Başak Burcu
        } else if ((ay == 9 && gün >= 23) || (ay == 10 && gün <= 22)) {
            return burcArray[6]; // Terazi Burcu
        } else if ((ay == 10 && gün >= 23) || (ay == 11 && gün <= 21)) {
            return burcArray[7]; // Akrep Burcu
        } else if ((ay == 11 && gün >= 22) || (ay == 12 && gün <= 21)) {
            return burcArray[8]; // Yay Burcu
        } else if ((ay == 12 && gün >= 22) || (ay == 1 && gün <= 21)) {
            return burcArray[9]; // Oğlak Burcu
        } else if ((ay == 1 && gün >= 22) || (ay == 2 && gün <= 19)) {
            return burcArray[10]; // Kova Burcu
        } else {
            return burcArray[11]; // Balık Burcu
        }
    }
}