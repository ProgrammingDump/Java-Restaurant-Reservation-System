/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semester.project;

import javax.swing.*;
import javax.swing.text.Document;
import javax.swing.text.PlainDocument;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;

public class PlaceholderTextFieldExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Placeholder TextField Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JTextField textField = new JTextField(20);
        addPlaceholder(textField, "Enter your text here...");

        frame.add(textField);
        frame.pack();
        frame.setVisible(true);
    }

    private static void addPlaceholder(JTextField textField, String placeholder) {
        Document document = new PlainDocument() {
            boolean placeholderActive = true;

            @Override
            public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
                if (placeholderActive) {
                    super.remove(0, getLength());
                    placeholderActive = false;
                }
                super.insertString(offset, str, attr);
            }

            @Override
            public void remove(int offs, int len) throws BadLocationException {
                if (placeholderActive) {
                    return;
                }
                super.remove(offs, len);
            }
        };

        textField.setDocument(document);
        textField.setText(placeholder);
        textField.setForeground(Color.GRAY);

        textField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (textField.getText().equals(placeholder)) {
                    textField.setText("");
                    textField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (textField.getText().isEmpty()) {
                    textField.setText(placeholder);
                    textField.setForeground(Color.GRAY);
                }
            }
        });
    }
}