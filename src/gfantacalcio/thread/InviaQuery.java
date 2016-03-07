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
public class InviaQuery extends Thread {
    private final String USER_AGENT = "Mozilla/5.0";
    private String url = "https://10.1.27.43/gfantacalcio/query.php";
    private String sql;
    private boolean invia;
    
    public InviaQuery(String sql){
        this.sql = sql;
        this.invia = false;
    }
    
    public static void main(String[] args){
       InviaQuery iq = new InviaQuery("INSERT INTO utenti (username,password,email) VALUES('a', 'b', 'b')");
       iq.start();
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
        String data = "sql=" +sql + "\r\n";//corpo della richiesta
        connection.setDoOutput(true);//abilita la scrittura
        connection.setRequestMethod("POST");//settaggio del metodo
        OutputStreamWriter wr = new OutputStreamWriter(connection.getOutputStream());
        wr.write(data);//scrittura del content
        wr.flush();
        System.out.println("Response Code: " + connection.getResponseMessage());
    }
}
