public class App {
public static void main(String[] args) {
    
    Driver brother   = new Driver();
   // Driver father    = new Driver();
   //Driver mother    = new Driver();
   // Passanger sister = new Passanger();

   // Dog          bob = new Dog();
   // Cat        milky = new Cat();

    ATransport mercedes = new Car();
    
    ((Car)mercedes).fl = brother;
    ((Car)mercedes).fr = new Box();
    ((Car)mercedes).bl = new Box();

    System.out.println(mercedes);
}    
}