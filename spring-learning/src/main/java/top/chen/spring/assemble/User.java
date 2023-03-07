package top.chen.spring.assemble;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class User {
    private String username;
    private Integer password;
    private List<String> list;
}
