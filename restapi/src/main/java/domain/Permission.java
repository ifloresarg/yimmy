package domain;

/**
 * Created by Ignacio Flores on 22/8/2016.
 */
public class Permission {

    private Long permissionId;
    private String name;

    public Permission() {
    }

    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
