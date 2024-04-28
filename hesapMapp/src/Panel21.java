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

public class Panel21 extends JPanel {
    JButton b1;
    JTextField t1;
    JLabel e1, e2;
    Timer timer;

    public Panel21() {
    	Font font = new Font("Arial", Font.PLAIN, 20);
        t1 = new JTextField();
        t1.setFont(font);
    	t1.setHorizontalAlignment(SwingConstants.CENTER);
    	t1.setForeground(Color.DARK_GRAY);
    	t1.setBackground(Color.lightGray);
    	// Köşeleri kavisli bir kenarlık oluşturma
        t1.setBorder(BorderFactory.createBevelBorder(10));
        e1 = new JLabel("Bir Sayı Girin");
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
                e2.setText("Sonuç" + "");
                timer.stop();
            }
        });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = t1.getText();
                if (input.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Lütfen bir sayı girin!", "Hata", JOptionPane.ERROR_MESSAGE);
                } else {
                    try {
                        int number = Integer.parseInt(input);
                        boolean isPrime = checkPrime(number);
                        if(isPrime) {
                        	 e2.setText("<html><div style='text-align: center;'>Sonuç<br><span style='font-size: 9px;'>" +"Asal<br>sayıdır."+ "</span></div></html>");
                        }else {
                        	e2.setText("<html><div style='text-align: center;'>Sonuç<br><span style='font-size: 9px;'>" +"Asal<br>sayı<br>değildir."+ "</span></div></html>");
                        }                        
                        timer.restart();
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Geçersiz sayı formatı!", "Hata", JOptionPane.ERROR_MESSAGE);
                    }
                }
                timer.restart();
            }
        });
        setLayout(null);
        e1.setBounds(240, 110, 150, 30);
    	e2.setBounds(255, 180, 300, 100);
    	t1.setBounds(230, 140, 100, 30);
    	b1.setBounds(230, 300, 100, 30);
        add(e1);
        add(e2);
        add(t1);
        add(b1);
    }

    private boolean checkPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}