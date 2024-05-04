package xyz.cotoha.program.qa;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class QandAActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qanda);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        List<QandA> qandaList = new ArrayList<>();
        qandaList.add(new QandA("Q1：メールが届きません", "A：ここをタップして詳細を見てください"));
        qandaList.add(new QandA("Q2：システムアップデートとはなんですか？", "A：ここをタップして詳細を見てください"));
        qandaList.add(new QandA("Q3：アプリのアップデートとはなんですか？", "A：ここをタップして詳細を見てください"));
        qandaList.add(new QandA("Q4：パスワードを忘れてしまった", "A：パスワードの再設定を行ってください \n　（自動入力機能を使うことをおすすめします）"));
        qandaList.add(new QandA("Q5：アプリ内で今まで機能が無くなった", "A：アプリの更新で変更された可能性があります"));
        qandaList.add(new QandA("Q6：間違えて写真などを消してしまった", "A：大抵30日間まではゴミ箱の中に入っています\n　  ゴミ箱から復元してください"));

        QandAAdapter adapter = new QandAAdapter(qandaList, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
