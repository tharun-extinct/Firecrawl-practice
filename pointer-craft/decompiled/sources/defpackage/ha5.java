package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.Pair;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.google.mlkit.vision.codescanner.internal.GmsBarcodeScanningDelegateActivity;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class ha5 implements g43, n64, hk3, ak3, wj3, vy4 {
    public final /* synthetic */ byte j;
    public final Object t;

    public /* synthetic */ ha5() {
        this.j = (byte) 7;
        this.t = new CountDownLatch(1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0033  */
    @Override // defpackage.vy4
    public nj6 a(Object obj) {
        boolean z;
        final i46 i46Var = (i46) this.t;
        i46Var.getClass();
        if (((p73) obj).j) {
            if (new Intent().setPackage("com.google.android.gms").setAction("com.google.android.gms.mlkit.ACTION_SCAN_BARCODE").resolveActivity(i46Var.g.getApplicationContext().getPackageManager()) != null) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        synchronized (i46.x) {
            try {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                final long jCurrentTimeMillis = System.currentTimeMillis();
                if (!z) {
                    if (!i46.l) {
                        pm3.g(i46Var.g);
                        i46.l = true;
                    }
                    i46Var.r(200, jElapsedRealtime, jCurrentTimeMillis);
                    return br2.b(new g63("Waiting for the Barcode UI module to be downloaded.", 200));
                }
                AtomicReference atomicReference = i46.v;
                Pair pair = (Pair) atomicReference.getAndSet(null);
                if (pair != null) {
                    ((nj6) ((kb0) pair.second).g.j).q(null);
                }
                kb0 kb0Var = new kb0();
                x25 x25Var = new x25(kb0Var.g);
                atomicReference.set(new Pair(x25Var, kb0Var));
                Intent intent = new Intent(i46Var.g, (Class<?>) GmsBarcodeScanningDelegateActivity.class);
                intent.putExtra("extra_supported_formats", i46Var.y.g);
                i46Var.y.getClass();
                intent.putExtra("extra_allow_manual_input", false);
                i46Var.y.getClass();
                intent.putExtra("extra_enable_auto_zoom", true);
                intent.setFlags(268435456);
                i46Var.g.startActivity(intent);
                nj6 nj6Var = x25Var.g;
                nj6Var.g(new xj3() { // from class: ky5
                    @Override // defpackage.xj3
                    public final void s(nj6 nj6Var2) {
                        int i;
                        i46 i46Var2 = i46Var;
                        long j = jElapsedRealtime;
                        long j2 = jCurrentTimeMillis;
                        if (nj6Var2.n) {
                            i = 201;
                        } else if (nj6Var2.t()) {
                            i = 0;
                        } else {
                            g63 g63Var = (g63) nj6Var2.x();
                            jr2.m(g63Var);
                            i = g63Var.j;
                        }
                        i46Var2.r(i, j, j2);
                    }
                });
                return nj6Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.n64
    public void accept(Object obj, Object obj2) {
        x25 x25Var = (x25) obj2;
        ov5 ov5Var = (ov5) ((qu5) obj).j();
        pu5 pu5Var = (pu5) this.t;
        Parcel parcelG = ov5Var.g();
        yu5.y(parcelG, pu5Var);
        try {
            ov5Var.n.transact(1, parcelG, null, 1);
            parcelG.recycle();
            x25Var.y(null);
        } catch (Throwable th) {
            parcelG.recycle();
            throw th;
        }
    }

    public void g() {
        ((CountDownLatch) this.t).await();
    }

    @Override // defpackage.g43
    public boolean j(i43 i43Var, MenuItem menuItem) {
        return false;
    }

    @Override // defpackage.ak3
    public void m(Exception exc) {
        ((CountDownLatch) this.t).countDown();
    }

    public boolean r() {
        return ((CountDownLatch) this.t).await(30000L, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.hk3
    public void v(Object obj) {
        byte b = this.j;
        Object obj2 = this.t;
        switch (b) {
            case 6:
                ((x25) ((s25) obj2).j).g.c();
                break;
            default:
                ((CountDownLatch) obj2).countDown();
                break;
        }
    }

    @Override // defpackage.wj3
    public void y() {
        ((CountDownLatch) this.t).countDown();
    }

    @Override // defpackage.g43
    public void z(i43 i43Var) {
        Toolbar toolbar = (Toolbar) this.t;
        z3 z3Var = toolbar.j.A;
        if (z3Var == null || !z3Var.j()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.N.m).iterator();
            while (it.hasNext()) {
                ((dx1) it.next()).g.h();
            }
        }
    }

    public ha5(s25 s25Var, s25 s25Var2) {
        this.j = (byte) 6;
        this.t = s25Var2;
    }

    public /* synthetic */ ha5(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }
}
