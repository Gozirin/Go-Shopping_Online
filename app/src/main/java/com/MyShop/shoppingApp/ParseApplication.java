package com.MyShop.shoppingApp;

import android.app.Application;


import com.MyShop.shoppingApp.Categories.Models.Post;
import com.MyShop.shoppingApp.Categories.Models.PostAMenagers;
import com.MyShop.shoppingApp.Categories.Models.PostBAlcolisees;
import com.MyShop.shoppingApp.Categories.Models.PostBoissons;
import com.MyShop.shoppingApp.Categories.Models.PostPCosmetiques;
import com.MyShop.shoppingApp.Categories.Models.PostPLaitiers;
import com.MyShop.shoppingApp.Categories.Models.PostPains;
import com.MyShop.shoppingApp.Categories.Models.PostSucreries;
import com.MyShop.shoppingApp.Categories.Models.PostViandes;
import com.MyShop.shoppingApp.Items_Detail.Details;
import com.MyShop.shoppingApp.Items_Detail.RelatedItems;
import com.MyShop.shoppingApp.Models.CardInfo;
import com.MyShop.shoppingApp.Models.User;
import com.MyShop.shoppingApp.New_Products.NewProducts;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(User.class);
        ParseObject.registerSubclass(Post.class);
        ParseObject.registerSubclass(NewProducts.class);
        ParseObject.registerSubclass(PostViandes.class);
        ParseObject.registerSubclass(PostPLaitiers.class);
        ParseObject.registerSubclass(PostPCosmetiques.class);
        ParseObject.registerSubclass(PostPains.class);
        ParseObject.registerSubclass(PostSucreries.class);
        ParseObject.registerSubclass(PostBAlcolisees.class);
        ParseObject.registerSubclass(PostAMenagers.class);
        ParseObject.registerSubclass(PostBoissons.class);
        ParseObject.registerSubclass(RelatedItems.class);
        ParseObject.registerSubclass(Details.class);
        ParseObject.registerSubclass(CardInfo.class);


        // set applicationId, and server server based on the values in the Heroku settings.
        // clientKey is not needed unless explicitly configured
        // any network interceptors must be added with the Configuration Builder given this syntax
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("homemarket") // should correspond to APP_ID env variable
                .clientKey("homemarket-app")  // set explicitly unless clientKey is explicitly configured on Parse server
                .server("http://homemarket.herokuapp.com/parse").build());
    }

}