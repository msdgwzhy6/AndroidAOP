package zj.it.bhne.androidaop

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import com.blankj.utilcode.util.ToastUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() ,View.OnClickListener{


    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnClick.setOnClickListener(this)
    }


    @SingleClick
    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                R.id.btnClick->{
                    ToastUtils.showShort("哈哈哈")
                    Log.e("刘佩希","wwww")
                }
            }
        }
    }

}