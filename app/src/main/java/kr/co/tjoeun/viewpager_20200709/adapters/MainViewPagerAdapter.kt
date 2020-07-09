package kr.co.tjoeun.viewpager_20200709.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kr.co.tjoeun.viewpager_20200709.fragments.FirstFragment
import kr.co.tjoeun.viewpager_20200709.fragments.SecondFragment

class MainViewPagerAdapter(fm : FragmentManager): FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {

        when (position)
        {

//            0 -> {return FirstFragment()}
//            else -> {return SecondFragment()}

        }
            return when(position)
            {
                0 -> FirstFragment()
                else -> SecondFragment()
            }

    }

    override fun getCount(): Int {

        return 2

    }
}