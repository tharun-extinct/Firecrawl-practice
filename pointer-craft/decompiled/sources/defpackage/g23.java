package defpackage;

import android.graphics.drawable.Drawable;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g23 implements Runnable {
    public final /* synthetic */ Drawable a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ MaterialButton t;

    public /* synthetic */ g23(MaterialButton materialButton, Drawable drawable, byte b) {
        this.j = b;
        this.t = materialButton;
        this.a = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.j;
        Drawable drawable = this.a;
        MaterialButton materialButton = this.t;
        switch (b) {
            case 0:
                int[] iArr = MaterialButton.V;
                materialButton.setIcon(drawable);
                break;
            default:
                int[] iArr2 = MaterialButton.V;
                materialButton.setIcon(drawable);
                break;
        }
    }
}
