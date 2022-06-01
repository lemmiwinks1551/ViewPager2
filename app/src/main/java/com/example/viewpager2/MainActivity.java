package com.example.viewpager2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager2 pager = findViewById(R.id.pager);
        FragmentStateAdapter pageAdapter = new MyAdapter(this);
        pager.setAdapter(pageAdapter);

        TabLayout tabLayout = findViewById(R.id.tab_layout);
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayout, pager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            // Конструктор TabLayoutMediator принимает три параметра: объекты ViewPager2 и TabLayout
            // и реализацию интерфейса TabConfigurationStrategy, которая с помощью метода onConfigureTab()
            // получает отдельную вкладку в виде объекта Tab и номер страницы и позволяет настроить вид вкладки,
            // например, установить заголовок вкладки.
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setText(String.valueOf(position));
            }
        });
        tabLayoutMediator.attach();
    }
}
