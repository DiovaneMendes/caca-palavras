import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LeituraDeArquivo {
	String palavra[] = new String[12];
	
	public LeituraDeArquivo(){
		
	}
	
	@SuppressWarnings("resource")
	public void lendoArquivo(){
		Scanner ler = null;
		int i = 0;
		
		try{
			ler = new Scanner(new FileReader("palavras.txt")).useDelimiter("\n");
		}catch (FileNotFoundException e){
			System.out.println("");
		}
		
		while(ler.hasNext()){
			String escrita = null;
			escrita = ler.next();
			palavra[i] = escrita;
			i++;
		}
		
	}
}
