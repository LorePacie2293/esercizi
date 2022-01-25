
public class main {

	public static void main(String[] args) {
		
		for(int cont = 1; cont <= 6; cont++) {
			
			for(int cont2 = 1; cont2 <= 8; cont2++) {
				
				if(cont2 == cont + 1) {
					System.out.print(" ");
					for(int cont3 = 6 - (cont - 1); cont3 >= 1; cont3--) {
						System.out.print(cont3);
					}
				}
				else if(cont2 <= cont){
					System.out.print(cont2);
				}
			}
			System.out.print("\n");
		}

	}

}
