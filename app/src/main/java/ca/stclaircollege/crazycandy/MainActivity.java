package ca.stclaircollege.crazycandy;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,
        CalculatorFragment.OnFragmentInteractionListener,
        EventFragment.OnFragmentInteractionListener,
        NutritionFragment.OnFragmentInteractionListener,
        ShowFragment.OnFragmentInteractionListener,
        HomeFragment.OnFragmentInteractionListener {

    FragmentManager fm = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        FragmentTransaction trans = fm.beginTransaction();
        trans.replace(R.id.mainFrame, new HomeFragment());
        trans.addToBackStack(null);
        trans.commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_candyShow) {
            FragmentTransaction trans = fm.beginTransaction();
            trans.setCustomAnimations(R.anim.slide_from_left, R.anim.slide_to_right);
            trans.replace(R.id.mainFrame, new ShowFragment());
            trans.addToBackStack(null);
            trans.commit();
        } else if (id == R.id.nav_calculator) {
            FragmentTransaction trans = fm.beginTransaction();
            trans.setCustomAnimations(R.anim.slide_from_left, R.anim.slide_to_right);
            trans.replace(R.id.mainFrame, new CalculatorFragment());
            trans.addToBackStack(null);
            trans.commit();
        } else if (id == R.id.nav_event) {
            FragmentTransaction trans = fm.beginTransaction();
            trans.setCustomAnimations(R.anim.slide_from_left, R.anim.slide_to_right);
            trans.replace(R.id.mainFrame, new EventFragment());
            trans.addToBackStack(null);
            trans.commit();
        } else if (id == R.id.nav_nutrition) {
            FragmentTransaction trans = fm.beginTransaction();
            trans.setCustomAnimations(R.anim.slide_from_left, R.anim.slide_to_right);
            trans.replace(R.id.mainFrame, new NutritionFragment());
            trans.addToBackStack(null);
            trans.commit();
        } else if (id == R.id.nav_location) {
//            FragmentTransaction trans = fm.beginTransaction();
//            trans.setCustomAnimations(R.anim.slide_from_left, R.anim.slide_to_right);
//            trans.replace(R.id.mainFrame, new LocationFragment());
//            trans.addToBackStack(null);
//            trans.commit();
            Uri geoLocation = Uri.parse("geo:0,0?q=34.2032076,-118.33679(Crazy Candy Store)");
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(geoLocation);
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            } else {
                Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content), "No installed software to complete the task.", Snackbar.LENGTH_SHORT);
                snackbar.show();
            }
        } else if (id == R.id.nav_contact) {
//            FragmentTransaction trans = fm.beginTransaction();
//            trans.setCustomAnimations(R.anim.slide_from_left, R.anim.slide_to_right);
//            trans.replace(R.id.mainFrame, new ContactFragment());
//            trans.addToBackStack(null);
//            trans.commit();

            String name = "Crazy Candy";
            String email = "megan.caza@gmail.com";

            String[] emailaddresses = {email};
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:"));
            intent.putExtra(Intent.EXTRA_EMAIL, emailaddresses);
            intent.putExtra(Intent.EXTRA_SUBJECT, "Question for Crazy Candy");
            intent.putExtra(Intent.EXTRA_TEXT, "Hello Crazy Candy, I had some questions about ...");
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
            else{
                Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content),
                        "No installed software to complete the task", Snackbar.LENGTH_SHORT);
                snackbar.show();
            }
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri){
        //you can leave it empty
    }
}
