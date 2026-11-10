package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class et2 {
    public final /* synthetic */ byte g;
    public final SideSheetBehavior y;

    public /* synthetic */ et2(SideSheetBehavior sideSheetBehavior, byte b) {
        this.g = b;
        this.y = sideSheetBehavior;
    }

    public static ba3 n(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("ActionCallbackBroadcastReceiver:parameters");
        if (bundle2 == null) {
            l0.u("The intent must contain a parameters bundle using extra: ActionCallbackBroadcastReceiver:parameters");
            return null;
        }
        ba3 ba3VarR = dg6.r(new g4[0]);
        LinkedHashMap linkedHashMap = ba3VarR.g;
        for (String str : bundle2.keySet()) {
            f4 f4Var = new f4(str);
            Object obj = bundle2.get(str);
            linkedHashMap.get(f4Var);
            if (obj == null) {
                linkedHashMap.remove(f4Var);
            } else {
                linkedHashMap.put(f4Var, obj);
            }
        }
        if (bundle.containsKey("android.widget.extra.CHECKED")) {
            Boolean boolValueOf = Boolean.valueOf(bundle.getBoolean("android.widget.extra.CHECKED"));
            f4 f4Var2 = ef6.g;
            linkedHashMap.get(f4Var2);
            linkedHashMap.put(f4Var2, boolValueOf);
        }
        return ba3VarR;
    }

    public static final String v(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (Float.isInfinite(f)) {
            return f < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0d, iMax);
        float f2 = f * fPow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        float f3 = i / fPow;
        return iMax > 0 ? String.valueOf(f3) : String.valueOf((int) f3);
    }

    public final int g() {
        byte b = this.g;
        SideSheetBehavior sideSheetBehavior = this.y;
        switch (b) {
            case 0:
                return Math.max(0, sideSheetBehavior.c + sideSheetBehavior.i);
            default:
                return Math.max(0, (sideSheetBehavior.w - sideSheetBehavior.q) - sideSheetBehavior.i);
        }
    }

    public final int r(View view) {
        byte b = this.g;
        SideSheetBehavior sideSheetBehavior = this.y;
        switch (b) {
            case 0:
                return view.getRight() + sideSheetBehavior.i;
            default:
                return view.getLeft() - sideSheetBehavior.i;
        }
    }

    public final int y() {
        byte b = this.g;
        SideSheetBehavior sideSheetBehavior = this.y;
        switch (b) {
            case 0:
                return (-sideSheetBehavior.q) - sideSheetBehavior.i;
            default:
                return sideSheetBehavior.w;
        }
    }
}
