package org.nsu.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] names = new String[]{"Atiar", "Saadman","Jabin","Arabi","Naheena","Nafis","Salat","Saiful"};
        ListView listView = (ListView)findViewById(R.id.list);

        PersonItem atiar = new PersonItem("Atiar", "Swajan", "CSE", R.drawable.panda);
        PersonItem jibne = new PersonItem("Kamal", "Jibne", "CSC", R.drawable.monkey);
        PersonItem nafis = new PersonItem("Nafis", "UI", "CSE", R.drawable.cat);
        PersonItem p1 = new PersonItem("Name1", "nickname1", "ENV", R.drawable.giraffe);
        PersonItem p2 = new PersonItem("Name2", "nickname2", "ENV", R.drawable.pup);
        PersonItem p3 = new PersonItem("Name3", "nickname3", "BIO", R.drawable.koala);
        final ArrayList<PersonItem> personItems = new ArrayList<>();
        personItems.add(atiar);
        personItems.add(jibne);
        personItems.add(nafis);
        personItems.add(p1);
        personItems.add(p2);
        personItems.add(p3);

        PersonAdapter nameAdapter =
                new PersonAdapter(this, personItems);

        listView.setAdapter(nameAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);

                PersonItem personItem = personItems.get(i);
                String name = personItem.name;
                String nickNmae = personItem.nickName;
                String dept = personItem.department;
                int img = personItem.imageResId;

                intent.putExtra("name", name);
                intent.putExtra("nick", nickNmae);
                intent.putExtra("dept", dept);
                intent.putExtra("img", img);
                startActivity(intent);
                //Toast.makeText(MainActivity.this, "I clicked on "+name, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
