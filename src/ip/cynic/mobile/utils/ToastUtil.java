package ip.cynic.mobile.utils;

import android.content.Context;
import android.widget.Toast;

public class ToastUtil {

	public static void showToasr(Context ctx,String str){
		Toast.makeText(ctx, str, Toast.LENGTH_SHORT).show();
	}
}
