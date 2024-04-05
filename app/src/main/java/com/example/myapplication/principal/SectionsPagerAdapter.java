package com.example.myapplication.principal;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SectionsPagerAdapter extends FragmentPagerAdapter
{

    private final Fragment[] mFragments = new Fragment[2];
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm, Fragment oficinasFragment, Fragment indicacoesFragment)
    {
        super(fm);
        mContext = context;
        mFragments[0] = oficinasFragment;
        mFragments[1] = indicacoesFragment;
    }

    @Override
    public Fragment getItem(int position)
    {
        return mFragments[position];
    }

    @Override
    public int getCount()
    {
        return mFragments.length;
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        switch (position) {
            case 0:
                return "Oficinas";
            case 1:
                return "Indicações";
            default:
                return null;
        }
    }
}
