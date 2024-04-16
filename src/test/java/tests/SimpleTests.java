package tests;


import com.fasterxml.jackson.databind.ObjectMapper;
import models.Cat;
import models.People;
import org.junit.jupiter.api.*;
import tests.utils.JsonHelper;


import java.io.File;
import java.io.IOException;
@Tag("API")
public class SimpleTests {

    @Test
    public void testTwoPlusTwoEqualFour() throws IOException {
//         ObjectMapper objectMapper = new ObjectMapper();
//         File file = new File("src/test/resources/stas.json");
//         People people = objectMapper.readValue(file, People.class);
//         System.out.println(people.getName());
//         System.out.println(people.getAge());
//         System.out.println(people.getSex());
//
//         File cat = new File("src/test/resources/cat.json");
//         Cat barsik = objectMapper.readValue(cat, Cat.class);
//         System.out.println(barsik);
//
//
//         People sasha = new People("sasha", 10, "female");
//            String json = objectMapper.writeValueAsString(sasha);
//            System.out.printl(json);

//    Cat cat = JsonHelper.fromJson("src/test/resources/cat.json", Cat.class);
//    People people = JsonHelper.fromJson("src/test/resources/stas.json", People.class);
//
//    System.out.println(cat);
//    System.out.println(people);
//
//    System.out.println(JsonHelper.toJson(cat));
//    System.out.println(JsonHelper.toJson(people));
//    }
        Cat cat = Cat.builder()
                .age(1)
                .isWhite(true)
                .name("Tom").build();

//        int realAge = cat.getAge() + 10;

       /* Cat cat1 = new Cat("Cat1","Bel", 1, true);
        System.out.println(cat);
        System.out.println(cat1);
        System.out.println(cat.equals((cat1)));*/

    }
}
