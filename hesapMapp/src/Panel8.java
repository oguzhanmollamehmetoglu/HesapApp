import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Panel8 extends JPanel {
    private JButton b1, b2, b3, b4, b5, b6;
    private JButton n0, n1, n2, n3, n4, n5, n6, n7, n8, n9;
    private JTextField t1;
    private String operator; // İşlemi takip etmek için operatör değişkeni
    private double operand1; // İşlemdeki ilk sayı
    private double operand2; // İşlemdeki ikinci sayı

    public Panel8() {
    	Font font = new Font("Arial", Font.PLAIN, 35);
        t1 = new JTextField();
        t1.setFont(font);
    	t1.setHorizontalAlignment(SwingConstants.CENTER);
    	t1.setForeground(Color.DARK_GRAY);
    	t1.setBackground(Color.lightGray);
    	// Köşeleri kavisli bir kenarlık oluşturma
        t1.setBorder(BorderFactory.createBevelBorder(10));
        b1 = new JButton("+");
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
        b2 = new JButton("-");
        b2.setBackground(Color.gray);
    	b2.setForeground(Color.white);
    	 b2.setBorder(BorderFactory.createLineBorder(Color.black));
    	 b2.addMouseListener(new MouseAdapter() {
    		    @Override
    		    public void mouseClicked(MouseEvent e) {
    		        // Mouse tıklama olayı gerçekleştiğinde yapılacak işlemler
    		    }

    		    @Override
    		    public void mouseEntered(MouseEvent e) {
    		        // Mouse butonun üzerine gelindiğinde yapılacak işlemler
    		    	b2.setBackground(Color.LIGHT_GRAY);
    		    	b2.setForeground(Color.black);
    		    }

    		    @Override
    		    public void mouseExited(MouseEvent e) {
    		        // Mouse butondan çıkıldığında yapılacak işlemler
    		    	b2.setBackground(Color.gray);
    		    	b2.setForeground(Color.white);
    		    }
    		});
        b3 = new JButton("/");
        b3.setBackground(Color.gray);
    	b3.setForeground(Color.white);
    	 b3.setBorder(BorderFactory.createLineBorder(Color.black));
    	 b3.addMouseListener(new MouseAdapter() {
    		    @Override
    		    public void mouseClicked(MouseEvent e) {
    		        // Mouse tıklama olayı gerçekleştiğinde yapılacak işlemler
    		    }

    		    @Override
    		    public void mouseEntered(MouseEvent e) {
    		        // Mouse butonun üzerine gelindiğinde yapılacak işlemler
    		    	b3.setBackground(Color.LIGHT_GRAY);
    		    	b3.setForeground(Color.black);
    		    }

    		    @Override
    		    public void mouseExited(MouseEvent e) {
    		        // Mouse butondan çıkıldığında yapılacak işlemler
    		    	b3.setBackground(Color.gray);
    		    	b3.setForeground(Color.white);
    		    }
    		});
        b4 = new JButton("x");
        b4.setBackground(Color.gray);
    	b4.setForeground(Color.white);
    	 b4.setBorder(BorderFactory.createLineBorder(Color.black));
    	 b4.addMouseListener(new MouseAdapter() {
    		    @Override
    		    public void mouseClicked(MouseEvent e) {
    		        // Mouse tıklama olayı gerçekleştiğinde yapılacak işlemler
    		    }

    		    @Override
    		    public void mouseEntered(MouseEvent e) {
    		        // Mouse butonun üzerine gelindiğinde yapılacak işlemler
    		    	b4.setBackground(Color.LIGHT_GRAY);
    		    	b4.setForeground(Color.black);
    		    }

    		    @Override
    		    public void mouseExited(MouseEvent e) {
    		        // Mouse butondan çıkıldığında yapılacak işlemler
    		    	b4.setBackground(Color.gray);
    		    	b4.setForeground(Color.white);
    		    }
    		});
        n0 = new JButton("0");
        n0.setBackground(Color.gray);
        n0.setForeground(Color.white);
        n0.setBorder(BorderFactory.createLineBorder(Color.black));
        n0.addMouseListener(new MouseAdapter() {
    		    @Override
    		    public void mouseClicked(MouseEvent e) {
    		        // Mouse tıklama olayı gerçekleştiğinde yapılacak işlemler
    		    }

    		    @Override
    		    public void mouseEntered(MouseEvent e) {
    		        // Mouse butonun üzerine gelindiğinde yapılacak işlemler
    		    	n0.setBackground(Color.LIGHT_GRAY);
    		    	n0.setForeground(Color.black);
    		    }

    		    @Override
    		    public void mouseExited(MouseEvent e) {
    		        // Mouse butondan çıkıldığında yapılacak işlemler
    		    	n0.setBackground(Color.gray);
    		    	n0.setForeground(Color.white);
    		    }
    		});
        n1 = new JButton("1");
        n1.setBackground(Color.gray);
        n1.setForeground(Color.white);
        n1.setBorder(BorderFactory.createLineBorder(Color.black));
        n1.addMouseListener(new MouseAdapter() {
    		    @Override
    		    public void mouseClicked(MouseEvent e) {
    		        // Mouse tıklama olayı gerçekleştiğinde yapılacak işlemler
    		    }

    		    @Override
    		    public void mouseEntered(MouseEvent e) {
    		        // Mouse butonun üzerine gelindiğinde yapılacak işlemler
    		    	n1.setBackground(Color.LIGHT_GRAY);
    		    	n1.setForeground(Color.black);
    		    }

    		    @Override
    		    public void mouseExited(MouseEvent e) {
    		        // Mouse butondan çıkıldığında yapılacak işlemler
    		    	n1.setBackground(Color.gray);
    		    	n1.setForeground(Color.white);
    		    }
    		});
        n2 = new JButton("2");
        n2.setBackground(Color.gray);
        n2.setForeground(Color.white);
        n2.setBorder(BorderFactory.createLineBorder(Color.black));
        n2.addMouseListener(new MouseAdapter() {
    		    @Override
    		    public void mouseClicked(MouseEvent e) {
    		        // Mouse tıklama olayı gerçekleştiğinde yapılacak işlemler
    		    }

    		    @Override
    		    public void mouseEntered(MouseEvent e) {
    		        // Mouse butonun üzerine gelindiğinde yapılacak işlemler
    		    	n2.setBackground(Color.LIGHT_GRAY);
    		    	n2.setForeground(Color.black);
    		    }

    		    @Override
    		    public void mouseExited(MouseEvent e) {
    		        // Mouse butondan çıkıldığında yapılacak işlemler
    		    	n2.setBackground(Color.gray);
    		    	n2.setForeground(Color.white);
    		    }
    		});
        n3 = new JButton("3");
        n3.setBackground(Color.gray);
        n3.setForeground(Color.white);
        n3.setBorder(BorderFactory.createLineBorder(Color.black));
        n3.addMouseListener(new MouseAdapter() {
    		    @Override
    		    public void mouseClicked(MouseEvent e) {
    		        // Mouse tıklama olayı gerçekleştiğinde yapılacak işlemler
    		    }

    		    @Override
    		    public void mouseEntered(MouseEvent e) {
    		        // Mouse butonun üzerine gelindiğinde yapılacak işlemler
    		    	n3.setBackground(Color.LIGHT_GRAY);
    		    	n3.setForeground(Color.black);
    		    }

    		    @Override
    		    public void mouseExited(MouseEvent e) {
    		        // Mouse butondan çıkıldığında yapılacak işlemler
    		    	n3.setBackground(Color.gray);
    		    	n3.setForeground(Color.white);
    		    }
    		});
        n4 = new JButton("4");
        n4.setBackground(Color.gray);
        n4.setForeground(Color.white);
        n4.setBorder(BorderFactory.createLineBorder(Color.black));
        n4.addMouseListener(new MouseAdapter() {
    		    @Override
    		    public void mouseClicked(MouseEvent e) {
    		        // Mouse tıklama olayı gerçekleştiğinde yapılacak işlemler
    		    }

    		    @Override
    		    public void mouseEntered(MouseEvent e) {
    		        // Mouse butonun üzerine gelindiğinde yapılacak işlemler
    		    	n4.setBackground(Color.LIGHT_GRAY);
    		    	n4.setForeground(Color.black);
    		    }

    		    @Override
    		    public void mouseExited(MouseEvent e) {
    		        // Mouse butondan çıkıldığında yapılacak işlemler
    		    	n4.setBackground(Color.gray);
    		    	n4.setForeground(Color.white);
    		    }
    		});
        n5 = new JButton("5");
        n5.setBackground(Color.gray);
        n5.setForeground(Color.white);
        n5.setBorder(BorderFactory.createLineBorder(Color.black));
        n5.addMouseListener(new MouseAdapter() {
    		    @Override
    		    public void mouseClicked(MouseEvent e) {
    		        // Mouse tıklama olayı gerçekleştiğinde yapılacak işlemler
    		    }

    		    @Override
    		    public void mouseEntered(MouseEvent e) {
    		        // Mouse butonun üzerine gelindiğinde yapılacak işlemler
    		    	n5.setBackground(Color.LIGHT_GRAY);
    		    	n5.setForeground(Color.black);
    		    }

    		    @Override
    		    public void mouseExited(MouseEvent e) {
    		        // Mouse butondan çıkıldığında yapılacak işlemler
    		    	n5.setBackground(Color.gray);
    		    	n5.setForeground(Color.white);
    		    }
    		});
        n6 = new JButton("6");
        n6.setBackground(Color.gray);
        n6.setForeground(Color.white);
        n6.setBorder(BorderFactory.createLineBorder(Color.black));
        n6.addMouseListener(new MouseAdapter() {
    		    @Override
    		    public void mouseClicked(MouseEvent e) {
    		        // Mouse tıklama olayı gerçekleştiğinde yapılacak işlemler
    		    }

    		    @Override
    		    public void mouseEntered(MouseEvent e) {
    		        // Mouse butonun üzerine gelindiğinde yapılacak işlemler
    		    	n6.setBackground(Color.LIGHT_GRAY);
    		    	n6.setForeground(Color.black);
    		    }

    		    @Override
    		    public void mouseExited(MouseEvent e) {
    		        // Mouse butondan çıkıldığında yapılacak işlemler
    		    	n6.setBackground(Color.gray);
    		    	n6.setForeground(Color.white);
    		    }
    		});
        n7 = new JButton("7");
        n7.setBackground(Color.gray);
        n7.setForeground(Color.white);
        n7.setBorder(BorderFactory.createLineBorder(Color.black));
        n7.addMouseListener(new MouseAdapter() {
    		    @Override
    		    public void mouseClicked(MouseEvent e) {
    		        // Mouse tıklama olayı gerçekleştiğinde yapılacak işlemler
    		    }

    		    @Override
    		    public void mouseEntered(MouseEvent e) {
    		        // Mouse butonun üzerine gelindiğinde yapılacak işlemler
    		    	n7.setBackground(Color.LIGHT_GRAY);
    		    	n7.setForeground(Color.black);
    		    }

    		    @Override
    		    public void mouseExited(MouseEvent e) {
    		        // Mouse butondan çıkıldığında yapılacak işlemler
    		    	n7.setBackground(Color.gray);
    		    	n7.setForeground(Color.white);
    		    }
    		});
        n8 = new JButton("8");
        n8.setBackground(Color.gray);
        n8.setForeground(Color.white);
        n8.setBorder(BorderFactory.createLineBorder(Color.black));
        n8.addMouseListener(new MouseAdapter() {
    		    @Override
    		    public void mouseClicked(MouseEvent e) {
    		        // Mouse tıklama olayı gerçekleştiğinde yapılacak işlemler
    		    }

    		    @Override
    		    public void mouseEntered(MouseEvent e) {
    		        // Mouse butonun üzerine gelindiğinde yapılacak işlemler
    		    	n8.setBackground(Color.LIGHT_GRAY);
    		    	n8.setForeground(Color.black);
    		    }

    		    @Override
    		    public void mouseExited(MouseEvent e) {
    		        // Mouse butondan çıkıldığında yapılacak işlemler
    		    	n8.setBackground(Color.gray);
    		    	n8.setForeground(Color.white);
    		    }
    		});
        n9 = new JButton("9");
        n9.setBackground(Color.gray);
        n9.setForeground(Color.white);
        n9.setBorder(BorderFactory.createLineBorder(Color.black));
        n9.addMouseListener(new MouseAdapter() {
    		    @Override
    		    public void mouseClicked(MouseEvent e) {
    		        // Mouse tıklama olayı gerçekleştiğinde yapılacak işlemler
    		    }

    		    @Override
    		    public void mouseEntered(MouseEvent e) {
    		        // Mouse butonun üzerine gelindiğinde yapılacak işlemler
    		    	n9.setBackground(Color.LIGHT_GRAY);
    		    	n9.setForeground(Color.black);
    		    }

    		    @Override
    		    public void mouseExited(MouseEvent e) {
    		        // Mouse butondan çıkıldığında yapılacak işlemler
    		    	n9.setBackground(Color.gray);
    		    	n9.setForeground(Color.white);
    		    }
    		});
        b5 = new JButton("=");
        b5.setBackground(Color.gray);
    	b5.setForeground(Color.white);
    	 b5.setBorder(BorderFactory.createLineBorder(Color.black));
    	 b5.addMouseListener(new MouseAdapter() {
    		    @Override
    		    public void mouseClicked(MouseEvent e) {
    		        // Mouse tıklama olayı gerçekleştiğinde yapılacak işlemler
    		    }

    		    @Override
    		    public void mouseEntered(MouseEvent e) {
    		        // Mouse butonun üzerine gelindiğinde yapılacak işlemler
    		    	b5.setBackground(Color.LIGHT_GRAY);
    		    	b5.setForeground(Color.black);
    		    }

    		    @Override
    		    public void mouseExited(MouseEvent e) {
    		        // Mouse butondan çıkıldığında yapılacak işlemler
    		    	b5.setBackground(Color.gray);
    		    	b5.setForeground(Color.white);
    		    }
    		});
        b6 = new JButton("Sil");
        b6.setBackground(Color.gray);
    	b6.setForeground(Color.white);
    	 b6.setBorder(BorderFactory.createLineBorder(Color.black));
    	 b6.addMouseListener(new MouseAdapter() {
    		    @Override
    		    public void mouseClicked(MouseEvent e) {
    		        // Mouse tıklama olayı gerçekleştiğinde yapılacak işlemler
    		    }

    		    @Override
    		    public void mouseEntered(MouseEvent e) {
    		        // Mouse butonun üzerine gelindiğinde yapılacak işlemler
    		    	b6.setBackground(Color.LIGHT_GRAY);
    		    	b6.setForeground(Color.black);
    		    }

    		    @Override
    		    public void mouseExited(MouseEvent e) {
    		        // Mouse butondan çıkıldığında yapılacak işlemler
    		    	b6.setBackground(Color.gray);
    		    	b6.setForeground(Color.white);
    		    }
    		});
        setLayout(null);
        b1.setBounds(340, 160, 70, 50);
        b2.setBounds(340, 220, 70, 50);
        b3.setBounds(340, 280, 70, 50);
        b4.setBounds(340, 340, 70, 50);
        b5.setBounds(280, 340, 50, 50);
        b6.setBounds(160, 340, 50, 50);
        // sayılar
        n0.setBounds(220, 340, 50, 50);
        n1.setBounds(160, 160, 50, 50);
        n2.setBounds(220, 160, 50, 50);
        n3.setBounds(280, 160, 50, 50);
        n4.setBounds(160, 220, 50, 50);
        n5.setBounds(220, 220, 50, 50);
        n6.setBounds(280, 220, 50, 50);
        n7.setBounds(160, 280, 50, 50);
        n8.setBounds(220, 280, 50, 50);
        n9.setBounds(280, 280, 50, 50);
        t1.setBounds(160, 90, 250, 50);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(n0);
        add(n1);
        add(n2);
        add(n3);
        add(n4);
        add(n5);
        add(n6);
        add(n7);
        add(n8);
        add(n9);
        add(t1);

        // Button Listeners
        ActionListener numberListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton) e.getSource();
                String buttonText = button.getText();
                t1.setText(t1.getText() + buttonText);
            }
        };

        ActionListener operatorListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton) e.getSource();
                String buttonText = button.getText();
                if (t1.getText().isEmpty()) {
                    // İlk sayıyı girilmeden operatör seçilemez
                    JOptionPane.showMessageDialog(null, "Önce bir sayı girin.", "Hata", JOptionPane.ERROR_MESSAGE);
                } else {
                    operator = buttonText;
                    operand1 = Double.parseDouble(t1.getText());
                    t1.setText("");
                }
            }
        };

        ActionListener calculateListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (t1.getText().isEmpty() || operator == null) {
                    // İkinci sayı girilmeden veya operatör seçilmeden hesaplama yapılamaz
                    JOptionPane.showMessageDialog(null, "İkinci bir sayı girin ve bir işlem seçin.", "Hata", JOptionPane.ERROR_MESSAGE);
                } else {
                    operand2 = Double.parseDouble(t1.getText());
                    double result = 0.0;
                    switch (operator) {
                        case "+":
                            result = operand1 + operand2;
                            break;
                        case "-":
                            result = operand1 - operand2;
                            break;
                        case "/":
                            if (operand2 == 0) {
                                JOptionPane.showMessageDialog(null, "Sıfıra bölme hatası.", "Hata", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                            result = operand1 / operand2;
                            break;
                        case "x":
                            result = operand1 * operand2;
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Geçersiz bir işlem seçtiniz.", "Hata", JOptionPane.ERROR_MESSAGE);
                            return;
                    }
                    t1.setText(Double.toString(result));
                }
            }
        };

        ActionListener clearListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("");
                operator = null;
                operand1 = 0.0;
                operand2 = 0.0;
            }
        };

        n0.addActionListener(numberListener);
        n1.addActionListener(numberListener);
        n2.addActionListener(numberListener);
        n3.addActionListener(numberListener);
        n4.addActionListener(numberListener);
        n5.addActionListener(numberListener);
        n6.addActionListener(numberListener);
        n7.addActionListener(numberListener);
        n8.addActionListener(numberListener);
        n9.addActionListener(numberListener);
        b1.addActionListener(operatorListener);
        b2.addActionListener(operatorListener);
        b3.addActionListener(operatorListener);
        b4.addActionListener(operatorListener);
        b5.addActionListener(calculateListener);
        b6.addActionListener(clearListener);
    }
}