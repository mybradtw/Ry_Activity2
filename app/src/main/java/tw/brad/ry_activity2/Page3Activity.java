package tw.brad.ry_activity2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Page3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
    }

    @Override
    public void finish() {
        setResult(777);
        super.finish();
    }
}
