package com.example.kotlin.delegate

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R

/**
 * Kotlin 委托基础含义
 */
class TestDelegateActivity1 : AppCompatActivity() {

    private var tvTitle : TextView? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delegate_test)
        tvTitle = findViewById(R.id.tv_title)
        tvTitle?.text = "Kotlin 委托基础含义"
    }

    /**
     * 测试
     */
    fun onDelegateBase(v : View) {
        CreateDBAction(SqlDB()).save()
        CreateDBAction(OracleDB()).save()
        CreateDBAction(MySqlDB()).save()
    }
    

}

interface DB {
    fun save()
}

class SqlDB() : DB {
    override fun save() = println("save to sql")
}

class MySqlDB() : DB {
    override fun save() = println("save to MySqlDB")
}

class OracleDB() : DB {
    override fun save() = println("save to Oracle")
}

// 委托含义解释： 将接口的实现 委托给了参数db
class CreateDBAction(db: DB) : DB by db
/*
public final class CreateDBAction implements DB {
   // $FF: synthetic field
   private final DB $$delegate_0;

   public CreateDBAction(@NotNull DB db) {
      Intrinsics.checkParameterIsNotNull(db, "db");
      super();
      this.$$delegate_0 = db;
   }

    @Override
    public void save() {
      this.$$delegate_0.save();
    }
}
 */