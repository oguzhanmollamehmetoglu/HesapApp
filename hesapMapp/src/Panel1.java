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

public class Panel1 extends JPanel {
	JButton b1;
	JTextField t1,t2,t3,t4,t5,t6,t7;
	JLabel e1,e2,e3,e4,e5,e6,e7,e8;
	int matematik,turkce,fizik,kimya,biyoloji,tarih,din,sonuc;
	public Panel1() {
		
		Font font = new Font("Arial", Font.PLAIN, 20);
		
	t1=new JTextField(matematik);
	t1.setFont(font);
	t1.setHorizontalAlignment(SwingConstants.CENTER);
	t1.setForeground(Color.DARK_GRAY);
	t1.setBackground(Color.lightGray);
	// Köşeleri kavisli bir kenarlık oluşturma
    t1.setBorder(BorderFactory.createBevelBorder(10));
	
	t2=new JTextField(turkce);
	t2.setFont(font);
	t2.setHorizontalAlignment(SwingConstants.CENTER);
	t2.setForeground(Color.DARK_GRAY);
	t2.setBackground(Color.lightGray);
	  t2.setBorder(BorderFactory.createBevelBorder(10));
	
	t3=new JTextField(fizik);
	t3.setFont(font);
	t3.setHorizontalAlignment(SwingConstants.CENTER);
	t3.setForeground(Color.DARK_GRAY);
	t3.setBackground(Color.lightGray);
	  t3.setBorder(BorderFactory.createBevelBorder(10));
	
	t4=new JTextField(kimya);
	t4.setFont(font);
	t4.setHorizontalAlignment(SwingConstants.CENTER);
	t4.setForeground(Color.DARK_GRAY);
	t4.setBackground(Color.lightGray);
	  t4.setBorder(BorderFactory.createBevelBorder(10));
	  
	t5=new JTextField(biyoloji);
	t5.setFont(font);
	t5.setHorizontalAlignment(SwingConstants.CENTER);
	t5.setForeground(Color.DARK_GRAY);
	t5.setBackground(Color.lightGray);
	  t5.setBorder(BorderFactory.createBevelBorder(10));
	  
	t6=new JTextField(tarih);
	t6.setFont(font);
	t6.setHorizontalAlignment(SwingConstants.CENTER);
	t6.setForeground(Color.DARK_GRAY);
	t6.setBackground(Color.lightGray);
	  t6.setBorder(BorderFactory.createBevelBorder(10));
	  
	t7=new JTextField(din);
	t7.setFont(font);
	t7.setHorizontalAlignment(SwingConstants.CENTER);
	t7.setForeground(Color.DARK_GRAY);
	t7.setBackground(Color.lightGray);
	  t7.setBorder(BorderFactory.createBevelBorder(10));
	  
	e1=new JLabel("Matematik= ");
	e1.setForeground(Color.white);
	e2=new JLabel("Türkçe= ");
	e2.setForeground(Color.white);
	e3=new JLabel("Fizik= ");
	e3.setForeground(Color.white);
	e4=new JLabel("Kimya= ");
	e4.setForeground(Color.white);
	e5=new JLabel("Biyoloji= ");
	e5.setForeground(Color.white);
	e6=new JLabel("Tarih= ");
	e6.setForeground(Color.white);
	e7=new JLabel("Din= ");
	e7.setForeground(Color.white);
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
	b1.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			 if (t1.getText().isEmpty() || t2.getText().isEmpty() || t3.getText().isEmpty() || t4.getText().isEmpty() ||
		                t5.getText().isEmpty() || t6.getText().isEmpty() || t7.getText().isEmpty()) {
		            // Kullanıcıya hata mesajı gösterilebilir veya başka bir işlem yapılabilir.
		            JOptionPane.showMessageDialog(null, "Tüm alanları doldurun.", "Hata", JOptionPane.ERROR_MESSAGE);
		        } else {
		        	try {
		            // Değerlerin doğru bir şekilde girildiğinden emin olunduğunda hesaplama yapılabilir.
		            matematik = Integer.parseInt(t1.getText());
		            turkce = Integer.parseInt(t2.getText());
		            fizik = Integer.parseInt(t3.getText());
		            kimya = Integer.parseInt(t4.getText());
		            biyoloji = Integer.parseInt(t5.getText());
		            tarih = Integer.parseInt(t6.getText());
		            din = Integer.parseInt(t7.getText());

		            double sonuc = (matematik + turkce + fizik + kimya + biyoloji + tarih + din) / 7.0;
		            
		            if (sonuc > 50) {
		                // Sonuç 50'den büyükse "Sınıfı Geçti" yazısı yazdırılır.
		                JOptionPane.showMessageDialog(null, "Sınıfı Geçti,not ortalaması: "+ sonuc);
		            } else {
		                // Sonuç 50'den küçük veya eşitse "Sınıfta Kaldı" yazısı yazdırılır.
		                JOptionPane.showMessageDialog(null, "Sınıfta Kaldı,not ortalaması: "+ sonuc);
		            }
		            // Dolu alanları temizle
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");
                    t5.setText("");
                    t6.setText("");
                    t7.setText("");
		        	}
                    catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Geçersiz değerler girdiniz.", "Hata", JOptionPane.ERROR_MESSAGE);
                    }
		        }
		}
		
	});
	setLayout(null);
	e1.setBounds(100, 80, 100, 30);
	e2.setBounds(100, 140, 100, 30);
	e3.setBounds(100, 200, 100, 30);
	e4.setBounds(100, 260, 100, 30);
	
	e5.setBounds(320, 110, 100, 30);
	e6.setBounds(320, 170, 100, 30);
	e7.setBounds(320, 230, 100, 30);
	
	t1.setBounds(180, 80, 100, 30);
	t2.setBounds(180, 140, 100, 30);
	t3.setBounds(180, 200, 100, 30);
	t4.setBounds(180, 260,100,30);
	
	t5.setBounds(380, 110,100,30);
	t6.setBounds(380, 170,100,30);
	t7.setBounds(380, 230,100,30);
	
	b1.setBounds(230, 350, 100, 30);
	add(e1);
	add(e2);
	add(e3);
	add(e4);
	add(e5);
	add(e6);
	add(e7);
	add(t1);
	add(t2);
	add(t3);
	add(t4);
	add(t5);
	add(t6);
	add(t7);
	add(b1);
  }
}
