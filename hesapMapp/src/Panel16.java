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

public class Panel16 extends JPanel {
    JButton b1;
    JTextField t1;
    JLabel e1, e2;
    Timer timer;

    public Panel16() {
    	Font font = new Font("Arial", Font.PLAIN, 20);
        t1 = new JTextField();
        t1.setFont(font);
    	t1.setHorizontalAlignment(SwingConstants.CENTER);
    	t1.setForeground(Color.DARK_GRAY);
    	t1.setBackground(Color.lightGray);
    	// Köşeleri kavisli bir kenarlık oluşturma
        t1.setBorder(BorderFactory.createBevelBorder(10));
        e1 = new JLabel("N Değerini Girin");
        e1.setForeground(Color.white);
        e2 = new JLabel("Sonuç");
        e2.setForeground(Color.white);
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
        timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("");
                e2.setText("Sonuç");
                timer.stop();
            }
        });

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String giris = t1.getText(); // Metin kutusundan kullanıcının girdisini al
                if (giris.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Lütfen bir sayı girin."); // Giriş boşsa hata mesajı göster
                    return;
                }
                
                try {
                    int n = Integer.parseInt(giris); // Girişi bir tamsayıya dönüştür
                    if (n < 1) {
                        JOptionPane.showMessageDialog(null, "Lütfen 1'den büyük bir sayı girin."); // Sayı 1'den küçükse hata mesajı göster
                        return;
                    }
                    
                    double sonuc = hesaplaHarmonikSerisi(n); // Harmonik seriyi hesapla
                    e2.setText("<html><div style='text-align: center;'>Sonuç<br><span style='font-size: 15px;'>" + sonuc + "</span></div></html>");
                    timer.restart(); // 3 saniye sonra metin kutusunu ve sonucu temizlemek için timer'ı başlat
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Lütfen geçerli bir tamsayı girin."); // Geçersiz sayı formatı için hata mesajı göster
                }
            }
        });

        setLayout(null);
        e1.setBounds(233, 120, 150, 30);
    	e2.setBounds(255, 170, 300, 100);
    	t1.setBounds(230, 150, 100, 30);
    	b1.setBounds(230, 270, 100, 30);
        add(e1);
        add(e2);
        add(t1);
        add(b1);
    }
    
    private double hesaplaHarmonikSerisi(int n) {
        double toplam = 0;
        for (int i = 1; i <= n; i++) {
            toplam += (1.0 / i);
        }
        return toplam;
    }
}