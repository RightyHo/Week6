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


