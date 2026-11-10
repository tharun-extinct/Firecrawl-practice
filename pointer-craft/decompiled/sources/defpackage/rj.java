package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.ColorSpace;
import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.function.DoubleUnaryOperator;

/* JADX INFO: loaded from: classes.dex */
public abstract class rj {
    public static final ColorSpace g(uj0 uj0Var) {
        ColorSpace colorSpaceY;
        ColorSpace colorSpaceY2;
        if (yf2.p(uj0Var, wj0.v)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (yf2.p(uj0Var, wj0.s)) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (yf2.p(uj0Var, wj0.p)) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (yf2.p(uj0Var, wj0.i)) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (yf2.p(uj0Var, wj0.a)) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (yf2.p(uj0Var, wj0.t)) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (yf2.p(uj0Var, wj0.z)) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (yf2.p(uj0Var, wj0.u)) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (yf2.p(uj0Var, wj0.m)) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (yf2.p(uj0Var, wj0.q)) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (yf2.p(uj0Var, wj0.l)) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (yf2.p(uj0Var, wj0.j)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (yf2.p(uj0Var, wj0.x)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (yf2.p(uj0Var, wj0.w)) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (yf2.p(uj0Var, wj0.b)) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (yf2.p(uj0Var, wj0.c)) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34 && (colorSpaceY2 = oc6.y(uj0Var)) != null) {
            return colorSpaceY2;
        }
        if (i >= 36 && (colorSpaceY = pc6.y(uj0Var)) != null) {
            return colorSpaceY;
        }
        if (!(uj0Var instanceof c94)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        String str = uj0Var.g;
        c94 c94Var = (c94) uj0Var;
        float[] fArrG = c94Var.n.g();
        ub5 ub5Var = c94Var.l;
        ColorSpace.Rgb.TransferParameters transferParameters = ub5Var != null ? new ColorSpace.Rgb.TransferParameters(ub5Var.y, ub5Var.r, ub5Var.n, ub5Var.v, ub5Var.x, ub5Var.l, ub5Var.g) : null;
        float[] fArr = c94Var.t;
        final byte b = 0;
        if (transferParameters != null) {
            y8.A();
            ColorSpace.Rgb rgb = new ColorSpace.Rgb(str, c94Var.j, fArrG, transferParameters);
            if (Float.isNaN(fArr[0]) || Arrays.equals(rgb.getTransform(), fArr)) {
                return rgb;
            }
            y8.A();
            return new ColorSpace.Rgb(str, fArr, transferParameters);
        }
        y8.A();
        float[] fArr2 = c94Var.j;
        final b94 b94Var = c94Var.q;
        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: vj0
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d) {
                byte b2 = b;
                xy1 xy1Var = b94Var;
                switch (b2) {
                    case 0:
                        break;
                }
                return ((Number) xy1Var.a(Double.valueOf(d))).doubleValue();
            }
        };
        final b94 b94Var2 = c94Var.i;
        final byte b2 = 1;
        return new ColorSpace.Rgb(str, fArr2, fArrG, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: vj0
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d) {
                byte b3 = b2;
                xy1 xy1Var = b94Var2;
                switch (b3) {
                    case 0:
                        break;
                }
                return ((Number) xy1Var.a(Double.valueOf(d))).doubleValue();
            }
        }, c94Var.v, c94Var.x);
    }

    public static Intent n(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return context.registerReceiver(broadcastReceiver, intentFilter, null, null, 2);
    }

    public static boolean r(File file, File file2) {
        try {
            Files.move(file.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static AutofillId y(View view) {
        return view.getAutofillId();
    }
}
