package rs.ac.bg.fon.np.json_api_caller.main;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import rs.ac.bg.fon.np.json_api_caller.domen.Film;

public class Main3 {

	public static void main(String[] args) {
		try (FileReader in = new FileReader("niz_objekata.json")) {
			Gson gson = new Gson();

			Type listType = new TypeToken<List<Film>>() {}.getType();

			List<Film> filmovi = gson.fromJson(in, listType);

			for (Film film : filmovi) {
				System.out.println(film);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
