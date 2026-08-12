package Projects.ClubManagemnetSystem;

public class Club {

    private int clubId;
    private String clubName;
    private String category;
    private String facultyName;

    public Club(int clubId, String clubName, String category, String facultyName) {
        this.clubId = clubId;
        this.clubName = clubName;
        this.category = category;
        this.facultyName = facultyName;
    }

    public int getClubId() {
        return clubId;
    }

    public String getClubName() {
        return clubName;
    }

    public String getCategory() {
        return category;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void displayClubDetails() {
        System.out.println("\n******* Club Details *******");
        System.out.println("Club ID: " + clubId);
        System.out.println("Club Name: " + clubName);
        System.out.println("Category: " + category);
        System.out.println("Faculty In-Charge: " + facultyName);
    }
}