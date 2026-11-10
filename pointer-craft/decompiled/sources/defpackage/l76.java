package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes.dex */
public class l76 implements ot4, gm0, ba0, gm5, ex0, so4, yx0 {
    public final /* synthetic */ byte j;
    public static final l76 t = new l76(1);
    public static final k44 a = new k44(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
    public static final l76 m = new l76(3);
    public static final l76 q = new l76(4);
    public static final l76 w = new l76(5);
    public static final /* synthetic */ l76 c = new l76(6);
    public static final /* synthetic */ l76 i = new l76(7);

    public /* synthetic */ l76(byte b) {
        this.j = b;
    }

    @Override // defpackage.gm0
    public Object c(vl vlVar) {
        switch (this.j) {
            case 6:
                vlVar.v(h63.class);
                return new cm1((byte) 0);
            default:
                return new io4((Context) vlVar.g(Context.class));
        }
    }

    @Override // defpackage.so4
    public er1 g(uy4 uy4Var) {
        return new mr1();
    }

    @Override // defpackage.gm5
    public int l() {
        return R.id.view_tree_navigation_event_dispatcher_owner;
    }

    @Override // defpackage.ba0
    public byte[] n(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return bArr2;
    }

    @Override // defpackage.ot4
    public boolean r(Object obj, Object obj2) {
        return obj == obj2;
    }

    public String toString() {
        switch (this.j) {
            case 4:
                return "ReferentialEqualityPolicy";
            case 9:
                return "Empty";
            case kq2.x /* 15 */:
                return "SharingStarted.Eagerly";
            case 17:
                int iHashCode = hashCode();
                a11.x(16);
                String string = Integer.toString(iHashCode, 16);
                string.getClass();
                return xi3.a("CreationExtras.Key@", string, "<", v54.g(Application.class).r(), ">");
            default:
                return super.toString();
        }
    }

    public Signature[] y(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
