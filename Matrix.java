public class Matrix {
	private int numRows;
	private int numCols;
	private int[][] mtx;

	public  Matrix(int x,int y){
		numRows = x;
		numCols = y;
		mtx = new int[numRows][numCols];
		for(int i=0;i<numRows;i++){
			for(int j=0;j<numCols;j++){
				mtx[i][j] = 1;
			}
		}
	}
	public void setElement(int xIndex,int yIndex,int value){
		if(xIndex < numRows && yIndex < numCols){
			mtx[xIndex][yIndex] = value;
		}
	}
	public void setRow(int rowNum,String str){
		String[] strArray = str.split(",");
		int[] inputArray = new int[strArray.length];
		for(int i=0;i<inputArray.length;i++){
			inputArray[i] = Integer.parseInt(strArray[i]);
		}
		if(rowNum < numRows && inputArray.length < numCols){
			for(int i=0;i<inputArray.length;i++){
				mtx[rowNum][i] = inputArray[i];
			}
		}
	}
	public void setColumn(int colNum,String str){
		String[] strArray = str.split(",");
		int[] inputArray = new int[strArray.length];
		for(int i=0;i<inputArray.length;i++){
			inputArray[i] = Integer.parseInt(strArray[i]);
		}
		if(colNum < numCols && inputArray.length < numRows){
			for(int i=0;i<inputArray.length;i++){
				mtx[i][colNum] = inputArray[i];
			}
		}
	}
	public String toString(){
		String result = "[";
		for(int i=0;i<numRows;i++){
			for(int j=0;j<numCols;j++){
				result = result + String.valueOf(mtx[i][j]) + ",";
			}
			if(i == numRows -1){
				result = result + "]";
			} else {
				result = result + ";";
			}
		}
		return result;
	}




}