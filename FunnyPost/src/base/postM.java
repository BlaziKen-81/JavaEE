package base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class postM {
	public static void postMethod() throws IOException {
	    URL url = new URL("https://jsonplaceholder.typicode.com/posts");
	    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	    connection.setRequestMethod("POST");
	    BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	    String inputLine;
	    while ((inputLine = in.readLine()) != null) {
	        System.out.println(inputLine);
	    }
	    in.close();
	}
}
