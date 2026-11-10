package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zo2 extends b12 {
    public static final int CHILDREN_FIELD_NUMBER = 7;
    private static final zo2 DEFAULT_INSTANCE;
    public static final int HASACTION_FIELD_NUMBER = 9;
    public static final int HAS_IMAGE_ALPHA_FIELD_NUMBER = 12;
    public static final int HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER = 11;
    public static final int HAS_IMAGE_DESCRIPTION_FIELD_NUMBER = 10;
    public static final int HEIGHT_FIELD_NUMBER = 3;
    public static final int HORIZONTAL_ALIGNMENT_FIELD_NUMBER = 4;
    public static final int IDENTITY_FIELD_NUMBER = 8;
    public static final int IMAGE_SCALE_FIELD_NUMBER = 6;
    private static volatile yp3 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VERTICAL_ALIGNMENT_FIELD_NUMBER = 5;
    public static final int WIDTH_FIELD_NUMBER = 2;
    private df2 children_ = c14.m;
    private boolean hasAction_;
    private boolean hasImageAlpha_;
    private boolean hasImageColorFilter_;
    private boolean hasImageDescription_;
    private int height_;
    private int horizontalAlignment_;
    private int identity_;
    private int imageScale_;
    private int type_;
    private int verticalAlignment_;
    private int width_;

    static {
        zo2 zo2Var = new zo2();
        DEFAULT_INSTANCE = zo2Var;
        b12.a(zo2.class, zo2Var);
    }

    public static zo2 c() {
        return DEFAULT_INSTANCE;
    }

    public static yo2 i() {
        return (yo2) DEFAULT_INSTANCE.y();
    }

    public final void b(boolean z) {
        this.hasAction_ = z;
    }

    public final void d(bp2 bp2Var) {
        if (bp2Var != bp2.q) {
            this.verticalAlignment_ = bp2Var.j;
        } else {
            l0.u("Can't get the number of an unknown enum value.");
        }
    }

    public final void e(ro2 ro2Var) {
        this.width_ = ro2Var.g();
    }

    public final void f(qo2 qo2Var) {
        if (qo2Var != qo2.q) {
            this.imageScale_ = qo2Var.j;
        } else {
            l0.u("Can't get the number of an unknown enum value.");
        }
    }

    public final void h(so2 so2Var) {
        if (so2Var != so2.q) {
            this.horizontalAlignment_ = so2Var.j;
        } else {
            l0.u("Can't get the number of an unknown enum value.");
        }
    }

    public final void k(ap2 ap2Var) {
        if (ap2Var != ap2.u) {
            this.type_ = ap2Var.j;
        } else {
            l0.u("Can't get the number of an unknown enum value.");
        }
    }

    public final void o() {
        this.identity_ = 1;
    }

    public final void p(boolean z) {
        this.hasImageColorFilter_ = z;
    }

    @Override // defpackage.b12
    public final Object r(int i) {
        yp3 z02Var;
        switch (du4.D(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new z24(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0001\u0000\u0001\f\u0002\f\u0003\f\u0004\f\u0005\f\u0006\f\u0007\u001b\b\f\t\u0007\n\u0007\u000b\u0007\f\u0007", new Object[]{"type_", "width_", "height_", "horizontalAlignment_", "verticalAlignment_", "imageScale_", "children_", zo2.class, "identity_", "hasAction_", "hasImageDescription_", "hasImageColorFilter_", "hasImageAlpha_"});
            case 3:
                return new zo2();
            case 4:
                return new yo2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                yp3 yp3Var = PARSER;
                if (yp3Var != null) {
                    return yp3Var;
                }
                synchronized (zo2.class) {
                    try {
                        z02Var = PARSER;
                        if (z02Var == null) {
                            z02Var = new z02();
                            PARSER = z02Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return z02Var;
            default:
                uo1.f();
                return null;
        }
    }

    public final void s(boolean z) {
        this.hasImageAlpha_ = z;
    }

    public final void u(boolean z) {
        this.hasImageDescription_ = z;
    }

    public final void w(ArrayList arrayList) {
        df2 df2VarT = this.children_;
        if (!((a1) df2VarT).j) {
            int size = df2VarT.size();
            df2VarT = df2VarT.t(size == 0 ? 10 : size * 2);
            this.children_ = df2VarT;
        }
        x02.g(arrayList, df2VarT);
    }

    public final void z(ro2 ro2Var) {
        this.height_ = ro2Var.g();
    }
}
