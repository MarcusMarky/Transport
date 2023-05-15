public class Car extends ATransport{
   
    private Driver  fl;
    private ITransportable  fr;
    private ITransportable  bl;
    private ITransportable  br;
//HW: --------------------v
    public ITransportable getThingFromPlace(String place){
     if (place.equals("Front Left")) {
            return fl;
     } else if (place.equals("Front Right")) {
            return fr;
     } else if (place.equals("Back Left")) {       
            return bl;
     } else if (place.equals("Back Right")) {
            return br;
    }
    return null;
    }

    public void setThingToPlace(String place, ITransportable thing) {
        if (place.equals("Front Left")) {
            fl = (Driver)thing;
    } else if (place.equals("Front Right")) {
            fr = (Passanger)thing;
    } else if (place.equals("Back Left")) {
            bl = (Box)thing;
    } else if (place.equals("Back Right")) {
            br = (Driver)thing;
    }
    }
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
