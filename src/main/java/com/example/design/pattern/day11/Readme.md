**代理模式**

-
代理模式就是多出来一个代理类，替原来的对象进行一些操作

- 应用场景

如果已有的方法在使用的时候需要对原有的方法进行改进，此时有两种办法。

1.修改原有的方法来适应。这样违反了“对扩展开放，对修改关闭”的原则。
2.就是采用一个代理类调用原有的方法，且对产生的结果进行控制。这种方法就是采用代理模式。

使用代理模式，可以将功能划分的更加清晰，有助于后期维护


- 代理模式和装饰器模式（异同）

代理模式和装饰器模式非常类似，甚至代码都是类似。二者主要区别主要是：代理模式中，代理类对被代理的对象
有控制权，决定其执行或者不执行。而在装饰器模式中，装饰类对代理对象没有控制权，只能为其增加一层装饰
，以加强装饰对象的功能而已。

代理模式使用到极致就是AOP,这是Spring架构开发必然要用到的技术，代理模式在java开发中俯拾皆是，而装饰器模式
是一个很拘谨的模式，在实际应用中很少。但也有不少框架项目使用了装饰模式，例如在jdk的java.io.*包中
就大量使用了装饰模式。

从实际出发：

代理：偏重因自己无法完成或者自己无需关心，需要他人干涉事件流程，更多的是对对象的控制。

装饰：偏重对原有对象功能的扩展，扩展后对象仍是对象本身。

参考：https://www.jianshu.com/p/c06a686dae39















