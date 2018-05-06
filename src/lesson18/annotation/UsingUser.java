package lesson18.annotation;

public class UsingUser {
    public static void main(String[] args) {
        User user = new User();
        Class<?> actionClass = DeleteAction.class;


        PermRequired permRequired = actionClass.
                getAnnotation(PermRequired.class);


        if (permRequired != null){
            if (user != null && user.
                    getPermissionList().
                    contains(permRequired.value())) {
                // some code
            }
        }

    }
}
