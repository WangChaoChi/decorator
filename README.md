# decorator
#### 下面是以上各个类的意义：<br>
1: Ingredient（成分）：所有类的父类，包括它们共有的方法，一般为抽象类且方法都有默认的实现，也可以为接口。 <br> 
它有Bread和Decorator两个子类。这种实际不存在的，系统需要的抽象类仅仅表示一个概念，图中用红色表示。 <br> <br>
2: Bread（面包）：就是我们三明治中必须的两片面包。它是系统中最基本的元素，也是被装饰的元素，和IO中的媒质 <br>
流（原始流）一个意义。在装饰器模式中属于一类角色，所以其颜色为紫色。<br><br>
3: Decorator（装饰器）：所有其它成分的父类，这些成分可以是猪肉、羊肉、青菜、芹菜。这也是一个实际不存在的类，<br>
仅仅表示一个概念，即具有装饰功能的所有对象的父类。图中用蓝色表示。 <br><br>
4: Pork（猪肉）：具体的一个成分，不过它作为装饰成分和面包搭配。 <br><br>
5: Mutton（羊肉）：同上。<br><br>
6: Celery（芹菜）：同上。<br><br>
7: Greengrocery（青菜）：同上。<br><br>
#### 总结一下装饰器模式中的四种角色：<br>
1.被装饰对象（Bread）； <br>
2.装饰对象（四种）； <br>
3.装饰器（Decorator）； <br>
4.公共接口或抽象类（Ingredient）。 <br>
其中1和2是系统或者实际存在的，3和4是实现装饰功能需要的抽象类。 <br>
