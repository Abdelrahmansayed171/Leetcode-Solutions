import Easy.Solution_724;
import Medium.Solution_2352;


public class Main {
    public static void main(String[] args) {
        Solution_2352 solution2352 = new Solution_2352();
        int[][] arr = {
                {3,2,1},
                {1,7,6},
                {2,7,7},
        };
        System.out.println(solution2352.equalPairs(arr));
    }
}