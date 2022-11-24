package com.shopmanagementsystem.spring.model.Purchase.Order;

import com.shopmanagementsystem.spring.Database.DAO.CartDAO;
import com.shopmanagementsystem.spring.Entity.Product;
import com.shopmanagementsystem.spring.model.Checkout.Checkout;
import com.shopmanagementsystem.spring.model.Checkout.CheckoutOrder;
import com.shopmanagementsystem.spring.model.Checkout.Receipt;
import com.shopmanagementsystem.spring.model.Checkout.withDiscount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductOrder {

    @Autowired
    CartDAO cartDAO;



    public void addToCart(Product p){
        cartDAO.addProduct(p);
    }

    public void clearCart(){
        cartDAO.clearCart();
    }

    public Receipt checkOut(){


        Checkout checkout = new CheckoutOrder();
        checkout.loadCart(cartDAO.getCart());

        //if - user has discounts active
        if (false){
            return checkout.getReceipt();
        }else{
            checkout = new withDiscount(checkout);
            return checkout.getReceipt();
        }
    }


}
