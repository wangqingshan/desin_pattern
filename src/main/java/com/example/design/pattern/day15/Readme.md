**享元模式**

-
Flyweight(享元抽象类)：一般是接口或者抽象类，定义了享元类的公共方法。这些方法可以分享内部状态的数据，也可
以调用这些方法修改外部状态。

ConcreteFlyweight(具体享元类)：具体享元类实现了抽象享元类的方法，为享元对象开辟了内存空间来保证享元对象的内部数据，
同时可以通过和单例模式结合只创建一个享元对象。

UnshareConcreteFlyweight(非具体享元类)：并不是所有的享元类都需要被共享的，有的享元类不需共享。可以通过
享元类来实例化一个非共享享元对象。

Flyweight(享元工厂类)：享元工厂类创建并且管理享元类，享元工厂类针对享元类来进行编程，通过提供一个享元池进行
享元对象的管理。一般享元池设计成键值对，或者其他的存储结构。当客户端进行享元对象请求时，如果享元池中有
对应的享元对象，则直接返回对应的对象，否则工厂类创建对应享元对象并保存到享元池。

- 优点、缺点

优点：
1.节约系统开销，保证一个常用的对象只有一个。
2.外部状态不会影响内部状态，可以在不同环境下进行共享。

缺点：
1.享元模式是逻辑变得更加复杂，需要将享元对象分出内部和外部状态。
2.为了使对象共享，外部状态在很多情况下是必须有的，当读取外部状态的时明显会增加运行时间。

- 应用场景

1.一个系统有大量细粒度化的对象，占据大量内存。
2.对象大部分属性可以外部化，并且将外部的属性放入到内部属性中来。


















