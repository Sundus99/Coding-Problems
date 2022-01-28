public class SortedMatrixSearch {

	public static void main(String[] args) {
		
		int search = 6;
		int current=0; //this keeps track of elements of matrix
		int i=0;//row counter
		int j=3;//last column
		int [][] matrix = {{1,2,3,4},
				   {5,6,7,8},
				   {9,10,11,12}};
		while(current!=search) {
			if(matrix[i][j] < search) {
				current = matrix[i][j];
				System.out.println("current in if: "+current);
				i=i+1;//go to next row
			}
			else if(matrix[i][j] > search) {
				current = matrix[i][j];
				System.out.println("current in else if: "+current);
        			j--;//current row's previous column
			}
		}
	}

}
//my approach to solving this problem:
//To search for a number in the matrix while checking least amount of entries
//I strategize to start from the top right as the matrix is sorted from left to
//right and top to bottom. 
//if the value being searched is less than matrix[i][j] then go to last column of next row
// else if value being searched is greater than matrix[i][j] then this implies
//the number can be found in this row as the element in previous row's last column
//was > value being searched so just need to decrement the column index of current row by 1
//until matrix[i][j] == valule being searched.
//Accomplishing the task in O(n) time complexity rather O(n^2) that checks every element in matrix
//O(n) is more efficient than O(n^2)
