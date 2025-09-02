# Kotlin基础  
JetPack 相关使用  
Kotlin和Java混合使用  
1.LifeCycle  
2.viewmodel  
3.livedata

kotlin中对象的属性是怎么定义的，为什么外部可以直接通过 对象.属性名称 进行访问？

# 编译环境
20250902修改
android-studio-2024.3.2.15
gradle插件:8.10.0
gradle:gradle-8.12-bin

# 参考文档
Kotlin 入门教程
https://www.lvtao.net/books/kotlin/kotlin-tutorial.html

# 注意
有如下代码
public class BaseMultiPartMvpPresenter<V extends IBaseMvpView, P extends BaseMvpPresenter> extends BaseMvpPresenter<V> 
指定泛型时使用extends BaseMvpPresenter 可以使用通配符？，但是外部继承不能使用，必须要指定确定的类型。
java可以直接省略，Kotlin不行，如果使用了通配符?，那他的所有子类也必须使用？
public class BaseMultiPartMvpPresenter<V extends IBaseMvpView, P extends BaseMvpPresenter<?>> extends BaseMvpPresenter<V> {
public class MultiPartyMvpPresenter<V extends IBaseMvpView> extends BaseMultiPartMvpPresenter<V, MultiPartyMvpPresenter<?>> {

# 框架图
Activity 直接使用
IBaseMvpView                    BaseMvpActivity                    BaseMvpPresenter
     ^                                 ^                                   ^
     |                                 |                                   |
     |                                 |                                   |
ITestMvpActivityView            TestMvpActivity                 TestMvpActivityPresenter

Fragment 直接使用
IBaseMvpView                    BaseMvpFragment                    BaseMvpPresenter
     ^                                 ^                                   ^
     |                                 |                                   |
     |                                 |                                   |
ITestMvpFragmentView            TestMvpFragment                 TestMvpFragmentPresenter

Activity 多模块使用
    IBaseMvpView                    BaseMvpActivity                    BaseMvpPresenter
         ^                                 ^                                   ^
         |                                 |                                   |
         |                                 |                                   |
                                                                     BaseMultiPartMvpPresenter
                                                                               ^
                                                                               |
                                                                               |
IBaseMultiPartMvpView            BaseMultiPartMvpActivity             MultiPartyMvpPresenter
         ^                                 ^                                   ^
         |                                 |                                   |
         |                                 |                                   |
ITestMultiPartMvpActivityView    TestMultiPartyActivity          TestMultiPartMvpActivityPresenter

Fragment 多模块使用
IBaseMvpView                    BaseMvpFragment                    BaseMvpPresenter
     ^                                 ^                                   ^
     |                                 |                                   |
     |                                 |                                   |
BaseMultiPartMvpPresenter
     ^
     |
     |
IBaseMultiPartMvpView             BaseMultiPartMvpFragment            MultiPartMvpPresenter
     ^                                 ^                                   ^
     |                                 |                                   |
     |                                 |                                   |
ITestMultiPartMvpFragmentView        TestMultiPartMvpFragment        TestMultiPartMvpFragmentPresenter


