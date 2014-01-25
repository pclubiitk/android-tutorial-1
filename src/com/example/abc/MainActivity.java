// Mention your package in the first line, this is basically the folder structure you follow in your src folder
package com.example.abc;

// Write all your imports here. Ideally, If you are using an IDE, it should be done automatically
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

// All activities that you create will always extend android.app.Activity
public class MainActivity extends Activity {

// Override means you want to overwrite the onCreate function of android.app.Activity with your own version of onCreate version
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);//You are calling onCreate function of android.app.Activity which takes care of all the basic setup that needs to be done
		setContentView(R.layout.activity_main);//Mention which xml file you want to use as your layout
		
		final EditText username = (EditText) findViewById(R.id.edit);//EditText are input fields in Android. findViewById function finds a view from the xml file you mentioned above and returns its instance 
		
		final TextView hello_world = (TextView) findViewById(R.id.text); //TextView means a place to put your text on screen as eveident from the name itself.
		
		hello_world.setText("abc"); // You can set text inside any textview using the setText function
		
		Button btn = (Button) findViewById(R.id.btn); // finding a button from xml layout

		//defining what to do when someone clicks on a button with the setOnClick function
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				hello_world.setText(username.getText().toString()); // Setting the text which was entered into the input field in the text view
			}
		});

	}

	//To setup the menu which apears on clicking the left button on older android phones or to setup the action bar in newer phones
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; 
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
