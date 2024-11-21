
public class Jugador {

private String nombre;
private Posicion posicion;
private int numero;
private int edad;
private int golAVG = 0;
private boolean activo;

public Jugador() {
	this.numero = -1;
	this.activo=true;
}



public Jugador (String nombre, Posicion posicion, int numero, int edad, int golAVG,boolean activo) {
this.nombre = nombre;
this.posicion = posicion;
this.numero = numero;
this.edad = edad;
this.golAVG = golAVG;
this.activo = activo;
}

public int getEdad() {return this.edad;}
public String getNombre() {return this.nombre;}
public Posicion getPosicion() {return this.posicion;}
public int getNumero() {return this.numero;}
public int getGolAVG() {return this.golAVG;}


public void setEdad(int edad) {this.edad = edad;}
public void setNombre(String nombre) {this.nombre = nombre;}
public void setPosicion(Posicion posicion) {this.posicion = posicion;}
public void setNumero(int numero) {this.numero = numero;}
public void setGolAVG(int golAVG) {this.golAVG = golAVG;}

} // class Jugador