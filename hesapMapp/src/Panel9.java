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

public class Panel9 extends JPanel {
	JButton b1;
	JTextField t1;
	JLabel e1,e2;
	Timer timer;
	
	public Panel9() {
		Font font = new Font("Arial", Font.PLAIN, 20);
	t1=new JTextField();
	t1.setFont(font);
	t1.setHorizontalAlignment(SwingConstants.CENTER);
	t1.setForeground(Color.DARK_GRAY);
	t1.setBackground(Color.lightGray);
	// Köşeleri kavisli bir kenarlık oluşturma
    t1.setBorder(BorderFactory.createBevelBorder(10));
	e1=new JLabel("Sıcaklık Girin");
	e1.setForeground(Color.white);
	e2=new JLabel("Etkinlik");
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
            e2.setText("Etkinlik"+"");
            timer.stop();
        }
    });
	b1.addActionListener(new ActionListener() {
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        String input = t1.getText();
	        if (input.isEmpty()) {
	            JOptionPane.showMessageDialog(null, "Lütfen sıcaklık değeri girin.");
	            return;
	        }

	        try {
	            double temperature = Double.parseDouble(input);
	            String recommendation = calculateRecommendation(temperature);
	            e2.setText("<html><div style='text-align: center;'>Etkinlik<br><span style='font-size: 10px;'>" + recommendation + "</span></div></html>");

	            // Start the timer to clear the fields after 3 seconds
	            timer.restart();
	        } catch (NumberFormatException ex) {
	            JOptionPane.showMessageDialog(null, "Geçersiz sıcaklık değeri.");
	        }
	    }
	});
	setLayout(null);
	e1.setBounds(240, 120, 150, 30);
	e2.setBounds(255, 180, 300, 100);
	t1.setBounds(230, 150, 100, 30);
	b1.setBounds(230, 290, 100, 30);
	add(e1);
	add(e2);
	add(t1);
	add(b1);
	}
	// Helper method to calculate the recommendation based on the temperature
		private String calculateRecommendation(double temperature) {
		    if (temperature >= 56.7) {
		        return "<html><div style='font-size: 8px;'>Dışarısı<br> Çok<br> Sıcak<br> Tehlikeli</div></html>";
		    } else if (temperature >= 30) {
		        return "Yüzme";
		    }else if (temperature >= 20) {
		        return "Piknik";
		    } else if (temperature >= 10) {
		        return "Yürüyüş";
		    } else if (temperature >= -20) {
		        return "Sinema";
		    } else {
		        return "<html><div style='font-size: 8px;'>Dışarısı<br> Çok<br> Soğuk<br> Tehlikeli</div></html>";
		    }
		}
}

