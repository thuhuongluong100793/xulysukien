package com.ltthuong.xulysukien;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
//Tong hop 6 truong hop
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    public ImageView imageView;
    public Button btnYellow;
    public Button btnBlue;
    public Button btnPink;
    public Button btnOrange;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);
        btnYellow = (Button) findViewById(R.id.btnYellow);
        btnYellow.setOnClickListener(listener);
        btnBlue = (Button) findViewById(R.id.btnBlue);
        btnBlue.setOnClickListener(this);
        btnPink = (Button) findViewById(R.id.btnPink);
        btnPink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setBackgroundColor(getResources().getColor(R.color.pink));
            }
        });
        btnOrange = (Button) findViewById(R.id.btnOrange);
        btnOrange.setOnClickListener(new Orange());
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linearLayout);
        //Tạo nút Button mới
        Button btnPurple = new androidx.appcompat.widget.AppCompatButton(this){};
        btnPurple.setText("Purple");
        btnPurple.setBackgroundColor(getResources().getColor(R.color.purple));
        linearLayout.addView(btnPurple);
        btnPurple.setOnClickListener(listener_purple);

    }
    public void onClickBtnGreen(View view){
        imageView.setBackgroundColor(getResources().getColor(R.color.green));
    }
    View.OnClickListener listener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            if(v==btnYellow) {
                imageView.setBackgroundColor(getResources().getColor(R.color.yellow));
            }
        }
    };
    View.OnClickListener listener_purple = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
                imageView.setBackgroundColor(getResources().getColor(R.color.purple));
            }
    };
    @Override
    public void onClick(View v) {
        if(v==btnBlue) {
            imageView.setBackgroundColor(getResources().getColor(R.color.blue));
        }
    }
    class Orange implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            imageView.setBackgroundColor(getResources().getColor(R.color.orange));
        }
    }

}
//3.6.1 va 3.6.2
/*public class MainActivity extends AppCompatActivity {
    public ImageView imageView;
    public Button btnYellow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);
        btnYellow = (Button) findViewById(R.id.btnYellow);
        btnYellow.setOnClickListener(listener);
    }
    public void onClickBtnGreen(View view){
        imageView.setBackgroundColor(getResources().getColor(R.color.green));
    }
    View.OnClickListener listener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            if(v==btnYellow) {
                imageView.setBackgroundColor(getResources().getColor(R.color.yellow));
            }
        }
    };
}*/
//3.6.3 va 3.6.4 va 3.6.5
/*public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    public ImageView imageView;
    public Button btnBlue;
    public Button btnPink;
    public Button btnOrange;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);
        btnBlue = (Button) findViewById(R.id.btnBlue);
        btnBlue.setOnClickListener(this);
        btnPink = (Button) findViewById(R.id.btnPink);
        btnPink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setBackgroundColor(getResources().getColor(R.color.pink));
            }
        });
        btnOrange = (Button) findViewById(R.id.btnOrange);
        btnOrange.setOnClickListener(new Orange());

    }
    @Override
    public void onClick(View v) {
        if(v==btnBlue) {
            imageView.setBackgroundColor(getResources().getColor(R.color.blue));
        }
    }
    class Orange implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            imageView.setBackgroundColor(getResources().getColor(R.color.orange));
        }
    }
}*/
//3.6.6
/*public class MainActivity extends AppCompatActivity {
    public ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linearLayout);
        imageView = (ImageView) findViewById(R.id.imageView);
        //Tạo nút Button mới
        Button btnPurple = new androidx.appcompat.widget.AppCompatButton(this){};
        btnPurple.setText("Purple");
        btnPurple.setBackgroundColor(getResources().getColor(R.color.purple));
        linearLayout.addView(btnPurple);
        btnPurple.setOnClickListener(listener);
    }
    View.OnClickListener listener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
                imageView.setBackgroundColor(getResources().getColor(R.color.purple));
        }
    };
}*/



