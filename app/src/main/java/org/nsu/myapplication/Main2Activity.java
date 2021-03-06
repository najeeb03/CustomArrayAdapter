package org.nsu.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView nameTextView = (TextView) findViewById(R.id.item_name);
        TextView nickTextView = (TextView) findViewById(R.id.item_nick);
        TextView deptTextView = (TextView) findViewById(R.id.item_dept);
        ImageView imageView = (ImageView) findViewById(R.id.item_image);

        nameTextView.setText(getIntent().getStringExtra("name"));
        nickTextView.setText(getIntent().getStringExtra("nick"));
        deptTextView.setText(getIntent().getStringExtra("dept"));
        imageView.setImageResource(getIntent().getIntExtra("img", 0));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main2, menu);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
