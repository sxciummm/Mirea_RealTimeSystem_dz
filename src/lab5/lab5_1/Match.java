package lab5.lab5_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Match extends JFrame{
    private int milanScore = 0;
    private int madridScore = 0;

    private JButton milanButton;
    private JButton madridButton;
    private JLabel resultLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel;

    public Match() {
        setTitle("Football Match: AC Milan vs Real Madrid");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 1, 10, 10));

        milanButton = new JButton("AC Milan");
        madridButton = new JButton("Real Madrid");
        resultLabel = new JLabel("Result: 0 X 0", SwingConstants.CENTER);
        lastScorerLabel = new JLabel("Last Scorer: N/A", SwingConstants.CENTER);
        winnerLabel = new JLabel("Winner: DRAW", SwingConstants.CENTER);



        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                updateScore("AC Milan");
            }
        });

        madridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                updateScore("Real Madrid");
            }
        });

        add(milanButton);
        add(madridButton);
        add(resultLabel);
        add(lastScorerLabel);
        add(winnerLabel);

    }

    private void updateScore(String lastScorer) {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);
        lastScorerLabel.setText("Last Scorer: " + lastScorer);

        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (madridScore > milanScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Match app = new Match();
                app.setVisible(true);
            }
        });
    }
}


