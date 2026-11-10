package defpackage;

import com.google.android.material.button.MaterialButton;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xj implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ int t;

    public /* synthetic */ xj(Object obj, int i, byte b) {
        this.j = b;
        this.a = obj;
        this.t = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.j;
        int i = this.t;
        Object obj = this.a;
        switch (b) {
            case 0:
                ((IntConsumer) obj).accept(i);
                break;
            default:
                int[] iArr = MaterialButton.V;
                ((MaterialButton) obj).setIconSize(i);
                break;
        }
    }
}
