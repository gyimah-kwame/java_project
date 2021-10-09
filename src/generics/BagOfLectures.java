package generics;

import java.util.ArrayList;
import java.util.List;

public class BagOfLectures {

    private List<Lecture> lectures;

    public BagOfLectures() {
        lectures = new ArrayList<>();
    }

    public void add(Lecture lecture) {
        lectures.add(lecture);
    }

    public void remove(Lecture lecture) {
        lectures.remove(lecture);
    }

    public void clear() {
        lectures.clear();
    }
}
