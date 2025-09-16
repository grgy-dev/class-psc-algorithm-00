import java.util.Scanner;
public class SalaProcurada
{
	public static void main(String[] args) {
	    Scanner fodasse = new Scanner(System.in);
		System.out.print("qual sua sala? ");
		String sala = fodasse.nextLine();
		String salaCorreta = "A219";
		
		if (sala.equalsIgnoreCase(salaCorreta)){
		    System.out.println("Você está no caminho certo.");
		}else {
		    System.out.println("Você está perdido(a), se encontre.");
		    
		}
}
}
