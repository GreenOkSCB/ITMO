package lesson13;

public class ExceptionBase {

    public static void tryException(){
        String str = null;
//        str.equals("string"); // NullPointerException

//        Integer.parseInt("hgrtres"); // NumberFormatException
        // можно выбросить аналогичное исключение,
        // воспользовавшись ключевым словом throw
//        throw new NumberFormatException("tryException");
        Object string = "90";
        int[] arr = new int[10];

        try {
            if (System.currentTimeMillis()%2==0){
                Integer integer = (Integer) string;
            } else {
                arr[10] = 90;
            }

        }
//        catch (ClassCastException e){
//            System.out.println("integer case: " + e.getMessage());
//        }
////         еще один блок catch
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("arr case: " + e.getMessage());
//        }
//        начиная с java 7 исключения можно группировать
//        через оператор |
//        catch (ClassCastException | ArrayIndexOutOfBoundsException e){
//            System.out.println("case: " + e.getMessage());
//        }

        catch (ClassCastException e){
            System.out.println("integer case: " + e.getMessage());
        }
//        catch (RuntimeException e){
//            System.out.println("All RuntimeException " + e.getMessage());
//        }

        finally {
//            блок, который будет выполнен в любом случае
            System.out.println("Finally block");
        }

        System.out.println("After try catch");
    }

    public static void tryExp2() { //throws Exception
//        throw new Exception("Exception here");

        try {
            throw new Exception("Exception here");
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getCause());

        }
//        throw new Exception("Exception here"); // ошибка
    }

    public static void main(String[] args) { //throws Exception
//        tryException();
        tryExp2();
    }
}
