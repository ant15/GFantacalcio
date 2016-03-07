/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gfantacalcio.thread;

import java.io.*;
import java.net.*;
import javax.net.ssl.HttpsURLConnection;

/**
 *
 * @author Studente
 */
public class SalvaUtenti extends Thread {
    private final String USER_AGENT = "Mozilla/5.0";
    private String url = "https://10.1.27.43/gfantacalcio/query.php";
    private String args;
    private boolean invia;
    
    public SalvaUtenti(String[] argomenti){
        int i = 0;
        for (String arg : argomenti){
            if(i == 0){
                this.args = arg;
                i++;
            }else
                this.args += ";" + arg;
        }
        this.invia = false;
    }
    
    public void run(){
        try{
            sendPost();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
 
    private void sendPost() throws Exception {
        URL url = new URL(this.url);
        
        
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestProperty("accept", "text/html");
        connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; (R1 1.5))");
        String data = "args=" + args + "\r\n";//corpo della richiesta
        connection.setDoOutput(true);//abilita la scrittura
        connection.setRequestMethod("POST");//settaggio del metodo
        OutputStreamWriter wr = new OutputStreamWriter(connection.getOutputStream());
        wr.write(data);//scrittura del content
        wr.flush();
        System.out.println("Response Code: " + connection.getResponseMessage());
    }
}
