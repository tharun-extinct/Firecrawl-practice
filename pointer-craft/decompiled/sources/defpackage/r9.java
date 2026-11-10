package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r9 implements Runnable {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        xa3 xa3Var = ba.S0;
        synchronized (xa3Var) {
            try {
                int i = Build.VERSION.SDK_INT;
                Object[] objArr = xa3Var.g;
                int i2 = xa3Var.y;
                Object[] objArr2 = 0;
                if (i < 30) {
                    for (int i3 = 0; i3 < i2; i3++) {
                        final ba baVar = (ba) objArr[i3];
                        boolean showLayoutBounds = baVar.getShowLayoutBounds();
                        Class cls = ba.P0;
                        baVar.setShowLayoutBounds(yf2.H());
                        if (showLayoutBounds != baVar.getShowLayoutBounds()) {
                            final Object[] objArr3 = objArr2 == true ? 1 : 0;
                            baVar.post(new Runnable() { // from class: s9
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b = objArr3;
                                    ba baVar2 = baVar;
                                    switch (b) {
                                        case 0:
                                            ba.s(baVar2.getRoot());
                                            break;
                                        default:
                                            ba.s(baVar2.getRoot());
                                            break;
                                    }
                                }
                            });
                        }
                    }
                } else {
                    for (int i4 = 0; i4 < i2; i4++) {
                        final ba baVar2 = (ba) objArr[i4];
                        final byte b = 1;
                        baVar2.post(new Runnable() { // from class: s9
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b2 = b;
                                ba baVar3 = baVar2;
                                switch (b2) {
                                    case 0:
                                        ba.s(baVar3.getRoot());
                                        break;
                                    default:
                                        ba.s(baVar3.getRoot());
                                        break;
                                }
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
