package in.ddw.carinfo.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import in.ddw.carinfo.Model.StateModel;
import in.ddw.carinfo.R;
import in.ddw.carinfo.pages.Home;

public class StateAdapter extends RecyclerView.Adapter<StateAdapter.MyViewHolder> {
    Context context;
    List<StateModel> stateModelList;

    public StateAdapter(Context context, List<StateModel> stateModelList) {
        this.context = context;
        this.stateModelList = stateModelList;
    }
    @NonNull
    @Override
    public StateAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.state_list_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.image.setImageResource(stateModelList.get(position).getImage());

        holder.title.setText(stateModelList.get(position).getStatename());

        holder.ll_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Position " + position, Toast.LENGTH_SHORT).show();
                Intent i = new Intent(context, Home.class);
                context.startActivity(i);
            }
        });
    }


    @Override
    public int getItemCount() {
        return stateModelList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView title;
        LinearLayout ll_main;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            title = itemView.findViewById(R.id.title);
            ll_main = itemView.findViewById(R.id.ll_main);
        }
    }
}
