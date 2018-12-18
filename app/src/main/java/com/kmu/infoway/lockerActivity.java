package com.kmu.infoway;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.text.method.ScrollingMovementMethod;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.content.res.AssetManager;
import android.content.res.AssetManager.AssetInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.json.JSONObject;
import org.json.JSONException;
import org.json.JSONArray;
import android.widget.TextView;



public class lockerActivity extends AppCompatActivity {
    JSONArray jsonArray;
    TextView text_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.locker_layout);
        text_view = (TextView)findViewById(R.id.text_view);
        text_view.setMovementMethod(new ScrollingMovementMethod());
        AssetManager assetManager = getResources().getAssets();
        try{
            AssetInputStream ais = (AssetInputStream)assetManager.open("locker.json");
            BufferedReader br = new BufferedReader(new InputStreamReader(ais));
            StringBuilder sb = new StringBuilder();
            int bufferSize = 1024 * 1024;
            char readBuf [] = new char[bufferSize];
            int resultSize = 0;
            while((resultSize = br.read(readBuf))  != -1){
                if(resultSize == bufferSize){
                    sb.append(readBuf);
                }else{
                    for(int i = 0; i < resultSize; i++){
                        sb.append(readBuf[i]);
                    }
                }
            }
            String jString = sb.toString();
            jsonArray =  new JSONArray(jString);
        }catch(JSONException je){
        }catch(Exception e){
        }
    }
    public void routeClick(View v) {
        Intent intent = new Intent(getApplicationContext(), routeActivity.class);
        startActivity(intent);
    }
    public void toiletClick(View v) {
        Intent intent = new Intent(getApplicationContext(), toiletActivity.class);
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
                        if(item.getTitle().toString().contains("전체")){
                            String text = "";
                            try {
                                for (int i = 0; i < jsonArray.length(); i++) {
                                    text += "역명: " + jsonArray.getJSONObject(i).getString("name").toString()
                                            + ", 호선: " + jsonArray.getJSONObject(i).getString("route").toString() + "\n";
                                }
                                text_view.setText(text);
                            } catch(JSONException e){
                            }
                        }else if(item.getTitle().toString().contains("1호선")){
                            String text = "";
                            try {
                                for (int i = 0; i < jsonArray.length(); i++) {
                                    if(jsonArray.getJSONObject(i).getString("route").toString().contains("1호선")) {
                                        text += "역명: " + jsonArray.getJSONObject(i).getString("name").toString()
                                                + ", 호선: " + jsonArray.getJSONObject(i).getString("route").toString() + "\n";
                                    }
                                }
                                text_view.setText(text);
                            } catch(JSONException e){
                            }
                        }else if(item.getTitle().toString().contains("2호선")){
                            String text = "";
                            try {
                                for (int i = 0; i < jsonArray.length(); i++) {
                                    if(jsonArray.getJSONObject(i).getString("route").toString().contains("2호선")) {
                                        text += "역명: " + jsonArray.getJSONObject(i).getString("name").toString()
                                                + ", 호선: " + jsonArray.getJSONObject(i).getString("route").toString() + "\n";
                                    }
                                }
                                text_view.setText(text);
                            } catch(JSONException e){
                            }
                        }else if(item.getTitle().toString().contains("3호선")){
                            String text = "";
                            try {
                                for (int i = 0; i < jsonArray.length(); i++) {
                                    if(jsonArray.getJSONObject(i).getString("route").toString().contains("3호선")) {
                                        text += "역명: " + jsonArray.getJSONObject(i).getString("name").toString()
                                                + ", 호선: " + jsonArray.getJSONObject(i).getString("route").toString() + "\n";
                                    }
                                }
                                text_view.setText(text);
                            } catch(JSONException e){
                            }
                        }else if(item.getTitle().toString().contains("4호선")){
                            String text = "";
                            try {
                                for (int i = 0; i < jsonArray.length(); i++) {
                                    if(jsonArray.getJSONObject(i).getString("route").toString().contains("4호선")) {
                                        text += "역명: " + jsonArray.getJSONObject(i).getString("name").toString()
                                                + ", 호선: " + jsonArray.getJSONObject(i).getString("route").toString() + "\n";
                                    }
                                }
                                text_view.setText(text);
                            } catch(JSONException e){
                            }
                        }else if(item.getTitle().toString().contains("5호선")){
                            String text = "";
                            try {
                                for (int i = 0; i < jsonArray.length(); i++) {
                                    if(jsonArray.getJSONObject(i).getString("route").toString().contains("5호선")) {
                                        text += "역명: " + jsonArray.getJSONObject(i).getString("name").toString()
                                                + ", 호선: " + jsonArray.getJSONObject(i).getString("route").toString() + "\n";
                                    }
                                }
                                text_view.setText(text);
                            } catch(JSONException e){
                            }
                        }else if(item.getTitle().toString().contains("6호선")){
                            String text = "";
                            try {
                                for (int i = 0; i < jsonArray.length(); i++) {
                                    if(jsonArray.getJSONObject(i).getString("route").toString().contains("6호선")) {
                                        text += "역명: " + jsonArray.getJSONObject(i).getString("name").toString()
                                                + ", 호선: " + jsonArray.getJSONObject(i).getString("route").toString() + "\n";
                                    }
                                }
                                text_view.setText(text);
                            } catch(JSONException e){
                            }
                        }else if(item.getTitle().toString().contains("7호선")){
                            String text = "";
                            try {
                                for (int i = 0; i < jsonArray.length(); i++) {
                                    if(jsonArray.getJSONObject(i).getString("route").toString().contains("7호선")) {
                                        text += "역명: " + jsonArray.getJSONObject(i).getString("name").toString()
                                                + ", 호선: " + jsonArray.getJSONObject(i).getString("route").toString() + "\n";
                                    }
                                }
                                text_view.setText(text);
                            } catch(JSONException e){
                            }
                        }else if(item.getTitle().toString().contains("8호선")){
                            String text = "";
                            try {
                                for (int i = 0; i < jsonArray.length(); i++) {
                                    if(jsonArray.getJSONObject(i).getString("route").toString().contains("8호선")) {
                                        text += "역명: " + jsonArray.getJSONObject(i).getString("name").toString()
                                                + ", 호선: " + jsonArray.getJSONObject(i).getString("route").toString() + "\n";
                                    }
                                }
                                text_view.setText(text);
                            } catch(JSONException e){
                            }
                        }else if(item.getTitle().toString().contains("9호선")){
                            String text = "";
                            try {
                                for (int i = 0; i < jsonArray.length(); i++) {
                                    if(jsonArray.getJSONObject(i).getString("route").toString().contains("9호선")) {
                                        text += "역명: " + jsonArray.getJSONObject(i).getString("name").toString()
                                                + ", 호선: " + jsonArray.getJSONObject(i).getString("route").toString() + "\n";
                                    }
                                }
                                text_view.setText(text);
                            } catch(JSONException e){
                            }
                        }
                        return true;
                    }
                });
        popup.show();
    }
}
