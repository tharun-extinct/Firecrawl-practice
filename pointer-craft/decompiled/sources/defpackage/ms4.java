package defpackage;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class ms4 implements Handler.Callback {
    public final /* synthetic */ byte g;
    public final Object y;

    public /* synthetic */ ms4(Object obj, byte b) {
        this.g = b;
        this.y = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        ComponentName componentName = null;
        switch (this.g) {
            case 0:
                if (message.what == 0) {
                    k2 k2Var = (k2) this.y;
                    if (message.obj == null) {
                        synchronized (k2Var.j) {
                            try {
                                throw null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    uo1.B();
                }
                return false;
            case 1:
                z56 z56Var = (z56) this.y;
                int i = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    StringBuilder sb = new StringBuilder(41);
                    sb.append("Received response to request: ");
                    sb.append(i);
                    Log.d("MessengerIpcClient", sb.toString());
                }
                synchronized (z56Var) {
                    try {
                        ej6 ej6Var = (ej6) z56Var.v.get(i);
                        if (ej6Var == null) {
                            StringBuilder sb2 = new StringBuilder(50);
                            sb2.append("Received response for unknown request: ");
                            sb2.append(i);
                            Log.w("MessengerIpcClient", sb2.toString());
                        } else {
                            z56Var.v.remove(i);
                            z56Var.r();
                            Bundle data = message.getData();
                            if (data.getBoolean("unsupported", false)) {
                                ej6Var.g(new bt4("Not supported by GmsCore"));
                            } else {
                                Bundle bundle = data.getBundle("data");
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                if (Log.isLoggable("MessengerIpcClient", 3)) {
                                    String strValueOf = String.valueOf(ej6Var);
                                    String strValueOf2 = String.valueOf(bundle);
                                    StringBuilder sb3 = new StringBuilder(strValueOf2.length() + strValueOf.length() + 16);
                                    sb3.append("Finishing ");
                                    sb3.append(strValueOf);
                                    sb3.append(" with ");
                                    sb3.append(strValueOf2);
                                    Log.d("MessengerIpcClient", sb3.toString());
                                }
                                ej6Var.y.y(bundle);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return true;
            default:
                int i2 = message.what;
                if (i2 == 0) {
                    yi6 yi6Var = (yi6) this.y;
                    synchronized (yi6Var.g) {
                        try {
                            ug6 ug6Var = (ug6) message.obj;
                            sh6 sh6Var = (sh6) yi6Var.g.get(ug6Var);
                            if (sh6Var != null && sh6Var.g.isEmpty()) {
                                if (sh6Var.r) {
                                    ug6 ug6Var2 = sh6Var.v;
                                    yi6 yi6Var2 = sh6Var.l;
                                    yi6Var2.r.removeMessages(1, ug6Var2);
                                    yi6Var2.n.M(yi6Var2.y, sh6Var);
                                    sh6Var.r = false;
                                    sh6Var.y = (byte) 2;
                                }
                                yi6Var.g.remove(ug6Var);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                        break;
                    }
                    return true;
                }
                if (i2 != 1) {
                    return false;
                }
                yi6 yi6Var3 = (yi6) this.y;
                synchronized (yi6Var3.g) {
                    try {
                        ug6 ug6Var3 = (ug6) message.obj;
                        sh6 sh6Var2 = (sh6) yi6Var3.g.get(ug6Var3);
                        if (sh6Var2 != null && sh6Var2.y == 3) {
                            String strValueOf3 = String.valueOf(ug6Var3);
                            StringBuilder sb4 = new StringBuilder(strValueOf3.length() + 47);
                            sb4.append("Timeout waiting for ServiceConnection callback ");
                            sb4.append(strValueOf3);
                            Log.e("GmsClientSupervisor", sb4.toString(), new Exception());
                            ComponentName componentName2 = sh6Var2.x;
                            if (componentName2 == null) {
                                ug6Var3.getClass();
                            } else {
                                componentName = componentName2;
                            }
                            if (componentName == null) {
                                ug6Var3.getClass();
                                componentName = new ComponentName("com.google.android.gms", "unknown");
                            }
                            sh6Var2.onServiceDisconnected(componentName);
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                    break;
                }
                return true;
        }
    }
}
