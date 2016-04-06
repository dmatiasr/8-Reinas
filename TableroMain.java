public class TableroMain{
	public static void main (String[] args){
		//creacion de un tablero
		Tablero tab = new Tablero();
		System.out.println(""+tab.toString());
		System.out.println(""+tab.hayAmenaza() );
	}
}