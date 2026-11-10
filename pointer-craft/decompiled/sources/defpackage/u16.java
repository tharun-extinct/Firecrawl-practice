package defpackage;

import android.os.Parcel;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u16 implements e3 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ u16(int i, Object obj) {
        this.t = obj;
        this.j = i;
    }

    public String g(si6 si6Var) {
        String str;
        j26 j26Var = (j26) this.t;
        byte b = this.j;
        try {
            if (j26Var.L == null) {
                throw null;
            }
            gy5 gy5Var = j26Var.L;
            String packageName = j26Var.J.getPackageName();
            if (b == 2) {
                str = "LAUNCH_BILLING_FLOW";
            } else if (b == 3) {
                str = "ACKNOWLEDGE_PURCHASE";
            } else if (b == 4) {
                str = "CONSUME_ASYNC";
            } else if (b != 5) {
                str = b != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION";
            } else {
                str = "IS_FEATURE_SUPPORTED";
            }
            e26 e26Var = new e26(si6Var);
            ay5 ay5Var = (ay5) gy5Var;
            Parcel parcelG = ay5Var.g();
            parcelG.writeString(packageName);
            parcelG.writeString(str);
            int i = wx5.g;
            parcelG.writeStrongBinder(e26Var);
            try {
                ay5Var.r.transact(1, parcelG, null, 1);
                return "billingOverrideService.getBillingOverride";
            } finally {
                parcelG.recycle();
            }
        } catch (Exception e) {
            j26Var.O(95, 28, b36.E);
            i06.t("BillingClientTesting", "An error occurred while retrieving billing override.", e);
            si6Var.g(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    @Override // defpackage.e3
    public boolean r(View view) {
        ((BottomSheetBehavior) this.t).E(this.j);
        return true;
    }
}
