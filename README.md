# DesignPatternDemos


> 设计模式之于代码审计，就像耶路撒冷之于西方。 - r00t4dm

Java设计模式梳理，记录学习过程中的优质demo；

主要参考：
- [HeadFirst设计模式](https://m.douban.com/book/subject/2243615/)
- [Java设计模式](https://github.com/quanke/design-pattern-java)

## 7大原则
```shell
1. 单一职责原则：一个类只负责一项职责（但界限非常模糊，视业务情况而定）
2. 接口隔离原则：优先使用多个隔离接口，而不是使用单个接口（函数式编程）
3. 依赖倒转原则：面向接口编程，高层模块不应该依赖低层模块，二者都应该依赖其抽象
4. 里氏替换原则：任何父类对象出现的地方，都可以用子类对象替换 (子类不可以重写父类中的具体方法)
5. 合成复用原则：尽量使用合成/聚合的方式，而不是使用继承（针对接口编程，而不是针对实现编程）
6. 迪米特原则:  类对自己依赖的类知道的越少越好，陌生的类最好不要以局部变量的形式出现在类的内部（最少知识原则）
7. 开闭原则:    软件实体应对拓展开放，对修改关闭
```

## 设计模式种类

### 创建型 Creational
Spring框架初始化全部实现
```shell
1.工厂模式 Factory 
  由子类决定创建的对象是哪种
  
2.抽象工厂模式 AbstractFactory
  创建多个工厂类继承抽象工厂类

3.单例模式 Singleton
  单例类必须自己创建自己的唯一实例（getInstance），单例类必须给所有其他对象提供这一实例（static field）

4.建造者模式 Builder
  将各种业务类集中起来进行管理，用来创建复合对象，使其具有不同的属性

5.原型模式 Prototype
  以某个对象为原型进行复制、克隆，产生一个和原对象类似的新对象
```

### 行为型 Behavioral
```shell
6.模板方法模式 TemplateMethod (抽象类)
  抽象类中定义一个主方法，再定义1...n个子方法，可以是抽象或实现方法。
  由子类决定如何实现算法过程中的一个步骤。
  子类通过继承抽象类，重写或调用抽象类方法，实现对子类方法的调用。
  
7.中介者模式 Mediator（中间类）  
  降低类类之间的耦合，具体类之间的关系及其方法调用由中介类负责

8.观察者模式 Observer
  让对象能够在状态改变时候被通知（Subject&Observer）

9.访问者模式 Visitor
  分离对象数据结构与行为，适用于数据结构相对稳定算法又易变化的系统
  
10.命令模式 Command
  调用方，传递方，执行方三者解耦，命令封装为对象，请求与执行分开

11.责任链模式 ChainOfResponsibility
  多个对象中每个对象持有对下一个对象的引用并形成链式引用，请求链上传递到某个类决定处理为止，
  可以实现在客户端未知的情况下动态调整系统

12.策略模式 Strategy
  设计接口类统一实现，封装可以互换的行为，并使用委托来决定要使用哪一个

13.迭代器模式 Iterator
  使用迭代器对象顺序访问聚集合中的对象，在对象中游走，而不暴露集合的实现

14.解释器模式 Interpreter（中间类）
  主要用于开发OOP编译器

15.备忘录模式 Memento（类状态）
  保存对象的某个状态，以便在适当的时候恢复对象

16.状态模式 State（类状态）
  对象状态改变时同时改变其实现（典型：权限控制）
  
```

### 结构型 Structural
```shell
17.适配器模式 Adapter
  将类的接口转换成另一种接口，消除接口不匹配所造成的类的兼容性问题。
  主要分为：类的适配器模式（主要）、对象的适配器模式、接口的适配器模式

18.桥接模式 Bridge
  将抽象化与实现化解耦，使得二者可以独立变化（典型：JDBC ）

19.组合模式 Composite
  客户用一致的方式处理对象集合和单个对象

20.装饰模式 Decorator
  给一个对象动态增加新功能，要求装饰对象和被装饰对象实现同一个接口，装饰对象持有被装饰对象的实例属性。应用场景：扩展类功能；动态增加、撤销对象功能

21.外观模式 Facade
  将类和类之间的关系配置到一个Facade类中，降低了类之间的耦合度，“家庭影院”

22.享元模式 Flyweight
    实现对象共享池，以减少内存的开销，通常与工厂模式配合使用（典型：JDBC连接池）

23.代理模式 Proxy
    创建一个代理类替原对象进行或扩展一些操作（满足开闭原则）
```



