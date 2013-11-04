//main program in Groovy
System.out.println("Please key in an integer: ");
int num1 = Integer.parseInt(System.console().readLine());
System.out.println("Now please key in another integer: ");
int num2 = Integer.parseInt(System.console().readLine());
Calculator calc = new Calculator(num1,num2);
int addTest = calc.add(num1,num2);
int minusTest = calc.subtract(num1,num2);
int timesTest = calc.multiply(num1,num2);
double divideTest = calc.divide(num1,num2);
int modTest = calc.modulus(num1,num2);

