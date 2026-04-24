package com.jmolina.lab2.util;

import javax.swing.text.JTextComponent;

public class FormUtils {
    
    public static void clearFields(JTextComponent... fields) {
        for (JTextComponent field : fields) {
            field.setText("");
        }
    }
}
