import javax.swing.*;
import java.awt.*;

public class SistemaEndocrinoMDI extends JFrame {
    private JDesktopPane desktopPane;

    public SistemaEndocrinoMDI() {
        setTitle("Sistema Endocrino - MDI");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        desktopPane = new JDesktopPane();
        add(desktopPane);

        crearMenu();
        abrirDashboard();
    }

    private void crearMenu() {
        JMenuBar menuBar = new JMenuBar();

        JMenu menuSistema = new JMenu("Sistema Endocrino");
        JMenuItem itemDashboard = new JMenuItem("Dashboard");
        JMenuItem itemSalir = new JMenuItem("Salir");

        itemDashboard.addActionListener(e -> abrirDashboard());
        itemSalir.addActionListener(e -> System.exit(0));

        menuSistema.add(itemDashboard);
        menuSistema.addSeparator();
        menuSistema.add(itemSalir);

        menuBar.add(menuSistema);
        setJMenuBar(menuBar);
    }

    private void abrirDashboard() {
        Dashboard dashboard = new Dashboard();
        desktopPane.add(dashboard);
        dashboard.setVisible(true);
    }
}
