
import java.io.*;
import java.lang.*;
import java.util.*;
class proba4
{
 public static void main(String args[]) throws IOException //("Powstal blad!");
	{
	 //deklaracja zmiennych
	 String NazwaSamochodu;
	 int RokProdukcji, Przebieg, Klimatyzacja;
	 int BiezacyRok, Iteracja;
	 Calendar Kalendarz = Calendar.getInstance();
	 	 
	 	 BiezacyRok = Kalendarz.get(Calendar.YEAR);
		 System.out.println("Obecnie mamy: "+ BiezacyRok + "r.");
		 
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Wpisz nazwe samochodu: ");
		NazwaSamochodu = input.readLine();
		System.out.println(" ");
		
		System.out.print("Wpisz rok produkcji samochodu: ");
		RokProdukcji = Integer.parseInt(input.readLine());
		System.out.println(" ");
		
		System.out.print("Wpisz przebieg samochodu [tys. km]: ");
		Przebieg = Integer.parseInt(input.readLine());
		System.out.println(" ");
		
		System.out.print("Czy samochod ma klimatyzacje? 1/0 ");
		Klimatyzacja = Integer.parseInt(input.readLine());
		System.out.println(Klimatyzacja);
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.print("Samochod: "+ NazwaSamochodu + ", rok produkcji: " + RokProdukcji);
		System.out.print(", przebieg: "+ Przebieg + " tys. km");
		System.out.println(", klimatyzacja: "+ Klimatyzacja);
		System.out.println("powinien posiadac nastepujace przeglady:");

		System.out.println("****Przeglady roczne**** ");
		//obliczamy ilosc przegladow rocznych
		Iteracja=3; //coroczny przeglad od 3go roku uzytkowania
		
		while (BiezacyRok>=RokProdukcji + Iteracja)
			{
			System.out.println("Rok " + (RokProdukcji+Iteracja)+": Przeglad nr " + (Iteracja-2) + " po " + Iteracja + " roku uzytkowania");
			Iteracja++;
			}

		
		//obliczamy ilosc wymian oleju
		System.out.println("****Wymiany oleju:**** ");
		Iteracja=20;
		while (Iteracja<=Przebieg)
			{
			System.out.println("Wymiana oleju po przebiegu " + Iteracja +" tys.km ");
			Iteracja=Iteracja+20;
			}

		//obliczamy ilosc przegladow klimatyzacji
		System.out.println("****Przeglady klimatyzacji:**** ");
		if (Klimatyzacja==1)
		{
		Iteracja=2;
		
			while (BiezacyRok>=RokProdukcji + Iteracja)
			{
			System.out.println("Przeglad klimatyzacji po " + Iteracja +" roku uzytkowania.");
			Iteracja=Iteracja+2;
			}
		}
		else
		{ 
		System.out.println("Brak klimatyzacji. ");
		}
		
	System.out.println("****KONIEC PROGRAMU**** ");
	}
 
}