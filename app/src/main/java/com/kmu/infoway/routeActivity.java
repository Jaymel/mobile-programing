package com.kmu.infoway;

import com.github.chrisbanes.photoview.PhotoView;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class routeActivity extends AppCompatActivity {

    PhotoView photoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.route_layout);
        PhotoView photoView = (PhotoView) findViewById(R.id.photo_view);
        photoView.setImageResource(R.drawable.all_route);
    }
    public void toiletClick(View v) {
        Intent intent = new Intent(getApplicationContext(), toiletActivity.class);
        startActivity(intent);
    }
    public void lockerClick(View v) {
        Intent intent = new Intent(getApplicationContext(), lockerActivity.class);
        startActivity(intent);
    }
    public void onClick(View button) {
        PopupMenu popup = new PopupMenu(this, button);
        popup.getMenuInflater().inflate(R.menu.route_menu, popup.getMenu());
        popup.setOnMenuItemClickListener(
                new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        Toast.makeText(getApplicationContext(), "선택한 호선: "
                                        + item.getTitle(),
                                Toast.LENGTH_SHORT).show();
                        CharSequence text = item.getTitle();
                        if(item.getTitle().toString().contains("전체")){
                            PhotoView photoView = (PhotoView) findViewById(R.id.photo_view);
                            photoView.setImageResource(R.drawable.all_route);
                        }else if (item.getTitle().toString().contains("1호선")){
                            PhotoView photoView = (PhotoView) findViewById(R.id.photo_view);
                            photoView.setImageResource(R.drawable.route1);
                        }else if (item.getTitle().toString().contains("2호선")){
                            PhotoView photoView = (PhotoView) findViewById(R.id.photo_view);
                            photoView.setImageResource(R.drawable.route2);
                        }else if (item.getTitle().toString().contains("3호선")){
                            PhotoView photoView = (PhotoView) findViewById(R.id.photo_view);
                            photoView.setImageResource(R.drawable.route3);
                        }else if (item.getTitle().toString().contains("4호선")){
                            PhotoView photoView = (PhotoView) findViewById(R.id.photo_view);
                            photoView.setImageResource(R.drawable.route4);
                        }else if (item.getTitle().toString().contains("5호선")){
                            PhotoView photoView = (PhotoView) findViewById(R.id.photo_view);
                            photoView.setImageResource(R.drawable.route5);
                        }else if (item.getTitle().toString().contains("6호선")){
                            PhotoView photoView = (PhotoView) findViewById(R.id.photo_view);
                            photoView.setImageResource(R.drawable.route6);
                        }else if (item.getTitle().toString().contains("7호선")){
                            PhotoView photoView = (PhotoView) findViewById(R.id.photo_view);
                            photoView.setImageResource(R.drawable.route7);
                        }else if (item.getTitle().toString().contains("8호선")){
                            PhotoView photoView = (PhotoView) findViewById(R.id.photo_view);
                            photoView.setImageResource(R.drawable.route8);
                        }else if (item.getTitle().toString().contains("9호선")){
                            PhotoView photoView = (PhotoView) findViewById(R.id.photo_view);
                            photoView.setImageResource(R.drawable.route9);
                        }

                        return true;
                    }

                });
        popup.show();
    }
}
