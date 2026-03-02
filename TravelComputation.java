// Program Name: TravelComputation
// Purpose: Calculate total distance and total travel time

class TravelComputation {
    public static void main(String[] args) {

        // Traveller name
        String travelerName = "Eric";

        // Cities
        String fromCity = "Chennai";
        String viaCity = "Vellore";
        String toCity = "Bangalore";

        // Distances
        double distanceFromToVia = 156.6;
        double distanceViaToFinalCity = 211.8;

        // Time in minutes
        int timeFromToVia = 4 * 60 + 4;
        int timeViaToFinalCity = 4 * 60 + 25;

        // Calculations
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        // Display result
        System.out.println("Travel Details:");
        System.out.println("Total Distance travelled by " + travelerName +
                " from " + fromCity + " to " + toCity + " via " + viaCity +
                " is " + totalDistance + " km");
        System.out.println("Total Time Taken: " + totalTime + " minutes");
    }
}