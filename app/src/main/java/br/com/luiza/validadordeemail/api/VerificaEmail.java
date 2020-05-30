package br.com.luiza.validadordeemail.api;

import android.os.StrictMode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Hashtable;
import java.util.Map;

import com.google.gson.Gson;

import br.com.luiza.validadordeemail.model.Email;

public class VerificaEmail {

    Gson gson = new Gson();

    public Email buscaEmail(String email) {
        try {
            if (android.os.Build.VERSION.SDK_INT > 9) {
                StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
                StrictMode.setThreadPolicy(policy);
            }


            String key = "4UZJHLTMEK5T2KJ5BLKD";
            Hashtable<String, String> data = new Hashtable<String, String>();
            data.put("format", "json");
            data.put("email", email);

            String datastr = "";
            for (Map.Entry<String, String> entry : data.entrySet()) {
                datastr += "&" + entry.getKey() + "=" + URLEncoder.encode(entry.getValue(), "UTF-8");
            }
            URL url = new URL("https://api.mailboxvalidator.com/v1/validation/single?key=" + key + datastr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

            Email emailFinal = new Email();
            emailFinal = gson.fromJson(br, Email.class);
            System.out.println(emailFinal);

            conn.disconnect();
            return emailFinal;
        } catch (
                MalformedURLException e) {
            e.printStackTrace();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}