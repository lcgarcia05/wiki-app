package com.example.wiki_app.view;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.wiki_app.R;
import com.example.wiki_app.model.Armor;
import com.example.wiki_app.utils.GlideApp;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class ArmorDetails extends Fragment {
    ImageView itemImage;
    TextView itemName;
    TextView itemId;
    TextView itemDescription;
    private static final String ARG_MODEL = "armor";
    private Armor armor;

    public static ArmorDetails newInstance(Armor armor){
        ArmorDetails armorDetails = new ArmorDetails();
        Bundle args = new Bundle();
        args.putParcelable(ARG_MODEL, armor);
        armorDetails.setArguments(args);
        return armorDetails;
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
//            Armor armor = bundle.getParcelable("armor");
//            Log.v("Tag", "Received: "+ armor);
//            itemName.setText(armor.getItemName());
//            itemId.setText(String.valueOf(armor.getItemId()));
//            itemDescription.setText(armor.getDescription());
//            itemDescription.setMovementMethod(new ScrollingMovementMethod());
//            GlideApp.with(this).load(armor.getImgLarge()).placeholder(R.drawable.placeholder_img).into(itemImage);
//        }

        if (getArguments() != null) {
            armor = getArguments().getParcelable(ARG_MODEL);
            Log.v("Tag", "Received" + armor);
            itemName.setText(armor.getItemName());
            itemId.setText(String.valueOf(armor.getItemId()));
            itemDescription.setText(armor.getDescription());
            itemDescription.setMovementMethod(new ScrollingMovementMethod());
            GlideApp.with(this).load(armor.getImgLarge()).placeholder(R.drawable.placeholder_img).into(itemImage);
        }
        return v;
    }
}