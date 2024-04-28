import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class Panel14 extends JPanel {
    JButton b1;
    JTextField t1, t2;
    JLabel e1, e2, e3;
    Timer timer;
    DecimalFormat df = new DecimalFormat("#.##");

    public Panel14() {
    	Font font = new Font("Arial", Font.PLAIN, 20);
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
        e1 = new JLabel("Taban Değeri Girin");
        e1.setForeground(Color.white);
        e2 = new JLabel("Üs Değeri Girin");
        e2.setForeground(Color.white);
        e3 = new JLabel("Sonuç");
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
        timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("");
                t2.setText("");
                e3.setText("Sonuç");
                timer.stop();
            }
        });

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tabanText = t1.getText();
                String usText = t2.getText();
                if (tabanText.isEmpty() || usText.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Lütfen tüm değerleri girin!", "Hata", JOptionPane.ERROR_MESSAGE);
                } else {
                    try {
                        double taban = Double.parseDouble(tabanText);
                        double us = Double.parseDouble(usText);
                        double sonuc = Math.pow(taban, us);
                        e3.setText("<html><div style='text-align: center;'>Sonuç<br><span style='font-size: 15px;'>" +""+ df.format(sonuc) + "</span></div></html>");
                        timer.restart();
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Geçersiz değerler!", "Hata", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        setLayout(null);
        e1.setBounds(225, 90, 150, 30);
    	e2.setBounds(235, 160, 200, 30);
    	e3.setBounds(260, 220, 170, 70);
    	t1.setBounds(230, 120, 100, 30);
    	t2.setBounds(230, 190, 100, 30);
    	b1.setBounds(230, 300, 100, 30);
        add(e1);
        add(e2);
        add(e3);
        add(t1);
        add(t2);
        add(b1);
    }
}