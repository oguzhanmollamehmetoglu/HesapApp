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

public class Panel11 extends JPanel {
    JButton b1;
    JTextField t1;
    JLabel e1,e2;
    Timer timer;
    
    public Panel11() {
    	Font font = new Font("Arial", Font.PLAIN, 20);
        t1=new JTextField();
        t1.setFont(font);
    	t1.setHorizontalAlignment(SwingConstants.CENTER);
    	t1.setForeground(Color.DARK_GRAY);
    	t1.setBackground(Color.lightGray);
    	// Köşeleri kavisli bir kenarlık oluşturma
        t1.setBorder(BorderFactory.createBevelBorder(10));
        e1=new JLabel("Doğum Yılınızı Girin");
        e1.setForeground(Color.white);
        e2=new JLabel("Çin Zodyağı Burcunuz");
        e2.setForeground(Color.white);
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
                e2.setText("Çin Zodyağı Burcunuz"+"");
                timer.stop();
            }
        });
        
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           	       String input = t1.getText();
            	if (input.isEmpty()) {
    	            JOptionPane.showMessageDialog(null, "Lütfen yıl değeri girin.");
    	            return;
    	        }
            	else {
                try {
                    int birthYear = Integer.parseInt(input);
                    String zodiacSign = calculateZodiacSign(birthYear);
                    e2.setText("<html><div style='text-align: center;'>Çin Zodyağı Burcunuz<br><span style='font-size: 10px;'>" + zodiacSign + "</span></div></html>");
                    timer.restart();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Lütfen doğru bir yıl girin.", "Hata", JOptionPane.ERROR_MESSAGE);
                }
              }
            }
        });
        
        setLayout(null);
        e1.setBounds(220, 120, 150, 30);
    	e2.setBounds(218, 180, 300, 100);
    	t1.setBounds(230, 150, 100, 30);
    	b1.setBounds(230, 290, 100, 30);
        add(e1);
        add(e2);
        add(t1);
        add(b1);
    }
    
    private String calculateZodiacSign(int birthYear) {
        String[] zodiacSigns = {
            "Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz",
            "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"
        };
        
        int startYear = 1924; // Çin Zodyağı döngüsü 1924 yılında başlar (Maymun burcu)
        int index = (birthYear - startYear) % 12;
        if (index < 0) {
            index += 12;
        }
        
        return zodiacSigns[index];
    }
}