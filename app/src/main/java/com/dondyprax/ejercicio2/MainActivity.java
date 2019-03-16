package com.dondyprax.ejercicio2;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.ImageView;

        import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    int[] imageArray = {R.drawable.picture_a, R.drawable.picture_b, R.drawable.picture_c};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView image1 = findViewById(R.id.image1);
        ImageView image2 = findViewById(R.id.image2);
        ImageView image3 = findViewById(R.id.image3);
        ImageView image4 = findViewById(R.id.image4);
        ImageView image5 = findViewById(R.id.image5);
        ImageView image6 = findViewById(R.id.image6);
        ImageView image7 = findViewById(R.id.image7);
        ImageView image8 = findViewById(R.id.image8);
        ImageView image9 = findViewById(R.id.image9);

        image1.setOnClickListener(this);
        image2.setOnClickListener(this);
        image3.setOnClickListener(this);
        image4.setOnClickListener(this);
        image5.setOnClickListener(this);
        image6.setOnClickListener(this);
        image7.setOnClickListener(this);
        image8.setOnClickListener(this);
        image9.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.image1:
                ImageView image1 = findViewById(R.id.image1);
                image1.setImageResource(imageArray[new Random().nextInt(imageArray.length)]);
                break;
            case R.id.image2:
                ImageView image2 = findViewById(R.id.image2);
                image2.setImageResource(imageArray[new Random().nextInt(imageArray.length)]);
                break;
            case R.id.image3:
                ImageView image3 = findViewById(R.id.image3);
                image3.setImageResource(imageArray[new Random().nextInt(imageArray.length)]);
                break;
            case R.id.image4:
                ImageView image4 = findViewById(R.id.image4);
                image4.setImageResource(imageArray[new Random().nextInt(imageArray.length)]);
                break;
            case R.id.image5:
                ImageView image5 = findViewById(R.id.image5);
                image5.setImageResource(imageArray[new Random().nextInt(imageArray.length)]);
                break;
            case R.id.image6:
                ImageView image6 = findViewById(R.id.image6);
                image6.setImageResource(imageArray[new Random().nextInt(imageArray.length)]);
                break;
            case R.id.image7:
                ImageView image7 = findViewById(R.id.image7);
                image7.setImageResource(imageArray[new Random().nextInt(imageArray.length)]);
                break;
            case R.id.image8:
                ImageView image8 = findViewById(R.id.image8);
                image8.setImageResource(imageArray[new Random().nextInt(imageArray.length)]);
                break;
            case R.id.image9:
                ImageView image9 = findViewById(R.id.image9);
                image9.setImageResource(imageArray[new Random().nextInt(imageArray.length)]);
                break;
        }
    }
}
