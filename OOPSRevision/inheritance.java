package OOPSRevision;

public class inheritance {

        static class Person {
            String name;

            Person(String name) {
                this.name = name;
            }

            void displayName() {
                System.out.println("Name: " + name);
            }
        }

        static class Student extends Person {
            String department;

            Student(String name, String department) {
                super(name);
                this.department = department;
            }

            void displayStudent() {
                displayName();
                System.out.println("Department: " + department);
            }
        }

        static class Teacher extends Person {
            String subject;

            Teacher(String name, String subject) {
                super(name);
                this.subject = subject;
            }

            void displayTeacher() {
                displayName();
                System.out.println("Subject: " + subject);
            }
        }

        public static void main(String[] args) {

            Student s = new Student("adii", "Computer Science");
            Teacher t = new Teacher("shubh", "Mathematics");

            s.displayStudent();
            t.displayTeacher();
        }
    }


