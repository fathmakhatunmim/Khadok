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


public class GetStarted extends Activity {

    private LinearLayout lin;
     private LinearLayout linear1;
     private Button button2;
     private Button button;

    private Button button3;
    // private TextView textView;
     private TextView khadok;
     private ImageView imageView;

     private Intent b = new Intent();
     @Override
     protected void onCreate(Bundle _savedInstanceState) {
          super.onCreate(_savedInstanceState);
          setContentView(R.layout.activity_get_started);
          initialize(_savedInstanceState);
          initializeLogic();
     }

     private void initialize(Bundle _savedInstanceState) {

          linear1 = (LinearLayout) findViewById(R.id.linear1);
          button2 = (Button) findViewById(R.id.button2);
          button= (Button) findViewById(R.id.button) ;
         // textView= (TextView) findViewById(R.id.textView);
          khadok= (TextView) findViewById(R.id.KHADOK);
          imageView= (ImageView) findViewById(R.id.imageView3);
          lin=(LinearLayout) findViewById(R.id.lin);

          button.setOnClickListener(new OnClickListener() {
               @Override
               public void onClick(View _view) {
                    b.setClass(getApplicationContext(), login_page.class);
                    startActivity(b);
                    finish();
               }
          });
         button2.setOnClickListener(new OnClickListener() {
             @Override
             public void onClick(View _view) {
                 b.setClass(getApplicationContext(), signup_activity.class);
                 startActivity(b);
                 finish();
             }
         });
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
                    _result.add((double)_arr.keyAt(_iIdx));
          }
          return _result;
     }

     @Deprecated
     public float getDip(int _input){
          return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
     }

     @Deprecated
     public int getDisplayWidthPixels(){
          return getResources().getDisplayMetrics().widthPixels;
     }

     @Deprecated
     public int getDisplayHeightPixels(){
          return getResources().getDisplayMetrics().heightPixels;
     }

}