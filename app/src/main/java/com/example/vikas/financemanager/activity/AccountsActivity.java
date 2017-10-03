package com.example.vikas.financemanager.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

import com.example.vikas.financemanager.R;

public class AccountsActivity extends AppCompatActivity {

    TabHost tabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accounts);
        getSupportActionBar().setTitle("Accounts");


        tabHost = (TabHost)findViewById(R.id.tabhost);
        tabHost.setup();
        //tab1
        TabHost.TabSpec t=tabHost.newTabSpec("Tab One");
        t.setIndicator("Bank");
        t.setContent(R.id.tab1);
        tabHost.addTab(t);
        //tab2
        t=tabHost.newTabSpec("Tab Two");
        t.setIndicator("Lend-Borrow");
        t.setContent(R.id.tab2);
        tabHost.addTab(t);
        //tab3
        t=tabHost.newTabSpec("Tab Three");
        t.setIndicator("Cash");
        t.setContent(R.id.tab3);
        tabHost.addTab(t);
    }
}
