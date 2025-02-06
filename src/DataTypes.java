public class DataTypes {
    public static void main(String[] args) {
        // Declaration
        // Declaring variable and it's type without setting it equal to a val TYPE IS REQUIRED
        //int age;
        //String name;

        //Assign declared variables to value
        //age = 26;
        // = "Dylan";

        //Declaration and Assignment at the same time
        int age = 10;
        String name = "Dylan";

        //Multi declaration (comma separated), this requires elements to be the same type;
        int num1, num2, num3, num4;

        int intExp = 2_147_483_647; //don't need underscores to serve as commas, MOST COMMON
        byte smallInt = 127;
        short medInt = 30000;
        long hugeInt = 3000000000L; //need to specify Long ints with 'L'

        float deci = 3.14f; //require lower case 'f'
        double veryPrecise = 3.14157265358979;

        char c = 'A'; //single character requires single ' '
        boolean testBool = true; // lower case value


        //Naming Rules
        // valid
//        userName
//        price_2024
//        number1
//        totalAmount$
//        isValidFlag
//
//        invalid
//        1stNumber // Cannot begin with a number
//        final // final is a reserved keyword
//        user-name // Hyphen (-) is not allowed
//        user@name // @ is not allowed

    }
}
