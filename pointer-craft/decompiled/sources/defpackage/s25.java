package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import android.view.ViewStructure;
import com.google.android.gms.common.internal.g;
import com.google.mlkit.vision.codescanner.internal.GmsBarcodeScanningDelegateActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class s25 implements pq, xj3, c4, n64, s4 {
    public Object j;

    public s25(byte b) {
        switch (b) {
            case 7:
                Object obj = l32.n;
                this.j = new SparseIntArray();
                break;
            case 10:
                this.j = new nj6();
                break;
            default:
                this.j = new lz2();
                break;
        }
    }

    public void a(String str, int i) {
        ((ViewStructure) this.j).setId(i, null, null, str);
    }

    @Override // defpackage.n64
    public void accept(Object obj, Object obj2) {
        x25 x25Var = (x25) obj2;
        rv5 rv5Var = (rv5) ((wv5) obj).j();
        e35 e35Var = (e35) this.j;
        Parcel parcelG = rv5Var.g();
        yu5.y(parcelG, e35Var);
        try {
            rv5Var.n.transact(1, parcelG, null, 1);
            parcelG.recycle();
            x25Var.y(null);
        } catch (Throwable th) {
            parcelG.recycle();
            throw th;
        }
    }

    public int c(Context context, g gVar) {
        int i;
        int iY;
        jr2.m(context);
        jr2.m(gVar);
        int iX = gVar.x();
        SparseIntArray sparseIntArray = (SparseIntArray) this.j;
        synchronized (sparseIntArray) {
            i = sparseIntArray.get(iX, -1);
        }
        if (i != -1) {
            return i;
        }
        SparseIntArray sparseIntArray2 = (SparseIntArray) this.j;
        synchronized (sparseIntArray2) {
            iY = 0;
            int i2 = 0;
            while (true) {
                try {
                    if (i2 >= sparseIntArray2.size()) {
                        iY = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray2.keyAt(i2);
                    if (iKeyAt > iX && sparseIntArray2.get(iKeyAt) == 0) {
                        break;
                    }
                    i2++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (iY == -1) {
                iY = l32.v.y(context, iX);
            }
            sparseIntArray2.put(iX, iY);
        }
        return iY;
    }

    @Override // defpackage.pq
    public Object g(pf4 pf4Var, Float f, Float f2, xy1 xy1Var, ss4 ss4Var) {
        float fFloatValue = f.floatValue();
        float fFloatValue2 = f2.floatValue();
        Object objQ = lr2.q(pf4Var, Math.signum(fFloatValue2) * Math.abs(fFloatValue), fFloatValue, v70.g(0.0f, fFloatValue2, 28), (oi) this.j, xy1Var, ss4Var);
        return objQ == px0.j ? objQ : (li) objQ;
    }

    public void j(String str) {
        ((ViewStructure) this.j).setContentDescription(str);
    }

    public void l(String str) {
        ((ViewStructure) this.j).setClassName(str);
    }

    public void m(CharSequence charSequence) {
        ((ViewStructure) this.j).setText(charSequence);
    }

    public Bundle n() {
        return ((ViewStructure) this.j).getExtras();
    }

    public void q(float f) {
        ((ViewStructure) this.j).setTextStyle(f, 0, 0, 0);
    }

    @Override // defpackage.s4
    public void r(Object obj) {
        GmsBarcodeScanningDelegateActivity gmsBarcodeScanningDelegateActivity = (GmsBarcodeScanningDelegateActivity) this.j;
        r4 r4Var = (r4) obj;
        Intent intent = r4Var.t;
        if (r4Var.j == -1 && intent != null && intent.hasExtra("extra_barcode_result")) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("extra_barcode_result");
            jr2.m(byteArrayExtra);
            Parcelable.Creator<oi6> creator = oi6.CREATOR;
            jr2.m(creator);
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
            parcelObtain.setDataPosition(0);
            oi6 oi6VarCreateFromParcel = creator.createFromParcel(parcelObtain);
            parcelObtain.recycle();
            i46.n(new vw(new s25(oi6VarCreateFromParcel)), 0);
        } else {
            i46.n(null, intent != null ? intent.getIntExtra("extra_error_code", 13) : 13);
        }
        gmsBarcodeScanningDelegateActivity.finish();
    }

    @Override // defpackage.xj3
    public void s(nj6 nj6Var) {
        Exception excX = nj6Var.x();
        if (excX != null) {
            ((ib0) this.j).j(new g84(excX));
            return;
        }
        boolean z = nj6Var.n;
        ib0 ib0Var = (ib0) this.j;
        if (z) {
            ib0Var.s(null);
        } else {
            ib0Var.j(nj6Var.l());
        }
    }

    public void t(int i, int i2, int i3, int i4) {
        ((ViewStructure) this.j).setDimens(i, i2, 0, 0, i3, i4);
    }

    public void v(s25 s25Var) {
        ((nj6) this.j).n(y25.g, new ha5(this, s25Var));
    }

    public ViewStructure w() {
        return (ViewStructure) this.j;
    }

    public void x() {
        lz2 lz2Var = (lz2) this.j;
        ((xj5) lz2Var.y).n();
        ((xj5) lz2Var.r).n();
        lz2Var.g = 0L;
    }

    public long y(long j) {
        lz2 lz2Var = (lz2) this.j;
        if (vj5.n(j) <= 0.0f || vj5.v(j) <= 0.0f) {
            mc2.y("maximumVelocity should be a positive value. You specified=".concat(vj5.t(j)));
        }
        return d06.g(((xj5) lz2Var.y).r(vj5.n(j)), ((xj5) lz2Var.r).r(vj5.v(j)));
    }

    public /* synthetic */ s25(Object obj) {
        this.j = obj;
    }
}
