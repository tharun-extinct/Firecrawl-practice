package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public abstract class nu2 extends Service implements gu2 {
    public final ro j = new ro(this);

    @Override // defpackage.gu2
    public final ju2 a() {
        return (ju2) this.j.t;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        intent.getClass();
        ro roVar = this.j;
        roVar.getClass();
        roVar.Q(vt2.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        ro roVar = this.j;
        roVar.getClass();
        roVar.Q(vt2.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        ro roVar = this.j;
        roVar.getClass();
        roVar.Q(vt2.ON_STOP);
        roVar.Q(vt2.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        ro roVar = this.j;
        roVar.getClass();
        roVar.Q(vt2.ON_START);
        super.onStart(intent, i);
    }
}
