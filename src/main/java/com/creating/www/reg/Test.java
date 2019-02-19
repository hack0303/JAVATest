package com.creating.www.reg;

import java.util.prefs.BackingStoreException;
import java.util.prefs.NodeChangeEvent;
import java.util.prefs.NodeChangeListener;
import java.util.prefs.PreferenceChangeEvent;
import java.util.prefs.PreferenceChangeListener;
import java.util.prefs.Preferences;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		Preferences pre=Preferences.systemRoot();
		
		try {
			for(String name:pre.childrenNames())System.out.println(name);
		} catch (BackingStoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(String.format("%d,%d,%d",1<<16,1<<8,1));
		pre.node("AlarmEE").put("Version",String.valueOf((1<<16)+(1<<8)+1));
        try {
			System.out.println(pre.nodeExists("AlarmEE")?pre.node("AlarmEE").getInt("Version",11):"无");
		} catch (BackingStoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        int value=pre.node("AlarmEE").getInt("Version",11);
        System.out.println(String.format("%d,%d,%d",value>>>16,value>>>8,value));
        System.out.println((value>>>16&255)+"."+(value>>>8&255)+"."+(value&255));
        pre.node("x").addNodeChangeListener(new NodeChangeListener() {
			
			@Override
			public void childRemoved(NodeChangeEvent evt) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void childAdded(NodeChangeEvent evt) {
				// TODO Auto-generated method stub
				
			}
		});
        pre.node("AlarmEE").addPreferenceChangeListener(new PreferenceChangeListener() {
			
			@Override
			public void preferenceChange(PreferenceChangeEvent evt) {
				System.out.println(evt.getKey());
				
			}
		});
        Object obj=new Object();
        synchronized(obj) 
        {
        	obj.wait();
        }
	}

}
