package Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class RandomizedSet {

    ArrayList<Integer> list;
    Map<Integer, Integer> map;
    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
    }

    public boolean insert(int val) {
        if(map.containsKey(val))
            return false;
        list.add(val);
        map.put(val, list.size()-1);
        return true;
    }

    public boolean remove(int val) {
        if(!map.containsKey(val))
            return false;

        int idx = map.get(val);
        int rval = list.get(list.size()-1);
        list.set(idx, rval);
        map.put(rval,idx);
        list.remove(list.size()-1);
        map.remove(val);

        return true;
    }

    public int getRandom() {
        Random rand = new Random();
        int idx = rand.nextInt(list.size());
        return list.get(idx);
    }
}

