
import java.util.Arrays;

public class GridPath {
  private int[][] grid;

  public GridPath(int[][] grid) {
    this.grid = grid;
  }

  
 public Location getNextLoc(int row, int col) {

   Location rightLoc = new Location(row, col +1);
   Location belowLoc = new Location(row+1,col);
  

  
   if(col == grid[0].length -1){
     return belowLoc;
   }
   if(row == grid.length-1){
      return rightLoc;
    }
   if(grid[row+1][col] < grid[row][col+1]){
     return belowLoc;
   }
   else{
     return rightLoc;
   }
 
 }
