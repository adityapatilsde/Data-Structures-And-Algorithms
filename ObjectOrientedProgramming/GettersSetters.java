package ObjectOrientedProgramming;

public  class GettersSetters {
    public static class student {
        public String name;
        private int rno;
        double percent;

        public int getRno() {
            return rno;
        }
        public void setRno(int roll){
            rno = roll;
        }
    }

    public static void main(String[] args) {
        student s = new student();
        System.out.println(s.getRno());
        s.setRno(76);
        System.out.println(s.getRno());
    }
}

