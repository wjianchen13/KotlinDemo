package com.example.kotlin.xiangxue.delegate

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * Kotlin 属性委托
 */
class TestDelegateActivity4 : AppCompatActivity() {

    private var tvTitle : TextView? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delegate_test)
        tvTitle = findViewById(R.id.tv_title)
        tvTitle?.text = "Kotlin 属性委托"
    }

    /**
     * 测试
     */
    fun onDelegateBase(v : View) {
        val simple04 = Simple04()
        simple04.number = 99999.0f  // 我给number赋值【用户在赋值 number 调用 setNumber ---> 实例 ---> setFloatValue】
        println(simple04.number) // 我读取number【/用户在读取 number 调用 getNumber ---> 实例 ---> getFloatValue】
    }
}

class Simple04 {

    // var 可读 可改 内部会有 set get           val 只有get 只读
    var floatValue : Float = 757567.65f
        set(v) {
            field = v
            println("你设置了 floatValue哦 v:$v")
        }
        get() {
            println("你获取了 floatValue哦")
            return field
        }

    var number : Float by ::floatValue
    /*set(v) {  相当于，隐式的有这段代码哦
        field = v
        println("你设置了floatValue哦 v:$v")
    }
    get() {
        println("你获取了floatValue哦")
        return field
    }*/
   
}

/*
   背后实现的原理：
   public final class Simple04 {
       // 实例 方便访问 getFloatValue  setFloatValue 的实例
       private final KMutableProperty0 number$delegate = new Simple04$number$2((Simple04)this);

       private float floatValue = 8768979.0F;

       public final float getFloatValue() {
         String var1 = "你获取了floatValue哦";
         System.out.println(var1);
         return this.floatValue;
       }

      public final void setFloatValue(float v) {
         this.floatValue = v;
         String var2 = "你设置了floatValue哦 v:" + v;
         System.out.println(var2);
      }

       // 用户在读取 number 调用 getNumber ---> 实例 ---> getFloatValue
       public final float getNumber() {
         KProperty0 var1 = (KProperty0)this.number$delegate;
         Object var3 = null;
         return ((Number)var1.get()).floatValue();
      }

      // 用户在赋值 number 调用 setNumber ---> 实例 ---> setFloatValue
      public final void setNumber(float var1) {
         KMutableProperty0 var2 = this.number$delegate;
         Object var4 = null;
         Float var5 = var1;
         var2.set(var5);
      }
   }
*/
