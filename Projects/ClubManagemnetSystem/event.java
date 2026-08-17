package Projects.ClubManagemnetSystem;

public class event {

        private int eventId;
        private String eventName;
        private String eventDate;
        private String eventVenue;
        private String eventDescription;
        private int clubId;

        //constructor
        public event(int eventId, String eventName, String eventDate,
                     String eventVenue, String eventDescription, int clubId) {

            this.eventId = eventId;
            this.eventName = eventName;
            this.eventDate = eventDate;
            this.eventVenue = eventVenue;
            this.eventDescription = eventDescription;
            this.clubId = clubId;
        }

        public int getEventId() {
            return eventId;
        }

        public String getEventName() {
            return eventName;
        }

        public String getEventDate() {
            return eventDate;
        }

        public String getEventVenue() {
            return eventVenue;
        }

        public String getEventDescription() {
            return eventDescription;
        }

        public int getClubId() {
            return clubId;
        }
    }
}
