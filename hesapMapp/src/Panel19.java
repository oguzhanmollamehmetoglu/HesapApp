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

public class Panel19 extends JPanel {
    JButton b1;
    JTextField t1, t2;
    JLabel e1, e2, e3, e4;
    Timer timer;

    public Panel19() {
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
        e1 = new JLabel("1. Sayıyı Girin");
        e1.setForeground(Color.white);
        e2 = new JLabel("2. Sayıyı Girin");
        e2.setForeground(Color.white);
        e3 = new JLabel("Ebobu");
        e3.setForeground(Color.white);
        e4 = new JLabel("Ekoku");
        e4.setForeground(Color.white);
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
                e3.setText("Ebobu");
                e4.setText("Ekoku");
                timer.stop();
            }
        });

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number1Str = t1.getText().trim();
                String number2Str = t2.getText().trim();

                if (number1Str.isEmpty() || number2Str.isEmpty()) {
                    JOptionPane.showMessageDialog(Panel19.this, "Lütfen boş değerleri doldurun.", "Uyarı", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                else {
                	try {
                		int number1 = Integer.parseInt(number1Str);
                        int number2 = Integer.parseInt(number2Str);

                        int gcd = calculateGCD(number1, number2);
                        int lcm = calculateLCM(number1, number2);
                        
                        e3.setText("<html><div style='text-align: center;'>Ebobu<br><span style='font-size: 15px;'>" + "" + gcd + "</span></div></html>");
                        e4.setText("<html><div style='text-align: center;'>Ekoku<br><span style='font-size: 15px;'>" + "" + lcm + "</span></div></html>");
                	}catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Geçersiz değer girdiniz.", "Hata", JOptionPane.ERROR_MESSAGE);
                    }
                }
                timer.restart();
            }
        });

        setLayout(null);
        e1.setBounds(235, 60, 250, 30);
    	e2.setBounds(235, 130, 250, 30);
    	e3.setBounds(260, 190, 150, 70);
    	e4.setBounds(260, 250, 150, 70);
    	t1.setBounds(230, 90, 100, 30);
    	t2.setBounds(230, 160, 100, 30);
    	b1.setBounds(230, 350, 100, 30);
        add(e1);
        add(e2);
        add(e3);
        add(e4);
        add(t1);
        add(t2);
        add(b1);
    }

    private int calculateGCD(int number1, int number2) {
        while (number2 != 0) {
            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }
        return number1;
    }

    private int calculateLCM(int number1, int number2) {
        return number1 * (number2 / calculateGCD(number1, number2));
    }
}