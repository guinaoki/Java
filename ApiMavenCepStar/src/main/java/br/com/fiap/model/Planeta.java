package br.com.fiap.model;

public class Planeta {
	
	/*{
	"name": "Dagobah",
	"rotation_period": "23",
	"orbital_period": "341",
	"diameter": "8900",
	"climate": "murky",
	"gravity": "N/A",
	"terrain": "swamp, jungles",
	"surface_water": "8",
	"population": "unknown",
	"residents": [],
	"films": [
		"https://swapi.dev/api/films/2/",
		"https://swapi.dev/api/films/3/",
		"https://swapi.dev/api/films/6/"
	],
	"created": "2014-12-10T11:42:22.590000Z",
	"edited": "2014-12-20T20:58:18.425000Z",
	"url": "https://swapi.dev/api/planets/5/"
}*/
	
	private String name;
	private String diameter;
	private String climate;
	
	public Planeta() {
		super();
	}

	public Planeta(String name, String diameter, String climate) {
		super();
		this.name = name;
		this.diameter = diameter;
		this.climate = climate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiameter() {
		return diameter;
	}

	public void setDiameter(String diameter) {
		this.diameter = diameter;
	}

	public String getClimate() {
		return climate;
	}

	public void setClimate(String climate) {
		this.climate = climate;
	}

	@Override
	public String toString() {
		return "StarWars [name=" + name + ", diameter=" + diameter + ", climate=" + climate + "]";
	}
	
	

}
