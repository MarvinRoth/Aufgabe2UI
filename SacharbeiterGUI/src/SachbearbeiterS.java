import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;
import java.lang.*;
import java.awt.event.ActionListener;


public class SachbearbeiterS extends JPanel{


    public static String eingabeBenutzername;
    public static String eingabePasswort;
    public static boolean eingabeBerechtigung;

    private static SachbearbeiterS singleInstance = new SachbearbeiterS();
    private SachbearbeiterK kontrolle;

    static JButton buttonOK;
    static JButton buttonAbbrechen;
    static JTextField tfName;
    static JTextField tfPW;
    static JRadioButton radioSachb;
    static JRadioButton radioAdmin;
    static ButtonGroup rbgroup;

    //wird von LoginAAS und SachbearbeiterBearbeitenAS genutzt
    public JPanel konfiguriereSachbearbeiterPanel(String ueberschrift, String defaultBenutzername, String defaultPasswort, boolean editierbar)
    {
        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));

        GridBagLayout gbl_contentPane = new GridBagLayout();
        gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0};
        gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
        gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        panel.setLayout(gbl_contentPane);
        
        
        //Konponenten anlegen
        buttonAbbrechen = new JButton("Abbrechen");
        GridBagConstraints gbc_btnAbbruch = new GridBagConstraints();
        gbc_btnAbbruch.insets = new Insets(0, 0, 0, 5);
        gbc_btnAbbruch.gridx = 0;
        gbc_btnAbbruch.gridy = 11;
        panel.add(buttonAbbrechen, gbc_btnAbbruch);

        JTextArea text = new JTextArea();
        Dimension dimension = new Dimension(400, 400);
        text.setPreferredSize(dimension);



        buttonOK = new JButton("Ok");
        GridBagConstraints gbc_btnOk = new GridBagConstraints();
        gbc_btnOk.insets = new Insets(0, 0, 0, 5);
        gbc_btnOk.gridx = 1;
        gbc_btnOk.gridy = 11;
        panel.add(buttonOK, gbc_btnOk);

        if(editierbar) {
            radioSachb = new JRadioButton("Sachbearbeiter", false);
            GridBagConstraints gbc_rdbtnSacharbeiter = new GridBagConstraints();
            gbc_rdbtnSacharbeiter.anchor = GridBagConstraints.WEST;
            gbc_rdbtnSacharbeiter.insets = new Insets(20, 5, 5, 0);
            gbc_rdbtnSacharbeiter.gridx = 4;
            gbc_rdbtnSacharbeiter.gridy = 9;
            panel.add(radioSachb, gbc_rdbtnSacharbeiter);


            radioAdmin = new JRadioButton("Administrator", true);
            GridBagConstraints gbc_rdbtnAdministartor = new GridBagConstraints();
            gbc_rdbtnAdministartor.anchor = GridBagConstraints.WEST;
            gbc_rdbtnAdministartor.insets = new Insets(0, 5, 45, 0);
            gbc_rdbtnAdministartor.gridx = 4;
            gbc_rdbtnAdministartor.gridy = 10;
            panel.add(radioAdmin, gbc_rdbtnAdministartor);

            JLabel labelBer = new JLabel("Berechtigung: ");
            GridBagConstraints gbc_lblBerechtigung = new GridBagConstraints();
            gbc_lblBerechtigung.anchor = GridBagConstraints.WEST;
            gbc_lblBerechtigung.insets = new Insets(20, 0, 5, 5);
            gbc_lblBerechtigung.gridx = 0;
            gbc_lblBerechtigung.gridy = 9;
            panel.add(labelBer, gbc_lblBerechtigung);

            //radiobuttons in group, damit nur einer anwählbar ist
            rbgroup = new ButtonGroup();
            rbgroup.add(radioSachb);
            rbgroup.add(radioAdmin);
        }

        JLabel labelUeberschrift = new JLabel(ueberschrift);
        GridBagConstraints gbc_lblLogin = new GridBagConstraints();
        gbc_lblLogin.anchor = GridBagConstraints.WEST;
        gbc_lblLogin.insets = new Insets(0, 0, 5, 5);
        gbc_lblLogin.gridx = 0;
        gbc_lblLogin.gridy = 0;
        panel.add(labelUeberschrift, gbc_lblLogin);

        JLabel labelName = new JLabel("Benutzername: ");
        GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
        gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
        gbc_lblNewLabel.insets = new Insets(20, 0, 5, 5);
        gbc_lblNewLabel.gridx = 0;
        gbc_lblNewLabel.gridy = 3;
        panel.add(labelName, gbc_lblNewLabel);

        JLabel labelPW = new JLabel("Passwort: ");
        GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
        gbc_lblNewLabel_1.insets = new Insets(20, 0, 5, 5);
        gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
        gbc_lblNewLabel_1.gridx = 0;
        gbc_lblNewLabel_1.gridy = 5;
        panel.add(labelPW, gbc_lblNewLabel_1);


        //JLabel labelLeer = new JLabel(" ");

        tfName = new JTextField(defaultBenutzername, 20);
        GridBagConstraints gbc_txtBenutzername = new GridBagConstraints();
        gbc_txtBenutzername.insets = new Insets(20, 5, 5, 0);
        gbc_txtBenutzername.fill = GridBagConstraints.HORIZONTAL;
        gbc_txtBenutzername.gridx = 4;
        gbc_txtBenutzername.gridy = 3;
        panel.add(tfName, gbc_txtBenutzername);

        tfPW = new JPasswordField(defaultPasswort, 20);
        GridBagConstraints gbc_textField = new GridBagConstraints();
        gbc_textField.insets = new Insets(20, 5, 5, 0);
        gbc_textField.fill = GridBagConstraints.HORIZONTAL;
        gbc_textField.gridx = 4;
        gbc_textField.gridy = 5;
        panel.add(tfPW, gbc_textField);


        return panel;

    }

    static void addOKListener(ActionListener okListener)
    {
        buttonOK.addActionListener(okListener);
    }

    static void addAbbruchListener(ActionListener abbruchListener)
    {
        buttonOK.addActionListener(abbruchListener);
    }


    SachbearbeiterS() {
        kontrolle = new SachbearbeiterK();
    }

    public static SachbearbeiterS getInstance(){
        if (singleInstance == null){

            singleInstance = new SachbearbeiterS();
            return singleInstance;
        }
        else return singleInstance;
    }

    public void eingabeBenutzername() throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Bitte Benutzername eingeben: ");
        eingabeBenutzername = br.readLine();

        if(eingabeBenutzername.length() < 1){

            System.out.println("Ungültig Eingabe. Der Benutzername darf nur aus Buchstaben und _ Bestehen");
            eingabeBenutzername();

        }
        else{
        for(int i = 0; i < eingabeBenutzername.length(); i++){

            char c = eingabeBenutzername.charAt(i);
            if(!Character.isLetter(c) && c != '_')
            {
                System.out.println("Kein gueltiger Benutzername. Der Benutzername darf nur aus Buchstaben und _ Bestehen");
                eingabeBenutzername();

            }
        }
        }

    }

    public void eingabePasswort()throws IOException{

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Bitte Passwort eingeben: ");
        eingabePasswort = br.readLine();

    }



 


}