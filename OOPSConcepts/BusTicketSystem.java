package OOPSConcepts;

class BusTicket {
    String passengerName;
    String destination;
    boolean checkedIn = false;

    public BusTicket(String passengerName, String destination) {
        this.passengerName = passengerName;
        this.destination = destination;
    }

    void markCheckedIn() {
        if (!checkedIn) {
            checkedIn = true;
        }
    }

    static boolean isValid(String name, String destination) {
        if (name == null || destination == null)
            return false;

        if (name.trim().isEmpty() || destination.trim().isEmpty())
            return false;

        if (!name.matches("[a-zA-Z ]+"))
            return false;

        return true;
    }

    static void processBatch(String[][] rawBookings) {
        BusTicket[] tickets = new BusTicket[rawBookings.length];

        int valid = 0;
        int rejected = 0;
        int duplicate = 0;

        for (int i = 0; i < rawBookings.length; i++) {

            String name = rawBookings[i][0];
            String destination = rawBookings[i][1];

            if (!isValid(name, destination)) {
                rejected++;
                continue;
            }

            boolean found = false;

            for (int j = 0; j < valid; j++) {
                if (tickets[j].passengerName.equals(name) &&
                        tickets[j].destination.equals(destination)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                duplicate++;
            } else {
                tickets[valid] = new BusTicket(name, destination);
                valid++;
            }
        }

        System.out.println("Valid: " + valid);
        System.out.println("Rejected: " + rejected);
        System.out.println("Duplicates skipped: " + duplicate);
    }
}

public class BusTicketSystem {
    public static void main(String[] args) {

        String[][] bookings = {
                {"Divya", "Chennai"},
                {"", "Bangalore"},
                {"Ravi123", "Pune"},
                {"Divya", "Chennai"},
                {" ", " "}
        };

        BusTicket.processBatch(bookings);
    }
}

