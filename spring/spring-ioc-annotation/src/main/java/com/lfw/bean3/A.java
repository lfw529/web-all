package com.lfw.bean3;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
public class A {
    public A() {
        System.out.println("A 的无参数构造方法打执行");
    }
}

@Controller
class B {
    public B() {
        System.out.println("B 的无参数构造方法打执行");
    }
}

@Service
class C {
    public C() {
        System.out.println("C 的无参数构造方法打执行");
    }
}

@Repository
class D {
    public D() {
        System.out.println("D 的无参数构造方法打执行");
    }
}

@Controller
class E {
    public E() {
        System.out.println("E 的无参数构造方法打执行");
    }
}

@Controller
class F {
    public F() {
        System.out.println("F 的无参数构造方法打执行");
    }
}
