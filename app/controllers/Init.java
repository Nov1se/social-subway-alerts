/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import au.com.bytecode.opencsv.CSVReader;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import play.mvc.Controller;

/**
 *
 * @author Michael
 */
public class Init extends Controller {

    public static void index() {
        try {
            URL url = new URL("http://www.getmura.com/currentversion/");
            url.openConnection();
            InputStream fileReader = url.openStream();
            CSVReader csvReader = new CSVReader(new BufferedReader(new InputStreamReader(fileReader)));
            String[] nextLine;
            while ((nextLine = csvReader.readNext()) != null) {
                // nextLine[] is an array of values from the line
                System.out.println(nextLine[0] + nextLine[1] + "etc...");
            }
        } catch (MalformedURLException ex) {
            Logger.getLogger(Init.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Init.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
