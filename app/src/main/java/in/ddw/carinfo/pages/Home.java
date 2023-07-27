package in.ddw.carinfo.pages;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import in.ddw.carinfo.Model.NewsModel;
import in.ddw.carinfo.R;
import in.ddw.carinfo.adapter.LatestNewsAdapter;

public class Home extends AppCompatActivity {

    LatestNewsAdapter latestNewsAdapter;
    RecyclerView rv_latestNews, rv_EVnews;

    List<NewsModel> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        findId();
        getList();
    }

    private void findId() {

        rv_latestNews = findViewById(R.id.rv_latestNews);
        rv_EVnews = findViewById(R.id.rv_EVnews);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.HORIZONTAL);
        rv_latestNews.setLayoutManager(layoutManager);
        latestNewsAdapter = new LatestNewsAdapter(this, list);
        rv_latestNews.setAdapter(latestNewsAdapter);


        LinearLayoutManager layoutManager1 = new LinearLayoutManager(this);
        layoutManager1.setOrientation(RecyclerView.HORIZONTAL);
        rv_EVnews.setLayoutManager(layoutManager1);
        latestNewsAdapter = new LatestNewsAdapter(this, list);
        rv_EVnews.setAdapter(latestNewsAdapter);

    }

    private void getList() {

        list.add(new NewsModel(R.drawable.carimg1,
                "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. ",
                "27 July 2023", "By Admin"));

        list.add(new NewsModel(R.drawable.carimg2,
                "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. ",
                "27 July 2023", "By Admin"));

        list.add(new NewsModel(R.drawable.carimg3,
                "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. ",
                "27 July 2023", "By Admin"));

        list.add(new NewsModel(R.drawable.carimg4,
                "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. ",
                "27 July 2023", "By Admin"));
    }
}