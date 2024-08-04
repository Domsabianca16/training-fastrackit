package course7.TemaSecondTry;

import java.util.UUID;

public class Comparator22 extends Assignment implements Comparable<Comparator22> {
    public Comparator22(UUID id, int courseNumber, String title, String description, DifficultyLevel level) {
        super(id, courseNumber, title, description, level);
    }

    @Override
    public int compareTo(Comparator22 o) {
        final int titleOfThis = this.getTitle().hashCode();
        final int titleOfOther = o.getTitle().hashCode();

        return titleOfThis - titleOfOther;
    }
}
