import javax.swing.JFrame;

public class SOS extends JFrame {
    public SOS(String title){
        int width;
        int height;
        setSize(width:200,height:600);
        setTitle(title);
        JMenuBar mymenuBar=new JMenuBar();
        JMenu filemenu= new JMenu(s:"File");
        mymenuBar.addd(filemenu)


    }
    public static void main(String[] args) {
        SOS myWindow= new SOS();

        myWindow.setVisible(b:true);

    }

}