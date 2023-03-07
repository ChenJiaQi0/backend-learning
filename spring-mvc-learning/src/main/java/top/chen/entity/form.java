package top.chen.entity;

import lombok.Data;

import java.util.List;

@Data
public class form {
    private String name;
    private String course;
    private List<Integer> purpose;
}
