package course7.Tema;

public class AssignmentComparedByCourseNumberAndDifficultyLevel extends Assignment implements Comparable<AssignmentComparedByCourseNumberAndDifficultyLevel> {


    public AssignmentComparedByCourseNumberAndDifficultyLevel(int courseNumber, String assignmentTitle, String assignmentDescription, DifficultyLevel level) {
        super(courseNumber, assignmentTitle, assignmentDescription, level);
    }

    @Override
    public int compareTo(AssignmentComparedByCourseNumberAndDifficultyLevel o) {
      final int courseNumberOfThis = this.getCourseNumber();
      final int courseNumberOfOther = o.getCourseNumber();


      return courseNumberOfThis - courseNumberOfOther;
    }
}
