import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class PanelA1 extends JPanel {

    public PanelA1() {
        setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
        setBackground(Color.WHITE);
        
        // E-posta etiketi oluştur ve panelde yerleştir
        JLabel emailLabel = createLabel("<html><b>E-posta:</b><br>oguzhanmollamehmetogulu@gmail.com</html>");
        add(emailLabel);
        
        // Telefon etiketi oluştur ve panelde yerleştir
        JLabel phoneLabel = createLabel("<html><b>Telefon:</b><br>+90 0539 859 18 61</html>");
        add(phoneLabel);
        
        // Instagram etiketi oluştur ve panelde yerleştir
        JLabel instagramLabel = createLabel("<html><b>Instagram:</b><br>@oguzhanmollamehmetoglu</html>");
        add(instagramLabel);
        
        // YouTube etiketi oluştur ve panelde yerleştir
        JLabel youtubeLabel = createLabel("<html><b>YouTube:</b><br>https://www.youtube.com/@oguzhanmollamehmetoglu7994/channels</html>");
        add(youtubeLabel);
        
        // GitHub etiketi oluştur ve panelde yerleştir
        JLabel githubLabel = createLabel("<html><b>GitHub:</b><br>https://github.com/oguzhanmollamehmetoglu</html>");
        add(githubLabel);
        
        // LinkedIn etiketi oluştur ve panelde yerleştir
        JLabel linkedinLabel = createLabel("<html><b>LinkedIn:</b><br>https://www.linkedin.com/in/o%C4%9Fuzhan-mollamehmeto%C4%9Flu-ab413823b</html>");
        add(linkedinLabel);
    }
    
    // Etiket oluşturmak için yardımcı metod
    private JLabel createLabel(String text) {
        JLabel label = new JLabel(text);
        label.setFont(new Font("Arial", Font.PLAIN, 14));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setForeground(Color.WHITE); // Yazı rengini beyaz olarak ayarla
        return label;
    }
    
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(600, 600);
    }
}