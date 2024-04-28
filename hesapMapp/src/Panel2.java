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

public class Panel2 extends JPanel {
	JButton b1;
	JTextField t1,t2;
	JLabel e1,e2,e3,e4,e5;
	double fiyat,toplam,kdvfiyat,kdvoran;
	Timer timer;
	
	public Panel2() {
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
	e1=new JLabel("Fiyat giriniz ");
	e1.setForeground(Color.white);
	e2=new JLabel("KDV Oranını giriniz ");
	e2.setForeground(Color.white);
	e3=new JLabel("KDV Oranı ");
	e3.setForeground(Color.white);
	e4=new JLabel("KDV Tutarı ");
	e4.setForeground(Color.white);
	e5=new JLabel("KDV'li Tutar ");
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
	timer = new Timer(3000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
         	//alanları boşalt
            t1.setText("");
            t2.setText("");
            e3.setText("KDV Oranı ");
            e4.setText("KDV Tutarı ");
            e5.setText("KDV'li Tutar ");
            timer.stop();
        }
    });
	b1.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			String fiyatStr = t1.getText();
			String kdvoranStr = t2.getText();

			if (fiyatStr.isEmpty() || kdvoranStr.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Lütfen tüm alanları doldurun.", "Hata", JOptionPane.ERROR_MESSAGE);
				return;
			}
			else {
				try {
				double fiyat = Double.parseDouble(fiyatStr);
				double kdvoran = Double.parseDouble(kdvoranStr);

				double kdvTutari = fiyat * (kdvoran / 100);
				double kdvliTutar = fiyat + kdvTutari;

				e3.setText("<html><div style='text-align: center;'>KDV Oranı<br><span style='font-size: 15px;'>" + "%" + (int)kdvoran + "</span></div></html>");
				e4.setText("<html><div style='text-align: center;'>KDV Tutarı<br><span style='font-size: 15px;'>" + kdvTutari + "</span></div></html>");
				e5.setText("<html><div style='text-align: center;'>KDV'li Tutar<br><span style='font-size: 15px;'>" + kdvliTutar + "</span></div></html>");
				
				timer.restart();
				}
				catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Geçersiz değerler girdiniz.", "Hata", JOptionPane.ERROR_MESSAGE);
                }
			}
			
		}
		
	});
	setLayout(null);
	e1.setBounds(245, 70, 100, 30);
	e2.setBounds(225, 140, 130, 30);
	e3.setBounds(245, 200, 150, 70);
	e4.setBounds(245, 260, 150, 70);
	e5.setBounds(245, 320, 150, 70);
	t1.setBounds(230, 100, 100, 30);
	t2.setBounds(230, 170, 100, 30);
	b1.setBounds(230, 400, 100, 30);
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
