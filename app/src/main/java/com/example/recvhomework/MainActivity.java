package com.example.recvhomework;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    CardAdapter adapter;
    List<CardItem> cardItemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // מצא את ה-RecyclerView בעזרת ה-ID
        recyclerView = findViewById(R.id.rcv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // יצירת רשימת קלפים
        cardItemList = new ArrayList<>();

        // הוספת פריטים לרשימה בעזרת המערכים שהגדרת בקובץ res/values/strings.xml
        String[] texts1 = getResources().getStringArray(R.array.string_array_example);
        String[] texts2 = getResources().getStringArray(R.array.string_array_example2);
        int[] imageIds = {
                R.drawable.baseline_account_circle_24, // שים כאן את ה-ID של התמונות שלך
                R.drawable.baseline_account_circle_24,
                R.drawable.baseline_account_circle_24,
                R.drawable.baseline_account_circle_24,
                R.drawable.baseline_account_circle_24,
                R.drawable.baseline_account_circle_24,
                R.drawable.baseline_account_circle_24,
                R.drawable.baseline_account_circle_24,
                R.drawable.baseline_account_circle_24,
                R.drawable.baseline_account_circle_24,
                R.drawable.baseline_account_circle_24,
                R.drawable.baseline_account_circle_24,
                R.drawable.baseline_account_circle_24,
                R.drawable.baseline_account_circle_24,
                R.drawable.baseline_account_circle_24
        };

        // הוספת הפריטים לרשימה
        for (int i = 0; i < texts1.length; i++) {
            cardItemList.add(new CardItem(texts1[i], texts2[i], imageIds[i]));
        }

        // יצירת והגדרת ה-Adapter
        adapter = new CardAdapter(this, cardItemList);
        recyclerView.setAdapter(adapter);
    }
}

