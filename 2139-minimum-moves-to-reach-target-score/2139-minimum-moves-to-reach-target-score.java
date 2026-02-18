class Solution {
    public int minMoves(int target, int maxDoubles) {
        int t = target;
        int moves = 0;

        while (t != 1) {
            if (maxDoubles == 0) {
                moves += t - 1;
                t = 1;
            } else {
                if (t % 2 == 0) {
                    t /= 2;
                    maxDoubles--;
                } else {
                    t--;
                }
                moves++;
            }
        }
        return moves;
    }
}