### 关于Activity的启动模式(android:launchMode)这个话题，网上有不计其数的文章阐述，其实这个配置说明在Android官方文
档里[Activity的清单配置说明](https://developer.android.com/guide/topics/manifest/activity-element.html#lmode)里
已经说的非常清晰了，但要弄清楚这个问题还需要知道一些别的概念，比如
[任务和返回栈](https://developer.android.com/guide/components/tasks-and-back-stack.html)
 - standard  每次都会新建，每个Task都可以有，且每个Task都可以有多个实例（每个Task都可以有，且可以有多个）  
 - singleTop 当前实例如果在栈顶，就不新建实例，调用其OnNewIntent。 如不在栈顶，则新建实例  （每个Task都可以有，且可以有多个，在栈顶时可复用）  
 - singleTask 新建一个Task，如果已经有其他的Task并且包含该实例，那就直接调用那个Task的实例。（只有一个Task中会有）  
 - singleInstance 新建一个Task，且在该Task中只有它的唯一一个实例。 (只有一个Task会有，且该Task中只有它) 