import javax.swing.*;
import javax.swing.plaf.BorderUIResource;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GuessGame extends JFrame {

    final short number;
    short tries = 0;

    public GuessGame() {
        super("Угадайка");
        setSize(700, 600);
        number = (short) (0 + (Math.random() * 21));

        setLayout(null);
        JButton guessButton = new JButton("Угадать");
        guessButton.setBounds(300, 300, 100, 50);

        JLabel jLabel = new JLabel("Введите число от 0 до 20");
        jLabel.setBounds(150, 260, 400, 20);

        JTextField guessField = new JTextField();
        guessField.setBounds(150, 280, 400, 20);
        guessField.setToolTipText("Введите число от 0 до 20");

        guessButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    short userNumber = Short.parseShort(guessField.getText());
                    if (userNumber > 20 || userNumber < 0) {
                        jLabel.setText("Вы ввели число меньше чем 0 или больше чем 20");
                        return;
                    }

                    tries++;
                    if (userNumber != number && tries >= 3) {
                        jLabel.setText("К сожалению вы проиграли");
                        guessButton.setEnabled(false);
                        guessField.setEnabled(false);
                        return;
                    }
                    if (userNumber == number) {
                        jLabel.setText("Поздравляем, вы угадали!");
                        guessButton.setEnabled(false);
                        guessField.setEnabled(false);
                        return;
                    }
                    if (userNumber < number) {
                        jLabel.setText("Загаданное число больше");
                        return;
                    }
                    jLabel.setText("Загаданное число меньше");

                } catch (Exception ex) {
                    jLabel.setText("Некорректный ввод");
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        add(guessButton);
        add(guessField);
        add(jLabel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new GuessGame().setVisible(true);
    }
}
