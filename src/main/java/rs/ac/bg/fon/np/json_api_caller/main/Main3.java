package rs.ac.bg.fon.np.json_api_caller.main;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

import rs.ac.bg.fon.np.json_api_caller.domen.Film;

public class Main3 {

	public static void main(String[] args) {
		try (FileReader in = new FileReader("niz_objekata.json")) {
			Gson gson = new Gson();

			List<Film> filmovi = Arrays.asList(gson.fromJson(in, Film[].class));

			for (Film film : filmovi) {
				System.out.println(film);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
