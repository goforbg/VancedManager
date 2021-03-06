package com.vanced.manager.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.vanced.manager.ui.fragments.ManagerChangelogFragment
import com.vanced.manager.ui.fragments.MicrogChangelogFragment
import com.vanced.manager.ui.fragments.VancedChangelogFragment

class SectionPageAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    private val fragmentItems = 3
    override fun getItemCount(): Int {
        return fragmentItems
    }

    override fun createFragment(position: Int): Fragment {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = VancedChangelogFragment()
            1 -> fragment = MicrogChangelogFragment()
            2 -> fragment = ManagerChangelogFragment()
        }
        return fragment!!
    }

}