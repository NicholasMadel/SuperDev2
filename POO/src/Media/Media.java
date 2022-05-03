package Media;

import java.util.Scanner;

public class Media {

	public double nota1;
	public double nota2;
	public double nota3;
	public double nota4;
	
	public double media;
	
	Scanner scan = new Scanner(System.in);
	
	public void cadastrarNotas () {
		System.out.println("Digite a nota1");
		nota1 = scan.nextDouble();
		System.out.println("Digite a nota2");
		nota2 = scan.nextDouble();
		System.out.println("Digite a nota3");
		nota3 = scan.nextDouble();
		System.out.println("Digite a nota4");
		nota4 = scan.nextDouble();
	
	}
	
	public double calcularMedia () {
	  return media = (nota1+nota2+nota3+nota4)/4 ;
	}
	  
	public void mostrarMedia () {
	   System.out.println("Media final: "+media);
	}
	
	
	
	
}
