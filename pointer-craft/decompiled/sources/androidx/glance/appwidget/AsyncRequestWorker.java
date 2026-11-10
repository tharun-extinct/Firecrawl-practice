package androidx.glance.appwidget;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.b8;
import defpackage.hx0;
import defpackage.k33;
import defpackage.mu0;
import defpackage.na1;
import defpackage.p03;
import defpackage.po2;
import defpackage.t42;
import defpackage.x21;

/* JADX INFO: loaded from: classes2.dex */
public final class AsyncRequestWorker extends CoroutineWorker {
    public final t42 b;
    public final po2 s;

    public AsyncRequestWorker(Context context, WorkerParameters workerParameters) {
        byte[] bArr;
        super(context, workerParameters);
        x21 x21Var = na1.g;
        this.b = p03.g;
        Object obj = workerParameters.y.g.get("request");
        if (obj instanceof Byte[]) {
            Byte[] bArr2 = (Byte[]) obj;
            bArr = new byte[bArr2.length];
            for (int i = 0; i < bArr2.length; i++) {
                bArr[i] = bArr2[i].byteValue();
            }
        } else {
            bArr = null;
        }
        this.s = po2.d(bArr);
    }

    @Override // androidx.work.CoroutineWorker
    public final hx0 a() {
        return this.b;
    }

    @Override // androidx.work.CoroutineWorker
    public final Object t(mu0 mu0Var) {
        return k33.B(new b8(this, null, (byte) 2), mu0Var);
    }
}
