package com.lanchuang.wgc.android_0080;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity
{

	protected void onCreate(Bundle savedInstanceState )
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		System.out.println("onCreate");
	}

	public boolean onCreateOptionsMenu(Menu menu )
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main ,menu);
		System.out.println("onCreateOptionsMenu");
		return true;
	}

	@SuppressLint("ShowToast")
	public boolean onOptionsItemSelected(MenuItem item )
	{
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		switch(item.getItemId())
		{
			case R.id.action_settings:
				Toast.makeText(this ,"action_settings" ,Toast.LENGTH_LONG).show();
				System.out.println("onOptionsItemSelected");
				break;

			case R.id.shezhi:
				Toast.makeText(this ,"shezhi" ,Toast.LENGTH_LONG).show();
				System.out.println("onOptionsItemSelected");
				break;
				
			case R.id.è®¾ç½®:
				Toast.makeText(this ,"ÉèÖÃ" ,Toast.LENGTH_LONG).show();
				System.out.println("onOptionsItemSelected");
				break;

			default:
				break;
		}
		// int id = item.getItemId();
		// if (id == R.id.action_settings) {
		// return true;
		// }
		return super.onOptionsItemSelected(item);
	}
}
