package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.e93;
import defpackage.f93;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class MultiInstanceInvalidationService extends Service {
    public int j;
    public final LinkedHashMap t = new LinkedHashMap();
    public final f93 a = new f93(this);
    public final e93 m = new e93(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        return this.m;
    }
}
