package empresa;

public class Principal {
	public static void main(String[] args) {
	livroDigital ld = new livroDigital("Os miseráveis" , new Autor ("Victor Hugo", "francês", "hugovictor@outlook.com"), "Romance", 
			5,1000, 3500);
	
	ld.info();
		
	}
}
	
