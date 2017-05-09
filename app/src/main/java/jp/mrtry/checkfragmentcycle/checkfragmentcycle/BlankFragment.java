package jp.mrtry.checkfragmentcycle.checkfragmentcycle;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class BlankFragment extends Fragment {
    final String TAG ="FragmentSample";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG,"onCreate", new Exception()  );
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.e(TAG,"onCreateView", new Exception() );
        return inflater.inflate(R.layout.fragment_blank ,container,false);
    }

    @Override
    public void onActivityCreated(Bundle bundle){
        super.onActivityCreated(bundle);
        Log.e(TAG,"onActivityCreated", new Exception() );
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.e(TAG,"onStart", new Exception() );
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.e(TAG,"onResume", new Exception() );
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.e(TAG,"onPause", new Exception() );
    }

    @Override
    public void onStop(){
        super.onStop();
        Log.e(TAG,"onStop", new Exception() );
    }

    @Override
    public void onDestroyView(){
        super.onDestroyView();
        Log.e(TAG,"onDestroyView", new Exception() );
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.e(TAG,"onDestroy", new Exception() );
    }

    @Override
    public void onDetach(){
        super.onDetach();
        Log.e(TAG,"onDetach", new Exception() );
    }

}
