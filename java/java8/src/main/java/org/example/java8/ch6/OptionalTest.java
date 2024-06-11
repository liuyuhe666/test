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
