public class SortedMatrixSearch {

	public boolean search(int search, int [][] matrix) {
	
		int current=0; //this keeps track of elements of matrix
		int i=0;//row counter
		int j=3;//last column
		boolean found = false;//to determine if value being searched is found in matrix or not
		
		System.out.println("row length: " + matrix.length);
		System.out.println("col length: " + matrix[0].length);
		while(found!=true) {
			//if search is greater than last element in current row
			//ensure that search value is not greater than the last element in the matrix
			if(matrix[i][j] < search && !(search > matrix[matrix.length-1][matrix[0].length-1])) {
				current = matrix[i][j];
				//System.out.println("current in if: "+current);
				if(i+1<matrix.length) i=i+1;//to ensure row index doesn't go out of bounds
				//i=i+1;
			}
			//if search is less than last element in current row
			//ensure that search value is not less than the first element in the matrix
			else if(matrix[i][j] > search && !(search < matrix[i][0])) {
				current = matrix[i][j];
				//System.out.println("current in else if: "+current);
				if(j >0 && j<matrix[0].length)j--;//to ensure column index doesn't go out of bounds
				//j--;
				
			}
			else if (matrix[i][j] == search) {
				current = matrix[i][j];
				found = true;
				//System.out.println("current in else if 2: "+current);
			}
			//if value being searched is not found in the matrix break the loop
			else {
				break;
			}
		}
		//System.out.println("current outside while: "+current+" found: "+ found);
		return found;
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

//fixed bugs in my code by writing test cases and testing code against it
