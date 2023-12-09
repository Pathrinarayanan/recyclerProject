package com.example.practice;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        List<WidgetItem> widgetItems = Arrays.asList(
                new WidgetItem("Item : 1", "text"),
                new WidgetItem("", "image"),
                new WidgetItem("Item : 3", "text"),
                new WidgetItem("", "image"),
                new WidgetItem("Item : 5", "text"),
                new WidgetItem("", "image"),
                new WidgetItem("Item : 7", "text"),
                new WidgetItem("", "image"),
                new WidgetItem("Item : 9", "text"),
                new WidgetItem("", "image")
        );
//        Gson gson = new Gson();
//        List<WidgetItem> widgetItems = gson.fromJson(loadJSONFromAsset(), new TypeToken<List<WidgetItem>>(){}.getType());


        RecyclerView recyclerView = findViewById(R.id.recyclerView);


        MyAdapter adapter = new MyAdapter(widgetItems);
        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


//        private String loadJSONFromAsset() {
//            String json = null;
//            try {
//                InputStream is = getAssets().open("data.json");
//                int size = is.available();
//                byte[] buffer = new byte[size];
//                is.read(buffer);
//                is.close();
//                json = new String(buffer, "UTF-8");
//            } catch (IOException ex) {
//                ex.printStackTrace();
//                return null;
//            }
//            System.out.print(json);
//            return json;
//        }


}
