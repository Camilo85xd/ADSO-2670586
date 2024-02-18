
import javax.swing.*;
import java.awt.*;

public class Renderizador_lineas implements ListCellRenderer<String> {
    public final DefaultListCellRenderer defaultRenderer = new DefaultListCellRenderer();

    @Override
    public Component getListCellRendererComponent(JList<? extends String> list, String value, int index,
                                                  boolean isSelected, boolean cellHasFocus) {
        JLabel renderer = (JLabel) defaultRenderer.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

        // Configurar la apariencia del JLabel
        renderer.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK)); // Línea inferior
        renderer.setBackground(Color.WHITE);
        renderer.setFont(new Font("Monospaced", Font.PLAIN, 14)); // Puedes ajustar el tamaño de la fuente

        return renderer;
    }
}

