package com.javarush.cryptanalyser.laptev.controller;

import com.javarush.cryptanalyser.laptev.model.ICryptoanizerCaesarConsole;
import com.javarush.cryptanalyser.laptev.view.ICryptoanizerCaesarGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BruteforceButtonPress implements ActionListener {
    private ICryptoanizerCaesarGUI iccGUI;
    private ICryptoanizerCaesarConsole iccConsole;
    private int key;

    public BruteforceButtonPress(ICryptoanizerCaesarGUI iccGUI, ICryptoanizerCaesarConsole iccConsole) {
        this.iccGUI = iccGUI;
        this.iccConsole = iccConsole;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        iccConsole.readFileToSourceTxt(iccGUI.getFilePath());
        key = iccConsole.bruteForceSourceTxt();
        iccConsole.encryptTxt(iccConsole.getSourceTxt(), -key);
        iccConsole.saveTxtToFile("decrypt.txt", iccConsole.getEncodeTxt());
        iccGUI.setTextAreaOut(iccConsole.getEncodeTxt());
        iccGUI.setKeyField(String.valueOf(key));
        iccGUI.setKeyLabel("Founded key -");
    }
}
