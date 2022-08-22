package skinsbox.fffskinsbundle.fff.skintool.fffskinleaders.fffskintool.emotes.toast;

import android.content.Context;
import android.widget.Toast;

public class Toaster {

    public static void sx(Context context,String s){
        Toast.makeText(context, s, Toast.LENGTH_SHORT).show();
    }
}
