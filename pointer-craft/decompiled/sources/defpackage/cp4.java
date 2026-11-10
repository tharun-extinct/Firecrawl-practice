package defpackage;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class cp4 implements Callable {
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object y;

    public /* synthetic */ cp4(Object obj, byte b) {
        this.g = b;
        this.y = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        byte b = this.g;
        Object obj = this.y;
        switch (b) {
            case 0:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((kr) ((ShortcutInfoCompatSaverImpl) obj).y.values()).iterator();
                while (true) {
                    bb2 bb2Var = (bb2) it;
                    if (!bb2Var.hasNext()) {
                        return arrayList;
                    }
                    zo4 zo4Var = ((hp4) bb2Var.next()).r;
                    zo4 zo4Var2 = new zo4();
                    zo4Var2.g = zo4Var.g;
                    zo4Var2.y = zo4Var.y;
                    Intent[] intentArr = zo4Var.r;
                    zo4Var2.r = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
                    zo4Var2.n = zo4Var.n;
                    zo4Var2.v = zo4Var.v;
                    zo4Var2.x = zo4Var.x;
                    zo4Var2.l = zo4Var.l;
                    zo4Var2.j = zo4Var.j;
                    zo4Var2.m = zo4Var.m;
                    zo4Var2.q = zo4Var.q;
                    os3[] os3VarArr = zo4Var.t;
                    if (os3VarArr != null) {
                        zo4Var2.t = (os3[]) Arrays.copyOf(os3VarArr, os3VarArr.length);
                    }
                    if (zo4Var.a != null) {
                        zo4Var2.a = new HashSet(zo4Var.a);
                    }
                    PersistableBundle persistableBundle = zo4Var.w;
                    if (persistableBundle != null) {
                        zo4Var2.w = persistableBundle;
                    }
                    if (TextUtils.isEmpty(zo4Var2.v)) {
                        l0.u("Shortcut must have a non-empty label");
                    } else {
                        Intent[] intentArr2 = zo4Var2.r;
                        if (intentArr2 == null || intentArr2.length == 0) {
                            l0.u("Shortcut must have an intent");
                        } else {
                            arrayList.add(zo4Var2);
                        }
                    }
                    return null;
                }
            case 1:
                return BitmapFactory.decodeFile(((hp4) obj).y);
            case 2:
                return rt2.r.g(((qh6) obj).l);
            default:
                return rt2.r.g(((ui6) obj).g);
        }
    }
}
