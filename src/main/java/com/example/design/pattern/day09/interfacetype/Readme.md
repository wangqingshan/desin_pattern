**接口适配器模式**

-
有时写一个接口的中有多个抽象方法，当我们写该接口的实现类时，必须实现该接口的所有方法，这明显比较
费事费时，因为并不是所有的方法都是我们需要的，有时只是需要一些，此处为了解决这个问题，我们引入了
接口的适配器模式，借助于一个抽象类，该抽象类实现了该接口，实现了所有的方法，而我们不和原始的接口打交道
，只是和该抽象类取得联系。所以写一个类，继承该抽象类，重写我们需要的方法就行。

















