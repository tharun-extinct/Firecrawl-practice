package io.appground.blek.data.room;

import defpackage.el2;
import defpackage.k61;
import defpackage.my1;
import defpackage.o05;
import defpackage.og2;
import defpackage.oo;
import defpackage.pi1;
import defpackage.qo;
import defpackage.tf0;
import defpackage.v54;
import defpackage.z94;
import io.appground.blek.data.room.AppDatabase_Impl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class AppDatabase_Impl extends AppDatabase {
    public final o05 q;
    public final o05 w;

    public AppDatabase_Impl() {
        final byte b = 0;
        this.q = new o05(new my1(this) { // from class: po
            public final /* synthetic */ AppDatabase_Impl t;

            {
                this.t = this;
            }

            @Override // defpackage.my1
            public final Object g() {
                byte b2 = b;
                AppDatabase_Impl appDatabase_Impl = this.t;
                switch (b2) {
                    case 0:
                        return new el2(appDatabase_Impl);
                    default:
                        return new k61(appDatabase_Impl);
                }
            }
        });
        final byte b2 = 1;
        this.w = new o05(new my1(this) { // from class: po
            public final /* synthetic */ AppDatabase_Impl t;

            {
                this.t = this;
            }

            @Override // defpackage.my1
            public final Object g() {
                byte b3 = b2;
                AppDatabase_Impl appDatabase_Impl = this.t;
                switch (b3) {
                    case 0:
                        return new el2(appDatabase_Impl);
                    default:
                        return new k61(appDatabase_Impl);
                }
            }
        });
    }

    @Override // defpackage.x94
    public final Set a() {
        return new LinkedHashSet();
    }

    @Override // defpackage.x94
    public final LinkedHashMap m() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        tf0 tf0VarG = v54.g(el2.class);
        pi1 pi1Var = pi1.j;
        linkedHashMap.put(tf0VarG, pi1Var);
        linkedHashMap.put(v54.g(k61.class), pi1Var);
        return linkedHashMap;
    }

    @Override // defpackage.x94
    public final List n(LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        int i = 2;
        arrayList.add(new oo(1, i, (byte) 0));
        byte b = 3;
        arrayList.add(new oo(i, b, (byte) 1));
        int i2 = 4;
        arrayList.add(new oo(b, i2, (byte) 2));
        arrayList.add(new oo(i2, 5, b));
        return arrayList;
    }

    @Override // io.appground.blek.data.room.AppDatabase
    public final k61 u() {
        return (k61) this.w.getValue();
    }

    @Override // defpackage.x94
    public final og2 v() {
        return new og2(this, new LinkedHashMap(), new LinkedHashMap(), "Layout", "DeviceConfig");
    }

    @Override // defpackage.x94
    public final z94 x() {
        return new qo(this);
    }

    @Override // io.appground.blek.data.room.AppDatabase
    public final el2 z() {
        return (el2) this.q.getValue();
    }
}
