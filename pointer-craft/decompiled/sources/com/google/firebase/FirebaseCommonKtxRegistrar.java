package com.google.firebase;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.cg5;
import defpackage.cm1;
import defpackage.d52;
import defpackage.d93;
import defpackage.e24;
import defpackage.f73;
import defpackage.hx0;
import defpackage.iw;
import defpackage.l0;
import defpackage.ll0;
import defpackage.lr2;
import defpackage.p30;
import defpackage.p51;
import defpackage.pw5;
import defpackage.ru2;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ll0> getComponents() {
        e24 e24Var = new e24(iw.class, hx0.class);
        e24[] e24VarArr = new e24[0];
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(e24Var);
        for (e24 e24Var2 : e24VarArr) {
            lr2.b(e24Var2, "Null interface");
        }
        Collections.addAll(hashSet, e24VarArr);
        p51 p51Var = new p51(new e24(iw.class, Executor.class), 1, 0);
        if (hashSet.contains(p51Var.g)) {
            l0.u("Components are not allowed to depend on interfaces they themselves provide.");
            return null;
        }
        hashSet2.add(p51Var);
        ll0 ll0Var = new ll0(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, cm1.q, hashSet3);
        e24 e24Var3 = new e24(ru2.class, hx0.class);
        e24[] e24VarArr2 = new e24[0];
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(e24Var3);
        for (e24 e24Var4 : e24VarArr2) {
            lr2.b(e24Var4, "Null interface");
        }
        Collections.addAll(hashSet4, e24VarArr2);
        p51 p51Var2 = new p51(new e24(ru2.class, Executor.class), 1, 0);
        if (hashSet4.contains(p51Var2.g)) {
            l0.u("Components are not allowed to depend on interfaces they themselves provide.");
            return null;
        }
        hashSet5.add(p51Var2);
        ll0 ll0Var2 = new ll0(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, d52.a, hashSet6);
        e24 e24Var5 = new e24(p30.class, hx0.class);
        e24[] e24VarArr3 = new e24[0];
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(e24Var5);
        for (e24 e24Var6 : e24VarArr3) {
            lr2.b(e24Var6, "Null interface");
        }
        Collections.addAll(hashSet7, e24VarArr3);
        p51 p51Var3 = new p51(new e24(p30.class, Executor.class), 1, 0);
        if (hashSet7.contains(p51Var3.g)) {
            l0.u("Components are not allowed to depend on interfaces they themselves provide.");
            return null;
        }
        hashSet8.add(p51Var3);
        ll0 ll0Var3 = new ll0(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, f73.a, hashSet9);
        e24 e24Var7 = new e24(cg5.class, hx0.class);
        e24[] e24VarArr4 = new e24[0];
        HashSet hashSet10 = new HashSet();
        HashSet hashSet11 = new HashSet();
        HashSet hashSet12 = new HashSet();
        hashSet10.add(e24Var7);
        for (e24 e24Var8 : e24VarArr4) {
            lr2.b(e24Var8, "Null interface");
        }
        Collections.addAll(hashSet10, e24VarArr4);
        p51 p51Var4 = new p51(new e24(cg5.class, Executor.class), 1, 0);
        if (hashSet10.contains(p51Var4.g)) {
            l0.u("Components are not allowed to depend on interfaces they themselves provide.");
            return null;
        }
        hashSet11.add(p51Var4);
        return pw5.d(ll0Var, ll0Var2, ll0Var3, new ll0(null, new HashSet(hashSet10), new HashSet(hashSet11), 0, 0, d93.a, hashSet12));
    }
}
