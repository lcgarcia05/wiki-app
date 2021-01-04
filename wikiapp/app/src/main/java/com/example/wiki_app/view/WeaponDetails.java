package com.example.wiki_app.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wiki_app.R;
import com.example.wiki_app.model.Weapon;
import com.example.wiki_app.utils.GlideApp;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class WeaponDetails extends Fragment {
    private static final String ARG_MODEL = "weapon";
    private Weapon weapon;
    ImageView itemImage;
    TextView itemName;
    TextView itemId;
    TextView itemDescription;

    public static WeaponDetails newInstance(Weapon weapon){
        WeaponDetails weaponDetails = new WeaponDetails();
        Bundle args = new Bundle();
        args.putParcelable(ARG_MODEL, weapon);
        weaponDetails.setArguments(args);
        return weaponDetails;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

        View v =  inflater.inflate(R.layout.fragment_item_details, container, false);
        itemImage = v.findViewById(R.id.image_item);
        itemName = v.findViewById(R.id.name_item);
        itemId = v.findViewById(R.id.id_item);
        itemDescription = v.findViewById(R.id.description_item);

//        Bundle bundle = this.getArguments();
//        if (bundle != null){
//            Weapon weapon = bundle.getParcelable("weapon");
//            Log.v("Tag", "Received: "+ weapon);
//
//            itemName.setText(weapon.getName());
//            itemId.setText(String.valueOf(weapon.getItemId()));
//            itemDescription.setText(weapon.getDescription());
//            itemDescription.setMovementMethod(new ScrollingMovementMethod());
//            GlideApp.with(this).load(weapon.getImgLarge()).placeholder(R.drawable.placeholder_img).into(itemImage);
//        }
        if (getArguments() != null){
            weapon = getArguments().getParcelable(ARG_MODEL);
            Log.v("Tag", "Received" + weapon);
            itemName.setText(weapon.getName());
            itemId.setText(String.valueOf(weapon.getItemId()));
            itemDescription.setText(weapon.getDescription());
            itemDescription.setMovementMethod(new ScrollingMovementMethod());
            GlideApp.with(this).load(weapon.getImgLarge()).placeholder(R.drawable.placeholder_img).into(itemImage);
        }
        return v;
    }
}