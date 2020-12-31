package com.example.wiki_app.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.wiki_app.R;
import com.example.wiki_app.model.Weapon;

import java.util.ArrayList;
import java.util.List;

public class WeaponAdapter extends RecyclerView.Adapter<WeaponAdapter.WeaponHolder> {
    private List<Weapon> weapons = new ArrayList<>();

    @NonNull
    @Override
    public WeaponHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.weapon_item, parent, false);

        return new WeaponHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WeaponHolder holder, int position) {
        holder.weaponId.setText(String.valueOf(weapons.get(position).getItemId()));
        holder.weaponName.setText(weapons.get(position).getName());
        holder.weaponName.append(" ["+ weapons.get(position).getSlots() + "]");

        // Weapon image
        Glide.with(holder.itemView.getContext()).load(weapons.get(position).getImgSmall())
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

    public class WeaponHolder extends RecyclerView.ViewHolder {
        private final ImageView weaponImage;
        private final TextView weaponName;
        private final TextView weaponId;
        public WeaponHolder(@NonNull View itemView) {
            super(itemView);
            weaponImage = itemView.findViewById(R.id.weapon_img);
            weaponName = itemView.findViewById(R.id.weapon_name);
            weaponId = itemView.findViewById(R.id.weapon_id);
        }

    }
}
