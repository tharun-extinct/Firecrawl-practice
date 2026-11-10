package defpackage;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fd extends nz1 implements xy1 {
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd(gd gdVar) {
        super(1, gdVar, gd.class, "paint", "paint(Landroidx/compose/ui/graphics/Canvas;)V", 0);
        this.i = (byte) 0;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007c  */
    /* JADX WARN: Code duplicated, block: B:27:0x008d  */
    @Override // defpackage.xy1
    public final Object a(Object obj) {
        rk0 rk0Var;
        Integer numValueOf;
        byte b = this.i;
        ji2VarI = null;
        ji2VarI = null;
        ji2 ji2VarI = null;
        og5 og5Var = og5.g;
        Object obj2 = this.t;
        switch (b) {
            case 0:
                ((gd) obj2).n((nb0) obj);
                return og5Var;
            case 1:
                q04 q04Var = (q04) obj;
                q04Var.getClass();
                ky0 ky0Var = (ky0) obj2;
                ky0Var.getClass();
                ky0Var.E0 = q04Var;
                tw1 tw1Var = ky0Var.j0;
                FrameLayout frameLayout = tw1Var != null ? tw1Var.r : null;
                if (frameLayout != null) {
                    ky0Var.f0(frameLayout, q04Var);
                }
                return og5Var;
            case 2:
                ((ih2) obj2).c((Throwable) obj);
                return og5Var;
            case 3:
                long j = ((wi3) obj).g;
                a45 a45Var = (a45) obj2;
                a45Var.getClass();
                e45 e45Var = (e45) v70.b(a45Var, f45.g);
                if (e45Var != null) {
                    m50.T(a45Var.E0(), null, new i(a45Var, j, e45Var, new z35(a45Var, j), (mu0) null), 3);
                }
                return og5Var;
            case 4:
                ((t35) obj2).y.g((xy1) obj);
                return og5Var;
            default:
                KeyEvent keyEvent = ((ki2) obj).g;
                d55 d55Var = (d55) obj2;
                t75 t75Var = d55Var.x;
                boolean z = d55Var.n;
                boolean z2 = true;
                if (keyEvent.getAction() != 0 || Character.isISOControl(keyEvent.getUnicodeChar())) {
                    rk0Var = null;
                } else {
                    y01 y01Var = d55Var.t;
                    y01Var.getClass();
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                        y01Var.g = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
                        numValueOf = null;
                    } else {
                        Integer num = y01Var.g;
                        if (num != null) {
                            y01Var.g = null;
                            int deadChar = KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar);
                            Integer numValueOf2 = Integer.valueOf(deadChar);
                            if (deadChar == 0) {
                                numValueOf2 = null;
                            }
                            if (numValueOf2 != null) {
                                unicodeChar = numValueOf2.intValue();
                            }
                            numValueOf = Integer.valueOf(unicodeChar);
                        } else {
                            numValueOf = Integer.valueOf(unicodeChar);
                        }
                    }
                    if (numValueOf != null) {
                        rk0Var = new rk0(new StringBuilder().appendCodePoint(numValueOf.intValue()).toString(), 1);
                    } else {
                        rk0Var = null;
                    }
                }
                if (rk0Var != null) {
                    if (z) {
                        d55Var.g(pw5.k(rk0Var));
                        t75Var.g = null;
                    } else {
                        z2 = false;
                    }
                } else if (mx5.n(keyEvent) != 2) {
                    z2 = false;
                } else {
                    int iN = tx5.n(keyEvent);
                    if (iN == 9) {
                        long jN = vx5.n(keyEvent.getKeyCode());
                        if (fi2.g(jN, fi2.x)) {
                            ji2VarI = ji2.SELECT_LINE_LEFT;
                        } else if (fi2.g(jN, fi2.l)) {
                            ji2VarI = ji2.SELECT_LINE_RIGHT;
                        } else if (fi2.g(jN, fi2.n)) {
                            ji2VarI = ji2.SELECT_HOME;
                        } else if (fi2.g(jN, fi2.v)) {
                            ji2VarI = ji2.SELECT_END;
                        }
                    } else if (iN == 1) {
                        long jN2 = vx5.n(keyEvent.getKeyCode());
                        if (fi2.g(jN2, fi2.x)) {
                            ji2VarI = ji2.LINE_LEFT;
                        } else if (fi2.g(jN2, fi2.l)) {
                            ji2VarI = ji2.LINE_RIGHT;
                        } else if (fi2.g(jN2, fi2.n)) {
                            ji2VarI = ji2.HOME;
                        } else if (fi2.g(jN2, fi2.v)) {
                            ji2VarI = ji2.END;
                        } else if (fi2.g(jN2, fi2.h)) {
                            ji2VarI = ji2.DELETE_FROM_LINE_START;
                        }
                    }
                    if (ji2VarI == null) {
                        ji2VarI = kc6.g.I(keyEvent);
                    }
                    if (ji2VarI == null || (ji2VarI.j && !z)) {
                        z2 = false;
                    } else {
                        q54 q54Var = new q54();
                        q54Var.j = true;
                        q2 q2Var = new q2((Object) ji2VarI, (Object) d55Var, (Object) q54Var, (byte) 28);
                        k65 k65Var = d55Var.r;
                        n55 n55Var = new n55(k65Var, d55Var.l, d55Var.g.n(), t75Var);
                        q2Var.a(n55Var);
                        boolean zY = u75.y(n55Var.x, k65Var.y);
                        cj cjVar = n55Var.l;
                        if (!zY || !yf2.p(cjVar, k65Var.g)) {
                            d55Var.a.a(k65.g(k65Var, cjVar, n55Var.x, 4));
                        }
                        d55Var.j.v = true;
                        z2 = q54Var.j;
                    }
                }
                return Boolean.valueOf(z2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fd(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.i = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd(Object obj) {
        super(1, obj, ih2.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        this.i = (byte) 2;
    }
}
