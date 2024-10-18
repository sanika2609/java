import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Notepad extends JFrame {
    private JTextArea textArea;
    private String currentFilePath;

    public Notepad() {
        // Set up the frame
        setTitle("Simple Notepad");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Create a text area
        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);
        
        // Create menu bar
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        // Add action listeners
        openItem.addActionListener(e -> openFile());
        saveItem.addActionListener(e -> saveFile());
        exitItem.addActionListener(e -> System.exit(0));

        setVisible(true);
    }

    private void openFile() {
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            currentFilePath = file.getPath();
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                textArea.setText("");
                String line;
                while ((line = br.readLine()) != null) {
                    textArea.append(line + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error opening file");
            }
        }
    }

    private void saveFile() {
        if (currentFilePath == null) {
            JFileChooser fileChooser = new JFileChooser();
            if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                currentFilePath = file.getPath();
            }
        }
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(currentFilePath))) {
            bw.write(textArea.getText());
            JOptionPane.showMessageDialog(this, "File saved successfully");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error saving file");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Notepad::new);
    }
}





/*The provided Java code is a simple implementation of a text editor (Notepad) using the Swing framework for creating graphical user interfaces. Here’s a breakdown of the code:

Class Declaration

public class Notepad extends JFrame {
The Notepad class extends JFrame, making it a window-based application.
Instance Variables

private JTextArea textArea;
private String currentFilePath;
textArea: A JTextArea where users can input and edit text.
currentFilePath: A string that holds the path of the currently opened or saved file.
Constructor

public Notepad() {
Initializes the GUI components.
Frame Setup

setTitle("Simple Notepad");
setSize(600, 400);
setDefaultCloseOperation(EXIT_ON_CLOSE);
Sets the title, size, and behavior when the window is closed.
Text Area

textArea = new JTextArea();
JScrollPane scrollPane = new JScrollPane(textArea);
add(scrollPane, BorderLayout.CENTER);
Creates a JTextArea for text input, wrapped in a JScrollPane for scrolling capabilities, and adds it to the center of the frame.
Menu Bar

JMenuBar menuBar = new JMenuBar();
JMenu fileMenu = new JMenu("File");
JMenuItem openItem = new JMenuItem("Open");
JMenuItem saveItem = new JMenuItem("Save");
JMenuItem exitItem = new JMenuItem("Exit");
Constructs a menu bar with a "File" menu and three menu items: Open, Save, and Exit.

fileMenu.add(openItem);
fileMenu.add(saveItem);
fileMenu.addSeparator();
fileMenu.add(exitItem);
menuBar.add(fileMenu);
setJMenuBar(menuBar);
Adds the menu items to the menu, adds a separator, and sets the menu bar to the frame.
Action Listeners

openItem.addActionListener(e -> openFile());
saveItem.addActionListener(e -> saveFile());
exitItem.addActionListener(e -> System.exit(0));
Registers action listeners for the menu items, linking them to methods that handle opening, saving, and exiting the application.
File Handling Methods
Open File

private void openFile() {
Opens a file dialog for the user to select a file to open.
java
Copy code
if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
If the user selects a file, the file path is stored and the file is read line by line.

while ((line = br.readLine()) != null) {
    textArea.append(line + "\n");
}
Appends each line to the textArea.
Save File

private void saveFile() {
Saves the current content of textArea to a file.

if (currentFilePath == null) {
If no file has been saved yet, a save dialog is shown to the user.
java
Copy code
try (BufferedWriter bw = new BufferedWriter(new FileWriter(currentFilePath))) {
    bw.write(textArea.getText());
}
Writes the content of the textArea to the specified file.
Main Method

public static void main(String[] args) {
    SwingUtilities.invokeLater(Notepad::new);
}
The entry point of the application. It uses SwingUtilities.invokeLater to ensure that the GUI creation is executed on the Event Dispatch Thread, which is the proper way to handle Swing components.*/
