class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<String, Set<Character>> squares = new HashMap<>();

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                String squareKey = (i / 3) + "," + (j / 3);
                if(board[i][j] == '.') continue;
                if(rows.containsKey(i)) {
                    if(rows.get(i).contains(board[i][j]))  return false;
                }
                if(cols.containsKey(j)) {
                    if(cols.get(j).contains(board[i][j])) return false;
                }
                if(squares.containsKey(squareKey)) {
                if(squares.get(squareKey).contains(board[i][j])) return false;
                }
                rows.computeIfAbsent(i, k->new HashSet<>()).add(board[i][j]);
                cols.computeIfAbsent(j, k->new HashSet<>()).add(board[i][j]);
                squares.computeIfAbsent(squareKey, k->new HashSet<>()).add(board[i][j]);

            }
        }

        return true;
    }
}
