public class Place {
    private String address;
    private int floors;

    public Place(String a, int f) {
        address = a;
        floors = f;
    }

    public String getAddress() {
        return address;
    }

    public int getFloors() {
        return floors;
    }

    public void findDirections() {
        System.out.println("Just use Google Maps...");
    }
}
