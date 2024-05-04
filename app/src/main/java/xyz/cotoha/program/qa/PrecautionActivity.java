package xyz.cotoha.program.qa;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PrecautionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_precaution);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        List<Precaution> precautionList = new ArrayList<>();
        precautionList.add(new Precaution("⑴ 会員登録中に前のページなど戻ると？", "　上の文字をタップして詳細を見てください"));
        precautionList.add(new Precaution("⑵ 会員登録中に前のページなど戻ると？", "　上の文字をタップして詳細を見てください"));
        precautionList.add(new Precaution("⑶ 会員登録中に前のページなど戻ると？", "　上の文字をタップして詳細を見てください"));

        PrecautionAdapter adapter = new PrecautionAdapter(precautionList, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}