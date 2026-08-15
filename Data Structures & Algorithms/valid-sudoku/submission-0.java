
//                 columns
//        0 1 2 | 3 4 5 | 6 7 8
//      ────────┼───────┼───────
// row 0   B0   |  B1   |  B2
// row 1   B0   |  B1   |  B2
// row 2   B0   |  B1   |  B2
//      ────────┼───────┼───────
// row 3   B3   |  B4   |  B5
// row 4   B3   |  B4   |  B5
// row 5   B3   |  B4   |  B5
//      ────────┼───────┼───────
// row 6   B6   |  B7   |  B8
// row 7   B6   |  B7   |  B8
// row 8   B6   |  B7   |  B8

// Part 1: r / 3

// Integer division groups the rows:

// rows 0,1,2 → 0
// rows 3,4,5 → 1
// rows 6,7,8 → 2
        
        // row/3 tells which horizontal group are we in


//         Part 2: c / 3

// Same idea for columns:

// columns 0,1,2 → 0
// columns 3,4,5 → 1
// columns 6,7,8 → 2

// So this tells us which box within that row group.

class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n=9;
        HashSet<Character>[]row=new HashSet[n];
        HashSet<Character>[]col=new HashSet[n];
        HashSet<Character>[]box=new HashSet[n];

        for(int i=0;i<9;i++){
            row[i]=new HashSet<Character>();
            col[i]=new HashSet<Character>();
            box[i]=new HashSet<Character>();
        }

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                char cel=board[i][j];
                if(cel=='.')
                continue;

                if(row[i].contains(cel))
                return false;

                row[i].add(cel);

                if(col[j].contains(cel))
                return false;

                col[j].add(cel);


                int boxie=3*(i/3)+(j/3);

                if(box[boxie].contains(cel))
                return false;
                box[boxie].add(cel);

            }
        }
                return true;






    }
}
