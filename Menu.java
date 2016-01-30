import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Menu extends JFrame{

    public Menu()
    {
        UI();
    }

    private void UI()
    {

        //------------------
        //      Panels
        //------------------

        //Background
        JPanel backgroundPanel = new JPanel();
        backgroundPanel.setLayout(new BorderLayout());
        backgroundPanel.setBackground(Color.DARK_GRAY);
        add(backgroundPanel);

        //Logo
        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.setBackground(Color.white);
        panel1.setBackground(Color.DARK_GRAY);
        panel1.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.BLACK, Color.GREEN));
        backgroundPanel.add(panel1, BorderLayout. NORTH);

        //Game Button Column
        JPanel panel2 = new JPanel();
        panel2.setLayout(new BorderLayout());
        panel2.setBackground(Color.DARK_GRAY);
        backgroundPanel.add(panel2, BorderLayout.WEST);

        //Game Display
        JPanel panel3 = new JPanel();
        panel3.setLayout(new BorderLayout());
        panel3.setBackground(Color.GRAY);
        panel3.setBorder(new LineBorder(Color.black, 2));
        backgroundPanel.add(panel3);

        //------------------
        //      Buttons
        //------------------

        JButton pongButton = new JButton();
        pongButton.setIcon(new ImageIcon("pong.png"));
        pongButton.setFocusPainted(false);
        pongButton.setMargin(new Insets(0, 0, 0, 0));
        pongButton.setContentAreaFilled(false);
        pongButton.setBorderPainted(false);
        pongButton.setOpaque(false);
        pongButton.setBorder(new LineBorder(Color.DARK_GRAY, 5, true));
        panel2.add(pongButton, BorderLayout.NORTH);

        JButton froggerButton = new JButton();
        froggerButton.setIcon(new ImageIcon("frogger.png"));
        froggerButton.setFocusPainted(false);
        froggerButton.setMargin(new Insets(0, 0, 0, 0));
        froggerButton.setContentAreaFilled(false);
        froggerButton.setBorderPainted(false);
        froggerButton.setOpaque(false);
        panel2.add(froggerButton, BorderLayout.CENTER);

        JButton minesweeperButton = new JButton();
        minesweeperButton.setIcon(new ImageIcon("minesweeper.png"));
        minesweeperButton.setFocusPainted(false);
        minesweeperButton.setMargin(new Insets(0, 0, 0, 0));
        minesweeperButton.setContentAreaFilled(false);
        minesweeperButton.setBorderPainted(false);
        minesweeperButton.setOpaque(false);
        panel2.add(minesweeperButton, BorderLayout.SOUTH);

        //------------------
        //      Labels
        //------------------

        //Create Logo for top portion of UI.
        JLabel taco = new JLabel();
        taco.setText("Taco");
        taco.setForeground(Color.GREEN);
        taco.setFont(new Font("Dialog", Font.PLAIN, 50));
        panel1.add(taco);

        //Taco Text
        JLabel logo = new JLabel();
        logo.setIcon(new ImageIcon("taco.png"));
        logo.setHorizontalAlignment(SwingConstants.CENTER);
        panel1.add(logo);

        //Games Text
        JLabel games = new JLabel();
        games.setText("Games");
        games.setForeground(Color.GREEN);
        games.setFont(new Font("Dialog", Font.PLAIN, 50));
        panel1.add(games);

        setTitle("Team Taco - Java Games");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        //------------------
        //      Listeners
        //------------------

        pongButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                panel3.removeAll();
                panel3.add(new PongComponent());
                pack();
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setVisible(true);
            }
        });

        froggerButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                panel3.removeAll();
                panel3.add(new FroggerComponent());
                pack();
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setVisible(true);
            }
        });

        minesweeperButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                panel3.removeAll();
                DrawingClass drw = new DrawingClass();
                drw.setAll();
                pack();
                setVisible(true);
            }
        });


        //Make it look prettier.
        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }


    }

    public static void main(String[] args)
    {
        Menu menu = new Menu();
        menu.setVisible(true);
    }
}
