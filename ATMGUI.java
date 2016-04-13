import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
  
public class ATMGUI 
{
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;
   private JPanel contPanel;
   public ATMGUI()
   {
      createGUI();
   }
   public static void main(String[] args)
   {
      ATMGUI  ATMGUI = new ATMGUI();      
      ATMGUI.showTextAreaDemo();
   } 
   private void createGUI()
   {
      mainFrame = new JFrame("Java Swing Examples");
      mainFrame.setSize(800,800);
      mainFrame.setLayout(new GridLayout(2, 1));
      mainFrame.addWindowListener(new WindowAdapter() 
      {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      }
      );     
      contPanel = new JPanel();
      contPanel.setLayout(new FlowLayout());
       
      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(contPanel);
      mainFrame.add(controlPanel);
        
      mainFrame.setVisible(true);  
   }
   private void showTextAreaDemo()
   {
       
      JLabel  namelabel= new JLabel("User ID: ", JLabel.RIGHT);
      final JTextField userText = new JTextField(6);
      contPanel.add(namelabel);
      contPanel.add(userText);
        
       /**
       * Text Field         
       * 
       */
        
 
      JLabel  commentlabel= new JLabel("Comments: ", JLabel.RIGHT);
 
      final JTextArea commentTextArea = 
         new JTextArea("",10,10);
 
      JScrollPane scrollPane = new JScrollPane(commentTextArea);    
 
       
      controlPanel.add(commentlabel);
      controlPanel.add(scrollPane);        
       
       
      /**
       * Button         
       * 
       */
       
      //resources folder should be inside SWING folder.
      //ImageIcon icon = createImageIcon("/resources/java_icon.png","Java");
 
      JPanel panel = new JPanel();
      panel.setBackground(Color.darkGray);
      panel.setSize(300,300);
      GridLayout layout = new GridLayout(3,1);
      panel.setLayout(layout); 
       
      panel.add(new JButton("OK"));
      panel.add(new JButton("Cancel")); 
      panel.add(new JButton("Exit")); 
      controlPanel.add(panel);
       
       
      /**
       * Radio Button         
       * 
       */
       
      JPanel panel1 = new JPanel();
      panel1.setBackground(Color.darkGray);
      panel1.setSize(300,300);
      GridLayout layout1 = new GridLayout(4,1);
      panel1.setLayout(layout1); 
       
      final JRadioButton radApple = new JRadioButton("Apple");
      final JRadioButton radMango = new JRadioButton("Mango");
      final JRadioButton radPeer = new JRadioButton("Peer");
      final JRadioButton radMelon = new JRadioButton("Melon");
       
       
       
      panel1.add(radApple);
      panel1.add(radMango);
      panel1.add(radPeer);
      panel1.add(radMelon);
       
      contPanel.add(panel1);
      /**
       * Text Field     
       * 
         */
       
       
       
       
      JLabel  passwordLabel = new JLabel("Password: ", JLabel.CENTER);
      final JPasswordField passwordText = new JPasswordField(6);    
      contPanel.add(passwordLabel);       
      contPanel.add(passwordText);
      
       
      mainFrame.setVisible(true);  
   }    
}