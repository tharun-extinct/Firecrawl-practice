package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h22 implements xy1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object t;

    public /* synthetic */ h22(int i, String str, byte[] bArr) {
        this.j = (byte) 2;
        this.m = str;
        this.t = bArr;
        this.a = i;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) throws Exception {
        byte b = this.j;
        og5 og5Var = og5.g;
        int i = this.a;
        Object obj2 = this.m;
        Object obj3 = this.t;
        switch (b) {
            case 0:
                co2 co2Var = (co2) obj;
                fo2 fo2VarS = go2.s();
                String canonicalName = ((l22) obj3).getClass().getCanonicalName();
                fo2VarS.n();
                ((go2) fo2VarS.t).z(canonicalName);
                fo2VarS.n();
                ((go2) fo2VarS.t).u(i);
                fo2VarS.n();
                ((go2) fo2VarS.t).p((String) obj2);
                go2 go2Var = (go2) fo2VarS.y();
                co2Var.n();
                ((po2) co2Var.t).A(go2Var);
                return og5Var;
            case 1:
                co2 co2Var2 = (co2) obj;
                jo2 jo2VarS = ko2.s();
                String canonicalName2 = ((l22) obj3).getClass().getCanonicalName();
                jo2VarS.n();
                ((ko2) jo2VarS.t).z(canonicalName2);
                jo2VarS.n();
                ((ko2) jo2VarS.t).p(i);
                Parcel parcelObtain = Parcel.obtain();
                ((Bundle) obj2).writeToParcel(parcelObtain, 0);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                ca0 ca0VarN = ea0.n(bArrMarshall, 0, bArrMarshall.length);
                jo2VarS.n();
                ((ko2) jo2VarS.t).u(ca0VarN);
                ko2 ko2Var = (ko2) jo2VarS.y();
                co2Var2.n();
                ((po2) co2Var2.t).C(ko2Var);
                return og5Var;
            case 2:
                String str = (String) obj2;
                byte[] bArr = (byte[]) obj3;
                tb4 tb4Var = (tb4) obj;
                tb4Var.getClass();
                cc4 cc4VarO = tb4Var.O("UPDATE layout SET name = ?, data = ? WHERE uid =?");
                try {
                    if (str == null) {
                        cc4VarO.g(1);
                    } else {
                        cc4VarO.m(str, 1);
                    }
                    cc4VarO.l(2, bArr);
                    cc4VarO.n(3, i);
                    cc4VarO.H();
                    cc4VarO.close();
                    return og5Var;
                } catch (Throwable th) {
                    cc4VarO.close();
                    throw th;
                }
            default:
                gk5 gk5Var = (gk5) obj3;
                us3 us3Var = (us3) obj2;
                ts3 ts3Var = (ts3) obj;
                int i2 = gk5Var.y;
                s55 s55Var = gk5Var.g;
                wb5 wb5Var = gk5Var.r;
                k75 k75Var = (k75) gk5Var.n.g();
                s55Var.g(um3.j, x52.g(ts3Var, i2, wb5Var, k75Var != null ? k75Var.g : null, false, us3Var.j), i, us3Var.t);
                ts3.m(ts3Var, us3Var, 0, Math.round(-s55Var.g.d()));
                return og5Var;
        }
    }

    public /* synthetic */ h22(l22 l22Var, int i, Object obj, byte b) {
        this.j = b;
        this.t = l22Var;
        this.a = i;
        this.m = obj;
    }

    public /* synthetic */ h22(gk5 gk5Var, us3 us3Var, int i) {
        this.j = (byte) 3;
        this.t = gk5Var;
        this.m = us3Var;
        this.a = i;
    }
}
