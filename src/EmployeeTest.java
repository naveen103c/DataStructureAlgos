import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;
import java.util.stream.Collectors;


@NoArgsConstructor
@AllArgsConstructor
@Data
class Employee {
    private int id;
    private String name;
    private int age;
}

public class EmployeeTest{
    public static void main(String[] args) {
        Map<Integer,Employee> hmap=new HashMap<>();
        List<String> empList = hmap.entrySet().stream().filter(t -> t.getValue().getAge() > 40)
                .map(t -> t.getValue().getName())
                .collect(Collectors.toList());
        System.out.println(empList);

    }
}
