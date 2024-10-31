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

/*public class SmallestInfiniteSet {
    int arr[];
    int ind;

    public SmallestInfiniteSet() {
        arr = new int[1001];
        ind = 1;
    }

    public int popSmallest() {
        while(arr[ind] == 1) ind++;
        arr[ind] = 1;
        return ind;
    }

    public void addBack(int num) {
        if(num < ind) ind = num;
        arr[num] = 0;
    }
}*/
