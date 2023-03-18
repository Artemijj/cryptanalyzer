package com.javarush.cryptanalyser.laptev.controller;

import com.javarush.cryptanalyser.laptev.model.ICryptoanizerCaesarConsole;
import com.javarush.cryptanalyser.laptev.view.ICryptoanizerCaesarGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DefaultButtonPress implements ActionListener {
    private ICryptoanizerCaesarGUI iccGUI;
    private ICryptoanizerCaesarConsole iccConsole;

    public DefaultButtonPress(ICryptoanizerCaesarGUI iccGUI, ICryptoanizerCaesarConsole iccConsole) {
        this.iccGUI = iccGUI;
        this.iccConsole = iccConsole;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        key = iccConsole.statAnalizSourceTxtByReferenceTxt(iccConsole.getLoadedTxt(), iccConsole.getReferenceTxt());
        int key = 23;
        iccConsole.readFileToSourceTxt("input.txt");
        iccConsole.encryptTxt(iccConsole.getSourceTxt(), key);
        iccConsole.saveTxtToFile("output.txt", iccConsole.getEncodeTxt());
        iccGUI.setTextAreaIn(iccConsole.getSourceTxt());
        iccGUI.setTextAreaOut(iccConsole.getEncodeTxt());
        iccGUI.setKeyField(String.valueOf(key));
//        iccGUI.setKeyLabel("Founded key -");
    }
}
