package seminars.first.Calculator;

/* public class Calculator {
    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    // HW1.1: Придумайте и опишите (можно в псевдокоде) функцию извлечения корня и
    // необходимые проверки для него используя граничные случаи
    public static double squareRootExtraction(double num) {
        //  0
        //  Отрицательные числа
        //  Дробные значения корней
        //  Целые
        if (num < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
        return Math.sqrt(num);
    }*/

// Нужно написать в калькуляторе метод вычисления суммы покупки со скидкой и проверить его, используя AssertJ
// Примерная сигнатура и тело метода:
/* public static double calculatingDiscount(double purchaseAmount,int discountAmount){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your purchase amount: ");
        purchaseAmount=sc.nextDouble();
        System.out.println("Enter your discount amount: ");
        discountAmount=sc.nextDouble();
        if(purchaseAmount< 0){
        throw new ArithmeticException("The price cannot be less than 0");
        }

        if(discountAmount==0){
        return purchaseAmount;
        }else if(discountAmount==100){
        return 0;
        }else if(discountAmount< 0){
        throw new ArithmeticException("The discount cannot be less than 0 %");
        }else if(discountAmount>100){
        throw new ArithmeticException("The discount cannot exceed 100 %”);
        }

        else{
        return purchaseAmount-(purchaseAmount*discountAmount)/100;
        }
        }
        */
