import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class SOS extends JFrame{
    public SOS(String title){
       setTitle(title);
       setSize(600, 600);
       JMenuBar menuBar=new JMenuBar();
       JMenu filMenu=new JMenu("File");
       menuBar.add(filMenu);
       setJMenuBar(menuBar);
       
       
    }
    public static void main(String[] args) {
        //create an instance of SOS
        SOS myWing=new SOS("University Management System");
        myWing.setVisible(true);
       
    }

}