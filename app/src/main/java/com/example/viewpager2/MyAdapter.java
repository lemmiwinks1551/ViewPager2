package com.example.viewpager2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MyAdapter extends FragmentStateAdapter {
    public MyAdapter(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        // По номеру страницы, передаваемому в качестве параметра position, возвращает объект фрагмента
        return (PageFragment.newInstance(position));
    }

    @Override
    public int getItemCount() {
        // Возвращает количество страниц, которые будут в ViewPager2
        return 10;
    }
}
