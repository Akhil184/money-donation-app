package com.example.myapplication;

import androidx.annotation.NonNull;
        import androidx.appcompat.app.ActionBarDrawerToggle;
        import androidx.appcompat.app.AppCompatActivity;
        import androidx.appcompat.widget.Toolbar;
        import androidx.core.view.GravityCompat;
        import androidx.drawerlayout.widget.DrawerLayout;
        import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
        import android.view.MenuItem;
        import android.widget.Toast;

        import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView nav;
    ActionBarDrawerToggle toggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawer);
        toolbar= findViewById(R.id.tool_bar);
        nav= findViewById(R.id.navmenu);
        setSupportActionBar(toolbar);

        toggle= new ActionBarDrawerToggle(this, drawerLayout,toolbar,R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        getSupportFragmentManager().beginTransaction().replace(R.id.container, new home()).commit();

        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            Fragment temp;

            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.menu_call:
                        temp= new call();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;


                    case R.id.menu_home:
                        temp= new home();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.menu_setting:
                        Intent N = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ukdev.co.in/about"));
                        startActivity(N);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.menu_settin:
                        temp= new setting();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.container, temp).commit();
                return true;
            }
        });
    }

}