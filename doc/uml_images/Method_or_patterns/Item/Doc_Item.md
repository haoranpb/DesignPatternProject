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



