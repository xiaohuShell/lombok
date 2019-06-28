package pojo;

import lombok.*;

@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)

@EqualsAndHashCode   //作用于类，覆盖默认的equals和hashCode
/**
 * @RequiredArgsConstructor  生成包含final和@NonNull注解的成员变量的构造器；
 * @Data 作用于类上，是以下注解的集合：@ToString @EqualsAndHashCode @Getter @Setter @RequiredArgsConstructor
 * @Builder： 作用于类上，将类转变为建造者模式
 *
 * @Cleanup 自动关闭资源，针对实现了java.io.Closeable接口的对象有效，
 * @SneakyThrows  可以对受检异常进行捕捉并抛出
 */
@AllArgsConstructor //生成全参构造器。
public class Person {
    @NonNull
    private String name;
    private int age;
    private boolean friendly;
}
