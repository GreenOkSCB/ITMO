package lesson13;

public class TstExceptions {
    public static String getStr(String string) throws CheckedException{
        if (string.length() < 4){
            throw new CheckedException("Слишком короткая строка");
        }
        return string;
    }

    public static int getInt(int i){
        if (i < 4){
            throw new UncheckedException("Слишком маленькое число");
        }
        return i;
    }



    public static void main(String[] args) {
        try {
            System.out.println(getStr("wow"));
        }
        catch (CheckedException e){
            try {
                throw new CheckedException("CheckedException", e);
            } catch (CheckedException e1) {
                System.out.println("cause: " + e1.getCause());
                e1.printStackTrace();
            }
//            System.out.println(e.getMessage());
        }

//        System.out.println(getInt(7));
//        System.out.println(getInt(2));
    }
}
