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

import java.text.DecimalFormat;

public class Panel6 extends JPanel{
	JButton b1;
	JTextField t1,t2;
	JLabel e1,e2,e3,e4,e5;
	DecimalFormat df = new DecimalFormat("#.##");
	Timer timer;
	
	public Panel6() {
		Font font = new Font("Arial", Font.PLAIN, 20);
	t1=new JTextField();
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
	e1=new JLabel("Dairenin Yarıçap Değerini Giriniz");
	e1.setForeground(Color.white);
	e2=new JLabel("Daire Diliminin Açı Değerini Giriniz");
	e2.setForeground(Color.white);
	e3=new JLabel("Dairenin Alanı");
	e3.setForeground(Color.white);
	e4=new JLabel("Dairenin Çevresi");
	e4.setForeground(Color.white);
	e5=new JLabel("Daire Diliminin Alanı");
	e5.setForeground(Color.white);
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
	timer = new Timer(5000, new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
        	 t1.setText("");
        	 t2.setText("");
             e3.setText("Dairenin Alanı");
             e4.setText("Dairenin Çevresi");
             e5.setText("Daire Diliminin Alanı");
             timer.stop();
         }
     });
	b1.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			 String radiusText = t1.getText();
			 String angleText = t2.getText();
             if (radiusText.isEmpty() || angleText.isEmpty()) {
                 JOptionPane.showMessageDialog(Panel6.this, "Yarıçap veya merkez açısı değeri girmediniz.", "Hata", JOptionPane.ERROR_MESSAGE);
                 return;
             }
             else {
             try {
                 double r = Double.parseDouble(radiusText);
                 double a = Double.parseDouble(angleText);
                 double alan = Math.PI * r * r;
                 double cevre = 2 * Math.PI * r;
                 double Dilimalan = (Math.PI * r * r * a) / 360;
                 e3.setText("<html><div style='text-align: center;'>Dairenin Alanı<br><span style='font-size: 15px;'>" + "" + df.format(alan) + "</span></div></html>");
                 e4.setText("<html><div style='text-align: center;'>Dairenin Çevresi<br><span style='font-size: 15px;'>" + "" + df.format(cevre) + "</span></div></html>");
                 e5.setText("<html><div style='text-align: center;'>Daire Diliminin Alanı<br><span style='font-size: 15px;'>" + "" + df.format(Dilimalan) + "</span></div></html>");
                 timer.restart();
             } catch (NumberFormatException ex) {
                 JOptionPane.showMessageDialog(Panel6.this, "Geçersiz yarıçap veya merkez açısı değeri.", "Hata", JOptionPane.ERROR_MESSAGE);
             }
             }
		}
	});
	setLayout(null);
	e1.setBounds(190, 60, 250, 30);
	e2.setBounds(190, 130, 250, 30);
	e3.setBounds(238, 190, 150, 70);
	e4.setBounds(230, 250, 150, 70);
	e5.setBounds(223, 310, 150, 70);
	t1.setBounds(230, 90, 100, 30);
	t2.setBounds(230, 160, 100, 30);
	b1.setBounds(230, 410, 100, 30);
	add(e1);
	add(e2);
	add(e3);
	add(e4);
	add(e5);
	add(t1);
	add(t2);
	add(b1);
	}
}
