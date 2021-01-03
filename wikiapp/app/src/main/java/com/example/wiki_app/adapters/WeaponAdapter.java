package com.example.wiki_app.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.wiki_app.R;
import com.example.wiki_app.model.Weapon;
import com.example.wiki_app.utils.CustomGlide;
import com.example.wiki_app.utils.GlideApp;

import java.util.ArrayList;
import java.util.List;

public class WeaponAdapter extends RecyclerView.Adapter<WeaponAdapter.WeaponHolder> {
    private List<Weapon> weapons = new ArrayList<>();
    private OnItemListener listener;

    public WeaponAdapter(List<Weapon> weapons, OnItemListener listener) {
        this.weapons = weapons;
        this.listener = listener;
    }

    @NonNull
    @Override
    public WeaponHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.weapon_item, parent, false);

        return new WeaponHolder(view, listener);
    }

    @Override
    public void onBindViewHolder(@NonNull WeaponHolder holder, int position) {

        holder.weaponId.setText(String.valueOf(weapons.get(position).getItemId()));
        holder.weaponName.setText(weapons.get(position).getName());
        holder.weaponName.append(" ["+ weapons.get(position).getSlots() + "]");

        // Weapon image
        GlideApp.with(holder.itemView.getContext()).load(weapons.get(position).getImgSmall())
                .centerCrop().into((holder.weaponImage));


    }

    @Override
    public int getItemCount() {
        return weapons.size();
    }

    public void setWeapons(List<Weapon> weapons) {
        this.weapons = weapons;
        notifyDataSetChanged();
    }

    public class WeaponHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private final ImageView weaponImage;
        private final TextView weaponName;
        private final TextView weaponId;
        OnItemListener onItemListener;
        public WeaponHolder(@NonNull View itemView, OnItemListener onItemListener) {
            super(itemView);
            weaponImage = itemView.findViewById(R.id.weapon_img);
            weaponName = itemView.findViewById(R.id.weapon_name);
            weaponId = itemView.findViewById(R.id.weapon_id);
            this.onItemListener = onItemListener;

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            onItemListener.onItemClick(getAdapterPosition());
        }
    }
}
