package javaCodes.ClassworkCodes;

public class Restaurant {

        private String name;
        private int guestCapacity;
        private int guestCount;

        public boolean isSeatAvailable (int partySize) {
            int seatsLeft = guestCapacity - guestCount;
            return partySize <= seatsLeft;
        }

        public void seatParty (int partySize) {
            guestCount = guestCount + partySize;
        }

        public void removeParty (int partySize) {
            guestCount = guestCount - partySize;
        }

        public void openRestaurantForService (String restaurantName, int restaurantGuestCapacity) {
            this.name = restaurantName;
            this.guestCapacity = restaurantGuestCapacity;
        }

        public void printRestaurantSummary () {
            System.out.println("Restaurant Name: " + name + " Guest Capacity: " + guestCapacity + " Guest Count: " + guestCount);
        }
    }