package com.google.firebase.concurrent;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.cg5;
import defpackage.e24;
import defpackage.iw;
import defpackage.jm0;
import defpackage.l0;
import defpackage.ll0;
import defpackage.lr2;
import defpackage.p30;
import defpackage.ru2;
import defpackage.xp2;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final xp2 g = new xp2(new jm0((byte) 1));
    public static final xp2 y = new xp2(new jm0((byte) 2));
    public static final xp2 r = new xp2(new jm0((byte) 3));
    public static final xp2 n = new xp2(new jm0((byte) 4));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        e24 e24Var = new e24(iw.class, ScheduledExecutorService.class);
        e24[] e24VarArr = {new e24(iw.class, ExecutorService.class), new e24(iw.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(e24Var);
        for (int i = 0; i < 2; i++) {
            lr2.b(e24VarArr[i], "Null interface");
        }
        Collections.addAll(hashSet, e24VarArr);
        ll0 ll0Var = new ll0(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new l0((byte) 24), hashSet3);
        e24 e24Var2 = new e24(p30.class, ScheduledExecutorService.class);
        e24[] e24VarArr2 = {new e24(p30.class, ExecutorService.class), new e24(p30.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(e24Var2);
        for (int i2 = 0; i2 < 2; i2++) {
            lr2.b(e24VarArr2[i2], "Null interface");
        }
        Collections.addAll(hashSet4, e24VarArr2);
        ll0 ll0Var2 = new ll0(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new l0((byte) 25), hashSet6);
        e24 e24Var3 = new e24(ru2.class, ScheduledExecutorService.class);
        e24[] e24VarArr3 = {new e24(ru2.class, ExecutorService.class), new e24(ru2.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(e24Var3);
        for (int i3 = 0; i3 < 2; i3++) {
            lr2.b(e24VarArr3[i3], "Null interface");
        }
        Collections.addAll(hashSet7, e24VarArr3);
        ll0 ll0Var3 = new ll0(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new l0((byte) 26), hashSet9);
        e24 e24Var4 = new e24(cg5.class, Executor.class);
        e24[] e24VarArr4 = new e24[0];
        HashSet hashSet10 = new HashSet();
        HashSet hashSet11 = new HashSet();
        HashSet hashSet12 = new HashSet();
        hashSet10.add(e24Var4);
        for (e24 e24Var5 : e24VarArr4) {
            lr2.b(e24Var5, "Null interface");
        }
        Collections.addAll(hashSet10, e24VarArr4);
        return Arrays.asList(ll0Var, ll0Var2, ll0Var3, new ll0(null, new HashSet(hashSet10), new HashSet(hashSet11), 0, 0, new l0((byte) 27), hashSet12));
    }
}
