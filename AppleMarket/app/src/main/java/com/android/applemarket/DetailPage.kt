package com.android.applemarket

import android.content.Intent
import android.content.res.Resources
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.res.ResourcesCompat
import com.android.applemarket.databinding.ActivityDetailPageBinding
import com.android.applemarket.databinding.ItemRecyclerviewBinding
import java.text.DecimalFormat

class DetailPage : AppCompatActivity() {

    private val binding by lazy { ActivityDetailPageBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //데이터 받아오기
        var data = intent?.getParcelableExtra<MyItem>(Contants.Item_OBJECT)?:
        //?: 로 null일 경우 앱이 꺼지지 않게 넣는 데이터
        MyItem(R.drawable.sample1,"제목","위치","내용","아이디",1000,1,1)
        //받은 데이터 집어넣기
        binding.imgTitle.setImageResource(data.aImg)
        binding.userId.text = data.aUserid
        binding.userPrice.text = DecimalFormat("#,###").format(data.aPrice) + "원"
        binding.userLocation.text = data.aUserlocation
        binding.userSubtitle.text = data.aSubtitle
        binding.userTitle.text = data.aTitle

//        //데이터 받아오기
//        var data = intent?.getParcelableExtra<MyItem>(Contants.Item_OBJECT)
//        //받은 데이터 집어넣기
//        //이미지는 받은 int가 진짜 int인지 모른다고 떠서 let을 써서 변환
//        data?.aImg?.let { binding.imgTitle.setImageResource(it) }
//        binding.userId.text = data?.aUserid
//        binding.userPrice.text = DecimalFormat("#,###").format(data?.aPrice) + "원"
//        binding.userLocation.text = data?.aUserlocation
//        binding.userSubtitle.text = data?.aSubtitle
//        binding.userTitle.text = data?.aTitle


        //누른 아이템의 위치 값을 받아서 스트링값 집어넣기 -> percelize 사용해서 이걸 바꿔야 할거 같음
//        val Data = intent.getIntExtra(Contants.Item_NUMBER,0)
//        when(Data) {
//            0 -> {
//                binding.imgTitle.setImageResource(R.drawable.sample1)
//                binding.userTitle.setText(R.string.no1_title)
//                binding.userSubtitle.setText(R.string.no1_subtitle)
//                binding.userLocation.setText(R.string.no1_location)
//                binding.userId.setText(R.string.no1_person)
//                binding.userPrice.setText(R.string.no1_price)
//            }
//            1 -> {
//                binding.imgTitle.setImageResource(R.drawable.sample2)
//                binding.userTitle.setText(R.string.no2_title)
//                binding.userSubtitle.setText(R.string.no2_subtitle)
//                binding.userLocation.setText(R.string.no2_location)
//                binding.userId.setText(R.string.no2_person)
//                binding.userPrice.setText(R.string.no2_price)
//            }
//            2 -> {
//                binding.imgTitle.setImageResource(R.drawable.sample3)
//                binding.userTitle.setText(R.string.no3_title)
//                binding.userSubtitle.setText(R.string.no3_subtitle)
//                binding.userLocation.setText(R.string.no3_location)
//                binding.userId.setText(R.string.no3_person)
//                binding.userPrice.setText(R.string.no3_price)
//            }
//            3 -> {
//                binding.imgTitle.setImageResource(R.drawable.sample4)
//                binding.userTitle.setText(R.string.no4_title)
//                binding.userSubtitle.setText(R.string.no4_subtitle)
//                binding.userLocation.setText(R.string.no4_location)
//                binding.userId.setText(R.string.no4_person)
//                binding.userPrice.setText(R.string.no4_price)
//            }
//            4 -> {
//                binding.imgTitle.setImageResource(R.drawable.sample5)
//                binding.userTitle.setText(R.string.no5_title)
//                binding.userSubtitle.setText(R.string.no5_subtitle)
//                binding.userLocation.setText(R.string.no5_location)
//                binding.userId.setText(R.string.no5_person)
//                binding.userPrice.setText(R.string.no5_price)
//            }
//            5 -> {
//                binding.imgTitle.setImageResource(R.drawable.sample6)
//                binding.userTitle.setText(R.string.no6_title)
//                binding.userSubtitle.setText(R.string.no6_subtitle)
//                binding.userLocation.setText(R.string.no6_location)
//                binding.userId.setText(R.string.no6_person)
//                binding.userPrice.setText(R.string.no6_price)
//            }
//            6 -> {
//                binding.imgTitle.setImageResource(R.drawable.sample7)
//                binding.userTitle.setText(R.string.no7_title)
//                binding.userSubtitle.setText(R.string.no7_subtitle)
//                binding.userLocation.setText(R.string.no7_location)
//                binding.userId.setText(R.string.no7_person)
//                binding.userPrice.setText(R.string.no7_price)
//            }
//            7 -> {
//                binding.imgTitle.setImageResource(R.drawable.sample8)
//                binding.userTitle.setText(R.string.no8_title)
//                binding.userSubtitle.setText(R.string.no8_subtitle)
//                binding.userLocation.setText(R.string.no8_location)
//                binding.userId.setText(R.string.no8_person)
//                binding.userPrice.setText(R.string.no8_price)
//            }
//            8 -> {
//                binding.imgTitle.setImageResource(R.drawable.sample9)
//                binding.userTitle.setText(R.string.no9_title)
//                binding.userSubtitle.setText(R.string.no9_subtitle)
//                binding.userLocation.setText(R.string.no9_location)
//                binding.userId.setText(R.string.no9_person)
//                binding.userPrice.setText(R.string.no9_price)
//            }
//            9 -> {
//                binding.imgTitle.setImageResource(R.drawable.sample10)
//                binding.userTitle.setText(R.string.no10_title)
//                binding.userSubtitle.setText(R.string.no10_subtitle)
//                binding.userLocation.setText(R.string.no10_location)
//                binding.userId.setText(R.string.no10_person)
//                binding.userPrice.setText(R.string.no10_price)
//            }
//
//        }
        //뒤로가기
        binding.back.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }


}