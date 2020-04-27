package com.example.doback;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;

public class JoinActivity extends AppCompatActivity {

    EditText et_id, et_pw, et_pwCheck, et_email, et_phone;
    Button btn_join;
    static RequestQueue requestQueue;
    StringRequest request;

    public class MyAsyncTask extends AsyncTask<Void, Integer, Boolean> {

        @Override
        protected Boolean doInBackground(Void... strings){
            if(requestQueue == null){
                requestQueue = Volley.newRequestQueue(getApplicationContext());
            }

            btn_join.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    testJson();
                }
            });
            return true;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }
        @Override
        protected void onPostExecute(Boolean s) {
            super.onPostExecute(s);
        }
        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
        }
        @Override
        protected void onCancelled(Boolean s) {
            super.onCancelled(s);
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("뒤로가기");
        actionBar.setDisplayHomeAsUpEnabled(true);

        getAppKeyHash();

        et_id = findViewById(R.id.et_id);
        et_pw = findViewById(R.id.et_pw);
        et_email = findViewById(R.id.et_email);
        et_phone = findViewById(R.id.et_phone);
        btn_join = findViewById(R.id.btn_join);
        if(requestQueue == null){
            requestQueue = Volley.newRequestQueue(getApplicationContext());
        }

        btn_join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testJson();
            }
        });

        MyAsyncTask asyncTask = new MyAsyncTask();
        asyncTask.execute();

//        if(requestQueue == null){
//            requestQueue = Volley.newRequestQueue(getApplicationContext());
//        }
//
//        join.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                testJson();
//
//            }
//        });

    }

    public void testJson(){
        String url = "http://192.168.56.1:8082/Doback/JoinService";



        request = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jObj = new JSONObject(response);
                    boolean error = jObj.getBoolean("error");

                    if (!error) {


                    } else {
                        Toast.makeText(JoinActivity.this,
                                "요청에 실패했습니다 : 서버 오류", Toast.LENGTH_SHORT).show();
                    }

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                println(response);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }

        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<String, String>();
                params.put("id", et_id.getText().toString());
                params.put("pw", et_pw.getText().toString());
                params.put("email", et_email.getText().toString());
                params.put("phone", et_phone.getText().toString());
                return params;
            }
        };

        request.setShouldCache(false);
        requestQueue.add(request);
    }

    public void println(String data){

        if (data.equals("true")){
            Log.v("son",data);
            Intent intent = new Intent(JoinActivity.this, LoginActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(JoinActivity.this,
                    "회원가입 실패", Toast.LENGTH_SHORT).show();
        }

    }
    // 해시 키 수집 코드
    private void getAppKeyHash() {
        try {
            PackageInfo info = getPackageManager().getPackageInfo(getPackageName(),
                    PackageManager.GET_SIGNATURES);
            for (Signature signature : info.signatures) {
                MessageDigest md;
                md = MessageDigest.getInstance("SHA");
                md.update(signature.toByteArray());
                String something = new String(Base64.encode(md.digest(), 0));
                Log.e("Hash key", something);
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            Log.e("name not found", e.toString());
        }
    }
}