import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MatchScore extends JFrame {
    private int scoreMilan = 0;
    private int scoreMadrid = 0;

    JButton but1 = new JButton("AC Milan");
    JButton but2 = new JButton("Real Madrid");
    JLabel scorer = new JLabel("Last Scorer: N/A");
    JLabel winner = new JLabel("Winner: DRAW");
    JLabel result = new JLabel("Result: 0 X 0");

    public void createGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,200);
        setLayout(null); //разметка произвольно

        but1.setBounds(15,50,125,20);
        but2.setBounds(140,50,125,20);

        add(but1);
        add(but2);

        but1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                scoreMilan++;
                scorer.setText("Last Scorer: AC Milan");
                winner.setText(whoIsWinner());
                result.setText(String.format("Result: %s X %s", scoreMilan, scoreMadrid));
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
        but2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                scoreMadrid++;
                scorer.setText("Last Scorer: Real Madrid");
                winner.setText(whoIsWinner());
                result.setText(String.format("Result: %s X %s", scoreMilan, scoreMadrid));
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

        scorer.setBounds(0, 110, 300, 20);
        winner.setBounds(150, 110, 300, 20);
        result.setBounds(90, 130, 300, 20);

        add(scorer);
        add(winner);
        add(result);
    }

    public String whoIsWinner() {
        if (scoreMilan > scoreMadrid) {
            return "Winner: AC Milan";
        }
        if (scoreMadrid > scoreMilan) {
            return "Winner: Real Madrid";
        }
        return "Winner: DRAW";
    }

    public static void main(String[] args) {
        MatchScore matchScore = new MatchScore();
        matchScore.createGUI();
        matchScore.setVisible(true);
    }
}
