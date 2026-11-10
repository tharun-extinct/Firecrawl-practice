package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.ViewGroup;
import com.android.billingclient.api.Purchase;
import io.appground.blehid.BleHidService;
import io.appground.blek.widget.ConnectDeviceActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends zz4 implements bz1 {
    public Object c;
    public final /* synthetic */ Object i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Object obj, Object obj2, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = obj;
        this.i = obj2;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        Object obj2 = this.i;
        switch (b) {
            case 0:
                return new q((ja3) this.c, (p72) obj2, mu0Var, (byte) 0);
            case 1:
                return new q((ja3) this.c, (q72) obj2, mu0Var, (byte) 1);
            case 2:
                q qVar = new q((td) obj2, mu0Var, (byte) 2);
                qVar.c = obj;
                return qVar;
            case 3:
                q qVar2 = new q((sv3) obj2, mu0Var, (byte) 3);
                qVar2.c = obj;
                return qVar2;
            case 4:
                return new q((gp) this.c, (yl0) obj2, mu0Var, (byte) 4);
            case 5:
                return new q((xt1) this.c, (ya5) obj2, mu0Var, (byte) 5);
            case 6:
                return new q((w10) this.c, (Purchase) obj2, mu0Var, (byte) 6);
            case 7:
                return new q((w10) this.c, (String) obj2, mu0Var, (byte) 7);
            case 8:
                return new q((BleHidService) obj2, mu0Var, (byte) 8);
            case 9:
                return new q((i60) this.c, (k44) obj2, mu0Var, (byte) 9);
            case 10:
                return new q((p60) this.c, (lt) obj2, mu0Var, (byte) 10);
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                q qVar3 = new q((dd0) obj2, mu0Var, (byte) 11);
                qVar3.c = obj;
                return qVar3;
            case 12:
                return new q((ao0) obj2, mu0Var, (byte) 12);
            case 13:
                return new q((eo0) this.c, (Runnable) obj2, mu0Var, (byte) 13);
            case 14:
                return new q((ConnectDeviceActivity) this.c, (String) obj2, mu0Var, (byte) 14);
            case kq2.x /* 15 */:
                q qVar4 = new q((Context) obj2, mu0Var, (byte) 15);
                qVar4.c = obj;
                return qVar4;
            case 16:
                return new q((bz1) this.c, (ov3) obj2, mu0Var, (byte) 16);
            case 17:
                return new q((bz1) this.c, (u54) obj2, mu0Var, (byte) 17);
            case 18:
                return new q((Context) this.c, (qr0) obj2, mu0Var, (byte) 18);
            case 19:
                return new q((e40) this.c, (qr0) obj2, mu0Var, (byte) 19);
            case 20:
                q qVar5 = new q((qr0) obj2, mu0Var, (byte) 20);
                qVar5.c = obj;
                return qVar5;
            case 21:
                return new q((yv0) obj2, mu0Var, (byte) 21);
            case 22:
                return new q((b65) this.c, (l60) obj2, mu0Var, (byte) 22);
            case 23:
                return new q((vu3) this.c, (b65) obj2, mu0Var, (byte) 23);
            case 24:
                q qVar6 = new q((bz1) obj2, mu0Var, (byte) 24);
                qVar6.c = obj;
                return qVar6;
            case 25:
                return new q((ky0) this.c, (ViewGroup) obj2, mu0Var, (byte) 25);
            case 26:
                return new q((ob3) this.c, (SharedPreferences) obj2, mu0Var, (byte) 26);
            case 27:
                return new q((qq1) this.c, (ue2) obj2, mu0Var, (byte) 27);
            case 28:
                return new q((er1) this.c, (ez3) obj2, mu0Var, (byte) 28);
            default:
                return new q((ve2) this.c, (ob3) obj2, mu0Var, (byte) 29);
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) throws Throwable {
        byte b = this.q;
        px0 px0Var = px0.j;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                return ((q) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 1:
                return ((q) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 2:
                ((q) b((mu0) obj2, (dd2) obj)).u(og5Var);
                return px0Var;
            case 3:
                return ((q) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 4:
                return ((q) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 5:
                return ((q) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 6:
                return ((q) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 7:
                return ((q) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 8:
                return ((q) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 9:
                return ((q) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 10:
                return ((q) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return ((q) b((mu0) obj2, (gr1) obj)).u(og5Var);
            case 12:
                return ((q) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 13:
                return ((q) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 14:
                return ((q) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case kq2.x /* 15 */:
                ((q) b((mu0) obj2, (dz3) obj)).u(og5Var);
                return px0Var;
            case 16:
                return ((q) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 17:
                return ((q) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 18:
                return ((q) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 19:
                return ((q) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 20:
                return ((q) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 21:
                return ((q) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 22:
                return ((q) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 23:
                return ((q) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 24:
                return ((q) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 25:
                ((q) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return px0Var;
            case 26:
                return ((q) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 27:
                return ((q) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 28:
                return ((q) b((mu0) obj2, (ox0) obj)).u(og5Var);
            default:
                return ((q) b((mu0) obj2, (ox0) obj)).u(og5Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:318:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:320:0x0609  */
    /* JADX WARN: Code duplicated, block: B:322:0x0616  */
    /* JADX WARN: Code duplicated, block: B:326:0x0624  */
    /* JADX WARN: Code duplicated, block: B:328:0x0631  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [mu0] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:321:0x0614 -> B:323:0x0618). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ix
    public final java.lang.Object u(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Object obj, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.i = obj;
    }
}
