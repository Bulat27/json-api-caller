package rs.ac.bg.fon.np.json_api_caller.main;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class Main4 {

	public static void main(String[] args) {
		JsonObject filmJson = new JsonObject();

		filmJson.addProperty("Title", "Shaun of the Dead");
		filmJson.addProperty("Year", 2004);
		filmJson.addProperty("Runtime", "99 min");
		filmJson.addProperty("Genre", "Comedy, Horror");
		filmJson.addProperty("Director", "Edgar Wright");
		filmJson.addProperty("imdbRating", 7.9);

		try (FileWriter out = new FileWriter("rucni_upis.json")) {
			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			out.write(gson.toJson(filmJson));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
