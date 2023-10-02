import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class CustomFrame extends JFrame {

    CustomFrame(ImageIcon image) {
        initializeFrame(image);

    }

    CustomFrame() {
        initializeFrame(null);
    }

    public void initializeFrame(ImageIcon image) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JFrame goes brrrrrrrr");
        this.setSize(500, 535);

        if (image != null) {
            this.setIconImage(image.getImage());
        }
    }

    public void showFrame() {
        this.setVisible(true);
    }
}
