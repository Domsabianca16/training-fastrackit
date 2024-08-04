package course7.TemaSecondTry;

import java.util.Objects;
import java.util.UUID;

public class Assignment {
    private UUID id;
    private int courseNumber;
    private String title;
    private String  description;
    private DifficultyLevel level;

    public Assignment(UUID id, int courseNumber, String title, String description, DifficultyLevel level) {
        this.id = UUID.randomUUID();
        this.courseNumber = courseNumber;
        this.title = title;
        this.description = description;
        this.level = level;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DifficultyLevel getLevel() {
        return level;
    }

    public void setLevel(DifficultyLevel level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "id=" + id +
                ", courseNumber=" + courseNumber +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", level=" + level +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Assignment that = (Assignment) o;
        return courseNumber == that.courseNumber && Objects.equals(id, that.id) && Objects.equals(title, that.title) && Objects.equals(description, that.description) && level == that.level;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, courseNumber, title, description, level);
    }
}
