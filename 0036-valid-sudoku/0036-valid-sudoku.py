class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        
        #let do it!
        #it's easy!
        
        rows = collections.defaultdict(set)
        cols = collections.defaultdict(set)
        squares = collections.defaultdict(set)
        
        #board[r][c] 0: 1,2,3,4,5,6,7,8
        
        for r in range(9):
            for c in range(9): 
                if board[r][c] == '.':
                    continue
                if board[r][c] in rows[r]:
                    return False
                if board[r][c] in cols[c]:
                    return False
                if board[r][c] in squares[(r//3, c//3)]:
                    return False
                rows[r].add(board[r][c])
                cols[c].add(board[r][c])
                squares[(r//3, c//3)].add(board[r][c]) 
                #defaultdict(<class 'set'>, {(0, 0): {'5', '3'}, (0, 1): {'7'}})
                
        return True
        

   
        