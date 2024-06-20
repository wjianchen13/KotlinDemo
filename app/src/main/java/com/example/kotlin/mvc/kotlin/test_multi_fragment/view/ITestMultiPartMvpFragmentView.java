package com.example.kotlin.mvc.kotlin.test_multi_fragment.view;

import com.example.kotlin.mvc.kotlin.base.view.IBaseMultiPartMvpView;

/**
 * 测试接口
 */
public interface ITestMultiPartMvpFragmentView extends IBaseMultiPartMvpView, IPart1View, IPart2View, IPart3View {

    void test();

}
