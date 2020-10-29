package com.java.october;

/*
 * Given a N by M matrix of numbers, print out the matrix in a clockwise spiral.
 * 
 * [[1,  2,  3,  4,  5],
 [6,  7,  8,  9,  10],
 [11, 12, 13, 14, 15],
 [16, 17, 18, 19, 20]]
 
 Output: 
 1
2
3
4
5
10
15
20
19
18
17
16
11
6
7
8
9
14
13
12
 */

public class October29th {

	public static void main(String[] args) {

		int mat[][] = { { 1,  2,  3,  4,  5 }, 
                		{ 6,  7,  8,  9,  10 }, 
                		{ 11, 12, 13, 14, 15 },
                		{ 16, 17, 18, 19, 20 }}; 
		
		/*int mat[][] = { { 1,2,3 }, 
        		{ 4,5,6 }, 
        		{ 7,8,9 }
        		}; */
		
		
//		printMatrix(mat);
		//Column : mat[1].length
		//row: mat.length
		int row = mat.length;
		int column = mat[1].length;
		
		printMatrixInSpiralForm(row,column,mat);
	}
	
	public static void printMatrix(int mat[][]) {

		// Loop through all rows
		for (int i = 0; i < mat.length; i++){
			
			// Loop through all elements of current row
			for (int j = 0; j < mat[i].length; j++){
				System.out.print(mat[i][j] + "  ");
			}
//			System.out.println("\n");
		}

	}
	
	public static void printMatrixInSpiralForm(int row, int column,int mat[][]) {
		
		int i=0;
		int first_row = 0;
		int first_column = 0;
		int last_row = row -1;
		int last_column = column-1;
		
		while(first_row<=last_row && first_column<= last_column){
			
			for(i=first_column;i<=last_column;i++){
				System.out.println(mat[first_row][i]);
			}
			first_row++;
			
			
			for(i=first_row; i<=last_row;i++){
				System.out.println(mat[i][last_column]);
			}
			last_column--;
			
			if(first_row<=last_row){
				for(i=last_column;i>=first_column;i--){
					System.out.println(mat[last_row][i]);
				}
				last_row--;
			}
			
			
			if(first_column<=last_column){
				
				for(i=last_row;i>=first_row;i--){
					System.out.println(mat[i][first_column]);
				}
				
				first_column++;
			}
			
			
			
		}

		

	}

}
