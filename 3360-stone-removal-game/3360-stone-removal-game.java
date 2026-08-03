class Solution {
    public boolean canAliceWin(int n) {
        int remove = 10;
        boolean aliceTurn = true;

        while (n >= remove) {
            n -= remove;
            remove--;
            aliceTurn = !aliceTurn;
        }

        // If it is Alice's turn and she cannot move, she loses.
        // Otherwise Bob cannot move, so Alice wins.
        return !aliceTurn;
    }
}