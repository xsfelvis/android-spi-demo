package me.yanglw.android.spi.demo.biz4;

import android.content.Context;
import android.support.v4.app.Fragment;

import me.yanglw.android.spi.ServiceProvider;
import me.yanglw.android.spi.demo.service.home.HomePage;

/**
 * Created by yanglw on 2018-05-28.
 */
@ServiceProvider(services = {HomePage.class}, priorities = {1})
public class Biz4HomePage implements HomePage {
    @Override
    public String getName(Context context) {
        return "Biz4";
    }

    @Override
    public Fragment getContent(Context context) {
        return new Biz4HomeFragment();
    }
}
