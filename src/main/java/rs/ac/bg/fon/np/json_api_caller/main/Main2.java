package rs.ac.bg.fon.np.json_api_caller.main;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import rs.ac.bg.fon.np.json_api_caller.domen.Film;

public class Main2 {

	public static void main(String[] args) {
		Film film1 = new Film();
		film1.setNaslov("The Lord of the Rings: The Fellowship of the Ring");
		film1.setGodinaIzlaska(2001);
		film1.setTrajanje("178 min");
		film1.setZanr("Action, Adventure, Drama");
		film1.setImeRezisera("Peter Jackson");
		film1.setImdbRejting(8.8);

		Film film2 = new Film();
		film2.setNaslov("Star Wars");
		film2.setGodinaIzlaska(1977);
		film2.setTrajanje("121 min");
		film2.setZanr("Action, Adventure, Fantasy");
		film2.setImeRezisera("George Lucas");
		film2.setImdbRejting(8.6);

		Film film3 = new Film();
		film3.setNaslov("Mad Max");
		film3.setGodinaIzlaska(1979);
		film3.setTrajanje("88 min");
		film3.setZanr("Action, Adventure, Sci-Fi");
		film3.setImeRezisera("George Miller");
		film3.setImdbRejting(6.9);

		Film[] filmovi = { film1, film2, film3 };

		try (PrintWriter out = new PrintWriter(new FileWriter("niz_objekata.json"))) {
			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			out.print(gson.toJson(filmovi));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
