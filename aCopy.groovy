ArrayCopier aCopy = new ArrayCopier();
int[] smlArray = [5,10,15];
int[] medArray = [2,4,6,8,10];
int[] lrgArray = [1,2,3,4,5,6,7,8];
int[] changeArray = [11,11,11,11,11];
System.out.println("The result of copying the same size arrays is: ")
int[] sameAns = aCopy.copy(medArray,changeArray);
System.out.println(sameAns);
System.out.println("The result of copying when the source array is longer is: ")
int[] longAns = aCopy.copy(lrgArray,changeArray);
System.out.println(longAns);
System.out.println("The result of copying when the source array is shorter is: ")
int[] shtAns = aCopy.copy(smlArray,changeArray);
System.out.println(shtAns);