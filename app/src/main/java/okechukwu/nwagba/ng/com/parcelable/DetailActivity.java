package okechukwu.nwagba.ng.com.parcelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView price, Location, nearSchool,previousOwner;
    House house;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        house = getIntent().getParcelableExtra("HOUSE_KEY");

        price = findViewById(R.id.price);
        Location = findViewById(R.id.location);
        nearSchool =  findViewById(R.id.nearSchool);
        previousOwner = findViewById(R.id.previousOwners);

        price.setText(((Integer)house.getPrice()).toString());
        Location.setText(house.getLocation());
        nearSchool.setText(((Boolean)house.isNearSchool()).toString());
        previousOwner.setText((house.getPreviousOwners().toString()));

    }
}
