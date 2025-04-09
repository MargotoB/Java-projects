import javax.swing.JOptionPane;

public class Video_zad1 {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("What is your name: ");
        JOptionPane.showMessageDialog(null, "Your name is " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height: "));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");
    }
}
