package com.example.wiki_app.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wiki_app.R;
import com.example.wiki_app.model.Armor;
import com.example.wiki_app.utils.GlideApp;

import java.util.ArrayList;
import java.util.List;

public class ArmorAdapter extends RecyclerView.Adapter<ArmorAdapter.ArmorHolder> {
    private List<Armor> armors = new ArrayList<>();
    private OnItemListener listener;

    public ArmorAdapter(List<Armor> armors, OnItemListener listener) {
        this.armors = armors;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ArmorAdapter.ArmorHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);

        return new ArmorHolder(view, listener);
    }

    @Override
    public void onBindViewHolder(@NonNull ArmorAdapter.ArmorHolder holder, int position) {
        holder.armorId.setText(String.valueOf(armors.get(position).getItemId()));
        holder.armorName.setText(armors.get(position).getItemName());

        GlideApp.with(holder.itemView.getContext()).load(armors.get(position).getImgSmall())
                .centerCrop().placeholder(R.drawable.placeholder_img).into(holder.armorImage);

    }

    @Override
    public int getItemCount() {
        return armors.size();
    }

    public void setArmors(List<Armor> armors) {
        this.armors = armors;
        notifyDataSetChanged();
    }

    public Armor getSelectedArmor(int pos){
        if (armors != null && getItemCount() > 0){
            return armors.get(pos);
        }
        return null;
    }

    public class ArmorHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private final ImageView armorImage;
        private final TextView armorName;
        private final TextView armorId;
        OnItemListener onItemListener;

        public ArmorHolder(@NonNull View itemView, OnItemListener onItemListener) {
            super(itemView);
            armorImage = itemView.findViewById(R.id.item_img);
            armorName = itemView.findViewById(R.id.item_name);
            armorId = itemView.findViewById(R.id.item_id);
            this.onItemListener = onItemListener;

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            onItemListener.onItemClick(getAdapterPosition());
        }
    }
}
