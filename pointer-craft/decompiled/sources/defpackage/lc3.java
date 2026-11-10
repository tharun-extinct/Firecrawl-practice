package defpackage;

import android.content.SharedPreferences;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lc3 implements my1 {
    public final /* synthetic */ byte j;

    public /* synthetic */ lc3(byte b) {
        this.j = b;
    }

    @Override // defpackage.my1
    public final Object g() {
        switch (this.j) {
            case 0:
                return new kd4();
            case 1:
                jc2 jc2Var = new jc2((byte) 0);
                jc2Var.g(v54.g(jd4.class), new m92((byte) 17));
                return jc2Var.y();
            case 2:
                ku0 ku0VarX = k33.x(ni1.j);
                k33.d(ku0VarX, null);
                return ku0VarX;
            case 3:
                return new jn3();
            case 4:
                return dh6.r();
            case 5:
                return null;
            case 6:
                return new h94();
            case 7:
                return new sc4(new LinkedHashMap());
            case 8:
                return null;
            case 9:
                return new rf4(0);
            case 10:
                return null;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                SharedPreferences sharedPreferences = d52.b;
                sharedPreferences.getClass();
                return sharedPreferences;
            case 12:
                return new un4();
            case 13:
                return new vb1(0.0f);
            case 14:
                return qf5.g;
            case kq2.x /* 15 */:
                return y31.g();
            case 16:
                k85 k85VarN = pf5.n();
                k85 k85VarV = pf5.v();
                k85 k85VarX = pf5.x();
                k85 k85VarL = pf5.l();
                k85 k85VarJ = pf5.j();
                k85 k85VarT = pf5.t();
                k85 k85VarW = pf5.w();
                k85 k85VarC = pf5.c();
                k85 k85VarI = pf5.i();
                k85 k85VarG = pf5.g();
                k85 k85VarY = pf5.y();
                k85 k85VarR = pf5.r();
                k85 k85VarA = pf5.a();
                k85 k85VarM = pf5.m();
                k85 k85VarQ = pf5.q();
                return new mf5(k85VarN, k85VarV, k85VarX, k85VarL, k85VarJ, k85VarT, k85VarW, k85VarC, k85VarI, k85VarG, k85VarY, k85VarR, k85VarA, k85VarM, k85VarQ, k85VarN, k85VarV, k85VarX, k85VarL, k85VarJ, k85VarT, k85VarW, k85VarC, k85VarI, k85VarG, k85VarY, k85VarR, k85VarA, k85VarM, k85VarQ);
            default:
                return og5.g;
        }
    }
}
