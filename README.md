# DesignModuleForJava
设计模式，语言为java（把以前工作设计模式的总结保存下来）

不断的更新将各种设计模式和几大原则慢慢的更新出来

常用的有23中设计模式：
1、单例模式
单例模式分为懒汉模式和饿汉模式

* 单例模式---饿汉模式----可以理解为：实例早于调用之前 
 * 1、饿汉模式是线程安全
 * 2、饿汉模式加载类时比较慢，获取对象的时候比较快
 
 * 单例模式的---懒汉模式---可以理解为调用早于实例之前
 * 1、线程不安全的
 * 2、加载类的速度快，获取对象的速度慢
 
 2、观察者模式
 
 #1、观察者模式的定义：
也叫发布订阅者模式，定义了一种一对多的依赖关系，使得每当一个对象改变状态，则所有以来于它的对象都会得到通知并被自动更新。
#2、观察者模式所表现出来的需求图

#3、根据需求图所设定的类图

#4、观察者模式的优点和缺点
优点：
--1、被观察者和观察则之间实现了抽象耦合；
--2、形成了一套的触发机制，符合单一职责原则，即每个类都是担负起单一的职责。
缺点：
观察者模式需要考虑一下开发效率和运行效率的问题，因为过度的抽象，会增加开发和调试的难度，而且java消息的通知默认是顺序执行的，当其中一个卡壳的话，会影响整体的执行效率。在这种情况下，一般考虑采用异步的方式。
#5、在真是世界中我们会对观察者模式进行改造和改装
主要涉及一下3个方面：
（1）观察者和倍观察者之间的消息沟通
（2）观察者响应的方式：实现观察者快速的响应的方法：多线程技术和缓存技术；
（3）被观察者尽量的自己做主：在被观察者中实现自己决定是否通知观察者，而不是什么都通知给观察者后由观察者判断是否要消费此通知。
#6、学习下java中观察者模式实现的代码
#7、观察者模式举例
（1）文件系统：新建一个文件以后，这个动作会通知磁盘目录增加该目录，并通知磁盘管理器减少磁盘的空间。这个时候文件就是被观察者，而磁盘目录和磁盘管理器就是观察者。
（2）ATM取钱：当输入密码多次错误时就会被吞卡，这个时候会触发摄像头拍照，同时通知监控系统，吞卡发生了

