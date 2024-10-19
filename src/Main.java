import Easy.Solution_724;
import Medium.Solution_2352;
import Medium.Solution_394;
import Medium.Solution_735;


public class Main {
    public static void main(String[] args) {
        Solution_394 solution2352 = new Solution_394();
        int[] arr = {-2,-1,1,2};
        System.out.println(solution2352.decodeString("3[a]2[bc]"));
        System.out.println(solution2352.decodeString("3[a2[c]]"));
/*        for (int i : solution2352.asteroidCollision(arr)) {
            System.out.println(i+ " ");
        }*/
    }
}