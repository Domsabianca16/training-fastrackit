package course7.TemaSecondTry;

import java.util.Comparator;
import java.util.UUID;

public class SecondComparator extends Assignment implements Comparable<SecondComparator> {
    public SecondComparator(UUID id, int courseNumber, String title, String description, DifficultyLevel level) {
        super(id, courseNumber, title, description, level);
    }

    @Override
    public int compareTo(SecondComparator o) {
        final int courseNumberOfThis = this.getCourseNumber();
        final int courseNumberOfOther = o.getCourseNumber();
        if((courseNumberOfThis - courseNumberOfOther) == 0)
            return compareTo(o);
        else {
            return courseNumberOfThis - courseNumberOfOther;
        }
    }
}
