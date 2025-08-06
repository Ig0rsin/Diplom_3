package api.models.auth;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoUpdateRequest {
    private String email;
    private String name;
}

/*public class UserInfoUpdateRequest {
    private String email;
    private String name;

    public UserInfoUpdateRequest(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public UserInfoUpdateRequest() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
} */
