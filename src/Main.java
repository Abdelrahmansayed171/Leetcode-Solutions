import Easy.Solution_724;
import Medium.Solution_2352;
import Medium.Solution_735;


public class Main {
    public static void main(String[] args) {
        Solution_735 solution2352 = new Solution_735();
        int[] arr = {-2,-1,1,2};
        System.out.println(solution2352.asteroidCollision(arr));
        for (int i : solution2352.asteroidCollision(arr)) {
            System.out.println(i+ " ");
        }
    }
}