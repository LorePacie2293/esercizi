import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class main {

	public static void main(String[] args) throws IOException {
		
		int contOperaz = 0;
		double contSell = 0;
		double contBuy = 0;
		BufferedReader buffer = null;
		ArrayList<String> listOperaz = new ArrayList<String>();
		String line = null;
		
		try {
			buffer = new BufferedReader(new FileReader("operaz.txt"));
		}
		catch(FileNotFoundException exc) {
			System.out.print("Errore apertura file");
		}
		
		line = buffer.readLine();
		
		while(line != null) {
			listOperaz.add(line);
			line = buffer.readLine();
		}
		
		for(String oper : listOperaz) {
			int numCampo = 1;
			boolean error = false;
			contOperaz++;
			int tot = 0;
			boolean type = false; 		//false = importo true = quantita
			String[] split = oper.split(" ");
			for(String a : split) {
				
				
				if(numCampo == 1) {
					if(!a.matches("[a-zA-Z0-9]*")) {
						error = true;
						
					}
				}
				else if(numCampo == 2 || numCampo == 3) {
					if(a.matches("[-+]?([0-9]*[.])?[0-9]+([-+]?\\d+)?")) {
						
						//Importo
						if(!type) {
						
							tot += Double.parseDouble(a);
							type = true;
						}
						
						//quantita
						else {
							tot *= Double.parseDouble(a);
						}
							
					}
					else {
						error = true;
					}
				}
				else if(numCampo == 4) {
					if(a.equalsIgnoreCase("s")) {
						contSell += tot;
					}
					else if(a.equalsIgnoreCase("b")) {
						contBuy += tot;
					}
					else {
						error = true;
					}
				}
				
				
				numCampo++;
			}
			//Error
			if(error) {
				System.out.print("\n");
				System.out.print("Riga sbagliata: " + contOperaz);
				System.out.print("\n");
				System.out.print("\n");
			}
			else {
				System.out.print("\n");
				System.out.print("Op: " + contOperaz + " - Buy: " + contBuy + " Sell: " + contSell);
				System.out.print("\n");
				System.out.print("\n");
			}
		}
		
	}

}
