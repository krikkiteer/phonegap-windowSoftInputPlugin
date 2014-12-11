package com.krikkiteer.plugins;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;

import org.json.JSONArray;
import org.json.JSONException;

import android.view.WindowManager;

public class windowSoftInputPlugin extends CordovaPlugin {
	
	@Override
	public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
		System.out.println("Im in windowSoftInputPlugin");
		if (action.equalsIgnoreCase("setInputAdjustPan")) {
			System.out.println("Start setInputAdjustPan");
			cordova.getActivity().runOnUiThread(new Runnable() {
	            public void run() {
	            	cordova.getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
    				System.out.println("setting softInputMode to SOFT_INPUT_ADJUST_PAN");
	            }
	        });
            //cordova.getActivity().getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
            //callbackContext.success(action);
            return true;
        } else if (action.equalsIgnoreCase("setInputAdjustResize")){
            System.out.println("setInputAdjustResize");
            cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    cordova.getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
                    System.out.println("setting softInputMode to SOFT_INPUT_ADJUST_RESIZE");
                }
            });
            return true;
        } else if (action.equalsIgnoreCase("setInputAdjustUnspecified")){
            System.out.println("setInputAdjustUnspecified");
            cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    cordova.getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_UNSPECIFIED);
                    System.out.println("setting softInputMode to SOFT_INPUT_ADJUST_UNSPECIFIED");
                }
            });
            return true;
        } else {
			System.out.println("UNKNOWN");
			callbackContext.error("unknown action" + action);
            return false;
        }
	}

}
