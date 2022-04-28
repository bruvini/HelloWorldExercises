import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner nome  = new Scanner(System.in); //atribuo um método para obtenção de dados
		String name, surname; //defino variáveis
		
		System.out.println("Digite seu nome: "); //solicito o nome
		name = nome.next(); //chamo o método de entrada de dado atribuido à variavel desejada
		System.out.println("Digite seu sobrenome: "); //solicito o sobrenome
		surname = nome.next(); //chamo o método de entrada de dado atribuido à variavel desejada
				
		System.out.println("Seu primeiro nome � " + name); //imprimo o nome com a variavel atribuida anteriormente
		System.out.println("Seu sobrenome � " + surname); //imprimo o sobrenome com a variavel atribuida anteriormente
		System.out.println("Seu nome completo � " + name + " " + surname); //imprimo o nome e sobrenome com as variáveis atribuidas anteriormente
		nome.close(); //finalizo o método de entrada de dados
	}

}
