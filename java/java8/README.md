# Java 8 新特性

- Lambda 表达式：允许把函数作为一个方法的参数，使代码更简洁
- Stream API：提供了一种更简单的方法来处理集合数据
- 方法引用：简化 Lambda 表达式的写法，允许直接引用已经存在的方法
- 接口默认方法：允许在接口中定义默认方法，提供更多灵活性
- 新的日期和时间 API：处理时区、时间间隔、日期格式化等
- Optional 类：容器对象，可以包含一个值或者为空

## Lambda 表达式

Java 8 提供了 Lambda 表达式。

```java
package org.example.java8.ch1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Sam", "Peter");
//        Collections.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        });

//        Collections.sort(names, (String a, String b) -> b.compareTo(a));
        
        names.sort((a, b) -> a.compareTo(b));
        
        System.out.println(names);
    }
}

```

可以直接在 Lambda 表达式中访问外部的局部变量

与局部变量相比，我们在 Lambda 表达式中对实例字段和静态变量都有读写访问权限

无法从 Lambda 表达式中访问默认方法

## Stream API

`java.util.stream` 表示能应用在一组元素上一次执行的操作序列。

Steam 操作分为中间操作和最终操作两种，最终操作返回特定类型的计算结果，而中间操作返回 Stream 本身。

Stream 操作可以串行执行或者并行执行。

Filter（过滤） 中间操作，通过一个 predicate 接口来过滤并保留符合条件的元素

Sorted（排序）中间操作，返回排序好的 Stream

Map（映射）中间操作，将元素根据指定的 Function 接口来依次将元素转成另外的对象

Match（匹配）最终操作，允许检测指定的 Predicate 是否匹配整个 Stream

Count（计数）最终操作，返回 Stream 中元素的个数

Reduce（规约）最终操作，通过指定的函数将 Stream 中的多个元素规约为一个元素，规约后的结果是通过 Optional 接口表示的

## 方法引用

Java 8 允许使用关键字 `::` 传递方法或构造函数的引用。

```java
package org.example.java8.ch3;

public class Main {
    public static void main(String[] args) {
        PersonFactory<Person> factory = Person::new;
        Person person = factory.createPerson("Yuhe", "Liu");
        System.out.println(person);
    }
}
```

## 接口默认方法

Java 8 使我们能狗通过使用 `default` 关键字向接口添加非抽象方法实现。

```java
package org.example.java8.ch4;

public interface Formula {
    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}
```

## 新的日期和时间 API

Java 8 在 `java.time` 包下包含了一个全新的日期和时间 API。

- Clock 类提供了访问当前日期和时间的方法，Clock 是时区敏感的
- 某一个特定的时间点也可以使用 `Instant` 类来表示
- 在新 API 中时区使用 ZoneId 来表示
- 可以使用 Instant 代替 Date，LocalDateTime 代替 Calender，DateTimeFormatter 代替 SimpleDateFormat

## Optional 类

Optional 不是函数式接口，而是用于防止 NullPointerException 的工具。

Optional 是一个简单的容器，其值可能是 null 或者不是 null。

```java
package org.example.java8.ch6;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        // of() 非 null 值时，创建一个 Optional
        Optional<String> str = Optional.of("hello");
        // 如果值存在返回 true，否则返回 false
        System.out.println(str.isPresent());
        // 如果有值则将其返回，否则抛出 NoSuchElementException
        System.out.println(str.get());
        // 如果有值则将其返回，否则返回指定的其他值
        System.out.println(str.orElse("world"));
        // 如果有值则调用 consumer，否则不做处理
        str.ifPresent(System.out::println);
    }
}
```

## 参考资料
- [https://javaguide.cn](https://javaguide.cn)