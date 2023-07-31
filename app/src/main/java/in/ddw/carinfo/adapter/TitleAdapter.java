package in.ddw.carinfo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import in.ddw.carinfo.customviews.TextviewMontserratBold;
import in.ddw.carinfo.model.TitleModel;
import in.ddw.carinfo.R;

public class TitleAdapter extends RecyclerView.Adapter<TitleAdapter.MyViewHolder> {
    Context context;
    List<TitleModel> titleModelList;

    public TitleAdapter(Context context, List<TitleModel> titleModelList) {
        this.context = context;
        this.titleModelList = titleModelList;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.title_list_item, parent, false);
        return new TitleAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        TitleModel tm = titleModelList.get(position);
        holder.tv_titleheading.setText(tm.getTitle());

    }

    @Override
    public int getItemCount() {
        return titleModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextviewMontserratBold tv_titleheading;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_titleheading = itemView.findViewById(R.id.tv_titleheading);
        }
    }
}
