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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.text.DefaultCaret;

public class Panel18 extends JPanel {
    JButton b1;
    JTextArea t1;
    JLabel e1;
    Timer timer;

    public Panel18() {
    	Font font = new Font("Arial", Font.PLAIN, 20);
        t1 = new JTextArea();
        t1.setFont(font);
    	t1.setForeground(Color.DARK_GRAY);
    	t1.setBackground(Color.lightGray);
    	// Köşeleri kavisli bir kenarlık oluşturma
        t1.setBorder(BorderFactory.createBevelBorder(10));
        e1 = new JLabel("Metin Girin");
        e1.setForeground(Color.white);
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
        timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("");
                timer.stop();
            }
        });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = t1.getText().trim();
                if (text.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Boş değer girdiniz!");
                }else {
                	try {
                        // Aradaki boşlukları kaldırarak karakter sayısını hesapla
                        text = text.replaceAll("\\s+", "");
                        int characterCount = text.length();
                        JOptionPane.showMessageDialog(null, "Karakter Sayısı = "+characterCount);
                	     }
                    catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Lütfen geçerli bir değer girin."); // Geçersiz sayı formatı için hata mesajı göster
                    }
                }
                timer.restart();
            }
        });
        setLayout(null);
        e1.setBounds(270, 5, 150, 30);

        t1.setLineWrap(true); // Satır sonunda otomatik olarak kaydırma yapmak için
        t1.setWrapStyleWord(true); // Kelimeleri kırparak kaydırma yapmak için

        // Metin alanının sağa doğru genişlemesini engellemek için yatay kaydırma çubuğunu devre dışı bırakalım
        JScrollPane scrollPane = new JScrollPane(t1, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
        JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setBounds(70, 30, 450, 380);
        add(scrollPane);

        // İçerik aşağıdan devam etsin
        DefaultCaret caret = (DefaultCaret) t1.getCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);

        b1.setBounds(250, 450, 100, 30);
        add(e1);
        add(b1);
    }
}