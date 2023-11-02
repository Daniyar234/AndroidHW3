package com.example.hw3_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hw3_android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var phoneList : ArrayList<Phone>
    private lateinit var phoneAdapter : PhoneAdapter
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        phoneList = ArrayList()
        phoneAdapter = PhoneAdapter(phoneList)
        foodListItems()

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.adapter = phoneAdapter
    }

    private fun foodListItems(){
        phoneList.add(Phone(R.drawable.iphone,"Iphone"))
        phoneList.add(Phone(R.drawable.samsung,"Samsung"))
        phoneList.add(Phone(R.drawable.xiaomi,"Xiaomi 14 Pro"))
        phoneList.add(Phone(R.drawable.oppo,"Oppo"))
        phoneList.add(Phone(R.drawable.poco,"Poco X3 pro death"))
        phoneList.add(Phone(R.drawable.vivo,"Vivo"))
        phoneList.add(Phone(R.drawable.huawei,"Huawei p30"))
        phoneList.add(Phone(R.drawable.asus,"Asus rog"))
        phoneList.add(Phone(R.drawable.iphone,"Iphone"))
        phoneList.add(Phone(R.drawable.samsung,"Samsung"))
        phoneList.add(Phone(R.drawable.xiaomi,"Xiaomi 14 Pro"))
        phoneList.add(Phone(R.drawable.oppo,"Oppo"))
        phoneList.add(Phone(R.drawable.poco,"Poco X3 pro death"))
        phoneList.add(Phone(R.drawable.vivo,"Vivo"))
        phoneList.add(Phone(R.drawable.huawei,"Huawei p30"))
        phoneList.add(Phone(R.drawable.asus,"Asus rog"))
    }
}