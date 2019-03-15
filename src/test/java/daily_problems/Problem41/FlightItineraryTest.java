package daily_problems.Problem41;

import daily_problems.Problem41.FlightItinerary;
import org.junit.Test;

import java.util.List;

public class FlightItineraryTest {

    FlightItinerary flightItinerary = new FlightItinerary();

    @Test
    public void printIternariesReturnsValidItineraries() {
        FlightItinerary.Itinerary[] itineraries = new FlightItinerary.Itinerary[4];
        FlightItinerary.Itinerary itinerary1 = new FlightItinerary.Itinerary("HNL", "AKL"); //HNL ➔ AKL
        FlightItinerary.Itinerary itinerary2 = new FlightItinerary.Itinerary("YUL", "ORD"); //YUL ➔ ORD
        FlightItinerary.Itinerary itinerary3 = new FlightItinerary.Itinerary("ORD", "SFO"); //ORD ➔ SFO
        FlightItinerary.Itinerary itinerary4 = new FlightItinerary.Itinerary("SFO", "HNL"); //SFO ➔ HNL
        itineraries[0] = itinerary1;
        itineraries[1] = itinerary2;
        itineraries[2] = itinerary3;
        itineraries[3] = itinerary4;

        List<FlightItinerary.Itinerary> itineraryList = flightItinerary.printIternaries("YUL", itineraries);
        System.out.print(itineraryList);
    }

    @Test
    public void printIternariesHandlesMultipleSameFrom() {
        FlightItinerary.Itinerary[] itineraries = new FlightItinerary.Itinerary[6];
        FlightItinerary.Itinerary itinerary1 = new FlightItinerary.Itinerary("HNL", "AKL"); //HNL ➔ AKL
        FlightItinerary.Itinerary itinerary5 = new FlightItinerary.Itinerary("AKL", "YUL"); //AKL ➔ YUL
        FlightItinerary.Itinerary itinerary6 = new FlightItinerary.Itinerary("YUL", "MKE"); //AKL ➔ YUL
        FlightItinerary.Itinerary itinerary2 = new FlightItinerary.Itinerary("YUL", "ORD"); //YUL ➔ ORD
        FlightItinerary.Itinerary itinerary3 = new FlightItinerary.Itinerary("ORD", "SFO"); //ORD ➔ SFO
        FlightItinerary.Itinerary itinerary4 = new FlightItinerary.Itinerary("SFO", "HNL"); //SFO ➔ HNL
        itineraries[0] = itinerary1;
        itineraries[1] = itinerary2;
        itineraries[2] = itinerary3;
        itineraries[3] = itinerary4;
        itineraries[4] = itinerary5;
        itineraries[5] = itinerary6;

        List<FlightItinerary.Itinerary> itineraryList = flightItinerary.printIternaries("YUL", itineraries);
        for (int i=0; i < itineraryList.size(); i++) {
            System.out.println(itineraryList.get(i).from);
            System.out.println(itineraryList.get(i).to);
        }
    }
}
