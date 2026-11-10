package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class mw5 extends BroadcastReceiver {
    public boolean g;
    public final /* synthetic */ oo3 r;
    public final boolean y;

    public mw5(oo3 oo3Var, boolean z) {
        this.r = oo3Var;
        this.y = z;
    }

    public final synchronized void g(Context context, IntentFilter intentFilter) {
        try {
            if (this.g) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.y ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.g = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:87:0x0200 A[Catch: all -> 0x021b, TRY_ENTER, TryCatch #0 {all -> 0x021b, blocks: (B:83:0x01ce, B:87:0x0200, B:88:0x0217), top: B:95:0x01ce }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0224  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        mc6 mc6Var;
        x20 x20VarV;
        long j;
        ArrayList arrayList;
        wc6 wc6Var;
        int iIntValue;
        oo3 oo3Var = this.r;
        o26 o26Var = (o26) oo3Var.n;
        w10 w10Var = (w10) oo3Var.r;
        String action = intent.getAction();
        int iHashCode = action.hashCode();
        mc6 mc6Var2 = mc6.m;
        mc6 mc6Var3 = mc6.a;
        mc6 mc6Var4 = mc6.q;
        if (iHashCode != -1484087650) {
            if (iHashCode != -337612916) {
                if (iHashCode == 345207161 && action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                    mc6Var = mc6Var4;
                } else {
                    mc6Var = mc6.t;
                }
            } else if (action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
                mc6Var = mc6Var2;
            } else {
                mc6Var = mc6.t;
            }
        } else if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
            mc6Var = mc6Var3;
        } else {
            mc6Var = mc6.t;
        }
        int i = (mc6Var.equals(mc6Var2) || mc6Var.equals(mc6Var4)) ? 2 : mc6Var.equals(mc6Var3) ? 32 : 1;
        Bundle extras = intent.getExtras();
        if (extras == null) {
            i06.j("BillingBroadcastManager", "Bundle is null.");
            x20 x20Var = b36.j;
            ((wh4) o26Var).t(m26.y(11, i, x20Var, null, mc6Var));
            if (w10Var != null) {
                w10Var.u(x20Var, null);
                return;
            }
            return;
        }
        if (i == 2) {
            int i2 = i06.g;
            w20 w20VarG = x20.g();
            w20VarG.j = i06.g("BillingBroadcastManager", intent.getExtras());
            Bundle extras2 = intent.getExtras();
            if (extras2 == null) {
                i06.j("BillingBroadcastManager", "Unexpected null bundle received!");
            } else {
                Object obj = extras2.get("SUB_RESPONSE_CODE");
                if (obj == null) {
                    i06.l("BillingBroadcastManager", "getOnPurchasesUpdatedSubResponseCodeFromBundle() got null response code, assuming OK");
                } else {
                    if (obj instanceof Integer) {
                        iIntValue = ((Integer) obj).intValue();
                    } else {
                        i06.j("BillingBroadcastManager", "Unexpected type for bundle sub response code: ".concat(obj.getClass().getName()));
                    }
                    w20VarG.t = iIntValue;
                    w20VarG.a = i06.x("BillingBroadcastManager", intent.getExtras());
                    x20VarV = w20VarG.r();
                }
            }
            iIntValue = 0;
            w20VarG.t = iIntValue;
            w20VarG.a = i06.x("BillingBroadcastManager", intent.getExtras());
            x20VarV = w20VarG.r();
        } else {
            x20VarV = i06.v(intent, "BillingBroadcastManager");
        }
        long j2 = extras.getLong("billingClientTransactionId", 0L);
        boolean z = extras.getBoolean("wasServiceAutoReconnected", false);
        if (!mc6Var.equals(mc6Var3) && !mc6Var.equals(mc6Var2)) {
            if (mc6Var.equals(mc6Var4)) {
                if (x20VarV.g != 0) {
                    x20 x20Var2 = x20VarV;
                    y(extras, x20Var2, i, mc6Var, j2, z);
                    vz5 vz5Var = a06.t;
                    w10Var.u(x20Var2, r06.q);
                    return;
                }
                i06.j("BillingBroadcastManager", "No valid alternative billing listener is registered.");
                x20 x20Var3 = b36.j;
                ((wh4) o26Var).q(m26.y(141, i, x20Var3, null, mc6Var), j2, z);
                vz5 vz5Var2 = a06.t;
                w10Var.u(x20Var3, r06.q);
                return;
            }
            return;
        }
        x20 x20Var4 = x20VarV;
        int i3 = i;
        mc6 mc6Var5 = mc6Var;
        ArrayList<String> stringArrayList = extras.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = extras.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList2 = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            j = 0;
            Purchase purchaseA = i06.a(extras.getString("INAPP_PURCHASE_DATA"), extras.getString("INAPP_DATA_SIGNATURE"));
            if (purchaseA == null) {
                i06.l("BillingHelper", "Couldn't find single purchase data as well.");
                arrayList = null;
            } else {
                arrayList2.add(purchaseA);
            }
            if (x20Var4.g == 0) {
                yb6 yb6VarR = m26.r(i3, mc6Var5);
                wh4 wh4Var = (wh4) o26Var;
                wh4Var.getClass();
                try {
                    pb6 pb6Var = (pb6) yb6VarR.q();
                    id6 id6Var = (id6) yb6VarR.u().q();
                    id6Var.r(z);
                    pb6Var.y();
                    yb6.o((yb6) pb6Var.t, (od6) id6Var.g());
                    yb6 yb6Var = (yb6) pb6Var.g();
                    wc6Var = (wc6) wh4Var.j;
                    if (j2 != j) {
                        tc6 tc6Var = (tc6) wc6Var.q();
                        tc6Var.y();
                        wc6.F((wc6) tc6Var.t, j2);
                        wc6Var = (wc6) tc6Var.g();
                    }
                    wh4Var.p(yb6Var, wc6Var);
                } catch (Throwable th) {
                    i06.t("BillingLogger", "Unable to log.", th);
                }
            } else {
                y(extras, x20Var4, i3, mc6Var5, j2, z);
            }
            w10Var.u(x20Var4, arrayList);
        }
        j = 0;
        i06.l("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
        for (int i4 = 0; i4 < stringArrayList.size() && i4 < stringArrayList2.size(); i4++) {
            Purchase purchaseA2 = i06.a(stringArrayList.get(i4), stringArrayList2.get(i4));
            if (purchaseA2 != null) {
                arrayList2.add(purchaseA2);
            }
        }
        arrayList = arrayList2;
        if (x20Var4.g == 0) {
            yb6 yb6VarR2 = m26.r(i3, mc6Var5);
            wh4 wh4Var2 = (wh4) o26Var;
            wh4Var2.getClass();
            pb6 pb6Var2 = (pb6) yb6VarR2.q();
            id6 id6Var2 = (id6) yb6VarR2.u().q();
            id6Var2.r(z);
            pb6Var2.y();
            yb6.o((yb6) pb6Var2.t, (od6) id6Var2.g());
            yb6 yb6Var2 = (yb6) pb6Var2.g();
            wc6Var = (wc6) wh4Var2.j;
            if (j2 != j) {
                tc6 tc6Var2 = (tc6) wc6Var.q();
                tc6Var2.y();
                wc6.F((wc6) tc6Var2.t, j2);
                wc6Var = (wc6) tc6Var2.g();
            }
            wh4Var2.p(yb6Var2, wc6Var);
        } else {
            y(extras, x20Var4, i3, mc6Var5, j2, z);
        }
        w10Var.u(x20Var4, arrayList);
    }

    public final void y(Bundle bundle, x20 x20Var, int i, mc6 mc6Var, long j, boolean z) {
        try {
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            o26 o26Var = (o26) this.r.n;
            if (byteArray != null) {
                ((wh4) o26Var).q(mb6.h(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD")), j, z);
            } else {
                ((wh4) o26Var).q(m26.y(23, i, x20Var, null, mc6Var), j, z);
            }
        } catch (Throwable unused) {
            i06.j("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }
}
