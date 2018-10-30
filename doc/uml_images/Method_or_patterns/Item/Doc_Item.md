# 3. design pattern 详述

## 3.1 Prototype

​	原型模式（Prototype Pattern）的主要思想是基于现有的对象克隆一个新的对象出来，一般是有对象的内部提供克隆的方法，通过该方法返回一个对象的副本，这种创建对象的方式，相比我们之前说的几类创建型模式还是有区别的，之前的讲述的工厂模式与抽象工厂都是通过工厂封装具体的new操作的过程，返回一个新的对象，有的时候我们通过这样的创建工厂创建对象不值得，特别是以下的几个场景的时候，可能使用原型模式更简单也效率更高。

### 3.1.1 Api描述

在建造给人居住的不同价值等级的房屋时，采用了Prototype设计模式，在BuildingForPeople类中声明了addPrototype()，returnType()，findAndClone()，clone()四个函数。addPrototype()用于添加新的Building原型到已有的列队中；returnType()用于得到当前的实例类型；若当前参数不是Building类型，findAndClone()用于克隆一个Building类型实例；clone()只用于克隆一个Building实例。

### 3.1.2  class diagram

​	![](./prototype_buildingvalue.png)

## 3.2 Singleton

​	在设计模式中，单例模式（Singleton Pattern）相对来说算是比较简单的一种设计模式。适用的场景在于：对于定义的一个类，在整个应用程序执行期间只有唯一的一个实例对象。通过使用单例模式，自行实例化并向这个系统提供这个单一实例的访问方法。根据此单一实例产生的时机不同，可以将其分为懒汉式单例模式、饿汉式单例模式和登记式单例模式。本例为饿汉式单例模式。

### 3.2.1 Api描述

​	定义了FarmAddress(String name)用来获取农场地址这个单例。

### 3.2.2 class diagram

​	![](./singleton_farmaddress.png)

## 3.3 Strategy

​	在策略模式（Strategy Pattern）中，一个类的行为或其算法可以在运行时更改。这种类型的设计模式属于行为型模式。我们创建表示各种策略的对象和一个行为随着策略对象改变而改变的 context 对象。策略对象改变 context 对象的执行算法。

### 3.3.1 Api描述

​	我们通过实现build类，使用不同的建造策略建造不同价值的房子。使用building()接口执行建造的行为，使用setBuildStrat(BuildingType buildingType)设置不同的房屋建造策略，使用doBuilding(BuildingType buildingType)执行建造房屋的行为。

### 3.3.2 class diagram

![](./strategy_buildingvalue.png)



## 3.4 Builder

​	建造者模式（Builder Pattern）使用多个简单的对象一步一步构建成一个复杂的对象，我们使用这种模式的目的在于将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示，这对于设计者来说是一个解耦的过程。其优点在于用户使用简单，并且可以在不需要知道内部构建细节的情况下构建复杂的对象模型，建造者独立而易扩展，便于控制细节风险。缺点在于产品需要有共同点，范围有限制，且如果内部变化复杂，建造类会比较多。

### 3.4.1 Api描述

​        在我们的架构中，对设定建造房屋的长度、宽度、高度三种尺寸时使用了Builder设计模式，首先定义设定尺寸的过程（Builder），分别是SetLength()、SetWidth()、SetHeight()三者，都声明为抽象方法，具体由子类进行实现，然后创建具体的建造者（ConcreteBuilder）具体实现三个抽象函数。

### 3.4.2  class diagram

​	![](C:/Users/Yuning%20Xia/Desktop/DesignPatternProject-master/doc/uml_images/Method_or_patterns/Item/Builder.png)

## 3.5 Factory Method

​	工厂方法模式（Factory Method）又叫虚拟构造器（Virtual Constructor）模式或者多态工厂模式（Polymorphic Factory），在工厂方法模式中，父类负责定义创建对象的公共接口，而子类则负责生成具体的对象，这样做的目的是将类的实例化操作延迟到子类中完成，即定义了一个用于创建对象的接口，由子类来决定究竟应该实例化哪一个类。其优点在于客户代码可以做到与特定应用无关，适用于任何实体类；能连接并行的类层次结构，具有良好的封装性，代码结构清晰且扩展性好。其缺点在于需要Creator和相应的子类作为Factory Method的载体，如果应用模型不需要Creator和子类存在，则需要增加一个类层次。

### 3.5.1 Api描述

​	在我们的架构中，Fertilizer是抽象产品角色，定义产品的接口，而InorganicFertilizer类和OrganicFertilizer类是具体的产品角色，是实现产品接口的具体产品类，抽象工厂角色是FertilizerAbstractFactory类，用来声明工厂方法，返回Fertilizer，而真实的工厂是InorganicFertilizerFactory类和OrganicFertilizerFactory类，实现工厂方法，由客户调用，返回一个实例。

### 3.5.2 class diagram

​	![](C:/Users/Yuning%20Xia/Desktop/DesignPatternProject-master/doc/uml_images/Method_or_patterns/Item/Factory%20Method.png)

## 3.6 Template Method

​	模板方法模式（Template Method）定义一个模板结构，将具体内容延迟到子类去实现，主要作用是在不改变模板结构的前提下在子类中重新定义模板中的内容，它能提高代码复用性 ，将相同部分的代码放在抽象的父类中，而将不同的代码放入不同的子类中，而且实现了反向控制，通过一个父类调用其子类的操作，通过对子类的具体实现扩展不同的行为，符合“开闭原则”，且提取公共部分代码，便于维护，但其缺点在于颠倒了我们平常的设计习惯：抽象类负责声明最抽象、最一般的事物属性和方法，实现类实现具体的事物属性和方法，所以在复杂的项目中可能会带来代码阅读的难度。

### 3.6.1 Api描述

​	在我们的架构中，我们创建了抽象模板结构即建房的步骤，即LayFoundation()、ConstructBuilding()、ExteriorTrim()三个函数分别代表夯实地基、建造建筑、外围环境修葺，然后创建具体模板，分别重写ConstructBuilding()和ExteriorTrim()这两个函数，代表着建造House、AnimalFold、PlantField、Storage这四种建筑的三个步骤中后两个都是各自不同的，需要分别实现这两个函数的具体功能。

### 3.6.2 class diagram

![](C:/Users/Yuning%20Xia/Desktop/DesignPatternProject-master/doc/uml_images/Method_or_patterns/Item/TemplateMethod.png)



