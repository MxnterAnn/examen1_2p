
package examen;

import javax.swing.*;
import org.netbeans.lib.awtextra.*;

public class Vista7 extends JFrame {

    JLabel etiTexto;
    JButton btnAzul, btnRojo, btnVerde, btnFondoAzul, btnFondoRojo, btnFondoVerde, btnTransparente, btnOpaca;

    public Vista7() {
        this.setTitle("Ejercicio 7");
        this.setSize(500, 500);
        this.getContentPane().setLayout(new AbsoluteLayout());

        etiTexto = new JLabel("    Hola Amix Te Gusta El Kpop o que tranza prro");
        this.getContentPane().add(etiTexto, new AbsoluteConstraints(10, 10, 300, 60));
        btnAzul = new JButton("Azul");
        this.getContentPane().add(btnAzul, new AbsoluteConstraints(10, 80, 200, 60));
        btnRojo = new JButton("Rojo");
        this.getContentPane().add(btnRojo, new AbsoluteConstraints(250, 80, 200, 60));
        btnVerde = new JButton("Verde");
        this.getContentPane().add(btnVerde, new AbsoluteConstraints(10, 150, 200, 60));
        btnFondoAzul = new JButton("Fondo Azul");
        this.getContentPane().add(btnFondoAzul, new AbsoluteConstraints(250, 150, 200, 60));
        btnFondoRojo = new JButton("Fondo Rojo");
        this.getContentPane().add(btnFondoRojo, new AbsoluteConstraints(10, 220, 200, 60));
        btnFondoVerde = new JButton("Fondo Verde");
        this.getContentPane().add(btnFondoVerde, new AbsoluteConstraints(250, 220, 200, 60));
        btnTransparente = new JButton("Transparente");
        this.getContentPane().add(btnTransparente, new AbsoluteConstraints(10, 290, 200, 60));
        btnOpaca = new JButton("Opaca");
        this.getContentPane().add(btnOpaca, new AbsoluteConstraints(250, 290, 200, 60));
    }

    public static void main(String[] args) {
        Vista7 g = new Vista7();
        g.setVisible(true);
    }

}
