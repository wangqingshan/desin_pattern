**备忘录模式**

- 概述

备忘录模式又叫快照模式或Token模式，是对象的行为模式。备忘录对象是一个用来存储另外一个对象内部状态快照的对象。备忘录模式的用意是在不破坏封装的条件下
将一个对象捕捉住，并外部化，存储起来，从而可用在将来合适的时候把这个对象还原到存储起来的状态。备忘录模式常常与命令模式和迭代模式一起使用。

- 涉及角色

备忘录角色、发起人角色、负责人角色。

    Originator(发起人)：负责创建一个备忘录Memento，用以记录当前时刻自身的内部状态，并可使用备忘录恢复内部状态。Originator可以根据需要决定
    Memento存储自己的哪些内部状态
      
    Memento(备忘录)：负责存储Originator对象的内部状态，并可以防止Originator以外的其他对象访问备忘录。备忘录有两个接口：Caretaker只能看到备忘录的窄接口
    ，他只能讲备忘录传递给其他对象。Originator却可以看到备忘录的宽接口。允许它访问返回到先前状态所需要的所有数据。
    
    Caretaker(管理者)：负责备忘录Memento，不能对Memento内容进行访问或者操作。
    
备忘录有两个等效的接口：

　　●　　窄接口：负责人（Caretaker）对象（和其他除发起人对象之外的任何对象）看到的是备忘录的窄接口(narrow interface)，这个窄接口只允许它把备忘录对象传给其他的对象。

　　●　　宽接口：与负责人对象看到的窄接口相反的是，发起人对象可以看到一个宽接口(wide interface)，这个宽接口允许它读取所有的数据，以便根据这些数据恢复这个发起人对象的内部状态。  
























