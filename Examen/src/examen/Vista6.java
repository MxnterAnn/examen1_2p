
package examen;

import javax.swing.*;
import org.netbeans.lib.awtextra.*;
import java.awt.Color;

public class Vista6 extends JFrame {

    JLabel etiNombre;
    JButton btnEsquina, btnCentro, btnAgrandar, btnAchicar;

    public Vista6() {
        this.setTitle("Ejercicio 6");
        this.setSize(500, 500);
        this.getContentPane().setLayout(new AbsoluteLayout());
        
        etiNombre=new JLabel("");
        this.getContentPane().add(etiNombre, new AbsoluteConstraints(10, 40, 100, 30));
        etiNombre.setBackground(Color.red);
        etiNombre.setOpaque(true);
        btnEsquina=new JButton("Esquina");
        this.getContentPane().add(btnEsquina, new AbsoluteConstraints(10, 80, 100, 30));
        btnCentro=new JButton("Centro");
        this.getContentPane().add(btnCentro, new AbsoluteConstraints(10, 120, 100, 30));
        btnAgrandar=new JButton("Agrandar");
        this.getContentPane().add(btnAgrandar, new AbsoluteConstraints(10, 160, 100, 30));
        btnAchicar=new JButton("Achicar");
        this.getContentPane().add(btnAchicar, new AbsoluteConstraints(10, 200, 100, 30));
    }
    public static void main(String[] args) {
        Vista6 f=new Vista6();
        f.setVisible(true);
    }
}

