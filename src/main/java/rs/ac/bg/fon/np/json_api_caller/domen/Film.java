package rs.ac.bg.fon.np.json_api_caller.domen;

import com.google.gson.annotations.SerializedName;

public class Film {

	@SerializedName("Title")
	private String naslov;
	@SerializedName("Year")
	private int godinaIzlaska;
	@SerializedName("Runtime")
	private String trajanje;
	@SerializedName("Genre")
	private String zanr;
	@SerializedName("Director")
	private String imeRezisera;
	@SerializedName("imdbRating")
	private double imdbRejting;

	public String getNaslov() {
		return naslov;
	}

	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}

	public int getGodinaIzlaska() {
		return godinaIzlaska;
	}

	public void setGodinaIzlaska(int godinaIzlaska) {
		this.godinaIzlaska = godinaIzlaska;
	}

	public String getTrajanje() {
		return trajanje;
	}

	public void setTrajanje(String trajanje) {
		this.trajanje = trajanje;
	}

	public String getZanr() {
		return zanr;
	}

	public void setZanr(String zanr) {
		this.zanr = zanr;
	}

	public String getImeRezisera() {
		return imeRezisera;
	}

	public void setImeRezisera(String imeRezisera) {
		this.imeRezisera = imeRezisera;
	}

	public double getImdbRejting() {
		return imdbRejting;
	}

	public void setImdbRejting(double imdbRejting) {
		this.imdbRejting = imdbRejting;
	}

	@Override
	public String toString() {
		return "Film [naslov=" + naslov + ", godinaIzlaska=" + godinaIzlaska + ", trajanje=" + trajanje + ", zanr="
				+ zanr + ", imeRezisera=" + imeRezisera + ", imdbRejting=" + imdbRejting + "]";
	}
}
