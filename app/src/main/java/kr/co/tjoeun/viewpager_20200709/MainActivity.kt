package kr.co.tjoeun.viewpager_20200709

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.tjoeun.viewpager_20200709.adapters.MainViewPagerAdapter

class MainActivity : BaseActivity() {

//    어댑터를 멤버변수로 생성
    lateinit var mvpa : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

//        뷰페이저용 어댑터 변수를 초기화
        mvpa = MainViewPagerAdapter(supportFragmentManager) //AppCompatActivity 에서 제공하는  supportFragmentManager 사용
        mainViewPager.adapter = mvpa

//        탭레이아웃의 기능으로 뷰페이저에 붙여주기
        myTabLayout.setupWithViewPager(mainViewPager)

    }
}