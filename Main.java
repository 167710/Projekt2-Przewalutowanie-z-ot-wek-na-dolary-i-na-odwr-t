//Przewalutowanie zlotowek na Dolary i na odwrót


import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
Scanner scanner = new Scanner(System.in);
System.out.println("Podaj zł na dolar:");
double zldolar= scanner.nextDouble();
System.out.println("Podaj dolar na zł:");
double dolarzl= scanner.nextDouble();
double zamiana1=0;    
double zamiana2=0;
  zamiana1=zldolar/4.4;
  zamiana2=dolarzl *4.4;
  System.out.println(" Przewalutowanie zł na dolara: "+zamiana1);
   System.out.println(" Przewalutowanie dolara na zł: "+zamiana2);
    
}
}  