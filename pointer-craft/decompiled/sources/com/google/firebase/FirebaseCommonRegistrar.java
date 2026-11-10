package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.b41;
import defpackage.d5;
import defpackage.d52;
import defpackage.e24;
import defpackage.e52;
import defpackage.f52;
import defpackage.hk2;
import defpackage.iw;
import defpackage.kl0;
import defpackage.l0;
import defpackage.ll0;
import defpackage.p51;
import defpackage.pu;
import defpackage.ro1;
import defpackage.sp2;
import defpackage.uo1;
import defpackage.z11;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String g(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        kl0 kl0VarG = ll0.g(b41.class);
        kl0VarG.g(new p51(2, 0, pu.class));
        kl0VarG.x = new l0((byte) 20);
        arrayList.add(kl0VarG.y());
        e24 e24Var = new e24(iw.class, Executor.class);
        kl0 kl0Var = new kl0(z11.class, e52.class, f52.class);
        kl0Var.g(p51.g(Context.class));
        kl0Var.g(p51.g(ro1.class));
        kl0Var.g(new p51(2, 0, d52.class));
        kl0Var.g(new p51(1, 1, b41.class));
        kl0Var.g(new p51(e24Var, 1, 0));
        kl0Var.x = new d5(e24Var, (byte) 3);
        arrayList.add(kl0Var.y());
        arrayList.add(sp2.t("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(sp2.t("fire-core", "22.2.1"));
        arrayList.add(sp2.t("device-name", g(Build.PRODUCT)));
        arrayList.add(sp2.t("device-model", g(Build.DEVICE)));
        arrayList.add(sp2.t("device-brand", g(Build.BRAND)));
        arrayList.add(sp2.i("android-target-sdk", new l0((byte) 28)));
        arrayList.add(sp2.i("android-min-sdk", new l0((byte) 29)));
        arrayList.add(sp2.i("android-platform", new uo1((byte) 0)));
        arrayList.add(sp2.i("android-installer", new uo1((byte) 1)));
        try {
            hk2.t.getClass();
            str = "2.4.20";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(sp2.t("kotlin", str));
        }
        return arrayList;
    }
}
