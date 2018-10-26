import java.util.ArrayList;

public class Course {
    private String Name;
    private ArrayList<String> s = new ArrayList<String>();
    private int numOfStudents;

    public Course(String Name) {
        this.Name = Name;
        this.numOfStudents = 0;
    }

    public void addStudent(String student) {
        numOfStudents++;
        s.add(student);

    }

    public ArrayList<String> getStudents() {
        return s;
    }

    public int getNumberOfStudents() {
        return numOfStudents;
    }

    public String getCourseName() {
        return Name;
    }

    public void dropS(String student) {
        for (int j = 0; j < s.size(); j++) {
            if (student.equalsIgnoreCase(s.get(j))) {
                s.remove(j);
            }
        }
    }
    public void clear() {
        s.clear();
    }
}