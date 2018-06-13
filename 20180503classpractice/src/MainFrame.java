import javax.swing.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {
    private JButton jbut = new JButton("Add");
    private JButton jbut1 = new JButton("Less");
    private int count = 0;
    public MainFrame(){
        init();
    }

    private void init(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jbut.setBounds(100,100,100,100);
        jbut1.setBounds(300,100,100,100);

        this.add(jbut);
        this.add(jbut1);
        this.setLayout(null);
        this.setLocation(300,300);
        this.setSize(1280,720);

        jbut.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                setTitle(Integer.toString(count));
            }
        });
        jbut1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count--;
                setTitle(Integer.toString(count));
            }
        });
    }
}
