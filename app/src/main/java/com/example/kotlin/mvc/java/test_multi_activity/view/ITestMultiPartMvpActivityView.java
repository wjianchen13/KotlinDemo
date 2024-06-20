package com.example.kotlin.mvc.java.test_multi_activity.view;

import com.example.kotlin.mvc.java.base.view.IBaseMultiPartMvpView;
import com.example.kotlin.mvc.java.test_multi_fragment.view.IPart1View;
import com.example.kotlin.mvc.java.test_multi_fragment.view.IPart2View;
import com.example.kotlin.mvc.java.test_multi_fragment.view.IPart3View;

/**
 * 测试接口
 */
public interface ITestMultiPartMvpActivityView extends IBaseMultiPartMvpView, IPart1View, IPart2View, IPart3View {

    void test();

}
