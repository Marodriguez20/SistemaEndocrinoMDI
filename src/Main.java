import com.formdev.flatlaf.FlatDarkLaf;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {
            FlatDarkLaf.setup(); // Aplicar tema FlatLaf
        } catch (Exception e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> {
            SistemaEndocrinoMDI mdi = new SistemaEndocrinoMDI();
            mdi.setVisible(true);
        });
    }
}
