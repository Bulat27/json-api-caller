package rs.ac.bg.fon.np.json_api_caller.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import rs.ac.bg.fon.np.json_api_caller.domen.Film;

public class Main1 {

	public static final String API_KEY = "";
	public static final String NAZIV_FILMA = "Baby+Driver";

	public static void main(String[] args) {
		String urlStr = "http://www.omdbapi.com/?apikey=" + API_KEY + "&t=" + NAZIV_FILMA;

		try {
			URL url = new URL(urlStr);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));

			Gson gson = new GsonBuilder().create();

			Film film = gson.fromJson(in, Film.class);

			in.close();
			System.out.println(film);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
