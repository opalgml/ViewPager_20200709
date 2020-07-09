package kr.co.tjoeun.fragment_20200709.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_first.welcomeMessageTxt
import kotlinx.android.synthetic.main.fragment_second.*
import kr.co.tjoeun.viewpager_20200709.R

class SecondFragment : Fragment()  {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        toastBtn.setOnClickListener {
//            makeToast 의 첫번째 재료 : 어느 화면에 띄울지
//            this : 프래그먼트 > 화면이아님 (에러 발생)
//            화면을 넣어주자 -> 나(프래그먼트)를 들고 있는 액티비티 대입
//            => activity 변수 사용
        Toast.makeText(activity, "버튼 이벤트입니다.", Toast.LENGTH_SHORT).show()
        }
    }

}