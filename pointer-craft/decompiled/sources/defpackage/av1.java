package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class av1 implements Callable {
    public final /* synthetic */ byte g;
    public final /* synthetic */ int n;
    public final /* synthetic */ Context r;
    public final /* synthetic */ Object v;
    public final /* synthetic */ String y;

    public /* synthetic */ av1(String str, Context context, Object obj, int i, byte b) {
        this.g = b;
        this.y = str;
        this.r = context;
        this.v = obj;
        this.n = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        byte b = this.g;
        int i = this.n;
        Object obj = this.v;
        Context context = this.r;
        String str = this.y;
        switch (b) {
            case 0:
                Object[] objArr = {(xu1) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return dv1.y(str, context, Collections.unmodifiableList(arrayList), i);
            default:
                try {
                    return dv1.y(str, context, (ArrayList) obj, i);
                } catch (Throwable unused) {
                    return new cv1(-3);
                }
        }
    }
}
