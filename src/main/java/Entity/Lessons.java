package Entity;

import java.io.Serializable;

public class Lessons implements Serializable {
    private int id;
    private String NameLesson;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameLesson() {
        return NameLesson;
    }

    public void setNameLesson(String nameLesson) {
        NameLesson = nameLesson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lessons lessons = (Lessons) o;

        if (id != lessons.id) return false;
        return NameLesson != null ? NameLesson.equals(lessons.NameLesson) : lessons.NameLesson == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (NameLesson != null ? NameLesson.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Lessons{" +
                "id=" + id +
                ", NameLesson='" + NameLesson + '\'' +
                '}';
    }
}
