## Abstract Factory

​	Abstract Factory 模式提供了一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。

​	优点：十分便捷的划分了不同产品组。

​	缺点：在OCP原则的规范下难以实现产品组内的扩展，但可以实现产品组的扩展。



### API描述

​	场景：我们将该模式运用于植株的种植过程中，PlantFactory实现了AbstractFactory接口，判断输入后可以分别在getRice() ; getCorn() ; getPasture(); 三个具体函数中调用对应类Rice, Corn, Pasture 的构造函数。   

​	

### class diagram

![AbstractFactory_p](.\uml_images\Method_or_patterns\AbstractFactory_p.png)





## Template Method

​	Template Method提供了一种在父类中定义处理流程，在子类中具体实现的处理方式，同时在具体实现时Template Method又允许子类重新定义流程的具体步骤。

​	优点：实现了反向控制和OCP原则，既提高了代码的复用性，又可以便捷的扩展子类群（扩展性），实现无限的可能性。

​	缺点：虽然提高了代码的复用性，但是每一个不同的实现都需要一个新的子类实现，从而提升了系统的复杂度。



### API描述

​	场景：我们定义了植物的基类Plant，并在Plant中定义了施肥函数fertilized( )。在基类Plant之下我们又具体实现了Rice、Corn、Pasture三种具体子类，并且为每个子类的fertilized( )函数进行了重写，从而为不同植物子类实现了的不同施肥方式。



### class diagram 

![AbstractFactory_p](.\uml_images\Method_or_patterns\TemplateMethod_p.png)





## Composite

​	Composite模式属于结构型模式的一种，该模式将对象组合成树形结构，以此来表示对象的“部分-整体”的层次结构。

​	优点：提升了代码的复用性；在逻辑上将树结构中的根节点和叶子节点做同化处理，使高层模块的调用更加简单；经过重写基类Component中的行为函数runAction()，可以使单个对象和复杂对象的使用具有一致性；可以自由的增加节点。

​	缺点：逻辑会变得更加复杂；叶子节点和根节点都是实现类，而不是接口，违反了依赖倒置原则。



### API描述

​	场景：我们将Composite这一模式使用到了植物授粉这一过程中，定义基类ReproductiveOrgan，子类Flower 和Stamen、Pistil。同时Flower 包含Stamen、Pistil。实现了基本的树状结构。	



### class diagram

![AbstractFactory_p](.\uml_images\Method_or_patterns\Composite_p.png)







## State 

​	State模式允许对象在内部状态发生改变时改变它自身的行为，提供了方便的解决复杂对象状态转换的方法、解决了不同状态下行为的封装问题。

​	优点：在逻辑上确定并枚举可能的状态与该状态下对应的行为方法，将状态与行为做逻辑关联，使得高层模块可以直接通过更改状态实现不同行为的选择；多个环境对象可以共享同一个状态模块，实现了代码的复用。

​	缺点：在原有的结构基础上增加了不同的状态类与对象类，但在实现方法上得到了精简；对OCP原则不友好，增加新的状态时必不可少的要更改切换状态的源代码。



### API描述

​	我们以PlantState为基本状态接口，为植物类（Plant）设立了四种成长状态：

| 类名             | 描述       |
| ---------------- | ---------- |
| GrowingState     | 成长阶段   |
| MatureState      | 成熟阶段   |
| HarvestableState | 可收获阶段 |
| DeadState        | 死亡阶段   |

​	四种状态的主要区别在于成长动作moveToNext( ) 方法，同一株植物在不同的成长阶段会有不同的成长方法，如在GrowingState下该方法将会在收到成长命令后输出成长成功的提示，并且重置当前植株的成长状态。



### class diagram

![AbstractFactory_p](.\uml_images\Method_or_patterns\State.png)







## Strategy

​	Strategy模式定义并封装一系列算法，由具体对象根据场景选择不同的策略，从而调用到对应的不同算法。

​	优点：分离具体的算法和客户端，使得客户端可以自由切换算法，算法也可以独立于客户端自由进行更改；避免在同一算法中出现大量的条件判断，而是将原本逻辑复杂的算法拆分成多个结构相对简单的独立算法；算法可扩展性良好。

​	缺点：在结构框架中需要实例化每一个新的策略类，且需要对外暴露所有的策略，复杂化了结构。

​	

### API描述

​	我们为植物提供了多种受粉方式，如自然传粉和人工授粉，分别对应的策略类为SpontaneousPollination和ArtificialPollination。继承自Mediator 的类PollinationMediator将会根据action 的不同，选择不同的策略来为对应植株进行授粉操作。



### class diagram

![AbstractFactory_p](.\uml_images\Method_or_patterns\Strategy_p.png)







## Mediator

​	Mediator解耦多个同事对象之间的复杂交互关系。创建中介者，每个同时对象都用与中介者的交互来替代原本同事对象之间的交互。反过来client则可以通过中介者统一管理所有对象。	

​	优点：解耦多个相似对象之间的复杂交互，从而可以独立的改变他们之间的交互逻辑，从而降低了类结构的复杂度，将多对多模式转化为多对一模式。

​	缺点：原本的同事对象之间交互越复杂，中介者的逻辑就会越复杂。



### API描述

​	我们将中介者模式运用到了植物自然传粉这一行为体系中，在自然传粉的过程中，植物群体之间的雌蕊（Pistil类）与雄蕊（Stamen类）将会直接与中介者（PollinationMediator类）进行交互，在逻辑上利用该中介者封装了雄蕊在植物集群中定位某一植株，进而定位某一雌蕊的过程。



### class diagram

![AbstractFactory_p](.\uml_images\Method_or_patterns\Mediator.png)











​	