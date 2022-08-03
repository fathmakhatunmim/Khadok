package com.example.khadok;

import android.app.Activity;
import android.os.*;
import android.view.View.*;
import android.widget.*;
import android.util.*;

import java.util.*;

import android.widget.LinearLayout;
import android.widget.Button;
import android.content.Intent;
import android.view.View;


public class firstpage extends Activity {

    private LinearLayout lin;
    private LinearLayout linear1;
    private Button vegbtn;
    private Button nonvegbtn;
    private ImageView imageView;

    private Intent b = new Intent();

    String user;
    @Override
    protected void onCreate(Bundle _savedInstanceState) {
        super.onCreate(_savedInstanceState);
        setContentView(R.layout.activity_firstpage);
        initialize(_savedInstanceState);
        initializeLogic();

        Intent intent = getIntent();
        String user1 = intent.getStringExtra("customerid");
        user=user1;
        Global.user=user;
    }

    private void initialize(Bundle _savedInstanceState) {

        linear1 = (LinearLayout) findViewById(R.id.linear1);

        vegbtn = (Button) findViewById(R.id.vegbtn);
        nonvegbtn = (Button) findViewById(R.id.nonvegbtn);
        //imageView= (ImageView) findViewById(R.id.imageView4);
        lin = (LinearLayout) findViewById(R.id.lin);


        vegbtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View _view) {
                b.setClass(getApplicationContext(), MainActivity1.class);;
                b.putExtra("foodtype",1);
                b.putExtra("customerid",user);
                startActivity(b);
                finish();
            }
        });
        nonvegbtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View _view) {
                b.setClass(getApplicationContext(), MainActivity1.class);
                b.putExtra("foodtype",2);
                b.putExtra("customerid",user);
                startActivity(b);
                finish();
            }
        });
       /*  button3.setOnClickListener(new OnClickListener() {
             @Override
             public void onBackPressed() {
                 b.setClass(getApplicationContext(), GetStarted.class);
                 startActivity(b);
                 finish();
             }
         });*/
    }

    private void initializeLogic() {
    }

    @Override
    protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {

        super.onActivityResult(_requestCode, _resultCode, _data);

        switch (_requestCode) {

            default:
                break;
        }
    }

    // @Override
//     public void onBackPressed() {
//          b.setClass(getApplicationContext(), WelcomeActivity.class);
//          startActivity(b);
//          finish();
//     }
    @Deprecated
    public void showMessage(String _s) {
        Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
    }

    @Deprecated
    public int getLocationX(View _v) {
        int _location[] = new int[2];
        _v.getLocationInWindow(_location);
        return _location[0];
    }

    @Deprecated
    public int getLocationY(View _v) {
        int _location[] = new int[2];
        _v.getLocationInWindow(_location);
        return _location[1];
    }

    @Deprecated
    public int getRandom(int _min, int _max) {
        Random random = new Random();
        return random.nextInt(_max - _min + 1) + _min;
    }

    @Deprecated
    public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
        ArrayList<Double> _result = new ArrayList<Double>();
        SparseBooleanArray _arr = _list.getCheckedItemPositions();
        for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
            if (_arr.valueAt(_iIdx))
                _result.add((double) _arr.keyAt(_iIdx));
        }
        return _result;
    }

    @Deprecated
    public float getDip(int _input) {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
    }

    @Deprecated
    public int getDisplayWidthPixels() {
        return getResources().getDisplayMetrics().widthPixels;
    }

    @Deprecated
    public int getDisplayHeightPixels() {
        return getResources().getDisplayMetrics().heightPixels;
    }


    @Override
    public void onBackPressed() {
        b.setClass(getApplicationContext(), GetStarted.class);
        startActivity(b);
        finish();
    }
}
