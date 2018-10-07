package com.example.zmc.kotlin_project

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch

class KotlinMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*launch {
            val result1 = async { uploadImageOne() }//上传第一种类型图片
            val result2 = async { uploadImageTwo() }//上传第二种类型图片
            val result3 = async { submitInfo(result1.await(), result2.await()) }//等待前两种上传结果
            val result = result3.await()//等待最后上传的结果
            runOnUiThread { Log.d("主线程",result) }
        }*/
        let()
    }


    fun let(){
        val str: String = "Boss"
        val result = str.let {
            print(this) // 接收者
            print(it) // 参数
            69 //区间返回值
        }
        print(result)

    }

    internal fun setMyData(something: Something?):Setting{
        return something?.data?.setting?.run {
            this.setSomeThing()
        }?:Setting()
    }

    /**
     * 上传第一种类型的图片
     */
    suspend fun uploadImageOne():String{
        Log.d("kotlin","第一种类型图片开始上传")
        delay(1000)
        Log.d("kotlin","第一种类型图片上传完毕")
        return "url-one"
    }

    /**第2种类型
     * 上传第2种类型的图片
     */
    suspend fun uploadImageTwo():String{
        Log.d("kotlin","第二种类型图片开始上传")
        delay(2000)
        Log.d("kotlin","第二种类型图片上传完毕")
        return "url-two"
    }

    /**
     * 上传信息，需要的是前两种图片url
     */
    suspend fun submitInfo(url1:String,url2:String):String{
        Log.d("kotlin","开始上传所有信息")
        delay(1000)
        Log.d("kotlin","上传完成"+url1+url2)
        return "全部上传成功"
    }


}
