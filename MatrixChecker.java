public class MatrixChecker {

	private	int xLength;
	private	int yLength;

	public	MatrixChecker(){
		xLength = 0;
		yLength = 0;
	}
	public	boolean	isSymmetrical(int[] checkArray){
		System.out.println("check array symetry method was called");	//debugging
		boolean result = true;
		xLength = checkArray.length;
		for(int i=0;i<xLength/2;i++){
			if(checkArray[i] != checkArray[xLength - (i + 1)]){
				result = false;
				break;
			}
		}
		return result;
	}
	public	boolean	isSymmetrical(int[][] checkMatrix){
		System.out.println("check MATRIX symetry method was called");	//debugging
		boolean result = true;
		xLength = checkMatrix[0].length;
		yLength = checkMatrix[1].length;
		for(int i=0;i<xLength;i++){
			for(int j=0;j<yLength;j++){
				if(checkMatrix[i][j] != checkMatrix[j][i]){
					result = false;
					break;
				}
			}
		}
		return result;
	}

	public	boolean	isTriangular(int[][] checkTri){
		boolean result = true;
		xLength = checkTri[0].length;
		yLength = checkTri[1].length;
		for(int i=0;i<xLength;i++){
			for(int j=0;j<yLength;j++){
				if(i > j){
					if(checkTri[i][j] != 0){
						result = false;
						break;
					}
				}
			}
		}
		return result;
	}



}