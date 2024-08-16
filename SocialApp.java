import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SocialApp extends JFrame {
    private UberSocial uberSocial;

    public SocialApp() {
        uberSocial = new UberSocial();
        setTitle("UberSocial");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1, 10, 10));
        add(panel);

        // Crear botones
        JButton btnAgregarCuenta = new JButton("Agregar Cuenta");
        JButton btnAgregarPost = new JButton("Agregar Post");
        JButton btnAgregarAmigo = new JButton("Agregar Amigo");
        JButton btnAgregarComment = new JButton("Agregar Comentario");
        JButton btnVerPerfil = new JButton("Ver Perfil");

        // Añadir botones al panel
        panel.add(btnAgregarCuenta);
        panel.add(btnAgregarPost);
        panel.add(btnAgregarAmigo);
        panel.add(btnAgregarComment);
        panel.add(btnVerPerfil);

        // Configurar acciones de los botones
        btnAgregarCuenta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarCuenta();
            }
        });

        btnAgregarPost.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarPost();
            }
        });

        btnAgregarAmigo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarAmigo();
            }
        });

        btnAgregarComment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarComment();
            }
        });

        btnVerPerfil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verPerfil();
            }
        });
    }

    private void agregarCuenta() {
        String username = JOptionPane.showInputDialog(this, "Ingrese el nombre de usuario:");
        String tipo = JOptionPane.showInputDialog(this, "Ingrese el tipo de cuenta (FACEBOOK/TWITTER):");
        uberSocial.agregarCuenta(username, tipo);
        JOptionPane.showMessageDialog(this, "Cuenta agregada.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }

    private void agregarPost() {
        String user = JOptionPane.showInputDialog(this, "Ingrese el nombre de usuario:");
        String post = JOptionPane.showInputDialog(this, "Ingrese el contenido del post:");
        uberSocial.agregarPost(user, post);
        JOptionPane.showMessageDialog(this, "Post agregado.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }

    private void agregarAmigo() {
        String user1 = JOptionPane.showInputDialog(this, "Ingrese el primer usuario:");
        String user2 = JOptionPane.showInputDialog(this, "Ingrese el segundo usuario:");
        uberSocial.agregarAmigo(user1, user2);
        JOptionPane.showMessageDialog(this, "Amigos agregados.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }

    private void agregarComment() {
        String user = JOptionPane.showInputDialog(this, "Ingrese el nombre de usuario:");
        int postID = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese el ID del post:"));
        String autor = JOptionPane.showInputDialog(this, "Ingrese el autor del comentario:");
        String comment = JOptionPane.showInputDialog(this, "Ingrese el contenido del comentario:");
        uberSocial.agregarComment(user, postID, autor, comment);
        JOptionPane.showMessageDialog(this, "Comentario agregado.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }

    private void verPerfil() {
        String user = JOptionPane.showInputDialog(this, "Ingrese el nombre de usuario:");
        uberSocial.profileFrom(user);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SocialApp().setVisible(true);
            }
        });
    }
}
