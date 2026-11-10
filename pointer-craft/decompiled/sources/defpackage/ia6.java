package defpackage;

import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class ia6 {
    public final Object g;
    public Object y;

    public ia6(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.g = new Messenger(iBinder);
            this.y = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.y = new iw5(iBinder);
            this.g = null;
        } else {
            String strValueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", strValueOf.length() != 0 ? "Invalid interface descriptor: ".concat(strValueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }

    public ia6(q70 q70Var) {
        this.y = new lg6();
        this.g = q70Var;
        bi6.A();
    }

    public ia6(Class cls, Object obj) {
        this.g = cls;
        this.y = obj;
    }
}
