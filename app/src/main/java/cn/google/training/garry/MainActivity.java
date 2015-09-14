package cn.google.training.garry;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    //It's generally a good practice to define keys for intent extras using your app's package name as a prefix.
    public final static String EXTRA_MESSAGE = "cn.google.training.garry.myfirstapp.MESSAGE";
    @Bind(R.id.et_message)
    EditText etMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }

    public void sendMessage(View view) {
        //Do something
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        String message = etMessage.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
