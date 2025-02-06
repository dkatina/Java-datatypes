public class DataTypes {

    public static int addNumber(int x){
        int y = 2; //local to addNum
        return x + y; //returning int type
    }

    public static void main(String[] args) {
        addNumber(3);
        //System.out.println(y); //y is outside the scope it was defined in.
    }
}
