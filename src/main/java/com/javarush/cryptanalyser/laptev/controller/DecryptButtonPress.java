package com.javarush.cryptanalyser.laptev.controller;

import com.javarush.cryptanalyser.laptev.model.ICryptoanizerCaesarConsole;
import com.javarush.cryptanalyser.laptev.view.ICryptoanizerCaesarGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DecryptButtonPress implements ActionListener {
    private ICryptoanizerCaesarGUI iccGUI;
    private ICryptoanizerCaesarConsole iccConsole;
    private int key;

    public DecryptButtonPress(ICryptoanizerCaesarGUI iccGUI, ICryptoanizerCaesarConsole iccConsole) {
        this.iccGUI = iccGUI;
        this.iccConsole = iccConsole;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String getValue = iccGUI.getKeyValue();
        try {
            key = Integer.parseInt(getValue);
            if (key > 0 && key < 41) {
                iccConsole.readFileToSourceTxt(iccGUI.getFilePath());
                iccConsole.encryptTxt(iccConsole.getSourceTxt(), -Math.abs(key));
                iccConsole.saveTxtToFile("decrypt.txt", iccConsole.getEncodeTxt());
                iccGUI.setTextAreaOut(iccConsole.getEncodeTxt());
            } else {
                iccGUI.alertDialog("The key can be a whole positive number from 1 to 40.");
            }
        } catch (NumberFormatException err) {
            iccGUI.alertDialog("It is necessary to enter the positive number from 1 to 40.");
        }
    }
}
