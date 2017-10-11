
package examen;

import java.awt.event.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.DefaultListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Control6 implements ActionListener, MouseListener {

    Vista6 g;

    public Control6() {
        g = new Vista6();
        g.setVisible(true);
        g.btnEsquina.addActionListener(this);
        g.btnAgrandar.addActionListener(this);
        g.btnCentro.addActionListener(this);
        g.btnAchicar.addActionListener(this);
        g.btnEsquina.addMouseListener(this);
        g.btnAgrandar.addMouseListener(this);
        g.btnCentro.addMouseListener(this);
        g.btnAchicar.addMouseListener(this);
    }

    public static void main(String[] args) {
        Control6 c = new Control6();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == g.btnEsquina) {

            g.etiNombre.setLocation(400, 40);
        }
        if (ae.getSource() == g.btnAgrandar) {

            g.etiNombre.setSize(200, 200);

        }
        if (ae.getSource() == g.btnCentro) {

            g.etiNombre.setLocation(220, 250);

        }
        if (ae.getSource() == g.btnAchicar) {

            g.etiNombre.setSize(40, 40);

        }

    }

    @Override
    public void mouseClicked(MouseEvent me) {

    }

    @Override
    public void mousePressed(MouseEvent me) {

    }

    @Override
    public void mouseReleased(MouseEvent me) {

    }

    @Override
    public void mouseEntered(MouseEvent me) {
        if (me.getSource() == g.btnEsquina) {

            g.btnEsquina.setSize(100, 50);

        }
        if (me.getSource() == g.btnAgrandar) {

            g.btnAgrandar.setSize(100, 50);
        }
        if (me.getSource() == g.btnCentro) {

            g.btnCentro.setSize(100, 50);

        }
        if (me.getSource() == g.btnAchicar) {

            g.btnAchicar.setSize(100, 50);

        }

    }

    @Override
    public void mouseExited(MouseEvent me) {

        if (me.getSource() == g.btnEsquina) {

            g.btnEsquina.setSize(100, 20);

        }
        if (me.getSource() == g.btnAgrandar) {

            g.btnAgrandar.setSize(100, 20);
        }
        if (me.getSource() == g.btnCentro) {

            g.btnCentro.setSize(100, 20);

        }
        if (me.getSource() == g.btnAchicar) {

            g.btnAchicar.setSize(100, 20);

        }

    }

}
