import javax.swing.*;
import java.awt.*;

public class Dashboard extends JInternalFrame {

    public Dashboard() {
        super("Dashboard", true, true, true, true);
        setSize(800, 600);
        setLocation(50, 50);

        JPanel panel = new JPanel(new BorderLayout());
        JLabel titulo = new JLabel("Bienvenido al Sistema Endocrino", JLabel.CENTER);
        titulo.setFont(new Font("Segoe UI", Font.BOLD, 22));
        panel.add(titulo, BorderLayout.NORTH);

        JPanel botonesPanel = new JPanel(new GridLayout(1, 3, 20, 20));
        botonesPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JButton btnGlandulas = crearBoton("Glándulas", "icons/add.png");
        JButton btnHormonas = crearBoton("Hormonas", "icons/edit.png");
        JButton btnInfo = crearBoton("Información", "icons/open.png");

        botonesPanel.add(btnGlandulas);
        botonesPanel.add(btnHormonas);
        botonesPanel.add(btnInfo);

        panel.add(botonesPanel, BorderLayout.CENTER);
        add(panel);
    }

    private JButton crearBoton(String texto, String iconPath) {
        JButton button = new JButton(texto);
        button.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        button.setIcon(new ImageIcon("resources/" + iconPath));
        button.setFocusPainted(false);
        button.setBackground(new Color(45, 45, 45));
        button.setForeground(Color.WHITE);
        return button;
    }
}
