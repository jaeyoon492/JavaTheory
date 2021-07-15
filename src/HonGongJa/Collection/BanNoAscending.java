package HonGongJa.Collection;

import java.util.Comparator;

public class BanNoAscending implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Student1 && o2 instanceof Student1) {
            Student1 s1 = (Student1)o1;
            Student1 s2 = (Student1)o2;
            s1.compareTo(s2);
            if (s1.ban == s2.ban){
                return s1.no - s2.no;
            }
        }
        return -1;
    }
}