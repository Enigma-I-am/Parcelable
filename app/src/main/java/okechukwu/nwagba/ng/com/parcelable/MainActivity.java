package okechukwu.nwagba.ng.com.parcelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    House house1;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> previousOwnerList = new ArrayList<>();
        previousOwnerList.add("Eric");
        previousOwnerList.add("King");

        house1 = new House(100000,"Los Angeles", true,previousOwnerList);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LaunchDetailActivity(house1);
            }
        });
    }

    public void LaunchDetailActivity(House house){
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("HOUSE_KEY",house);
        startActivity(intent);
    }
}
