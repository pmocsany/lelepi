import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MainFrame extends JFrame{
    InputPanel aHosszPanel;
    InputPanel bHosszPanel;
    InputPanel cHosszPanel;
    JPanel buttonPanel;
    InputPanel paralelepipedonterfogataPanel;
    
    public MainFrame() {
        this.initComponent();
        this.addComponent();
        this.setFrame();
    }
    private void initComponent(){
        this.aHosszPanel = new InputPanel("A oldal hossza");
        this.bHosszPanel = new InputPanel("B oldal hossza");
        this.cHosszPanel = new InputPanel("C oldal hossza");
        this.buttonPanel = new JPanel();
        this.paralelepipedonterfogataPanel = new InputPanel("paralelepipedon térfogata ");
    }
    private void addComponent(){
        this.add(this.aHosszPanel);
        this.add(this.bHosszPanel);
        this.add(this.cHosszPanel);
        this.add(this.buttonPanel);
        this.add(this.paralelepipedonterfogataPanel);
    }
    private void setFrame(){
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
}
