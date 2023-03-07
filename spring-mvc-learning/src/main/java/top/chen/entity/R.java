package top.chen.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Map;

@Data
@ToString
public class R {
    private String message;
    private Map<String,Object> data;
}
