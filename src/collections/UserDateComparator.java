package collections;

import java.util.Comparator;

public class UserDateComparator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        if (o1.getCreatedDate().isAfter(o2.getCreatedDate())) {
            return 1;
        } else if (o2.getCreatedDate().isAfter(o1.getCreatedDate())) {
            return -1;
        } else {
            return 0;
        }
    }
}
