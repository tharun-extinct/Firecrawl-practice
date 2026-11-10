package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.Toast;
import io.appground.blek.R;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class ux extends zz4 implements bz1 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ byte q;
    public byte w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ux(String str, Object obj, boolean z, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = str;
        this.b = obj;
        this.i = z;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return new ux(this.c, (gy) obj2, this.i, mu0Var, (byte) 0);
            default:
                return new ux(this.c, (sv0) obj2, this.i, mu0Var, (byte) 1);
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        ox0 ox0Var = (ox0) obj;
        mu0 mu0Var = (mu0) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((ux) b(mu0Var, ox0Var)).u(og5Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.ix
    public final Object u(Object obj) {
        Integer num;
        Toast toast;
        byte b = this.q;
        String str = this.c;
        px0 px0Var = px0.j;
        Object obj2 = this.b;
        boolean z = this.i;
        Integer num2 = null;
        switch (b) {
            case 0:
                gy gyVar = (gy) obj2;
                byte b2 = this.w;
                if (b2 == 0) {
                    js2.o(obj);
                    if (str != null) {
                        switch (str.hashCode()) {
                            case -1890344818:
                                if (str.equals("vol_down")) {
                                    gyVar.T().c(234, z);
                                    num = new Integer(2);
                                    num2 = num;
                                }
                                break;
                            case -810904185:
                                if (str.equals("vol_up")) {
                                    gyVar.T().c(233, z);
                                    num = new Integer(1);
                                    num2 = num;
                                }
                                break;
                            case -803548597:
                                if (str.equals("page_up")) {
                                    gyVar.T().w(0, 92, z);
                                    num = new Integer(5);
                                    num2 = num;
                                }
                                break;
                            case 883407954:
                                if (str.equals("page_down")) {
                                    gyVar.T().w(0, 93, z);
                                    num = new Integer(6);
                                    num2 = num;
                                }
                                break;
                            case 1007565665:
                                if (str.equals("mouse_left")) {
                                    k40 k40VarV = gyVar.V();
                                    if (k40VarV != null) {
                                        this.w = (byte) 1;
                                        if (k40VarV.v((byte) 1, z, this) == px0Var) {
                                            return px0Var;
                                        }
                                    }
                                    num = new Integer(3);
                                    num2 = num;
                                }
                                break;
                            case 1175425538:
                                if (str.equals("mouse_right")) {
                                    k40 k40VarV2 = gyVar.V();
                                    if (k40VarV2 != null) {
                                        this.w = (byte) 2;
                                        if (k40VarV2.v((byte) 2, z, this) == px0Var) {
                                            return px0Var;
                                        }
                                    }
                                    num = new Integer(4);
                                    num2 = num;
                                }
                                break;
                        }
                    }
                } else if (b2 == 1) {
                    js2.o(obj);
                    num = new Integer(3);
                    num2 = num;
                } else {
                    if (b2 != 2) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                    num = new Integer(4);
                    num2 = num;
                }
                if (num2 != null) {
                    int iIntValue = num2.intValue();
                    if (z) {
                        String str2 = gyVar.c().getStringArray(R.array.volume_button_keys)[iIntValue];
                        Context contextN = gyVar.N();
                        str2.getClass();
                        if (Build.VERSION.SDK_INT != 25) {
                            WeakReference weakReference = bi6.z;
                            if (weakReference != null && (toast = (Toast) weakReference.get()) != null) {
                                toast.cancel();
                            }
                            Toast toastMakeText = Toast.makeText(contextN.getApplicationContext(), str2, 0);
                            toastMakeText.show();
                            bi6.z = new WeakReference(toastMakeText);
                        }
                    }
                }
                return og5.g;
            default:
                sv0 sv0Var = (sv0) obj2;
                byte b3 = this.w;
                if (b3 == 0) {
                    js2.o(obj);
                    switch (str.hashCode()) {
                        case -1890344818:
                            if (str.equals("vol_down")) {
                                sv0Var.y.c(234, z);
                                new Integer(1);
                            }
                            break;
                        case -810904185:
                            if (str.equals("vol_up")) {
                                sv0Var.y.c(233, z);
                                new Integer(0);
                            }
                            break;
                        case -803548597:
                            if (str.equals("page_up")) {
                                sv0Var.y.w(0, 92, z);
                                new Integer(4);
                            }
                            break;
                        case 883407954:
                            if (str.equals("page_down")) {
                                sv0Var.y.w(0, 93, z);
                                new Integer(5);
                            }
                            break;
                        case 1007565665:
                            if (str.equals("mouse_left")) {
                                k40 k40VarT = sv0Var.y.t();
                                if (k40VarT != null) {
                                    this.w = (byte) 1;
                                    if (k40VarT.v((byte) 1, z, this) == px0Var) {
                                        return px0Var;
                                    }
                                }
                                new Integer(2);
                            }
                            break;
                        case 1175425538:
                            if (str.equals("mouse_right")) {
                                k40 k40VarT2 = sv0Var.y.t();
                                if (k40VarT2 != null) {
                                    this.w = (byte) 2;
                                    if (k40VarT2.v((byte) 2, z, this) == px0Var) {
                                        return px0Var;
                                    }
                                }
                                new Integer(3);
                            }
                            break;
                    }
                } else if (b3 == 1) {
                    js2.o(obj);
                    new Integer(2);
                } else {
                    if (b3 != 2) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                    new Integer(3);
                }
                return og5.g;
        }
    }
}
