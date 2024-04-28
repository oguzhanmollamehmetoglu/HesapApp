import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;

public class Panel0 extends JPanel {

    public Panel0() {
        setBackground(Color.WHITE); // Panel arkaplan rengini beyaz olarak ayarlar
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image pf = Toolkit.getDefaultToolkit().getImage("./img/profil.jpg");
        // Yuvarlak bir şekil oluşturmak için clip'i ayarla
        g.setClip(new Ellipse2D.Float(200, 50, 200, 200));
        // Profil resmini çizer
        g.drawImage(pf, 200, 20, 200, 250, getFocusCycleRootAncestor());
        // Clip ayarını sıfırla
        g.setClip(null);
        // Metin açıklamasını çizer
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.PLAIN, 14));
        String metin = "Hoş geldiniz!\nBenim adım Oğuzhan Mollamehmetoğlu. "
        		+ "Bu benim Java dili ile yazdığım ilk projem.\n"
        		+ "Nesne tabanlı programlama eğitiminden sonra hesaplamlarla alaklı bir çok\n"
        		+ "uygulama yapmış olup bu projede deneyimlemeye olanak sağladı.";
        String[] satirlar = metin.split("\n");
        int x = 40;
        int y = 300;
        for (String satir : satirlar) {
            g.drawString(satir, x, y);
            y += g.getFontMetrics().getHeight(); // Bir sonraki satırın yüksekliği kadar artır
        }
    }
}