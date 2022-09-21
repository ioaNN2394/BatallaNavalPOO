import javax.swing.JOptionPane;

public class IO {
    public static void show(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
    public static int readInt(String msg) {
        return Integer.parseInt(JOptionPane.showInputDialog(null, msg));
    }
    public static double readDouble(String msg) {
        return Double.parseDouble(JOptionPane.showInputDialog(null, msg));
    }
    public static String readString(String msg) {
        return String.valueOf(JOptionPane.showInputDialog(null, msg));
    }
    public static char readChar(String msg) {
        return JOptionPane.showInputDialog(null, msg).charAt(0);
    }
}