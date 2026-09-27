package com.FileHandling;

import javax.swing.*;
import java.awt.*;

public class LibraryGUI extends JFrame {

    JTextField txtBook = new JTextField();
    JTextField txtAuthor = new JTextField();
    JTextField txtPrice = new JTextField();

    JTextArea output = new JTextArea();

    public LibraryGUI() {

        setTitle("Library Management System");
        setSize(600,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(4,2,10,10));

        panel.add(new JLabel("Book Name"));
        panel.add(txtBook);

        panel.add(new JLabel("Author Name"));
        panel.add(txtAuthor);

        panel.add(new JLabel("Price"));
        panel.add(txtPrice);

        JButton btnStore = new JButton("1. Store Data");
        JButton btnRead = new JButton("2. Read Data");
        JButton btnSearch = new JButton("3. Search");
        JButton btnExit = new JButton("4. Exit");

        panel.add(btnStore);
        panel.add(btnRead);

        JPanel bottom = new JPanel();

        bottom.add(btnSearch);
        bottom.add(btnExit);

        output.setEditable(false);

        add(panel,BorderLayout.NORTH);
        add(new JScrollPane(output),BorderLayout.CENTER);
        add(bottom,BorderLayout.SOUTH);

        btnStore.addActionListener(e -> {

            try{

                String bname = txtBook.getText();
                String aname = txtAuthor.getText();
                double price = Double.parseDouble(txtPrice.getText());

                Book book = new Book(bname,aname,price);

                LibraryOperations.writeToFile(book);

                JOptionPane.showMessageDialog(this,"Book Stored Successfully.");

                txtBook.setText("");
                txtAuthor.setText("");
                txtPrice.setText("");

            }catch(Exception ex){

                JOptionPane.showMessageDialog(this,"Invalid Input.");
            }

        });

        btnRead.addActionListener(e->{

            output.setText(LibraryOperations.readFromFile());

        });

        btnSearch.addActionListener(e->{

            String name = JOptionPane.showInputDialog("Enter Book Name");

            if(name!=null){

                output.setText(LibraryOperations.searchFromFile(name));
            }

        });

        btnExit.addActionListener(e->System.exit(0));
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> new LibraryGUI().setVisible(true));
    }
}
