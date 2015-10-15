package main;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Boss on 15/10/15.
 */
public class NumberOfDiscIntersections {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Event[] events = new Event[A.length*2];
        for (int i = 0; i<A.length;i++){
            events[i*2] = new Event();
            events[i*2].setValue(i-A[i]);
            events[i*2].setIs_start(true);
            events[i*2+1] = new Event();
            events[i*2+1].setValue(i+(long)A[i]);
            events[i*2+1].setIs_start(false);
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

    class Event {
        private long value;
        private boolean is_start;
        public void setValue(long value){
            this.value=value;
        }
        public void setIs_start(boolean is_start){
            this.is_start = is_start;
        }
//        public long getValue(){
//            return this.value;
//        }
//        public boolean getIs_start(){
//            return this.is_start;
//        }
    }


}
