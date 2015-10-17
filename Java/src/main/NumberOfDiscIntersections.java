package main;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Boss on 15/10/15.
 */
public class NumberOfDiscIntersections {
    public int solution(int[] A) {
        // write your code in Java SE 8
//        ArrayList<Event> events = new ArrayList<>();
//        for(int i = 0; i<A.length; i++){
//            events.add(new Event(((long)i-A[i]),true));
//            events.add(new Event(((long)i+A[i]),false));
//        }

//        Comparator<Event> c = Comparator.comparing(event -> event.value);
//        c = c.thenComparing(Comparator.comparing(event -> !event.is_start));
//        events.sort(c);


        Event[] events = new Event[A.length*2];
        for (int i = 0; i<A.length;i++){
            events[i*2] = new Event((i-(long)A[i]),true);
            events[i*2+1] = new Event((i+(long)A[i]),false);
        }
        Arrays.sort(events, new EventComparator());

        int intersections=0, active_circle = 0;
        for(Event e:events){
            if(e.is_start){
                intersections+=active_circle;
                active_circle ++;
                if(intersections>10E6)
                    return -1;
            }else{
                active_circle--;
            }
        }
        return intersections;

    }


    class Event {
        private long value;
        private boolean is_start;
        Event(long value, boolean is_start){
            this.value=value;
            this.is_start = is_start;
        }
    }
    public class EventComparator implements Comparator<Event> {
        @Override
        public int compare(Event e1, Event e2) {
            int valueCompare = Long.valueOf(e1.value).compareTo(Long.valueOf(e2.value));
            if (valueCompare != 0) {
                return valueCompare;
            } else {
                return Boolean.valueOf(!e1.is_start).compareTo(Boolean.valueOf(!e2.is_start));
            }
        }
    }

}
