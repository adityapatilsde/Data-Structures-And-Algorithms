package Projects.ClubManagemnetSystem;

public class Member {
        private int id;
        private String name;
        private  String department;
        private String studyYear;
        private String phoneNumber;
        private String email;
        private String role;
        private  int clubId;

         public Member(int id, String name, String department,String studyYear,String phoneNumber,
                       String email,String role,int clubId) {
             this.id = id;
             this.name = name;
             this.department = department;
             this.studyYear = studyYear;
             this.phoneNumber = phoneNumber;
             this.email = email;
             this.role = role;
             this.clubId = clubId;
         }
             public int getId () {
                 return id;
             }

             public String getName () {
                 return name;
             }

             public String getDepartment () {
                 return department;
             }

             public String getStudyYear () {
                 return studyYear;
             }

             public String getPhoneNumber () {
                 return phoneNumber;
             }

             public String getEmail () {
                 return email;
             }

             public String getRole () {
                 return role;
             }

             public int getClubId () {
                 return clubId;
             }
         }

