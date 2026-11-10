package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class c35 implements Iterable {
    public final ArrayList j = new ArrayList();
    public final Context t;

    public c35(Context context) {
        this.t = context;
    }

    public static c35 v(Context context) {
        return new c35(context);
    }

    public final void g(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.t.getPackageManager());
        }
        if (component != null) {
            n(component);
        }
        this.j.add(intent);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.j.iterator();
    }

    public final void n(ComponentName componentName) {
        Context context = this.t;
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        try {
            for (Intent intentK = jr2.k(context, componentName); intentK != null; intentK = jr2.k(context, intentK.getComponent())) {
                arrayList.add(size, intentK);
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    public final void x() {
        ArrayList arrayList = this.j;
        if (arrayList.isEmpty()) {
            l0.z("No intents added to TaskStackBuilder; cannot startActivities");
            return;
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        this.t.startActivities(intentArr, null);
    }

    public final void y(yk ykVar) {
        Intent intentF = jr2.f(ykVar);
        if (intentF == null) {
            intentF = jr2.f(ykVar);
        }
        if (intentF != null) {
            ComponentName component = intentF.getComponent();
            if (component == null) {
                component = intentF.resolveActivity(this.t.getPackageManager());
            }
            n(component);
            this.j.add(intentF);
        }
    }
}
