package course7.TemaSecondTry;

import java.util.Comparator;
import java.util.UUID;

public class Comparator11 extends Assignment implements Comparable<Comparator11> {

    public Comparator11(UUID id, int courseNumber, String title, String description, DifficultyLevel level) {
        super(id, courseNumber, title, description, level);
    }

    @Override
    public int compareTo(Comparator11 o) {
        final int difficultyLevelOfThis = this.getLevel().hashCode();
        final int difficultyLevelOfOther = o.getLevel().hashCode();
        return difficultyLevelOfThis - difficultyLevelOfOther;
    }
}
