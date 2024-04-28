
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

public class Panel7 extends JPanel {
	JButton b1;
	JTextField t1,t2;
	JLabel e1,e2,e3;
	Timer timer;
	DecimalFormat df = new DecimalFormat("#.##");
	
	public Panel7() {
		Font font = new Font("Arial", Font.PLAIN, 20);
	t1=new JTextField();
	t1.setFont(font);
	t1.setHorizontalAlignment(SwingConstants.CENTER);
	t1.setForeground(Color.DARK_GRAY);
	t1.setBackground(Color.lightGray);
	// Köşeleri kavisli bir kenarlık oluşturma
    t1.setBorder(BorderFactory.createBevelBorder(10));
	t2=new JTextField();
	t2.setFont(font);
	t2.setHorizontalAlignment(SwingConstants.CENTER);
	t2.setForeground(Color.DARK_GRAY);
	t2.setBackground(Color.lightGray);
	  t2.setBorder(BorderFactory.createBevelBorder(10));
	e1=new JLabel("Km Verisini Girin");
	e1.setForeground(Color.white);
	e2=new JLabel("Taksimetre Açılış Ücretini Girin");
	e2.setForeground(Color.white);
	e3=new JLabel("Taksimetre");
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
            e3.setText("Taksimetre");
            timer.stop();
        }
    });
	b1.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			 String km = t1.getText();
             String açılışücreti = t2.getText();

             // Boş değer denetimi
             if (km.isEmpty() || açılışücreti.isEmpty()) {
                 JOptionPane.showMessageDialog(null, "Değerler boş olamaz!");
                 return;
             }
             else {
            	 try {
            	 double KM = Double.parseDouble(km);
                 double ac = Double.parseDouble(açılışücreti);
                 double price = ac + (KM * 2.20);
                 if(price <20)
                 {
                	 price = 20;
                 }
                 e3.setText("<html><div style='text-align: center;'>Taksimetre<br><span style='font-size: 15px;'>" +""+ df.format(price) +"TL"+ "</span></div></html>");
                 timer.restart();
                 }
                 catch (NumberFormatException ex) {
                     JOptionPane.showMessageDialog(null, "Geçersiz değerler girdiniz.", "Hata", JOptionPane.ERROR_MESSAGE);
                 }
             }
		}
	});
	setLayout(null);
	e1.setBounds(230, 70, 150, 30);
	e2.setBounds(189, 140, 200, 30);
	e3.setBounds(245, 200, 170, 70);
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
}
