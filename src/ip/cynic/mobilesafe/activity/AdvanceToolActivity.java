package ip.cynic.mobilesafe.activity;

import ip.cynic.mobilesafe.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * @author cynic
 *
 * 2015-12-3
 */
public class AdvanceToolActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_atools);
	}
	
	
	//������ѯ������ҳ��
	public void openQuery(View v){
		startActivity(new Intent(this, AddressActivity.class));
	}
}
