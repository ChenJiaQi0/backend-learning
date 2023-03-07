package top.chen.entity;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class User {
    private String username;
    private String reason;
    private String gender;
    private String password;

    public User(String username, String gender) {
        this.username = username;
        this.gender = gender;
    }
}
