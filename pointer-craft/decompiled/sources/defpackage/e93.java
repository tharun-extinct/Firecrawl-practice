package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: loaded from: classes2.dex */
public final class e93 extends Binder implements i92 {
    public final /* synthetic */ MultiInstanceInvalidationService r;

    public e93(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.r = multiInstanceInvalidationService;
        attachInterface(this, i92.y);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        f93 f93Var;
        String str = i92.y;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        int i3 = 0;
        h92 h92Var = null;
        h92 h92Var2 = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(h92.g);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof h92)) {
                    g92 g92Var = new g92();
                    g92Var.r = strongBinder;
                    h92Var = g92Var;
                } else {
                    h92Var = (h92) iInterfaceQueryLocalInterface;
                }
            }
            String string = parcel.readString();
            h92Var.getClass();
            if (string != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.r;
                synchronized (multiInstanceInvalidationService.a) {
                    try {
                        int i4 = multiInstanceInvalidationService.j + 1;
                        multiInstanceInvalidationService.j = i4;
                        if (multiInstanceInvalidationService.a.register(h92Var, Integer.valueOf(i4))) {
                            multiInstanceInvalidationService.t.put(Integer.valueOf(i4), string);
                            i3 = i4;
                        } else {
                            multiInstanceInvalidationService.j--;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
            return true;
        }
        if (i == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(h92.g);
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof h92)) {
                    g92 g92Var2 = new g92();
                    g92Var2.r = strongBinder2;
                    h92Var2 = g92Var2;
                } else {
                    h92Var2 = (h92) iInterfaceQueryLocalInterface2;
                }
            }
            int i5 = parcel.readInt();
            h92Var2.getClass();
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.r;
            synchronized (multiInstanceInvalidationService2.a) {
                multiInstanceInvalidationService2.a.unregister(h92Var2);
            }
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i6 = parcel.readInt();
        String[] strArrCreateStringArray = parcel.createStringArray();
        strArrCreateStringArray.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.r;
        synchronized (multiInstanceInvalidationService3.a) {
            try {
                String str2 = (String) multiInstanceInvalidationService3.t.get(Integer.valueOf(i6));
                if (str2 == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                } else {
                    int iBeginBroadcast = multiInstanceInvalidationService3.a.beginBroadcast();
                    while (true) {
                        f93Var = multiInstanceInvalidationService3.a;
                        if (i3 >= iBeginBroadcast) {
                            break;
                        }
                        try {
                            Object broadcastCookie = f93Var.getBroadcastCookie(i3);
                            broadcastCookie.getClass();
                            Integer num = (Integer) broadcastCookie;
                            int iIntValue = num.intValue();
                            String str3 = (String) multiInstanceInvalidationService3.t.get(num);
                            if (i6 != iIntValue && str2.equals(str3)) {
                                try {
                                    ((h92) multiInstanceInvalidationService3.a.getBroadcastItem(i3)).r(strArrCreateStringArray);
                                } catch (RemoteException e) {
                                    Log.w("ROOM", "Error invoking a remote callback", e);
                                }
                            }
                            i3++;
                        } catch (Throwable th2) {
                            multiInstanceInvalidationService3.a.finishBroadcast();
                            throw th2;
                        }
                    }
                    f93Var.finishBroadcast();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
