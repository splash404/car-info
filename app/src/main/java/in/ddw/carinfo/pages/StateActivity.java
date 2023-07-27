package in.ddw.carinfo.pages;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

import in.ddw.carinfo.Adapter.StateAdapter;
import in.ddw.carinfo.Model.StateModel;
import in.ddw.carinfo.R;

public class StateActivity extends AppCompatActivity {

    RecyclerView rv_state;
    List<StateModel> list;
    StateAdapter stateAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state);



        gridList();
        rv_state = findViewById(R.id.rv_state);
        GridLayoutManager layoutManager = new GridLayoutManager(this,4);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        rv_state.setLayoutManager(layoutManager);
        stateAdapter = new StateAdapter(this,list);
        rv_state.setAdapter(stateAdapter);

    }


    private void gridList() {
        list = new ArrayList<>();

        list.add(new StateModel(R.drawable.maharashtra, "Maharashtra"));
        list.add(new StateModel(R.drawable.maharashtra, "Asam"));
        list.add(new StateModel(R.drawable.maharashtra, "Bihar"));
        list.add(new StateModel(R.drawable.maharashtra, "Mizoram"));
        list.add(new StateModel(R.drawable.maharashtra, "Goa"));
        list.add(new StateModel(R.drawable.maharashtra, "Harayan"));
        list.add(new StateModel(R.drawable.maharashtra, "Odisha"));
        list.add(new StateModel(R.drawable.maharashtra, "Jharkhand"));
        list.add(new StateModel(R.drawable.maharashtra, "Karnataka"));
        list.add(new StateModel(R.drawable.maharashtra,"Kerla"));
        list.add(new StateModel(R.drawable.maharashtra,"Rajsthan"));
        list.add(new StateModel(R.drawable.maharashtra, "screen Rotation"));
        list.add(new StateModel(R.drawable.maharashtra, "Battery full"));
        list.add(new StateModel(R.drawable.maharashtra,"Access Alarm"));
        list.add(new StateModel(R.drawable.maharashtra, "Mizoram"));
        list.add(new StateModel(R.drawable.maharashtra, "Goa"));
        list.add(new StateModel(R.drawable.maharashtra, "Harayan"));
        list.add(new StateModel(R.drawable.maharashtra, "Odisha"));
        list.add(new StateModel(R.drawable.maharashtra, "Jharkhand"));
        list.add(new StateModel(R.drawable.maharashtra, "Karnataka"));
    }

}