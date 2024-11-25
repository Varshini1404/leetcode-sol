class Solution {
    private static final int ROWS = 2;
    private static final int COLUMNS = 3;

    public int slidingPuzzle(int[][] board) {
        var initialPuzzleBoard = new PuzzleBoard(board);
        var targetPuzzleBoard = new PuzzleBoard(new int[][] {
            {1, 2, 3},
            {4, 5, 0}
        });

        Queue<PuzzleBoard> queue = new LinkedList<>();
        queue.add(initialPuzzleBoard);

        Set<PuzzleBoard> visited = new HashSet<>();
        visited.add(initialPuzzleBoard);

        int steps = 0;

        while (!queue.isEmpty()) {
            var numberOfPuzzlesInCurrentLevel = queue.size();

            for (var i = 0; i < numberOfPuzzlesInCurrentLevel; i++) {
                var currentPuzzleBoard = queue.remove();

                if (currentPuzzleBoard.equals(targetPuzzleBoard)) {
                    return steps;
                }

                for (var row = 0; row < ROWS; row++) {
                    for (var col = 0; col < COLUMNS; col++) {
                        var adjacentPuzzleBoard = currentPuzzleBoard.tryMoveSingleTile(row, col);

                        if (adjacentPuzzleBoard == null || visited.contains(adjacentPuzzleBoard)) {
                            continue;
                        }

                        queue.add(adjacentPuzzleBoard);
                        visited.add(adjacentPuzzleBoard);
                    }
                }
            }

            steps++;
        }

        return -1;
    }

    private static class PuzzleBoard {
        private static final Coordinate DELTA_NORTH = new Coordinate(-1, 0);
        private static final Coordinate DELTA_SOUTH = new Coordinate(1, 0);
        private static final Coordinate DELTA_EAST = new Coordinate(0, 1);
        private static final Coordinate DELTA_WEST = new Coordinate(0, -1);

        PuzzleEntry[][] puzzleEntries;

        PuzzleBoard(int[][] puzzleBoardEntries) {
            puzzleEntries = new PuzzleEntry[ROWS][COLUMNS];

            for (var row = 0; row < ROWS; row++) {
                for (var col = 0; col < COLUMNS; col++) {
                    puzzleEntries[row][col] = new PuzzleEntry(new Coordinate(row, col), puzzleBoardEntries[row][col]);
                }
            }
        }

        PuzzleBoard(PuzzleBoard otherPuzzleBoard) {
            puzzleEntries = new PuzzleEntry[ROWS][COLUMNS];

            for (var row = 0; row < ROWS; row++) {
                for (var col = 0; col < COLUMNS; col++) {
                    var currentOtherPuzzleEntry = otherPuzzleBoard.puzzleEntries[row][col];

                    puzzleEntries[row][col] = new PuzzleEntry(new Coordinate(currentOtherPuzzleEntry.coordinate.x, currentOtherPuzzleEntry.coordinate.y), currentOtherPuzzleEntry.val);
                }
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof PuzzleBoard puzzleBoard)) return false;
            return Arrays.deepEquals(puzzleEntries, puzzleBoard.puzzleEntries);
        }

        @Override
        public int hashCode() {
            return Arrays.deepHashCode(puzzleEntries);
        }

        private PuzzleBoard copy() {
            return new PuzzleBoard(this);
        }

        public PuzzleBoard tryMoveSingleTile(int row, int col) {
            var puzzleAfterMove = this.copy();
            var currentPuzzleEntry = puzzleAfterMove.puzzleEntries[row][col];

            for (var delta : new Coordinate[] { DELTA_NORTH, DELTA_EAST, DELTA_WEST, DELTA_SOUTH }) {
                var newCoordinateOfPuzzleEntry = currentPuzzleEntry.coordinate.add(delta);

                if (newCoordinateOfPuzzleEntry.x >= 0 && newCoordinateOfPuzzleEntry.x < ROWS && newCoordinateOfPuzzleEntry.y >= 0 && newCoordinateOfPuzzleEntry.y < COLUMNS) {
                    if (puzzleAfterMove.puzzleEntries[newCoordinateOfPuzzleEntry.x][newCoordinateOfPuzzleEntry.y].val == 0) {
                        puzzleAfterMove.puzzleEntries[newCoordinateOfPuzzleEntry.x][newCoordinateOfPuzzleEntry.y] = new PuzzleEntry(new Coordinate(newCoordinateOfPuzzleEntry.x, newCoordinateOfPuzzleEntry.y), currentPuzzleEntry.val);
                        puzzleAfterMove.puzzleEntries[row][col] = new PuzzleEntry(new Coordinate(row, col), 0);
                        break;
                    }
                }
            }

            if (puzzleAfterMove.equals(this)) {
                return null;
            } else {
                return puzzleAfterMove;
            }
        }
    }

    private record PuzzleEntry(Coordinate coordinate, int val) {
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof PuzzleEntry that)) return false;
            return val == that.val && Objects.equals(coordinate, that.coordinate);
        }

        @Override
        public int hashCode() {
            return Objects.hash(coordinate, val);
        }
    }

    private record Coordinate(int x, int y) {
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Coordinate that)) return false;
            return x == that.x && y == that.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }

        public Coordinate add(Coordinate delta) {
            return new Coordinate(x + delta.x, y + delta.y);
        }
    }
}