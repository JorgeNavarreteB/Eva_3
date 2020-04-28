import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
 
@SuppressWarnings("serial")
public class Interfaz extends JFrame {
     
    
    String usuario, contra;
    JTextField Tusuario;
    JPasswordField Tcontra;
     
    
    public Interfaz(){
        
        super("Login de la aplicación");
        setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(300, 200);
         
        JLabel Lusuario = new JLabel("Usuario");
        Lusuario.setBounds(10, 50, 150, 30);
        add(Lusuario);
         
        Tusuario = new JTextField();
        Tusuario.setBounds(100, 50, 150, 30);
        add(Tusuario);
         
 
        JLabel Lcontra = new JLabel("Contraseña");
        Lcontra.setBounds(10, 100, 150, 30);
        add(Lcontra);
         
        Tcontra = new JPasswordField();
        Tcontra.setBounds(100, 100, 150, 30);
        add(Tcontra);
         
        JButton ingresar = new JButton("Ingresar");
        ingresar.setBounds(80, 150, 150, 30);
        ingresar.setContentAreaFilled(false);
        ingresar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                Verificacion();
            }
        });
        add(ingresar);
         
    }
     
    @SuppressWarnings("deprecation")
    public void Verificacion(){
 
      
        usuario = Tusuario.getText();
        contra = Tcontra.getText();
         
        
      
       
        
    }
}