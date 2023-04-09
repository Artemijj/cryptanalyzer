package com.javarush.cryptanalyser.laptev.model;

import com.javarush.cryptanalyser.laptev.view.CryptoanizerCaesarGUI;
import com.javarush.cryptanalyser.laptev.view.ICryptoanizerCaesarGUI;

public class CryptoanizerCaesar {
    private static String errorMessage =
            "Проверьте правильность введённых параметров.\n" +
            "Для получения справки введите -help";
    private static String helpMessage =
            "-c <filename>  - Копирование файла.\n" +
            "-e <key> <filename>  - Шифрование файла (0 < key <= 40).\n" +
            "-d <key> <filename>  - Дешифрование файла (0 < key <= 40).\n" +
            "-b <filename>  - Дешифрование файла (bruteforce).\n" +
            "-s <cryptFilename> <referenceFilename>  - Дешифрование файла методом статистического анализа.\n" +
            "-g  - Запустить графический интерфейс.";

    public static void main(String[] args) {

        ICryptoanizerCaesarConsole iccConsole = new CryptoanizerCaesarConsole();
        ICryptoanizerCaesarGUI iccGUI = new CryptoanizerCaesarGUI(iccConsole);
        iccGUI.mainWindow();
        iccConsole.setGuiMark(true);
//        if (args.length == 0) {
//            System.err.println(errorMessage);
//            System.exit(1);
//        }
//        String progKey = args[0];
//        if (progKey.equals("-c")) {
//            if (args.length != 2) {
//                System.err.println(errorMessage);
//                System.exit(1);
//            }
//            String file = args[1];
//            iccConsole.readFileToSourceTxt(file);
//            iccConsole.saveTxtToFile("copy.txt", iccConsole.getSourceTxt());
//        } else if (progKey.equals("-e")) {
//            if (args.length != 3) {
//                System.err.println(errorMessage);
//                System.exit(1);
//            }
//            try {
//                int encryptKey = Integer.parseInt(args[1]);
//                if (encryptKey >= iccConsole.getAlphabet().length()) {
//                    System.err.println(errorMessage);
//                    System.exit(1);
//                }
//                String file = args[2];
//                iccConsole.readFileToSourceTxt(file);
//                iccConsole.encryptTxt(iccConsole.getSourceTxt(), encryptKey);
//                iccConsole.saveTxtToFile("encoded.txt", iccConsole.getEncodeTxt());
//            } catch (NumberFormatException e) {
//                System.err.println(errorMessage);
//                System.exit(1);
//            }
//        } else if (progKey.equals("-d")) {
//            if (args.length != 3) {
//                System.err.println(errorMessage);
//                System.exit(1);
//            }
//            try {
//                int encryptKey = Integer.parseInt(args[1]);
//                if (encryptKey >= iccConsole.getAlphabet().length()) {
//                    System.err.println(errorMessage);
//                    System.exit(1);
//                }
//                String file = args[2];
//                iccConsole.readFileToSourceTxt(file);
//                iccConsole.encryptTxt(iccConsole.getSourceTxt(), -Math.abs(encryptKey));
//                iccConsole.saveTxtToFile("output.txt", iccConsole.getEncodeTxt());
//            } catch (NumberFormatException e) {
//                System.err.println(errorMessage);
//                System.exit(1);
//            }
//        } else if (progKey.equals("-b")) {
//            if (args.length != 2) {
//                System.err.println(errorMessage);
//                System.exit(1);
//            }
//            String file = args[1];
//            iccConsole.readFileToSourceTxt(file);
//            int key = iccConsole.bruteForceSourceTxt();
//            iccConsole.encryptTxt(iccConsole.getSourceTxt(), key);
//            iccConsole.saveTxtToFile("output.txt", iccConsole.getEncodeTxt());
//        } else if (progKey.equals("-s")) {
//            if (args.length != 3) {
//                System.err.println(errorMessage);
//                System.exit(1);
//            }
//            String cryptFile = args[1];
//            String planeFile = args[2];
//            iccConsole.readFileToSourceTxt(planeFile);
//            iccConsole.setReferenceTxt(iccConsole.getSourceTxt());
//            iccConsole.readFileToSourceTxt(cryptFile);
//            iccConsole.setEncodeTxt(iccConsole.getSourceTxt());
//            int key = iccConsole.statAnalizSourceTxtByReferenceTxt(iccConsole.getEncodeTxt(), iccConsole.getReferenceTxt());
//            iccConsole.encryptTxt(iccConsole.getSourceTxt(), -key);
//            iccConsole.saveTxtToFile("output.txt", iccConsole.getEncodeTxt());
//        } else if (progKey.equals("-g")) {
//            iccGUI.mainWindow();
//            iccConsole.setGuiMark(true);
//        } else if (progKey.equals("-help")) {
//            System.out.println(helpMessage);
//        } else {
//            System.out.println(helpMessage);
//        }
    }
}
