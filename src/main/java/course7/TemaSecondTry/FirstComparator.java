package course7.TemaSecondTry;
import java.util.UUID;



public class FirstComparator extends Assignment implements Comparable<FirstComparator> {

    public FirstComparator(UUID id, int courseNumber, String title, String description, DifficultyLevel level) {
        super(id, courseNumber, title, description, level);
    }


    @Override
    public int compareTo(FirstComparator o) {
        final int  courseNumberOfThis = this.getCourseNumber();
        final int courseNumberOfOther = o.getCourseNumber();

        if ((courseNumberOfThis - courseNumberOfOther) == 0) {
            return compareTo(o);
        } else
            return courseNumberOfThis - courseNumberOfOther;
    }
}
