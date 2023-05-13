public class Car extends ATransport{
    public Driver  fl;
    public ITransportable  fr;
    public ITransportable  bl;
    public ITransportable  br;

    public String toString() {
        String out = 
        "+------------- Mercedes -------------+\n"+
        "|                                    |\n"+
        "|                                    |\n"+
        "|   +-----+                +-----+   |\n"+
        "|   |"+fl+" |                |"+fr+" |   |\n"+
        "|   +-----+                +-----+   |\n"+
        "|                                    |\n"+
        "|                                    |\n"+
        "|                                    |\n"+
        "|   +-----+                +-----+   |\n"+
        "|   |"+bl+" |                |"+br+" |   |\n"+
        "|   +-----+                +-----+   |\n"+
        "+------------------------------------+\n";
        return out;
    }
}
