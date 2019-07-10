package com.example.ongoingbooking.OngoingOrders;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.util.Log;

import com.example.ongoingbooking.R;

public class OngoingVendor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ongoing_vendor);

        try{
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ffffff")));
            getSupportActionBar().setTitle(Html.fromHtml("<font color='#333333'>Ongoing Booking</font>"));
            final Drawable upArrow = getResources().getDrawable(R.drawable.ic_keyboard_backspace_black_24dp);
            upArrow.setColorFilter(getResources().getColor(R.color.chart_deep_red), PorterDuff.Mode.SRC_ATOP);
            getSupportActionBar().setHomeAsUpIndicator(upArrow);
        }
        catch(Exception e){
            Log.i("msg","error");
        }



        com.example.ongoingbooking.OngoingOrders.MyListData[] myListData = new com.example.ongoingbooking.OngoingOrders.MyListData[] {
                new com.example.ongoingbooking.OngoingOrders.MyListData("Wagonar R", R.drawable.suzuki),
                new com.example.ongoingbooking.OngoingOrders.MyListData("Audi", R.drawable.audi),
                new com.example.ongoingbooking.OngoingOrders.MyListData("Wagonar R",  R.drawable.suzuki),
                new com.example.ongoingbooking.OngoingOrders.MyListData("Audi",  R.drawable.audi),
                new com.example.ongoingbooking.OngoingOrders.MyListData("Wagonar R",  R.drawable.suzuki),
                new com.example.ongoingbooking.OngoingOrders.MyListData("Audi",  R.drawable.audi),
                new com.example.ongoingbooking.OngoingOrders.MyListData("Wagonar R",  R.drawable.suzuki),
                new com.example.ongoingbooking.OngoingOrders.MyListData("Audi",  R.drawable.audi),
                new com.example.ongoingbooking.OngoingOrders.MyListData("Wagonar R",  R.drawable.suzuki),
                new com.example.ongoingbooking.OngoingOrders.MyListData("Audi",  R.drawable.audi),
                new com.example.ongoingbooking.OngoingOrders.MyListData("Wagonar R",  R.drawable.suzuki),
                new MyListData("Audi",  R.drawable.audi),
        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        com.example.ongoingbooking.OngoingOrders.MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
