import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class QuizGame implements ActionListener {

    private JButton[] buttons;
    private JPanel textPanel;
    private JPanel buttonPanel;
    private JLabel text;
    private JFrame frame;
    private Random random;
    private Questions g;
    private int size;
    private int current;
    private boolean right;
    private int count = 0;


    public QuizGame(){
        buttons = new JButton[4];
        textPanel = new JPanel();
        buttonPanel = new JPanel();
        text = new JLabel();
        frame = new JFrame("Quiz Game by Jan");
        random = new Random();

        // Parameter for the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLayout(new BorderLayout());
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);

        // Parameter for the output text message
        text.setBackground(Color.DARK_GRAY);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Ink Free", Font.BOLD, 75));
        text.setHorizontalAlignment(JLabel.CENTER);
        text.setText("QuizGame");
        text.setOpaque(true);

        // Parameter for the panels
        textPanel.setLayout(new BorderLayout());
        textPanel.setBounds(0, 0, 800, 250);
        text.setFont(textPanel.getFont().deriveFont(40.0f));
        buttonPanel.setLayout(new GridLayout(2, 2));
        buttonPanel.setBackground(new Color(150, 150, 150));

        // Parameter for the buttons
        for(int i = 0; i < buttons.length; i++){
            buttons[i] = new JButton();
            buttons[i].setBackground(Color.BLACK);
            buttonPanel.add(buttons[i]);
            buttons[i].setFont(new Font("Ink Free", Font.BOLD, 75));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }

        textPanel.add(text);
        frame.add(textPanel, BorderLayout.NORTH);
        frame.add(buttonPanel);
        g = new Questions();
        size = g.questions.size();

        start();
    }

    public void start(){
        String s;
        for(int i = 0; i < buttons.length; i++){
            buttons[i].setBackground(Color.BLACK);
        }
        while(true){
            if(Questions.questions.size() == Questions.usedQuestions.size()){
                JOptionPane.showMessageDialog(frame, "There are no more questions.\n " +
                        "Thanks for playing. :)");
                JOptionPane.showMessageDialog(frame, "You had " + count + " out of " +
                        Questions.questions.size() + " right.");
                frame.dispose();
                return;
            }
            current = random.nextInt(size);
            s = Questions.questions.get(current);
            if(Questions.usedQuestions.contains(s))
                current = current == Questions.questions.size() - 1 ? 0 : current + 1;
            else
                break;
        }
        text.setText(s);
        for(int i = 0; i < buttons.length; i++){
            buttons[i].setText(Questions.answers.get(current)[i]);
            buttons[i].setForeground(Color.WHITE);
        }
    }

    private void gameOver(){
        String[] options = {"Next Question", "Exit"};
        String over = right ? "That was right!" : "That was wrong. Correct answer was: " + g.correct.get(current);
        int n = JOptionPane.showOptionDialog(frame, over + "\n",
                null, JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,null, options, options[0]);
        if(n == 0) start();
        else frame.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i = 0; i < buttons.length; i++){
            if(e.getSource() == buttons[i]){
                g.usedQuestions.add(g.questions.get(current));
                if(buttons[i].getText().equals(g.correct.get(current))){
                    // right answer
                    right = true;
                    buttons[i].setBackground(Color.GREEN);
                    count++;
                }else{
                    // wrong answer
                    right = false;
                    buttons[i].setBackground(Color.RED);
                }
                gameOver();
            }
        }
    }
}
