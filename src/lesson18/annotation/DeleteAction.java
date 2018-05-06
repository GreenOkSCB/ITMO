package lesson18.annotation;

@PermRequired(User.Permission.ADMIN)
public class DeleteAction {
    public void delete(User user){}
}
