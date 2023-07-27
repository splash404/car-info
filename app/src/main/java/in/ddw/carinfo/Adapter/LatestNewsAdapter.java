package in.ddw.carinfo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import in.ddw.carinfo.Model.NewsModel;
import in.ddw.carinfo.R;
import in.ddw.carinfo.customviews.TextviewMontserratBold;

public class LatestNewsAdapter extends RecyclerView.Adapter<LatestNewsAdapter.NewAdapterHolder> {


    Context mContext;
    List<NewsModel> list;


    public LatestNewsAdapter(Context mContext, List<NewsModel> list) {
        this.mContext = mContext;
        this.list = list;
    }


    @Override
    public NewAdapterHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.latest_news_item, parent, false);
        return new NewAdapterHolder(view);
    }

    @Override
    public void onBindViewHolder(NewAdapterHolder holder, int position) {
        NewsModel newsModel = list.get(position);

        holder.iv_latestNews.setImageResource(list.get(position).getImage());
        holder.tv_createBy.setText(newsModel.getCreatedBy());
        holder.tv_date.setText(newsModel.getDate());
        holder.tvmb_title.setText(newsModel.getTitle());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class NewAdapterHolder extends RecyclerView.ViewHolder {

        ImageView iv_latestNews;
        TextviewMontserratBold tvmb_title;
        TextView tv_date;
        TextView tv_createBy;

        public NewAdapterHolder(View itemView) {
            super(itemView);

            iv_latestNews = itemView.findViewById(R.id.iv_latestNews);
            tvmb_title = itemView.findViewById(R.id.tvmb_title);
            tv_date = itemView.findViewById(R.id.tv_date);
            tv_createBy = itemView.findViewById(R.id.tv_createBy);

        }
    }
}
