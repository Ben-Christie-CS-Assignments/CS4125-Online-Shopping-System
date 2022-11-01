package system.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import system.ui.Adapters.CartRecyclerAdapter;
import system.ui.Adapters.StockRecyclerAdapter;

public class CartUI extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart_ui);

        createObjects();

        setAdapter();
    }

    private void setAdapter() {
        //pass list of data into parentheses
        CartRecyclerAdapter cartRecyclerAdapter = new CartRecyclerAdapter();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(cartRecyclerAdapter);
    }

    private void createObjects() {
        recyclerView = findViewById(R.id.cartRecyclerView);
    }
}