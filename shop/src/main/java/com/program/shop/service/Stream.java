package com.program.shop.service;

import com.program.shop.vo.Employee;
import com.program.shop.vo.Student;

import java.util.*;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("1001", "李明", 5000, "male"),
                new Employee("1002", "王明", 7000, "male"),
                new Employee("1003", "张丽", 10000, "female"),
                new Employee("1005", "谢北", 15000, "female"),
                new Employee("1004", "谢楠", 11000, "female"),
                new Employee("1004", "谢楠", 11000, "female")
        };
      List<Employee> list= Arrays.asList(employees);
       System.out.println("-----------------直接用lambda表达式遍历集合--------------");
       list.forEach((e)-> System.out.println(e.toString()));
       System.out.println("----------------用stream结合lambda表达式遍历集合---------------");
        list.stream().forEach((e)-> System.out.println(e.toString()));
         System.out.println("-------------与comparator结合,对集合进行降序升序---double类型的不好使---------------");
      Collections.sort(list,(e1,e2)->e1.getSalary()-e2.getSalary());
      //list.sort((e1,e2)->e1.getSalary().compareTo(e2.getSalary())); compareto好像不好使
      System.out.println(list.toString());
      System.out.println("-------------filter使用,查询集合中所有女性----先拦截筛选再遍历-----------");
      list.stream().filter((e)->Objects.equals(e.getSex(),"female")).forEach((e)-> System.out.println(e.toString()));
      System.out.println("-------------limit使用,查询前两条数据-----------");
      list.stream().limit(2).forEach((e)-> System.out.println(e.toString()));
      System.out.println("-------------distinct使用,去重-----------");
      list.stream().distinct().forEach((e)-> System.out.println(e.toString()));
      System.out.println("-------------skip使用,跳过前n个数据-----------");
      list.stream().skip(2).forEach((e)-> System.out.println(e.toString()));
      System.out.println("-------------遍历集合的某一个参数-----------");
      //一般形式
      list.stream().forEach(e-> System.out.println(e.getSalary()));
      //使用map映射
      list.stream().map(e -> e.getSalary()).forEach(e -> System.out.println(e));
      //flatmap扁平化处理  遍历list集合里的两个数组
        Employee[] employees1 = {
                new Employee("1001", "李明", 5000, "male"),
                new Employee("1002", "王明", 7000, "male"),
                new Employee("1003", "张丽", 10000, "female"),
                new Employee("1004", "谢楠", 11000, "female")
        };
        Employee[] employees2 = {
                new Employee("1005", "Marry", 5000, "male"),
                new Employee("1006", "Linda", 7000, "male"),
                new Employee("1007", "Cris", 10000, "female")
        };
      List<Employee[]> list1 = new ArrayList<>();
    list1.add(employees1);
    list1.add(employees2);
    System.out.println("老方法只能遍历一次");
    list1.forEach(e-> System.out.println(e.toString()));
    System.out.println("flatmap遍历集合之后,再遍历数组   Arrays.stream()将数组变为流");
    list1.stream().flatMap(e -> Arrays.stream(e)).forEach(e -> System.out.println(e.toString()));
    System.out.println("遍历集合并按照salary的顺序就行排序");
    list.stream().map(e->e.getSalary()).sorted().forEach(e-> System.out.println(e.toString()));
    System.out.println("按照compare的顺序进行排序并遍历");
    list.stream().map(e->e.getSalary()).sorted((e1,e2)->e2.compareTo(e1)).forEach(e-> System.out.println(e.toString()));
    System.out.println("判断有没有500大");
    System.out.println(list.stream().allMatch(e -> e.getSalary() > 500));
    System.out.println(list.stream().anyMatch(e -> e.getSalary() > 500));
    System.out.println(list.stream().noneMatch(e -> e.getSalary() > 500));
    System.out.println("返回第一个元素");
    System.out.println(list.stream().findFirst().toString());
    System.out.println("返回任意元素");
    System.out.println(list.stream().findAny().toString());
    System.out.println("返回数量");
    System.out.println(list.stream().count());
    System.out.println("最大最小值");
    System.out.println(list.stream().max((e1,e2)->{
            if(e1.getSalary()>e2.getSalary())return 1;
            else return -1;
        }).toString());
    System.out.println(list.stream().min((e1,e2)->{
            if(e1.getSalary()>e2.getSalary())return 1;
            else return -1;
        }));
    System.out.println("归约操作 x,y带面前面一个数和后面一个数");
    String reduce1 = list.stream().map(e -> e.getName()).reduce("", (x, y) -> x + "," + y);
    System.out.println(reduce1.substring(1));
    Optional<String> reduce2= list.stream().map(e -> e.getName()).reduce((x, y) -> x + "," + y);
    System.out.println(reduce2.get());
    System.out.println("Collector的用语");
    List<String> collect = list.stream().map(e -> e.getName()).collect(Collectors.toList());
    collect.forEach(System.out::println);
    System.out.println("--------------------------");
    HashSet<String> collect1 = list.stream().map(e -> e.getName()).collect(Collectors.toCollection(HashSet::new));
    collect1.forEach(System.out::println);
    System.out.println("-------------分组----------------------");
    Map<String, List<Employee>> group = list.stream().collect(Collectors.groupingBy(e -> e.getName()));
    System.out.println(group);
    }
}
