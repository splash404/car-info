package in.ddw.carinfo.pages;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import in.ddw.carinfo.adapter.TitleAdapter;
import in.ddw.carinfo.model.TitleModel;
import in.ddw.carinfo.R;

public class TitleActivity extends AppCompatActivity {

    RecyclerView rv_title;
    TitleAdapter titleAdapter;
    List<TitleModel> titleModelList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);

        rv_title = findViewById(R.id.rv_title);

        titleList();

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        rv_title.setLayoutManager(layoutManager);
        titleAdapter = new TitleAdapter(this, titleModelList);
        rv_title.setAdapter(titleAdapter);

    }

    private void titleList() {

        titleModelList = new ArrayList<>();
        titleModelList.add(new TitleModel("Lorem ipsum dolor de limit"));
        titleModelList.add(new TitleModel("Lorem ipsum dolor de limit"));
        titleModelList.add(new TitleModel("Lorem ipsum dolor de limit"));
        titleModelList.add(new TitleModel("Lorem ipsum dolor de limit"));
        titleModelList.add(new TitleModel("Lorem ipsum dolor de limit"));
    }
}