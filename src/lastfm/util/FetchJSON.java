package lastfm.util;

import java.net.URL;
import java.net.URLConnection;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class FetchJSON {
	public static String fetchJSONFrom(String url){
		try{
			url = url.replace(" ", "%20");
			url += "&format=json";
			URL address = new URL(url);
			
			System.out.println("Fetching URL: "+ url);
			
			URLConnection connection = address.openConnection();
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			StringBuilder stringBuilder = new StringBuilder();
			String line = null;
			
			while((line = reader.readLine()) != null)
				stringBuilder.append(line+"\n");
			
			return stringBuilder.toString();
			
		}catch(IOException error){
			error.toString();
			return null;
		}
	}
}
