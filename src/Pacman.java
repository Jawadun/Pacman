import javax.swing.JFrame;

public class Pacman extends JFrame{

    public Pacman() {
        add(new Model());
    }


    public static void main(String[] args) {
        Pacman pac = new Pacman();
        pac.setTitle("Pacman");
        pac.setDefaultCloseOperation(EXIT_ON_CLOSE);
        pac.pack();
        pac.setLocationRelativeTo(null);
        pac.setVisible(true);
    }

}