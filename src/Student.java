public class Student implements Comparable {
    private int roll;
    private String name;
    private int marks;

    public Student(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return roll + " " + name + " " + marks;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public int compareTo(Object obj) {
        Student student = (Student) obj;

        if(this.roll == student.roll) {
            return 0;
        }

        if(this.roll > student.roll) {
            return 1;
        }

        return -1;
    }
}


class StudentComparator implements Comparator{
    public int compare(Object obj1, Object obj2) {
        Student s1 = (Student) obj1;
        Student s2 = (Student) obj2;

        if(s1.getRoll() == s2.getRoll()) {
            return  0;
        }

        if(s1.getRoll() > s2.getRoll()) {
            return 1;
        }

        return -1;
    }
}
