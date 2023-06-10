import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class Solution {
    public void wallsAndGates(int[][] rooms) {
        int ROWS = rooms.length;
        int COLS = rooms[0].length;
        Set<Pair<Integer, Integer>> visit = new HashSet<>();
        Queue<Pair<Integer, Integer>> q = new ArrayDeque<>();

        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                if (rooms[r][c] == 0) {
                    q.add(new Pair<>(r, c));
                    visit.add(new Pair<>(r, c));
                }
            }
        }

        int dist = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Pair<Integer, Integer> pair = q.poll();
                int r = pair.getKey();
                int c = pair.getValue();
                rooms[r][c] = dist;
                addRooms(r + 1, c, ROWS, COLS, visit, q, rooms);
                addRooms(r - 1, c, ROWS, COLS, visit, q, rooms);
                addRooms(r, c + 1, ROWS, COLS, visit, q, rooms);
                addRooms(r, c - 1, ROWS, COLS, visit, q, rooms);
            }
            dist++;
        }
    }

    private void addRooms(int r, int c, int ROWS, int COLS, Set<Pair<Integer, Integer>> visit,
                          Queue<Pair<Integer, Integer>> q, int[][] rooms) {
        if (r < 0 || c < 0 || r == ROWS || c == COLS || visit.contains(new Pair<>(r, c)) || rooms[r][c] == -1) {
            return;
        }
        visit.add(new Pair<>(r, c));
        q.add(new Pair<>(r, c));
    }
}

