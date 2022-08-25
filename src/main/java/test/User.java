package test;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Builder
public class User {

    private String id;
    private String name;
    private Integer age;
    private String email;
}
