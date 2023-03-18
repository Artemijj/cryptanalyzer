package com.javarush.cryptanalyser.laptev.view;

import javax.swing.*;

public interface ICryptoanizerCaesarGUI {
    void mainWindow();
    void  setFileLabel(String filename);
    void setTextAreaIn(String text);
    void setTextAreaOut(String text);
    void setReferenceLabel(String reference);
    String getKeyValue();
    void setFilePath(String path);
    String getFilePath();
    void setReferencePath(String path);
    String getReferencePath();
    void setKeyField(String text);
    void setKeyLabel(String text);
    void alertDialog(String alert);
}
