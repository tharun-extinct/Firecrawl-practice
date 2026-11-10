package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Bundle;
import androidx.work.CoroutineWorker;
import io.appground.blehid.BleHidService;
import io.appground.blehid.ClassicHidService;
import io.appground.blek.widget.ConnectDeviceActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends zz4 implements bz1 {
    public final /* synthetic */ Object b;
    public Object c;
    public final /* synthetic */ Object i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Object obj2, Object obj3, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = obj;
        this.i = obj2;
        this.b = obj3;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        Object obj2 = this.b;
        Object obj3 = this.i;
        switch (b) {
            case 0:
                return new c((ja3) this.c, (lx3) obj3, (ya1) obj2, mu0Var, (byte) 0);
            case 1:
                c cVar = new c((cz1) obj3, (p8) obj2, mu0Var, (byte) 1);
                cVar.c = obj;
                return cVar;
            case 2:
                c cVar2 = new c((cz1) obj3, (q8) obj2, mu0Var, (byte) 2);
                cVar2.c = obj;
                return cVar2;
            case 3:
                c cVar3 = new c((dz1) obj3, (p8) obj2, mu0Var, (byte) 3);
                cVar3.c = obj;
                return cVar3;
            case 4:
                c cVar4 = new c((dz1) obj3, (q8) obj2, mu0Var, (byte) 4);
                cVar4.c = obj;
                return cVar4;
            case 5:
                return new c((w12) this.c, (Context) obj3, (tp) obj2, mu0Var, (byte) 5);
            case 6:
                c cVar5 = new c((String) obj3, (rt) obj2, mu0Var, (byte) 6);
                cVar5.c = obj;
                return cVar5;
            case 7:
                return new c((rt) this.c, (to2) obj3, (ss) obj2, mu0Var, (byte) 7);
            case 8:
                return new c((BleHidService) this.c, (BluetoothDevice) obj3, (s54) obj2, mu0Var, (byte) 8);
            case 9:
                return new c((BleHidService) this.c, (BluetoothDevice) obj3, (String) obj2, mu0Var, (byte) 9);
            case 10:
                return new c((p60) this.c, (gh3) obj3, (p2) obj2, mu0Var, (byte) 10);
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                c cVar6 = new c((nt2) obj3, (yt3) obj2, mu0Var, (byte) 11);
                cVar6.c = obj;
                return cVar6;
            case 12:
                return new c((pc0) this.c, (nt2) obj3, (yt3) obj2, mu0Var, (byte) 12);
            case 13:
                c cVar7 = new c((bz1) obj3, (pc0) obj2, mu0Var, (byte) 13);
                cVar7.c = obj;
                return cVar7;
            case 14:
                c cVar8 = new c((BluetoothAdapter) obj3, (Context) obj2, mu0Var, (byte) 14);
                cVar8.c = obj;
                return cVar8;
            case kq2.x /* 15 */:
                c cVar9 = new c((x84) obj3, (ClassicHidService) obj2, mu0Var, (byte) 15);
                cVar9.c = obj;
                return cVar9;
            case 16:
                c cVar10 = new c((ConnectDeviceActivity) obj3, (String) obj2, mu0Var, (byte) 16);
                cVar10.c = obj;
                return cVar10;
            case 17:
                return new c((qr0) this.c, (String) obj3, (Integer) obj2, mu0Var, (byte) 17);
            case 18:
                return new c((qr0) this.c, (Context) obj3, (String) obj2, mu0Var, (byte) 18);
            case 19:
                return new c((wm4) this.c, (gu2) obj3, (qr0) obj2, mu0Var, (byte) 19);
            case 20:
                return new c((ku0) this.c, (BroadcastReceiver.PendingResult) obj3, (bz1) obj2, mu0Var, (byte) 20);
            case 21:
                return new c((hh2) obj3, (CoroutineWorker) obj2, mu0Var, (byte) 21);
            case 22:
                c cVar11 = new c((b31) obj3, (bz1) obj2, mu0Var, (byte) 22);
                cVar11.c = obj;
                return cVar11;
            case 23:
                return new c((b31) this.c, (ub3) obj3, (bz1) obj2, mu0Var, (byte) 23);
            case 24:
                return new c((ja3) this.c, (ue2) obj3, (ya1) obj2, mu0Var, (byte) 24);
            case 25:
                return new c((e62) this.c, (e40) obj3, (Bundle) obj2, mu0Var, (byte) 25);
            case 26:
                return new c((bz1) this.c, (Context) obj3, (BluetoothAdapter) obj2, mu0Var, (byte) 26);
            case 27:
                return new c((ah2) this.c, (rw3) obj3, this.b, mu0Var, (byte) 27);
            case 28:
                return new c((ah2) this.c, (rw3) obj3, (Long) obj2, mu0Var, (byte) 28);
            default:
                return new c((qq2) this.c, (no1) obj3, (x32) obj2, mu0Var, (byte) 29);
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) throws Throwable {
        byte b = this.q;
        px0 px0Var = px0.j;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                return ((c) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 1:
                return ((c) b((mu0) obj2, (i13) obj)).u(og5Var);
            case 2:
                return ((c) b((mu0) obj2, (l11) obj)).u(og5Var);
            case 3:
                return ((c) b((mu0) obj2, (fp3) obj)).u(og5Var);
            case 4:
                return ((c) b((mu0) obj2, (fp3) obj)).u(og5Var);
            case 5:
                return ((c) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 6:
                return ((c) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 7:
                return ((c) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 8:
                return ((c) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 9:
                return ((c) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 10:
                return ((c) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                ((c) b((mu0) obj2, (ad2) obj)).u(og5Var);
                return px0Var;
            case 12:
                ((c) b((mu0) obj2, (og5) obj)).u(og5Var);
                return px0Var;
            case 13:
                ((c) b((mu0) obj2, (yt3) obj)).u(og5Var);
                return px0Var;
            case 14:
                return ((c) b((mu0) obj2, (ez3) obj)).u(og5Var);
            case kq2.x /* 15 */:
                return ((c) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 16:
                return ((c) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 17:
                return ((c) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 18:
                return ((c) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 19:
                return ((c) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 20:
                return ((c) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 21:
                ((c) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return og5Var;
            case 22:
                return ((c) b((mu0) obj2, (pf4) obj)).u(og5Var);
            case 23:
                return ((c) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 24:
                return ((c) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 25:
                return ((c) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 26:
                return ((c) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 27:
                return ((c) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 28:
                return ((c) b((mu0) obj2, (ox0) obj)).u(og5Var);
            default:
                return ((c) b((mu0) obj2, (ox0) obj)).u(og5Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:202:0x03b5 A[Catch: all -> 0x03bc, TryCatch #8 {all -> 0x03bc, blocks: (B:200:0x03a2, B:202:0x03b5, B:204:0x03b9), top: B:440:0x03a2 }] */
    /* JADX WARN: Code duplicated, block: B:207:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:210:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:296:0x05f4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:206:0x03d7 -> B:208:0x03db). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:210:0x03e5
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ix
    public final java.lang.Object u(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Object obj2, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.i = obj;
        this.b = obj2;
    }
}
