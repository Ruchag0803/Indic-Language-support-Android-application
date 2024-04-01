// Generated by view binder compiler. Do not edit!
package com.example.e_commerce_application.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.e_commerce_application.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityHomePageBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView appLogo;

  @NonNull
  public final ImageButton art;

  @NonNull
  public final ImageView cartIcon;

  @NonNull
  public final ImageButton clothes;

  @NonNull
  public final ImageButton food;

  @NonNull
  public final GridLayout grid;

  @NonNull
  public final ImageButton kitchen;

  @NonNull
  public final TextView messageTextView;

  @NonNull
  public final ImageView profileIcon;

  @NonNull
  public final SearchView searchBar;

  @NonNull
  public final ImageButton skincare;

  @NonNull
  public final LinearLayout topBar;

  @NonNull
  public final ImageButton toy;

  private ActivityHomePageBinding(@NonNull LinearLayout rootView, @NonNull ImageView appLogo,
      @NonNull ImageButton art, @NonNull ImageView cartIcon, @NonNull ImageButton clothes,
      @NonNull ImageButton food, @NonNull GridLayout grid, @NonNull ImageButton kitchen,
      @NonNull TextView messageTextView, @NonNull ImageView profileIcon,
      @NonNull SearchView searchBar, @NonNull ImageButton skincare, @NonNull LinearLayout topBar,
      @NonNull ImageButton toy) {
    this.rootView = rootView;
    this.appLogo = appLogo;
    this.art = art;
    this.cartIcon = cartIcon;
    this.clothes = clothes;
    this.food = food;
    this.grid = grid;
    this.kitchen = kitchen;
    this.messageTextView = messageTextView;
    this.profileIcon = profileIcon;
    this.searchBar = searchBar;
    this.skincare = skincare;
    this.topBar = topBar;
    this.toy = toy;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityHomePageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityHomePageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_home_page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityHomePageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.app_logo;
      ImageView appLogo = ViewBindings.findChildViewById(rootView, id);
      if (appLogo == null) {
        break missingId;
      }

      id = R.id.art;
      ImageButton art = ViewBindings.findChildViewById(rootView, id);
      if (art == null) {
        break missingId;
      }

      id = R.id.cart_icon;
      ImageView cartIcon = ViewBindings.findChildViewById(rootView, id);
      if (cartIcon == null) {
        break missingId;
      }

      id = R.id.clothes;
      ImageButton clothes = ViewBindings.findChildViewById(rootView, id);
      if (clothes == null) {
        break missingId;
      }

      id = R.id.food;
      ImageButton food = ViewBindings.findChildViewById(rootView, id);
      if (food == null) {
        break missingId;
      }

      id = R.id.grid;
      GridLayout grid = ViewBindings.findChildViewById(rootView, id);
      if (grid == null) {
        break missingId;
      }

      id = R.id.kitchen;
      ImageButton kitchen = ViewBindings.findChildViewById(rootView, id);
      if (kitchen == null) {
        break missingId;
      }

      id = R.id.message_text_view;
      TextView messageTextView = ViewBindings.findChildViewById(rootView, id);
      if (messageTextView == null) {
        break missingId;
      }

      id = R.id.profile_icon;
      ImageView profileIcon = ViewBindings.findChildViewById(rootView, id);
      if (profileIcon == null) {
        break missingId;
      }

      id = R.id.search_bar;
      SearchView searchBar = ViewBindings.findChildViewById(rootView, id);
      if (searchBar == null) {
        break missingId;
      }

      id = R.id.skincare;
      ImageButton skincare = ViewBindings.findChildViewById(rootView, id);
      if (skincare == null) {
        break missingId;
      }

      id = R.id.top_bar;
      LinearLayout topBar = ViewBindings.findChildViewById(rootView, id);
      if (topBar == null) {
        break missingId;
      }

      id = R.id.toy;
      ImageButton toy = ViewBindings.findChildViewById(rootView, id);
      if (toy == null) {
        break missingId;
      }

      return new ActivityHomePageBinding((LinearLayout) rootView, appLogo, art, cartIcon, clothes,
          food, grid, kitchen, messageTextView, profileIcon, searchBar, skincare, topBar, toy);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}