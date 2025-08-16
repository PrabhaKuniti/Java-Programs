import java.util.*;
class MeetingRoomsII{
    static int minMeetingRooms(int[][] itv){
        java.util.Arrays.sort(itv,(a,b)->a[0]-b[0]);
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int[] in:itv){if(!pq.isEmpty()&&pq.peek()<=in[0])pq.poll();pq.add(in[1]);}
        return pq.size();
    }
    public static void main(String[] args){
        System.out.println(minMeetingRooms(new int[][]{{0,30},{5,10},{15,20}}));
    }
}
