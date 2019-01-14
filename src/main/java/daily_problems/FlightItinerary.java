package daily_problems;

import java.util.ArrayList;
import java.util.List;

public class FlightItinerary {

    static class Itinerary {
        String from, to;

        public Itinerary(String from, String to) {
            this.from = from;
            this.to = to;
        }
    }

    public List<Itinerary> printIternaries(String startingPoint, Itinerary[] itineraries) {
        List<Itinerary> finalItineraries = new ArrayList<Itinerary>();
        if (validItinerary(startingPoint, itineraries, finalItineraries)) { //why is this false?
            return finalItineraries;
        } else {
            return finalItineraries;
        }
    }

    public boolean validItinerary(String startingPoint, Itinerary[] itineraries,
                                  List<Itinerary> finalItineraries) {

        if (finalItineraries.size() == itineraries.length) {
            return true;
        }

        boolean validItinerary = false;
        String to = "";

        for (int i=0; i < itineraries.length; i++) {  //iterate through itineries  == if one matches the starting point then valid
            if (itineraries[i].from.equals(startingPoint)) { //TODO: Bug since we are not removing itineraries as they are being placed
                validItinerary = true;
                to = itineraries[i].to;
                break;
            }
        }

        if (validItinerary) {
            Itinerary itinerary = new Itinerary(startingPoint, to);
            finalItineraries.add(itinerary);
            validItinerary(to, itineraries, finalItineraries);
        }

        return false; //if none do return false
    }
}
