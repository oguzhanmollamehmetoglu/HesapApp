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

import java.text.DecimalFormat;

public class Panel4 extends JPanel{
	JButton b1;
	JTextField t1,t2;
	JLabel e1,e2,e3;
	DecimalFormat df = new DecimalFormat("#.#");
	
	public Panel4() {
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
	e1=new JLabel("Boy (metre cinsinden)");
	e1.setForeground(Color.white);
	e2=new JLabel("Kilo");
	e2.setForeground(Color.white);
	e3=new JLabel("Vücut Kitle İndexsiniz");
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
	b1.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			String boyText = t1.getText();
			String kiloText = t2.getText();
			
			// Boş alan kontrolü
			if (boyText.isEmpty() || kiloText.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Lütfen boş alanları doldurun.", "Uyarı", JOptionPane.WARNING_MESSAGE);
				return;
			}
			else
			{
				try {
			// Boy ve kilo değerlerini al
			double boy = Double.parseDouble(boyText);
			double kilo = Double.parseDouble(kiloText);
			
			// Vücut kitle indeksi hesapla
			double vucutKitleIndeksi = kilo / (boy * boy);
			String biçimlendirilmişDeger = df.format(vucutKitleIndeksi);
			
			// Vücut kitle indeksi sonucunu ekrana yazdır
			e3.setText("<html><div style='text-align: center;'>Vücut Kitle İndexsiniz<br><span style='font-size: 15px;'>" + biçimlendirilmişDeger + "</span></div></html>");
			
			// Değeri belirle ve ekrana yazdır
			String deger;
			if (vucutKitleIndeksi < 18.5) {
				deger = "Zayıf";
			} else if (vucutKitleIndeksi >= 18.5 && vucutKitleIndeksi <= 24.99) {
				deger = "İdeal";
			} else if (vucutKitleIndeksi >= 25 && vucutKitleIndeksi <= 29.99) {
				deger = "Şişman";
			} else if (vucutKitleIndeksi >= 30 && vucutKitleIndeksi <= 34.99) {
				deger = "Obez";
			} else {
				deger = "Aşırı Obez";
			}
			JOptionPane.showMessageDialog(null, "Vücut Kitle İndeksi Değeri: " + deger);
			
			// TextField'ları temizle
	        t1.setText("");
	        t2.setText("");
	        e3.setText("Vücut Kitle İndexsiniz" + "");
			}
	        catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Geçersiz değerler girdiniz.", "Hata", JOptionPane.ERROR_MESSAGE);
            }
			}
		}
	});
	setLayout(null);
	e1.setBounds(218, 70, 150, 30);
	e2.setBounds(265, 140, 130, 30);
	e3.setBounds(217, 200, 170, 70);
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
