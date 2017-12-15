package Entity;

public class Student {
    private int id;
    private String LastName;
    private String FirstName;
    private int all_propuski;
    private int good_propuski;
    private int bad_propuski;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public int getAll_propuski() {
        return all_propuski;
    }

    public void setAll_propuski(int all_propuski) {
        this.all_propuski = all_propuski;
    }

    public int getGood_propuski() {
        return good_propuski;
    }

    public void setGood_propuski(int good_propuski) {
        this.good_propuski = good_propuski;
    }

    public int getBad_propuski() {
        return bad_propuski;
    }

    public void setBad_propuski(int bad_propuski) {
        this.bad_propuski = bad_propuski;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (id != student.id) return false;
        if (all_propuski != student.all_propuski) return false;
        if (good_propuski != student.good_propuski) return false;
        if (bad_propuski != student.bad_propuski) return false;
        if (LastName != null ? !LastName.equals(student.LastName) : student.LastName != null) return false;
        return FirstName != null ? FirstName.equals(student.FirstName) : student.FirstName == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (LastName != null ? LastName.hashCode() : 0);
        result = 31 * result + (FirstName != null ? FirstName.hashCode() : 0);
        result = 31 * result + all_propuski;
        result = 31 * result + good_propuski;
        result = 31 * result + bad_propuski;
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", LastName='" + LastName + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", all_propuski=" + all_propuski +
                ", good_propuski=" + good_propuski +
                ", bad_propuski=" + bad_propuski +
                '}';
    }
}
