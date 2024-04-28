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

public class Panel13 extends JPanel {
    JButton b1;
    JTextField t1;
    JLabel e1, e2, e3, e4, e5;
    Timer timer;

    public Panel13() {
    	Font font = new Font("Arial", Font.PLAIN, 20);
        t1 = new JTextField();
        t1.setFont(font);
    	t1.setHorizontalAlignment(SwingConstants.CENTER);
    	t1.setForeground(Color.DARK_GRAY);
    	t1.setBackground(Color.lightGray);
    	// Köşeleri kavisli bir kenarlık oluşturma
        t1.setBorder(BorderFactory.createBevelBorder(10));
        e1 = new JLabel("Sayı Girin");
        e1.setForeground(Color.white);
        e2 = new JLabel("Tek Sayıların Adedi");
        e2.setForeground(Color.white);
        e3 = new JLabel("Tek Sayıların Toplamı");
        e3.setForeground(Color.white);
        e4 = new JLabel("Çift Sayıların Adedi");
        e4.setForeground(Color.white);
        e5 = new JLabel("Çift Sayıların Toplamı");
        e5.setForeground(Color.white);
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
                e2.setText("Tek Sayıların Adedi");
                e3.setText("Tek Sayıların Toplamı");
                e4.setText("Çift Sayıların Adedi");
                e5.setText("Çift Sayıların Toplamı");
                timer.stop();
            }
        });

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = t1.getText();
                if (input.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Lütfen bir sayı girin", "Hata", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                else {
                	try {
                		 int number = Integer.parseInt(input);
                         int oddCount = 0;
                         int evenCount = 0;
                         int oddSum = 0;
                         int evenSum = 0;

                         for (int i = 1; i <= number; i++) {
                             if (i % 2 == 0) {
                                 evenCount++;
                                 evenSum += i;
                             } else {
                                 oddCount++;
                                 oddSum += i;
                             }
                         }
                         e2.setText("<html><div style='text-align: center;'>Tek Sayıların Adedi<br><span style='font-size: 15px;'>" + "" + oddCount + "</span></div></html>");
                         e3.setText("<html><div style='text-align: center;'>Tek Sayıların Toplamı<br><span style='font-size: 15px;'>" + "" + oddSum + "</span></div></html>");
                         e4.setText("<html><div style='text-align: center;'>Çift Sayıların Adedi<br><span style='font-size: 15px;'>" + "" +  evenCount + "</span></div></html>");
                         e5.setText("<html><div style='text-align: center;'>Çift Sayıların Toplamı<br><span style='font-size: 15px;'>" + "" + evenSum + "</span></div></html>");
                         timer.restart();
                	}
                	catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Geçersiz değer girdiniz!", "Hata", JOptionPane.ERROR_MESSAGE);
                    }
                }              
            }
        });

        setLayout(null);
        e1.setBounds(247, 60, 250, 30);
    	e2.setBounds(220, 130, 150, 70);
    	e3.setBounds(215, 190, 150, 70);
    	e4.setBounds(224, 250, 150, 70);
    	e5.setBounds(218, 310, 150, 70);
    	t1.setBounds(230, 90, 100, 30);
    	b1.setBounds(230, 410, 100, 30);
        add(e1);
        add(e2);
        add(e3);
        add(e4);
        add(e5);
        add(t1);
        add(b1);
    }
}