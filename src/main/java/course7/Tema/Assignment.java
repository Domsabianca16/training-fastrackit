package course7.Tema;

import java.util.*;

public class Assignment {
    private UUID id;
    private int courseNumber;
    private String assignmentTitle;
    private String assignmentDescription;
    private DifficultyLevel level;

    public Assignment(int courseNumber, String assignmentTitle, String assignmentDescription,  DifficultyLevel level) {
        this.id = UUID.randomUUID();
        this.courseNumber = courseNumber;
        this.assignmentTitle = assignmentTitle;
        this.assignmentDescription = assignmentDescription;
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

    public String getAssignmentTitle() {
        return assignmentTitle;
    }

    public void setAssignmentTitle(String assignmentTitle) {
        this.assignmentTitle = assignmentTitle;
    }

    public String getAssignmentDescription() {
        return assignmentDescription;
    }

    public void setAssignmentDescription(String assignmentDescription) {
        this.assignmentDescription = assignmentDescription;
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
                ", assignmentTitle='" + assignmentTitle + '\'' +
                ", assignmentDescription='" + assignmentDescription + '\'' +
                ", level=" + level +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Assignment that = (Assignment) o;
        return courseNumber == that.courseNumber && Objects.equals(id, that.id) && Objects.equals(assignmentTitle, that.assignmentTitle) && Objects.equals(assignmentDescription, that.assignmentDescription) && level == that.level;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, courseNumber, assignmentTitle, assignmentDescription, level);
    }




}
