import java.util.*;
class Taxi{
    int Taxiid;
    char availability;
    int earrings;
    char location;
    Taxi(int Taxiid,char availability,int earrings,char location) {
        this.Taxiid = Taxiid;
        this.availability = availability;
        this.earrings=earrings;
        this.location=location;
    }
}
public class Taxi_booking {
    public static void main(String[] args) {
        ArrayList<Taxi> taxis=new ArrayList<>();
        taxis.add(new Taxi(1, 'Y', 0, 'A'));
        taxis.add(new Taxi(1, 'Y', 0, 'A'));
        taxis.add(new Taxi(1, 'Y', 0, 'A'));
    }
}
