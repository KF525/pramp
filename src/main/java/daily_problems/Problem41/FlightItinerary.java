package daily_problems.Problem41;

import java.util.ArrayList;
import java.util.List;

public class FlightItinerary {
/*
Given an unordered list of flights taken by someone, each represented as (origin, destination) pairs, and a starting airport, compute the person's itinerary. If no such itinerary exists, return null. If there are multiple possible itineraries, return the lexicographically smallest one. All flights must be used in the itinerary.

For example, given the list of flights [('SFO', 'HKO'), ('YYZ', 'SFO'), ('YUL', 'YYZ'), ('HKO', 'ORD')] and starting airport 'YUL', you should return the list ['YUL', 'YYZ', 'SFO', 'HKO', 'ORD'].

Given the list of flights [('SFO', 'COM'), ('COM', 'YYZ')] and starting airport 'COM', you should return null.

Given the list of flights [('A', 'B'), ('A', 'C'), ('B', 'C'), ('C', 'A')] and starting airport 'A', you should return the list ['A', 'B', 'C', 'A', 'C'] even though ['A', 'C', 'A', 'B', 'C'] is also a valid itinerary. However, the first one is lexicographically smaller.
 */
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
