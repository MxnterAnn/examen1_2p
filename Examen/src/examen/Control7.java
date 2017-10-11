
package examen;

import java.awt.Color;
import java.awt.event.*;

public class Control7 implements ActionListener {

    Vista7 g;

    public Control7() {
        g = new Vista7();
        g.setVisible(true);
        g.btnAzul.addActionListener(this);
        g.btnRojo.addActionListener(this);
        g.btnVerde.addActionListener(this);
        g.btnFondoAzul.addActionListener(this);
        g.btnFondoRojo.addActionListener(this);
        g.btnFondoVerde.addActionListener(this);
        g.btnTransparente.addActionListener(this);
        g.btnOpaca.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (g.btnAzul == ae.getSource()) {
            g.etiTexto.setForeground(Color.BLUE);
        }
        if (g.btnRojo == ae.getSource()) {
            g.etiTexto.setForeground(Color.RED);
        }
        if (g.btnVerde == ae.getSource()) {
            g.etiTexto.setForeground(Color.GREEN);
        }
        if (g.btnFondoAzul == ae.getSource()) {
            g.etiTexto.setBackground(Color.BLUE);

        }
        if (g.btnFondoRojo == ae.getSource()) {
            g.etiTexto.setBackground(Color.RED);

        }
        if (g.btnFondoVerde == ae.getSource()) {
            g.etiTexto.setBackground(Color.GREEN);
        }
        if (g.btnTransparente == ae.getSource()) {
            g.etiTexto.setOpaque(false);
        }
        if (g.btnOpaca == ae.getSource()) {
            g.etiTexto.setOpaque(true);
        }

    }

    public static void main(String[] args) {
        Control7 c = new Control7();
    }
}
