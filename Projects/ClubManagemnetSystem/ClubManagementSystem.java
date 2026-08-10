package Projects.ClubManagemnetSystem;
import java.util.Scanner;

public class ClubManagementSystem {
    static int president = 0;
    static int vicePresident = 0;
    static int secretary = 0;
    static int member = 0;


    static void CreateClub(Scanner sc){
        System.out.println("******* Enter club details ********");
        System.out.println();
        System.out.print("Enter club ID No: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Club Name: ");
        String name = sc.nextLine();
        System.out.print("Enter club category: ");
        String category = sc.nextLine();
        System.out.print("Enter Faculty in charge name: ");
        String Facultyname = sc.nextLine();
        System.out.println();
    }
    static void AddClubMember(Scanner sc){

        System.out.println("Enter Student role Accordingly: ");
        String memberRole[] = {"President", "VicePresident", "Secretary", "Member"};
        System.out.println("Enter 0 for President");
        System.out.println("Enter 1 for Vice President");
        System.out.println("Enter 2 for Secretary");
        System.out.println("Enter 3 for Member");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if (choice >= 0 && choice < 4) {
            switch (choice) {
                case 0:
                    if (president >= 1) {
                        System.out.println("President already exists!");
                        return;
                    }
                    else {
                        president++;
                    }
                    break;
                case 1:
                    vicePresident++;
                    break;
                case 2:
                    secretary++;
                    break;
                case 3:
                    member++;
                    break;
            }
        } else {
            System.out.println("Invalid role!");
            return;
        }

        System.out.println();

        System.out.println("***** Enter "+memberRole[choice]+" details *****");
        System.out.println();
        System.out.print("Enter "+memberRole[choice]+" Id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter "+memberRole[choice]+" name: ");
        String name = sc.nextLine();
        System.out.print("Enter Department name: ");
        String department = sc.nextLine();
        System.out.print("Enter year of study: ");
        String studyYear = sc.nextLine();
        System.out.print("Enter phone number: ");
        String phNumber = sc.nextLine();
        System.out.print("Enter "+memberRole[choice]+" email Id: ");
        String email = sc.nextLine();
        System.out.println();

        Member newMember = new Member(
                id,
                name,
                department,
                studyYear,
                phNumber,
                email,
                memberRole[choice],
                1
        );

        System.out.println("===== MEMBER ADDED SUCCESSFULLY =====");
        System.out.println("ID: " + newMember.getId());
        System.out.println("Name: " + newMember.getName());
        System.out.println("Department: " + newMember.getDepartment());
        System.out.println("Year: " + newMember.getStudyYear());
        System.out.println("Phone: " + newMember.getPhoneNumber());
        System.out.println("Email: " + newMember.getEmail());
        System.out.println("Role: " + newMember.getRole());
        System.out.println("Club ID: " + newMember.getClubId());


        System.out.println("Club total member's analysis: ");
        System.out.println();
        System.out.println("President count: "+president);
        System.out.println("Vice President count: "+vicePresident);
        System.out.println("Secretary count: "+secretary);
        System.out.println("Member count: "+member);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CreateClub(sc);
        AddClubMember(sc);
    }
}
