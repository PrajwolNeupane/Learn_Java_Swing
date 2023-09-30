import java.awt.Font;

public class CustomFonts {

    public Font lightFont(int size) {
        try {
            Font poppinsFont = Font.createFont(Font.TRUETYPE_FONT, new java.io.File("Poppins-Light.ttf"));
            poppinsFont = poppinsFont.deriveFont(Font.PLAIN, size);
            return poppinsFont;

        } catch (java.awt.FontFormatException | java.io.IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Font regularFont(int size) {
        try {
            Font poppinsFont = Font.createFont(Font.TRUETYPE_FONT, new java.io.File("Poppins-Regular.ttf"));
            poppinsFont = poppinsFont.deriveFont(Font.PLAIN, size);
            return poppinsFont;

        } catch (java.awt.FontFormatException | java.io.IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Font mediumFont(int size) {
        try {
            Font poppinsFont = Font.createFont(Font.TRUETYPE_FONT, new java.io.File("Poppins-Medium.ttf"));
            poppinsFont = poppinsFont.deriveFont(Font.PLAIN, size);
            return poppinsFont;

        } catch (java.awt.FontFormatException | java.io.IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Font semiBoldFont(int size) {
        try {
            Font poppinsFont = Font.createFont(Font.TRUETYPE_FONT, new java.io.File("Poppins-Semibold.ttf"));
            poppinsFont = poppinsFont.deriveFont(Font.PLAIN, size);
            return poppinsFont;

        } catch (java.awt.FontFormatException | java.io.IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Font boldFont(int size) {
        try {
            Font poppinsFont = Font.createFont(Font.TRUETYPE_FONT, new java.io.File("Poppins-Bold.ttf"));
            poppinsFont = poppinsFont.deriveFont(Font.PLAIN, size);
            return poppinsFont;

        } catch (java.awt.FontFormatException | java.io.IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
