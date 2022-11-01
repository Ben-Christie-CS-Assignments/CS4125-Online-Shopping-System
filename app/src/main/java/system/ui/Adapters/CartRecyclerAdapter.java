package system.ui.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import system.ui.R;

public class CartRecyclerAdapter extends RecyclerView.Adapter<CartRecyclerAdapter.MyViewHolder> {
    /*
        TODO: connect database to recycler adapter to be used in populating stock
    */

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView itemName, itemQuantity, itemPrice, itemPoints;

        public MyViewHolder(final View view) {
            super(view);
            itemName = view.findViewById(R.id.cartItemName);
            itemQuantity = view.findViewById(R.id.cartItemQuantity);
            itemPrice = view.findViewById(R.id.cartItemPrice);
            itemPoints = view.findViewById(R.id.cartItemPoints);

        }
    }

    @NonNull
    @Override
    public CartRecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View stockView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_data_row, parent, false);
        return new MyViewHolder(stockView);
    }

    @Override
    public void onBindViewHolder(@NonNull CartRecyclerAdapter.MyViewHolder holder, int position) {
        /*
            Implement data for name, quantity, price and points here
            Referenced: https://www.youtube.com/watch?v=__OMnFR-wZU
        */

        // String name = nameFromDatabase + ":";
        // String quantity = "Quantity:" + quantitySelected;
        // String price = "Price: €" + priceFromDatabase * quantitySelected;
        // String points = "Points: " pointsFromDatabase * quantitySelected;

        // holder.itemName.setText(name);
        // holder.itemQuantity.setText(quantity);
        // holder.itemPrice.setText(price);
        // holder.itemPoints.setText(points);

    }

    @Override
    public int getItemCount() {
        // return amount of data e.g. if we have 20 items of stock this should return 20
        return 0;
    }
}
