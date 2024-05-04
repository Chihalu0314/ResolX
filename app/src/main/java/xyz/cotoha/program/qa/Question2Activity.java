package xyz.cotoha.program.qa;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Question2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);

        TextView textView = findViewById(R.id.text_view);
        String text = "\n\nシステムアップデートについて\n\n\n" +
                "システムアップデートとは\nスマホ本体のアップデートです\n\n" +
                "大きな更新と小さな更新の2種類があります\n\n\n\n" +
                "=======大きな更新=======\n（メージャーアップデート）\n\n" +
                "・Andoridバージョンがアップデートされます\n・新機能の追加やパフォーマンスの改善など\n\n\n\n" +
                "=======小さな更新=======\n（マイナーアップデート）\n\n" +
                "・小さな改善や新機能の追加修正など\n\n\n\n" +
                "=======注意事項=======\n\n" +
                "⑴ 大きな更新をする際は注意してください\n" +
                "※不具合が起きる可能性があります※\n\n\n" +
                "⑵ システムアップデートには\nサポート期限というものがあります\n" +
                "期限を過ぎるとシステムアップデートを\n受けることが出来なくなります\n\n\n" +
                "⑶ Google Pixel 7aは最低でも\n3年までのアップデートが保証されています\n" +
                "ただし、変更される可能性もあります\n" +
                "メジャーアップデートは2026年5月までの\n" +
                "サポートが予定されています\n\n" +
                "マイナーアップデートは2028年5月までの\n" +
                "サポートが予定されています\n\n\n\n";



        textView.setText(text);
    }
}
