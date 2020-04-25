## 模板方法模式的定义
模板方法模式（Template Method Pattern）是如此简单，以致让你感觉你已经能够掌握其精髓了。其定义如下：
>Define the skeleton of an algorithm in an operation,deferring some steps to subclasses.Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.（定义一个操作中的算法的框架，而将一些步骤延迟到子类中。使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。）

模板方法模式的通用类图如下所示：

![模板方法模式的通用类图](https://gitee.com/uploads/images/2018/0518/103524_3fbf2dd6_737082.png "模板方法模式的通用类图")

模板方法模式确实非常简单，仅仅使用了Java的继承机制，但它是一个应用非常广泛的模式。其中，AbstractClass叫做抽象模板，它的方法分为两类：
#### 基本方法
基本方法也叫做基本操作，是由子类实现的方法，并且在模板方法被调用。

#### 模板方法
可以有一个或几个，一般是一个具体方法，也就是一个框架，实现对基本方法的调度，完成固定的逻辑。

注意：**为了防止恶意的操作，一般模板方法都加上final关键字，不允许被覆写。**

在类图中还有一个角色：具体模板。ConcreteClass1和ConcreteClass2属于具体模板，实现父类所定义的一个或多个抽象方法，也就是父类定义的基本方法在子类中得以实现。

---

## 模板方法模式的应用
### 模板方法模式的优点

#### 封装不变部分，扩展可变部分
把认为是不变部分的算法封装到父类实现，而可变部分的则可以通过继承来继续扩展。在悍马模型例子中，是不是就非常容易扩展？例如增加一个H3型号的悍马模型，很容易呀，增加一个子类，实现父类的基本方法就可以了。

#### 提取公共部分代码，便于维护
我们例子中刚刚走过的弯路就是最好的证明，如果我们不抽取到父类中，任由这种散乱的代码发生，想想后果是什么样子？维护人员为了修正一个缺陷，需要到处查找类似的代码！

#### 行为由父类控制，子类实现
基本方法是由子类实现的，因此子类可以通过扩展的方式增加相应的功能，符合开闭原则。

### 模板方法模式的缺点
按照我们的设计习惯，抽象类负责声明最抽象、最一般的事物属性和方法，实现类完成具体的事物属性和方法。但是模板方法模式却颠倒了，抽象类定义了部分抽象方法，由子类实现，子类执行的结果影响了父类的结果，也就是子类对父类产生了影响，这在复杂的项目中，会带来代码阅读的难度，而且也会让新手产生不适感。

### 模板方法模式的使用场景
- 多个子类有公有的方法，并且逻辑基本相同时。
- 重要、复杂的算法，可以把核心算法设计为模板方法，周边的相关细节功能则由各个子类实现。
- 重构时，模板方法模式是一个经常使用的模式，把相同的代码抽取到父类中，然后通过钩子函数（见“模板方法模式的扩展”）约束其行为。

---

## 最佳实践
初级程序员在写程序的时候经常会问高手“父类怎么调用子类的方法”。这个问题很有普遍性，反正我是被问过好几回，那么父类是否可以调用子类的方法呢？我的回答是能，但强烈地、极度地不建议这么做，那该怎么做呢?

- 把子类传递到父类的有参构造中，然后调用。
- 使用反射的方式调用，你使用了反射还有谁不能调用的？！
- 父类调用子类的静态方法。

这三种都是父类直接调用子类的方法，好用不？好用！解决问题了吗？解决了！项目中允许使用不？不允许！我就一直没有搞懂为什么要用父类调用子类的方法。如果一定要调用子类，那为什么要继承它呢？搞不懂。其实这个问题可以换个角度去理解，父类建立框架，子类在重写了父类部分的方法后，再调用从父类继承的方法，产生不同的结果（而这正是模板方法模式）。这是不是也可以理解为父类调用了子类的方法呢？你修改了子类，影响了父类行为的结果，曲线救国的方式实现了父类依赖子类的场景，模板方法模式就是这种效果。

模板方法在一些开源框架中应用非常多，它提供了一个抽象类，然后开源框架写了一堆子类。在《××× In Action》中就说明了，如果你需要扩展功能，可以继承这个抽象类，然后覆写protected方法，再然后就是调用一个类似execute方法，就完成你的扩展开发，非常容易扩展的一种模式。