package com.hsyncnblk.jsonparse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hsyncnblk.jsonparse.databinding.ActivityMainBinding
import org.json.JSONException
import org.json.JSONObject

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    // var json = "{\"person\":{\"name\":\"Hüseyin\",\"yas\":21}}"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            button.setOnClickListener {

                try {

                    var json = binding.textView5.text.toString()

                    val obj = JSONObject(json)

                    val person : JSONObject = obj.getJSONObject("person")


                    val name = person.getString("name")
                    val age = person.getString("yas")

                    binding.tvName.text="name: $name"
                    binding.tvAge.text="age: $age"


                }catch (e:JSONException){
                    e.printStackTrace()
                }

            }
        }



    }
}