package com.example.marlieske.marlieske_pset1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    CheckBox cbArms, cbEars, cbEyebrows, cbEyes, cbGlasses, cbShoes, cbHat, cbNose, cbMustache, cbMouth;
    ImageView arms, ears, eyes, eyebrows, glasses, hat, mouth, mustache, nose, shoes;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        cbArms=(CheckBox)findViewById(R.id.checkBoxArms);
        arms=(ImageView)findViewById(R.id.imageViewArms);
        cbEars=(CheckBox)findViewById(R.id.checkBoxEars);
        ears=(ImageView)findViewById(R.id.imageViewEars);
        cbEyebrows=(CheckBox)findViewById(R.id.checkBoxEyebrows);
        eyebrows=(ImageView)findViewById(R.id.imageViewEyebrows);
        cbEyes=(CheckBox)findViewById(R.id.checkBoxEyes);
        eyes=(ImageView)findViewById(R.id.imageViewEyes);
        cbGlasses=(CheckBox)findViewById(R.id.checkBoxGlasses);
        glasses=(ImageView)findViewById(R.id.imageViewGlasses);
        cbHat=(CheckBox)findViewById(R.id.checkBoxHat);
        hat=(ImageView)findViewById(R.id.imageViewHat);
        cbShoes=(CheckBox)findViewById(R.id.checkBoxShoes);
        shoes=(ImageView)findViewById(R.id.imageViewShoes);
        cbMustache=(CheckBox)findViewById(R.id.checkBoxMustache);
        mustache=(ImageView)findViewById(R.id.imageViewMustache);
        cbNose=(CheckBox)findViewById(R.id.checkBoxNose);
        nose=(ImageView)findViewById(R.id.imageViewNose);
        cbMouth=(CheckBox)findViewById(R.id.checkBoxMouth);
        mouth=(ImageView)findViewById(R.id.imageViewMouth);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    public void onCheckboxClicked(View view) {
        boolean check = ((CheckBox) view).isChecked();

        switch(view.getId()) {
            case R.id.checkBoxArms:
                if (check) {
                    arms.setVisibility(View.VISIBLE);
                }
                else {
                    arms.setVisibility(View.INVISIBLE);
                }
            case R.id.checkBoxEars:
                if (check) {
                    ears.setVisibility(View.VISIBLE);
                }
                else {
                    ears.setVisibility(View.INVISIBLE);

                    case R.id.checkBoxEyes:
                if (check)
                    eyes.setVisibility(View.VISIBLE);
                else
                    eyes.setVisibility(View.INVISIBLE);
            case R.id.checkBoxEyebrows:
                if (check)
                    eyebrows.setVisibility(View.VISIBLE);
                else
                    eyebrows.setVisibility(View.INVISIBLE);
            case R.id.checkBoxHat:
                if (check)
                    hat.setVisibility(View.VISIBLE);
                else
                    hat.setVisibility(View.INVISIBLE);
            case R.id.checkBoxShoes:
                if (check)
                    shoes.setVisibility(View.VISIBLE);
                else
                    shoes.setVisibility(View.INVISIBLE);
            case R.id.checkBoxMustache:
                if (check)
                    mustache.setVisibility(View.VISIBLE);
                else
                    mustache.setVisibility(View.INVISIBLE);
            case R.id.checkBoxGlasses:
                if (check)
                    glasses.setVisibility(View.VISIBLE);
                else
                    glasses.setVisibility(View.INVISIBLE);
            case R.id.checkBoxNose:
                if (check)
                    nose.setVisibility(View.VISIBLE);
                else
                    nose.setVisibility(View.INVISIBLE);
            case R.id.checkBoxMouth:
                if (check)
                    mouth.setVisibility(View.VISIBLE);
                else
                    mouth.setVisibility(View.INVISIBLE);

        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
