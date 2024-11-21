
public class Entrenador {
private String nombre;
private int edad;
private int numtitulos;


public Entrenador() {
	
}
public Entrenador(String nombre, int edad, int numtitulos) {
	this.nombre = nombre;
	this.edad = edad;
	this.numtitulos = numtitulos;
}
public String getnombre() {return this.nombre;}
public void setnombre(String nombre) {this.nombre = nombre;}

public int getedad() {return this.edad;}
public void setedad(int edad) {this.edad = edad;}

public int getnumtitulos() {return this.numtitulos;}
public void setnumtitulos(int numtitulos) {this.numtitulos = numtitulos;}
}
