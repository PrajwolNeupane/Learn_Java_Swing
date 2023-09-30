import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {
	public static void main(String[] args) {

		ImageIcon image = new ImageIcon("image.png");
		ImageIcon bgImage = new ImageIcon("ui_visuals_black.png");
		CustomFonts font = new CustomFonts();
		JLabel label = new JLabel();
		Border border = BorderFactory.createLineBorder(Color.GREEN, 1, false);

		label.setFont(font.regularFont(20));
		label.setText("Your life");
		label.setIcon(bgImage);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.CENTER);
		label.setForeground(new Color(0x46484A));
		label.setBackground(Color.red);
		label.setOpaque(true);
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		// label.setBounds(0, 0, 25, 25);

		CustomFrame frame = new CustomFrame(image);
		frame.add(label);
		frame.pack();
		frame.showFrame();

	}
}
