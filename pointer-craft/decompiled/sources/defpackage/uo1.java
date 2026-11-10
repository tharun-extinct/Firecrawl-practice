package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.io.IOException;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uo1 implements st2, gm0, f41, sb1 {
    public final /* synthetic */ byte j;

    public /* synthetic */ uo1(byte b) {
        this.j = b;
    }

    public static /* synthetic */ void A(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void B() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void C(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void a(String str, int i) {
        throw new IllegalArgumentException(str + i);
    }

    public static /* synthetic */ void b() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void d(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void e(String str, int i) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void f() {
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ void g() {
        throw new il0(false);
    }

    public static /* synthetic */ void h(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void i(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void j(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void k(Object obj, Object obj2, String str) {
        throw new il0(str + obj + obj2);
    }

    public static /* synthetic */ void l(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void o(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void p(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void q(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void s(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void t(String str) throws IOException {
        throw new IOException(str);
    }

    public static /* synthetic */ void u(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void v(int i, int i2, Object obj, String str) {
        throw new IllegalArgumentException((str + i + obj + i2).toString());
    }

    public static /* synthetic */ void w(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    public static /* synthetic */ void x(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static /* synthetic */ void z(String str, int i) {
        throw new IllegalStateException(str + i);
    }

    @Override // defpackage.gm0
    public Object c(vl vlVar) {
        return FirebaseInstallationsRegistrar.lambda$getComponents$0(vlVar);
    }

    @Override // defpackage.sb1
    public double n(double d) {
        return d;
    }

    @Override // defpackage.f41
    public void r(n14 n14Var) {
    }

    @Override // defpackage.st2
    public String y(Context context) {
        switch (this.j) {
            case 0:
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    return "tv";
                }
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                    return "watch";
                }
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                    return "auto";
                }
                return (Build.VERSION.SDK_INT < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                return installerPackageName != null ? FirebaseCommonRegistrar.g(installerPackageName) : "";
        }
    }
}
