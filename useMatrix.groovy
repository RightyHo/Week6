System.out.println("How many rows?");
int x = Integer.parseInt(System.console().readLine());
System.out.println("How many columns?");
int y = Integer.parseInt(System.console().readLine());

Matrix cMat = new Matrix(x,y);

System.out.println("Set Element - Row Num: ");
int rNum = Integer.parseInt(System.console().readLine());
System.out.println("Set Element - Column Num: ");
int cNum = Integer.parseInt(System.console().readLine());
System.out.println("What value to you want there?: ");
int val = Integer.parseInt(System.console().readLine());

cMat.setElement(rNum,cNum,val);

System.out.println("Set Row - Row Num: ");
int row = Integer.parseInt(System.console().readLine());
System.out.println("Key in a string of integers of length " + y + " and separate with commas: ");
String s = System.console().readLine();

cMat.setRow(row,s);

System.out.println("Set Column - Column Num: ");
int column = Integer.parseInt(System.console().readLine());
System.out.println("Key in a string of integers of length " + x + " and separate with commas: ");
String sCol = System.console().readLine();

cMat.setColumn(column,sCol);

String pOut = cMat.toString();

System.out.println(pOut);

cMat.prettyPrint();

System.out.println("This Array should be marked as symmetrical...");
Matrix symArray = new Matrix(1,7);
symArray.setRow(0,"1,3,5,7,5,3,1");
symArray.prettyPrint();
if(symArray.symmetry()){
	System.out.println("Indeed that array was symmetrical!");
} else {
	System.out.println("That array was NOT symmetrical!");
}

System.out.println("This Matrix should be marked as symmetrical...");
Matrix symMatrix = new Matrix(4,4);
symMatrix.setRow(0,"2,4,6,8");
symMatrix.setRow(1,"4,9,3,7");
symMatrix.setRow(2,"6,3,6,6");
symMatrix.setRow(3,"8,7,6,5");
symMatrix.prettyPrint();
if(symMatrix.symmetry()){
	System.out.println("Indeed that Matrix was symmetrical!");
} else {
	System.out.println("That Matrix was NOT symmetrical!");
}
if(symMatrix.isTri()){
	System.out.println("That Matrix was triangular!");
} else {
	System.out.println("That Matrix was NOT triangular!");
}

System.out.println("This Matrix should be marked as Triangular...");
Matrix triMatrix = new Matrix(3,3);
triMatrix.setRow(0,"2,4,6");
triMatrix.setRow(1,"0,3,7");
triMatrix.setRow(2,"0,0,8");
triMatrix.prettyPrint();
if(triMatrix.isTri()){
	System.out.println("That Matrix was triangular!");
} else {
	System.out.println("That Matrix was NOT triangular!");
}