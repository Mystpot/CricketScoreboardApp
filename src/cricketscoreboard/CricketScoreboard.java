/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cricketscoreboard;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import cricketscoreboard.Batsman;
import java.io.Serializable;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;



/**
 *
 * @author gemorgan
 */
public class CricketScoreboard implements Serializable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        CricketScoreboardForm form = new CricketScoreboardForm();
        form.setVisible(true);
       
        
        
    }
    
}
