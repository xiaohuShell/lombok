package pojo;

import lombok.Getter;
import lombok.Setter;

public class Animal {
    private String name;
    private int age;
    @Getter
    @Setter
    private boolean funny;
}
