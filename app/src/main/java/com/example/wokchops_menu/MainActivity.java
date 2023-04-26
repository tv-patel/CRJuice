package com.example.wokchops_menu;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Drawable drawable;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=findViewById(R.id.imageview);
        drawable=getResources().getDrawable(R.drawable.image1);
        imageView.setImageDrawable(drawable);
        listView=findViewById(R.id.listView);
        List<String> title=new ArrayList<>();


        title.add("Chikoo Shake                                               30/-");
        title.add("Chocolate Chikoo Shake                            40/-");
        title.add("Banana Shake                                              30/-");
        title.add("Chocolate Banana Shake                            40/-");
        title.add("Watermelon Juice                                       30/-");
        title.add("Mango Shake                                              30/-");
        title.add("Papaya Shake                                             30/-");
        title.add("Pineapple Juice                                           40/-");
        title.add("Mosambi Juice                                           40/-");
        title.add("Orange Juice                                              40/-");
        title.add("Mosambi Orange Juice                              40/-");
        title.add("Red Pineapple Juice                                  40/-");
        title.add("Orange Pineapple Juice                            40/-");
        title.add("Black Pineapple Juice                               40/-");
        title.add("Choco Parle                                               30/-");
        title.add("Rose Milk Shake                                       30/-");
        title.add("Bournville Shake                                       30/-");
        title.add("Royal Pan Shake                                       30/-");
        title.add("Thandai Shake                                           30/-");
        title.add("Gulkand Shake                                          30/-");
        title.add("Black Currant Shake                                  30/-");
        title.add("Green Apple Shake                                   30/-");
        title.add("Pineapple Shake                                       40/-");
        title.add("Very Berry Shake                                      30/-");
        title.add("Butterscotch Shake                                  30/-");
        title.add("Cold Coffee                                              40/-");
        title.add("Rajwadi Kesar Shake                                 40/-");
        title.add("Kesar Badam Shake                                  40/-");
        title.add("Pista Milk Shake                                        40/-");
        title.add("Kiwi Shake                                                40/-");
        title.add("Strawberry Shake                                     40/-");
        title.add("Oreo Chocolate Shake                              40/-");
        title.add("Chocolate Crunch Shake                          40/-");
        title.add("Rasmalai Shake                                        40/-");


        MyAdapter myAdapter=new MyAdapter(this,title);
        listView.setAdapter(myAdapter);
    }


}