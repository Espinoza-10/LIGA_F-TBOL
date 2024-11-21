
public class LIGA {

	public LIGA() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jugador J1 = new Jugador("Johan Cruiff", Posicion.DELANTERO,11,25,2,false);
		  J1.setNombre("Johan Cruiff");
		  J1.setEdad(25);
		  J1.setPosicion(Posicion.DELANTERO);
		  J1.setNumero(11);
		
		Jugador J2 = new Jugador("Luis Aragones", Posicion.CENTROCAMPISTA,10,28,2,false);
		  J2.setNombre("Luis Aragones");
		  J2.setEdad(28);
		  J2.setPosicion(Posicion.CENTROCAMPISTA);
		  J2.setNumero(10);
		
		Jugador J3 = new Jugador("Mohamed Salah", Posicion.DELANTERO,11,32,2,true);
		  J3.setNombre("Mohamed Salah");
		  J3.setEdad(32);
		  J3.setPosicion(Posicion.DELANTERO);
		  J3.setNumero(11);
		
		Jugador J4 = new Jugador("Virgil Van Dijk", Posicion.DEFENSA,4,33,1,true);
		  J4.setNombre("Virgil Van Dijk");
		  J4.setEdad(33);
		  J4.setPosicion(Posicion.DEFENSA);
		  J4.setNumero(4);
		    
		Equipo e1= new Equipo("FC Barcelona","Nou Camp");
			e1.setNombre("FC Barcelona");
			e1.setEstadio("Nou Camp");
			
		Equipo e2= new Equipo("Liverpool","Anfield");
		    e2.setNombre("Liverpool");
		    e2.setEstadio("Anfield");
		    
		Equipo e3= new Equipo("Real Madrid","Santiago Bernabéu");
		    e3.setNombre("Real Madrid");
		    e3.setEstadio("Santiago Bernabéu");
		    
		Equipo e4= new Equipo("Manchester United","Old Trafford");
		    e4.setNombre("Manchester United");
		    e4.setEstadio("Old Trafford");
		    
		    
		Entrenador en1= new Entrenador("Carlo Ancelotti",65,29);
		    en1.setnombre("Carlo Ancelotti");
		    en1.setedad(65);
		    en1.setnumtitulos(29);
		
		Entrenador en2= new Entrenador("Jurgen Klopp",57,13);
		    en2.setnombre("Jurgen Klopp");
		    en2.setedad(57);
		    en2.setnumtitulos(13);
		
		Entrenador en3= new Entrenador("José Mourinho",61,25);
		    en3.setnombre("José Mourinho");
		    en3.setedad(61);
		    en3.setnumtitulos(25);
		    
		Entrenador en4= new Entrenador("Pep Guardiola",53,39);
		    en4.setnombre("Pep Guardiola");
		    en4.setedad(53);
		    en4.setnumtitulos(39);
		    
		    
		    
		 //Asignar todos los Entrenadores posibles a un equipo concreto   
		team12.Entrenadores[0]=12;
		team12.Entrenadores[1]=2;
		
		//Asignar 1 Jugador existente a un equipo existente en una posición de la plantilla concreta
		
	    team12.Jugadores[0]= j10;
	    team12.Jugadores[15]= j33;
		
	    //Crear arrays a partir de los jugadores y entrenadores disponibles
		Jugador[]jto1 = (j10, j44, j33, j23, j66, j89, j45);
		Entrenador[]jto2 = (e17,E2);
		
		//Asignar a un equipo ya creado un array de jugadores
		team12.Jugadores = jto1;
		
		//Crear un equipo nuevo e instanciar de una vez todos los jugadores y entrenadores
		Equipo nuevo = new Equipo ("Liverpool","Anfield",jto1,jto2);
	
	}

}
