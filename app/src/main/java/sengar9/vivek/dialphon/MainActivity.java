package sengar9.vivek.dialphon;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText phone = findViewById(R.id.editText);
        Button b = findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = String.format("tel:%s",phone.getText().toString().trim());
                Intent phonnumber = new Intent(Intent.ACTION_DIAL);
                phonnumber.setData(Uri.parse(number));
                startActivity(phonnumber);
            }
        });
    }
}
