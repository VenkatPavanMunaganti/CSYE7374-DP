/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye7374.fileUtil;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author benki
 */
public class GeneralFileUtil {
    /** 
     * @param filename name of file
     * @param data to write to file
     * @param isCleanWrite is false for appending to file
     */
    
    private static String baseDirectory = "src/main/java/edu/neu/csye7374/datastore/";
//    private static String baseDirectory = "";
    public static void writeToFile(String filename, String data, boolean isCleanWrite) {
        String filePath = baseDirectory + filename;
        try (FileWriter fileWriter = new FileWriter(filePath, !isCleanWrite)) {
            fileWriter.append(data + "\n");
            fileWriter.close();
        } catch(Exception e) {
            System.err.println("Error writing to file: " + filePath + " data: " + data + " isCleanWrite: " + isCleanWrite);
        }
    }
}
