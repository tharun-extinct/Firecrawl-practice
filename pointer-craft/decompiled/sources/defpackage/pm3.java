package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pm3 {
    public static final tn1 g;
    public static final uy5 r;
    public static final tn1 y;

    static {
        tn1 tn1Var = new tn1("vision.barcode", 1L);
        g = tn1Var;
        tn1 tn1Var2 = new tn1("vision.custom.ica", 1L);
        tn1 tn1Var3 = new tn1("vision.face", 1L);
        tn1 tn1Var4 = new tn1("vision.ica", 1L);
        tn1 tn1Var5 = new tn1("vision.ocr", 1L);
        tn1 tn1Var6 = new tn1("mlkit.langid", 1L);
        tn1 tn1Var7 = new tn1("mlkit.nlclassifier", 1L);
        tn1 tn1Var8 = new tn1("tflite_dynamite", 1L);
        tn1 tn1Var9 = new tn1("mlkit.barcode.ui", 1L);
        y = tn1Var9;
        tn1 tn1Var10 = new tn1("mlkit.smartreply", 1L);
        ld1 ld1Var = new ld1((byte) 4);
        ld1Var.t("barcode", tn1Var);
        ld1Var.t("custom_ica", tn1Var2);
        ld1Var.t("face", tn1Var3);
        ld1Var.t("ica", tn1Var4);
        ld1Var.t("ocr", tn1Var5);
        ld1Var.t("langid", tn1Var6);
        ld1Var.t("nlclassifier", tn1Var7);
        ld1Var.t("tflite_dynamite", tn1Var8);
        ld1Var.t("barcode_ui", tn1Var9);
        ld1Var.t("smart_reply", tn1Var10);
        rx5 rx5Var = (rx5) ld1Var.n;
        if (rx5Var != null) {
            throw rx5Var.g();
        }
        uy5 uy5VarG = uy5.g(ld1Var.y, (Object[]) ld1Var.r, ld1Var);
        rx5 rx5Var2 = (rx5) ld1Var.n;
        if (rx5Var2 != null) {
            throw rx5Var2.g();
        }
        r = uy5VarG;
        ld1 ld1Var2 = new ld1((byte) 4);
        ld1Var2.t("com.google.android.gms.vision.barcode", tn1Var);
        ld1Var2.t("com.google.android.gms.vision.custom.ica", tn1Var2);
        ld1Var2.t("com.google.android.gms.vision.face", tn1Var3);
        ld1Var2.t("com.google.android.gms.vision.ica", tn1Var4);
        ld1Var2.t("com.google.android.gms.vision.ocr", tn1Var5);
        ld1Var2.t("com.google.android.gms.mlkit.langid", tn1Var6);
        ld1Var2.t("com.google.android.gms.mlkit.nlclassifier", tn1Var7);
        ld1Var2.t("com.google.android.gms.tflite_dynamite", tn1Var8);
        ld1Var2.t("com.google.android.gms.mlkit_smartreply", tn1Var10);
        rx5 rx5Var3 = (rx5) ld1Var2.n;
        if (rx5Var3 != null) {
            throw rx5Var3.g();
        }
        uy5.g(ld1Var2.y, (Object[]) ld1Var2.r, ld1Var2);
        rx5 rx5Var4 = (rx5) ld1Var2.n;
        if (rx5Var4 != null) {
            throw rx5Var4.g();
        }
    }

    public static void g(Context context) {
        int i;
        nj6 nj6VarY;
        jx5 jx5Var = qx5.m;
        Object[] objArr = {"barcode_ui"};
        br2.G(1, objArr);
        cy5 cy5Var = new cy5(1, objArr);
        m32.y.getClass();
        int i2 = s32.r;
        try {
            i = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            i = 0;
        }
        if (i < 221500000) {
            Intent intent = new Intent();
            intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
            intent.setAction("com.google.android.gms.vision.DEPENDENCY");
            intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", cy5Var));
            intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
            context.sendBroadcast(intent);
            return;
        }
        int i3 = cy5Var.w;
        final tn1[] tn1VarArr = new tn1[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            tn1 tn1Var = (tn1) r.get(cy5Var.get(i4));
            jr2.m(tn1Var);
            tn1VarArr[i4] = tn1Var;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new om3() { // from class: xi6
            @Override // defpackage.om3
            public final tn1[] g() {
                tn1 tn1Var2 = pm3.g;
                return tn1VarArr;
            }
        });
        jr2.l("APIs must not be empty.", !arrayList.isEmpty());
        zv5 zv5Var = new zv5(context, zv5.a, pj.g, j32.y);
        bk bkVarR = bk.r(arrayList, true);
        if (bkVarR.j.isEmpty()) {
            nj6VarY = br2.s(new r73(0, false));
        } else {
            w25 w25VarY = w25.y();
            w25VarY.g = new tn1[]{nf6.g};
            w25VarY.y = true;
            w25VarY.r = (short) 27304;
            w25VarY.n = new cd2((byte) 27, zv5Var, bkVarR, false);
            nj6VarY = zv5Var.y(0, w25VarY.g());
        }
        bi6 bi6Var = bi6.o;
        nj6VarY.getClass();
        nj6VarY.r(y25.g, bi6Var);
    }
}
