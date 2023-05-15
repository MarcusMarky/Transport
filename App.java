public class App {
public static void main(String[] args) {
    
    Driver brother   = new Driver();
   // Driver father    = new Driver();
    Driver mother    = new Driver();
    Passanger sister = new Passanger();
    Box cardboardbox    = new Box();
   //Dog          bob = new Dog();
   // Cat        milky = new Cat();

    ATransport mercedes = new Car();
    
    ((Car)mercedes).setThingToPlace("Front Left", brother);
    ((Car)mercedes).setThingToPlace("Front Right", sister);
    ((Car)mercedes).setThingToPlace("Back Left",cardboardbox );
    ((Car)mercedes).setThingToPlace("Back Right", mother);
     System.out.println(mercedes);
}    
}