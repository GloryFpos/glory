package Entity;

public class Lesson_Student {
    private int id_lesson;
    private int id_student;

    public int getId_student() {
        return id_student;
    }

    public void setId_student(int id_student) {
        this.id_student = id_student;
    }

    public int getId_lesson() {
        return id_lesson;
    }

    public void setId_lesson(int id_lesson) {
        this.id_lesson = id_lesson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lesson_Student that = (Lesson_Student) o;

        if (id_lesson != that.id_lesson) return false;
        return id_student == that.id_student;
    }

    @Override
    public int hashCode() {
        int result = id_lesson;
        result = 31 * result + id_student;
        return result;
    }

    @Override
    public String toString() {
        return "Lesson_Student{" +
                "id_lesson=" + id_lesson +
                ", id_student=" + id_student +
                '}';
    }
}
