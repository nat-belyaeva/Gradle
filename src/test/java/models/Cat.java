package models;

import lombok.*;

@ToString
@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
//@EqualsAndHashCode
@Data
@Builder
public class Cat {
    private String name;
    private String model;
    private Integer age;
    private Boolean isWhite;

}
