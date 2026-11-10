package defpackage;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class gi1 extends mh1 implements Runnable {
    public final WeakReference j;

    public gi1(EditText editText) {
        this.j = new WeakReference(editText);
    }

    @Override // java.lang.Runnable
    public final void run() {
        hi1.g((EditText) this.j.get(), 1);
    }

    @Override // defpackage.mh1
    public final void y() {
        Handler handler;
        EditText editText = (EditText) this.j.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }
}
