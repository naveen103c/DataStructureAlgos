package Java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CodeDecodeStream {
    public static void main(String[] args) throws Exception {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1,"John", "Sales", 23,50000.0, 5));
        employeeList.add(new Employee(2,"Jane1", "Marketing", 20,60000.0, 8));
        employeeList.add(new Employee(3,"Jane2", "Sales", 23,70000.0, 7));
        employeeList.add(new Employee(4,"Jane3", "Tech", 40,95000.0, 3));
        employeeList.add(new Employee(5,"Jane4", "Tech", 23, 80000.0, 6));

        System.out.println(groupingByAge(employeeList));
        System.out.println(sortingByAge(employeeList));
        System.out.println(nameWithNumber(employeeList));
        System.out.println(orElseThrowExample(employeeList));
        System.out.println(sortEmployeeOnSalartDesc(employeeList));
        sortEmployeeOnNameDesc(employeeList);

        int[] arr1={1,2,3,4,5};
        int[] arr2={4,5,6,7,8};
        findCommon(arr1,arr2);
        reverseGivenArrayInPlace(arr1);

        String fruit[]={"apple","banana","pineapple"};
        findLengthOfLongest(fruit);
    }

    private static void findLengthOfLongest(String[] fruit) {
        Integer integer = Arrays.stream(fruit).map(t -> t.length()).sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println(integer);
    }

    private static void reverseGivenArrayInPlace(int[] arr1) {
        int mid = arr1.length / 2;
        IntStream.range(0,mid).forEach(i->{
            int temp=arr1[i];
            arr1[i]=arr1[arr1.length-i-1];
            arr1[arr1.length-i-1]=temp;
        });
        System.out.println(arr1);
    }

    private static void findCommon(int[] arr1, int[] arr2) {
        Set<Integer> set=new HashSet<>();
        Set<Integer> collect = Arrays.stream(arr1).filter(t -> Arrays.stream(arr2).anyMatch(t1 -> t == t1)).boxed().collect(Collectors.toSet());
        System.out.println(collect);
    }

    private static void sortEmployeeOnNameDesc(List<Employee> employeeList) {
        System.out.println("sortEmployeeOnNameDesc");
        employeeList.stream()
//                .sorted(Comparator.comparing(t->t.getName()))
//                .sorted((t1,t2)->(t2.getName().compareTo(t1.getName())))
                .sorted((t1,t2)->(t1.getName().compareTo(t2.getName())))
                .forEach(System.out::println);
    }

    private static Map<String, Double> sortEmployeeOnSalartDesc(List<Employee> employeeList) {
        System.out.println("sortEmployeeOnSalartDesc");
        Map<String, Double> collect = employeeList.stream()
                .sorted(Comparator.comparingDouble(t -> t.getSalary()))
                .collect(Collectors.groupingBy(t -> t.getName()))
                .entrySet().stream()
                .collect(Collectors.toMap(t -> t.getKey(), t -> t.getValue().get(0).getSalary()));
        System.out.println(collect);
        employeeList.stream()
//                .sorted(Comparator.comparingDouble(t -> t.getSalary()))
//                .sorted((t1,t2)-> (int) (t1.getSalary()- t2.getSalary()))
                .sorted((t1,t2)-> (int) (t2.getSalary()- t1.getSalary()))
                .forEach(t-> System.out.println(t.getSalary()));
        return collect;
    }

    private static Integer orElseThrowExample(List<Employee> employeeList) throws Exception {
        Integer res=0;
//        try{
        System.out.println("orElseThrowExample");
//        System.out.println(employeeList.stream().map(t->t.getAge()).filter(t->t>100).findFirst().orElseThrow());
//             res= employeeList.stream().map(t -> t.getAge()).filter(t -> t > 100).findFirst().orElseThrow(() -> new Exception("No age greater thann 11"));

//            res= employeeList.stream().map(t -> t.getAge()).filter(t -> t > 100).findFirst().orElseThrow(() -> new RuntimeException("No age greater thann 11"));        }catch (Exception e){
//            System.out.println(res+":exception occured :"+e);
//        }
        return res;
    }

    private static Map<String, Long> nameWithNumber(List<Employee> employeeList) {
        System.out.println(employeeList.stream().collect(Collectors.groupingBy(t->t.getName()))
                .entrySet().stream().collect(Collectors.toMap(t->t.getKey(),t->t.getValue().size()))
                .entrySet().stream().filter(t->t.getValue()>1).collect(Collectors.toList()));
        System.out.println(employeeList.stream().collect(Collectors.groupingBy(t->t.getName(),Collectors.counting()))
                .entrySet().stream().filter(t->t.getValue()>2).collect(Collectors.toList()));
        List<String> nameList = employeeList.stream().map(t -> t.getName()).collect(Collectors.toList());
        System.out.println(nameList.stream().filter(i->Collections.frequency(nameList,i)>1).collect(Collectors.toSet()));
        Map<String, Long> hmap = employeeList.stream().collect(Collectors.groupingBy(t -> t.getName(), Collectors.counting()));
        return hmap;
    }

    private static List<Integer> sortingByAge(List<Employee> employeeList) {
        Set<String> set=new HashSet<>();
        System.out.println(employeeList.stream().map(t->t.getAge()).sorted().skip(1).findFirst().get());
        System.out.println(employeeList.stream().map(t->t.getAge()).sorted().skip(1).limit(2).collect(Collectors.toList()));
        System.out.println(employeeList.stream().map(t->t.getName().toUpperCase()).sorted().collect(Collectors.joining(",")));
        System.out.println(employeeList.stream().map(t->t.getName().toUpperCase()).sorted().filter(t->!set.add(t)).distinct().collect(Collectors.joining(",")));

        return employeeList.stream().map(t->t.getAge()).sorted().collect(Collectors.toList());
    }

    private static Map<Integer, Set<Employee>> groupingByAge(List<Employee> employeeList) {
        Map<Integer, Set<Employee>> hashMap = employeeList.stream().collect(Collectors.groupingBy(t -> t.getAge(),Collectors.toSet()));

        //sorted
        Map<Integer, Set<Employee>> hashMap2 = employeeList.stream().collect(Collectors.groupingBy(t -> t.getAge(),TreeMap::new,Collectors.toSet()));
        hashMap2 = employeeList.stream().collect(Collectors.groupingBy(t -> t.getAge(),
                ()->new TreeMap<>()
//                TreeMap::new
                , Collectors.toSet()));
        Map<Integer, Map<Integer, Employee>> hashMap1 = employeeList.stream().collect(Collectors.groupingBy(t -> t.getAge(), Collectors.toMap(t -> t.getId(), t -> t)));
        return hashMap2;
    }

}
