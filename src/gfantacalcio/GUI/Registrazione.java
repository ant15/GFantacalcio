
package gfantacalcio.GUI;

import gfantacalcio.object.Utente;
import gfantacalcio.thread.SalvaUtenti;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Registrazione extends JFrame implements ActionListener {
    
    private Utente U;
    private JButton Reg;
    private JButton Annulla;
    private JFrame f;
    private JTextField txtUser;
    private JTextField txtPass;
    private JTextField txtMail;
            
    public Registrazione() {
        
        f = new JFrame("Registrazione");
        JPanel p = new JPanel();
        txtUser = new JTextField(30);
        txtPass = new JTextField(30);
        txtMail = new JTextField(30);
        Reg = new JButton();
        Annulla = new JButton();
        
        txtUser.setFont(new Font("sansserif",Font.BOLD,20));
        txtPass.setFont(new Font("sansserif",Font.BOLD,20));
        txtMail.setFont(new Font("sansserif",Font.BOLD,20));
        
        p.setLayout(new GridLayout(4, 2, 10, 10));
        
        JLabel Username = new JLabel("Username", JLabel.RIGHT);
        Username.setFont(new Font("sansserif",Font.BOLD,20));
        p.add(Username);
        p.add(txtUser);
        JLabel Password = new JLabel("Password", JLabel.RIGHT);
        Password.setFont(new Font("sansserif",Font.BOLD,20));
        p.add(Password);
        p.add(txtPass);
        JLabel Mail = new JLabel("E-Mail", JLabel.RIGHT);
        Mail.setFont(new Font("sansserif",Font.BOLD,20));
        p.add(Mail);
        p.add(txtMail);
        Annulla.setText("ANNULLA");
        Annulla.addActionListener(this);
        p.add(Annulla);
        Reg.setText("REGISTRATI!");
        Reg.addActionListener(this);
        p.add(Reg);
        
        f.getContentPane().add(p);
        f.setSize(400, 200);
        f.setLocation(100, 100);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object premuto = e.getSource();
        if(premuto == Reg){
            if((txtUser.getText().isEmpty())||(txtPass.getText().isEmpty())||(txtMail.getText().isEmpty())){
                JOptionPane.showMessageDialog(null ,"TUTTI I CAMPI SONO OBBLIGATORI!");
            }else{
                String emailPattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
                if (!(txtMail.getText().matches(emailPattern))) {
                    JOptionPane.showMessageDialog(null ,"E-MAIL NON VALIDA!");
                }else{
                    SalvaUtenti salva = new InviaQuery("INSERT INTO utenti (username,password,email) VALUES('" + txtUser.getText() + "',  SHA1('" + txtPass.getText() + "') '" + txtMail.getText() + "')" );
                    salva.start();
                }
            }
        }
        
        if(premuto == Annulla){
            f.dispose();
        }
    }
    
    
}
