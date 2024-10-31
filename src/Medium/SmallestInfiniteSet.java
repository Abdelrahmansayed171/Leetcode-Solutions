package Medium;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class SmallestInfiniteSet {
    PriorityQueue<Integer> heap;
    Set<Integer> hashTable;
    public SmallestInfiniteSet() {
        heap = new PriorityQueue<>();
        hashTable = new HashSet<>();
        for(int i =1; i <= 1000;i++){
            heap.add(i);
            hashTable.add(i);
        }
    }

    public int popSmallest() {
        int smallest = heap.poll();
        hashTable.remove(smallest);
        return smallest;
    }

    public void addBack(int num) {
        if(hashTable.contains(num))
            return;
        heap.offer(num);
        hashTable.add(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */
