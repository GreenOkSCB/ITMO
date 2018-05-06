package lesson18.annotation;

import java.util.ArrayList;
import java.util.List;

public class User {

    public static enum Permission {
        USER, ADMIN
    }

    private List<Permission> permissionList;
    public List<Permission> getPermissionList(){
        return new ArrayList<Permission>(permissionList);
    }
}
