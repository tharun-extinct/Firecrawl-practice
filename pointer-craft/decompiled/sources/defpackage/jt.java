package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.widget.Toast;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jt implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ Context t;

    public /* synthetic */ jt(Context context, byte b) {
        this.j = b;
        this.t = context;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        Toast toast;
        Toast toast2;
        byte b = this.j;
        og5 og5Var = og5.g;
        Context context = this.t;
        switch (b) {
            case 0:
                String str = (String) obj;
                str.getClass();
                String strConcat = "Failed to scan code: ".concat(str);
                context.getClass();
                if (Build.VERSION.SDK_INT != 25) {
                    WeakReference weakReference = bi6.z;
                    if (weakReference != null && (toast = (Toast) weakReference.get()) != null) {
                        toast.cancel();
                    }
                    Toast toastMakeText = Toast.makeText(context.getApplicationContext(), strConcat, 1);
                    toastMakeText.show();
                    bi6.z = new WeakReference(toastMakeText);
                }
                return og5Var;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                String strConcat2 = "Failed to scan code: ".concat(str2);
                context.getClass();
                if (Build.VERSION.SDK_INT != 25) {
                    WeakReference weakReference2 = bi6.z;
                    if (weakReference2 != null && (toast2 = (Toast) weakReference2.get()) != null) {
                        toast2.cancel();
                    }
                    Toast toastMakeText2 = Toast.makeText(context.getApplicationContext(), strConcat2, 1);
                    toastMakeText2.show();
                    bi6.z = new WeakReference(toastMakeText2);
                }
                return og5Var;
            case 2:
                String str3 = (String) obj;
                str3.getClass();
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", "Check out my custom layout for the Bluetooth Keyboard & Mouse Android app.\n".concat(str3));
                intent.setType("text/plain");
                context.startActivity(Intent.createChooser(intent, null));
                return og5Var;
            default:
                String string = context.getString(((Integer) obj).intValue());
                string.getClass();
                return string;
        }
    }
}
