package Top_Interview_150;

// 130. Surrounded Regions
// Medium

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Surrounded_Regions {
    public void solve(char[][] board) {
        for(int i = 0;i < board.length;i++){
            for(int j = 0;j < board[0].length;j++){
                if(i == 0 || i == board.length-1 || j == 0 || j == board[0].length-1){
                    if(board[i][j] == 'O'){
                        dfs(board, i, j);
                    }
                }
            }
        }
        for(int i = 0;i < board.length;i++){
            for(int j = 0;j < board[0].length;j++){
                if(board[i][j] == 'S')
                    board[i][j] = 'O';
                else if(board[i][j] == 'O')
                    board[i][j] = 'X';
            }
        }
    }

    private void dfs(char[][] board, int r, int c) {
        board[r][c] = 'S';
        int[][] neighbors = {{-1,0},{1,0},{0,1},{0,-1}};
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{r,c});

        while (!stack.isEmpty()){
            int[] points = stack.pop();
            for (int[] neighbor: neighbors){
                int nr = points[0] + neighbor[0], nc = points[1] + neighbor[1];
                if(nr >=0 && nr < board.length && nc >= 0 && nc < board[0].length && board[nr][nc] == 'O'){
                    stack.push(new int[] {nr,nc});
                    board[nr][nc] = 'S';
                }
            }
        }
    }
}
