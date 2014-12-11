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
            return true;
        } else if (action.equalsIgnoreCase("setInputAdjustResize")){
            System.out.println("setInputAdjustResize");
            cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    cordova.getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
                    System.out.println("before win.hasSoftInputMode = " + cordova.getActivity().getWindow().hasSoftInputMode());
                    System.out.println("setting softInputMode to SOFT_INPUT_ADJUST_RESIZE");
                    System.out.println("after win.hasSoftInputMode = " + cordova.getActivity().getWindow().hasSoftInputMode());
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
        } else if (action.equalsIgnoreCase("setFullScreenFlag")){
            System.out.println("setFullScreenFlag");
            cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    cordova.getActivity().getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
                    System.out.println("setting window-flag FULLSCREEN");
                }
            });
            return true;
        } else if (action.equalsIgnoreCase("unsetFullScreenFlag")){
            System.out.println("unsetFullScreenFlag");
            cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    cordova.getActivity().getWindow().clearFlags(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_UNSPECIFIED);
                    System.out.println("un-setting window-flag FULLSCREEN");
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
