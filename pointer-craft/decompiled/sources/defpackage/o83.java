package defpackage;

import android.view.MotionEvent;
import android.view.View;
import io.appground.blek.utils.PointerPathView;

/* JADX INFO: loaded from: classes.dex */
public final class o83 implements View.OnTouchListener, View.OnHoverListener {
    public boolean A;
    public dh2 D;
    public boolean E;
    public boolean a;
    public int b;
    public long d;
    public boolean e;
    public boolean f;
    public long h;
    public int i;
    public final n83 j;
    public boolean m;
    public boolean o;
    public float p;
    public long s;
    public boolean t;
    public float u;
    public long z;
    public boolean q = true;
    public float w = 1.0f;
    public float c = 0.04f;
    public ki0 k = new ki0(-1.0f, 1.0f);
    public final j B = new j();
    public final j C = new j();

    public o83(n83 n83Var) {
        this.j = n83Var;
    }

    public static Byte g(MotionEvent motionEvent) {
        int actionButton = motionEvent.getActionButton();
        if (actionButton == 1) {
            return (byte) 1;
        }
        if (actionButton == 2) {
            return (byte) 2;
        }
        if (actionButton == 4) {
            return (byte) 4;
        }
        if (actionButton != 8) {
            return actionButton != 16 ? null : (byte) 16;
        }
        return (byte) 8;
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        view.getClass();
        motionEvent.getClass();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        view.onHoverEvent(motionEvent);
        if (!this.m) {
            return false;
        }
        int action = motionEvent.getAction();
        j jVar = this.C;
        j jVar2 = this.B;
        if (action == 7) {
            this.j.p(jVar2.y(x, this.w), jVar.y(y, this.w));
            return true;
        }
        if (action != 9) {
            return true;
        }
        jVar2.r(x);
        jVar.r(y);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0186  */
    /* JADX WARN: Code duplicated, block: B:103:0x018a  */
    /* JADX WARN: Code duplicated, block: B:105:0x018e  */
    /* JADX WARN: Code duplicated, block: B:107:0x019f  */
    /* JADX WARN: Code duplicated, block: B:109:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:111:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:113:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:115:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:118:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:120:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:126:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:128:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x01f1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:133:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:134:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:135:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:140:0x0212  */
    /* JADX WARN: Code duplicated, block: B:148:0x0227  */
    /* JADX WARN: Code duplicated, block: B:161:0x027b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0091  */
    /* JADX WARN: Code duplicated, block: B:34:0x0097  */
    /* JADX WARN: Code duplicated, block: B:36:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x009d  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:70:0x0102  */
    /* JADX WARN: Code duplicated, block: B:73:0x010e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0116  */
    /* JADX WARN: Code duplicated, block: B:86:0x014d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0172  */
    /* JADX WARN: Code duplicated, block: B:98:0x017a  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        long eventTime;
        dh2 dh2Var;
        dh2 dh2Var2;
        int i;
        int iY;
        int iY2;
        ki0 ki0Var;
        float fFloatValue;
        ki0 ki0Var2;
        float fFloatValue2;
        view.getClass();
        motionEvent.getClass();
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        float x = motionEvent.getX(actionIndex);
        float y = motionEvent.getY(actionIndex);
        boolean zN = eb6.n(motionEvent.getSource(), 8194);
        n83 n83Var = this.j;
        if (zN) {
            n83Var.x();
            return false;
        }
        boolean z = motionEvent.getToolType(actionIndex) == 2;
        j jVar = this.C;
        j jVar2 = this.B;
        if (!z) {
            eventTime = motionEvent.getEventTime();
            if (actionMasked != 0) {
                n83Var.v(true);
                if (this.q && (dh2Var = this.D) != null && dh2Var.y()) {
                    dh2Var2 = this.D;
                    if (dh2Var2 != null) {
                        dh2Var2.x(null);
                    }
                    this.o = true;
                    this.A = true;
                    n83Var.k((byte) 1, true);
                }
                this.s = eventTime;
                this.i = pointerId;
                this.p = x;
                this.u = y;
                this.f = true;
                float f = view.getResources().getDisplayMetrics().density;
                this.k = new ki0((-3.0f) * f, 3.0f * f);
                int i2 = (int) ((64.0f * f) + 0.5f);
                if ((this.t && x < i2) || (this.a && x > view.getWidth() - i2)) {
                    this.e = true;
                }
                jVar2.r(x);
                jVar.r(y);
                if (z) {
                    ((PointerPathView) view).v(x, y, true);
                }
            } else if (actionMasked != 1) {
                n83Var.v(false);
                if (this.e) {
                    this.e = false;
                }
                if (this.q) {
                    if (this.A) {
                        n83Var.k((byte) 1, false);
                        if (this.o && eventTime - this.s < 250) {
                            n83Var.a((byte) 1, true);
                            ((PointerPathView) view).x(x, y);
                        }
                        this.o = false;
                        this.A = false;
                    } else if (this.f) {
                        i = this.b;
                        if (i != 0) {
                            this.D = n83Var.a((byte) 1, false);
                        } else if (i != 1) {
                            n83Var.a((byte) 2, false);
                        } else if (i == 2) {
                            n83Var.a((byte) 4, false);
                        }
                        this.d = eventTime;
                        ((PointerPathView) view).x(x, y);
                    }
                    this.b = 0;
                    this.i = 0;
                    return true;
                }
            } else if (actionMasked != 2) {
                if (actionMasked != 5) {
                    if (actionIndex == 1) {
                        this.z = eventTime;
                        this.e = true;
                    }
                    if (actionIndex > this.b) {
                        this.b = actionIndex;
                        return true;
                    }
                } else {
                    if (actionMasked != 6) {
                        switch (actionMasked) {
                            case 211:
                                jVar2.r(x);
                                jVar.r(y);
                                n83Var.k((byte) 2, true);
                                return true;
                            case 212:
                                n83Var.k((byte) 2, false);
                                return true;
                            case 213:
                                n83Var.p(jVar2.y(x, this.w), jVar.y(y, this.w));
                                return true;
                        }
                    }
                    if (this.i == pointerId) {
                        this.i = -1;
                    }
                    if (this.e) {
                        this.e = false;
                    }
                    if (this.q && actionIndex == 1 && eventTime - this.s > 500 && eventTime - this.z < 250) {
                        n83Var.a((byte) 1, false);
                        ((PointerPathView) view).x(x, y);
                        return true;
                    }
                }
            } else if (eventTime - this.h >= 15) {
                if (eventTime - this.s < 250) {
                    ki0Var = this.k;
                    fFloatValue = Float.valueOf(this.p - x).floatValue();
                    if (fFloatValue >= ki0Var.g && fFloatValue <= ki0Var.y) {
                        ki0Var2 = this.k;
                        fFloatValue2 = Float.valueOf(this.u - y).floatValue();
                        if (fFloatValue2 >= ki0Var2.g && fFloatValue2 <= ki0Var2.y) {
                            return true;
                        }
                    }
                }
                if (this.f) {
                    this.f = false;
                    jVar2.r(x);
                    jVar.r(y);
                }
                if (this.q && !this.A && eventTime - this.d < 300) {
                    this.A = true;
                    n83Var.k((byte) 1, true);
                }
                this.h = eventTime;
                if (this.e) {
                    iY = jVar.y(y, this.c);
                    if (iY != 0) {
                        n83Var.c(iY, 0);
                    }
                    iY2 = jVar2.y(x, 0.005f);
                    if (iY2 != 0) {
                        n83Var.c(0, iY2);
                        return true;
                    }
                } else if (this.i == pointerId) {
                    n83Var.p(jVar2.y(x, this.w), jVar.y(y, this.w));
                    if (z) {
                        ((PointerPathView) view).v(x, y, false);
                        return true;
                    }
                } else {
                    this.i = pointerId;
                    jVar2.r(x);
                    jVar.r(y);
                    if (z) {
                        ((PointerPathView) view).v(x, y, true);
                        return true;
                    }
                }
            }
            return true;
        }
        if (!this.E) {
            this.E = true;
        }
        if (this.m) {
            if (actionMasked == 0) {
                jVar2.r(x);
                jVar.r(y);
                n83Var.k((byte) 1, true);
                ((PointerPathView) view).v(x, y, true);
                return true;
            }
            if (actionMasked == 1) {
                n83Var.k((byte) 1, false);
                return true;
            }
            if (actionMasked != 2) {
                switch (actionMasked) {
                    case 211:
                        jVar2.r(x);
                        jVar.r(y);
                        n83Var.k((byte) 2, true);
                        return true;
                    case 212:
                        n83Var.k((byte) 2, false);
                        return true;
                }
            }
            n83Var.p(jVar2.y(x, this.w), jVar.y(y, this.w));
            ((PointerPathView) view).v(x, y, false);
            return true;
        }
        eventTime = motionEvent.getEventTime();
        if (actionMasked != 0) {
            n83Var.v(true);
            if (this.q) {
                dh2Var2 = this.D;
                if (dh2Var2 != null) {
                    dh2Var2.x(null);
                }
                this.o = true;
                this.A = true;
                n83Var.k((byte) 1, true);
            }
            this.s = eventTime;
            this.i = pointerId;
            this.p = x;
            this.u = y;
            this.f = true;
            float f2 = view.getResources().getDisplayMetrics().density;
            this.k = new ki0((-3.0f) * f2, 3.0f * f2);
            int i3 = (int) ((64.0f * f2) + 0.5f);
            if (this.t) {
                this.e = true;
            } else {
                this.e = true;
            }
            jVar2.r(x);
            jVar.r(y);
            if (z) {
                ((PointerPathView) view).v(x, y, true);
            }
        } else if (actionMasked != 1) {
            n83Var.v(false);
            if (this.e) {
                this.e = false;
            }
            if (this.q) {
                if (this.A) {
                    n83Var.k((byte) 1, false);
                    if (this.o) {
                        n83Var.a((byte) 1, true);
                        ((PointerPathView) view).x(x, y);
                    }
                    this.o = false;
                    this.A = false;
                } else if (this.f) {
                    i = this.b;
                    if (i != 0) {
                        this.D = n83Var.a((byte) 1, false);
                    } else if (i != 1) {
                        n83Var.a((byte) 2, false);
                    } else if (i == 2) {
                        n83Var.a((byte) 4, false);
                    }
                    this.d = eventTime;
                    ((PointerPathView) view).x(x, y);
                }
                this.b = 0;
                this.i = 0;
                return true;
            }
        } else if (actionMasked != 2) {
            if (actionMasked != 5) {
                if (actionIndex == 1) {
                    this.z = eventTime;
                    this.e = true;
                }
                if (actionIndex > this.b) {
                    this.b = actionIndex;
                    return true;
                }
            } else {
                if (actionMasked != 6) {
                    switch (actionMasked) {
                        case 211:
                            jVar2.r(x);
                            jVar.r(y);
                            n83Var.k((byte) 2, true);
                            return true;
                        case 212:
                            n83Var.k((byte) 2, false);
                            return true;
                        case 213:
                            n83Var.p(jVar2.y(x, this.w), jVar.y(y, this.w));
                            return true;
                    }
                }
                if (this.i == pointerId) {
                    this.i = -1;
                }
                if (this.e) {
                    this.e = false;
                }
                if (this.q) {
                    n83Var.a((byte) 1, false);
                    ((PointerPathView) view).x(x, y);
                    return true;
                }
            }
        } else if (eventTime - this.h >= 15) {
            if (eventTime - this.s < 250) {
                ki0Var = this.k;
                fFloatValue = Float.valueOf(this.p - x).floatValue();
                if (fFloatValue >= ki0Var.g) {
                    ki0Var2 = this.k;
                    fFloatValue2 = Float.valueOf(this.u - y).floatValue();
                    if (fFloatValue2 >= ki0Var2.g) {
                        return true;
                    }
                }
            }
            if (this.f) {
                this.f = false;
                jVar2.r(x);
                jVar.r(y);
            }
            if (this.q) {
                this.A = true;
                n83Var.k((byte) 1, true);
            }
            this.h = eventTime;
            if (this.e) {
                iY = jVar.y(y, this.c);
                if (iY != 0) {
                    n83Var.c(iY, 0);
                }
                iY2 = jVar2.y(x, 0.005f);
                if (iY2 != 0) {
                    n83Var.c(0, iY2);
                    return true;
                }
            } else if (this.i == pointerId) {
                n83Var.p(jVar2.y(x, this.w), jVar.y(y, this.w));
                if (z) {
                    ((PointerPathView) view).v(x, y, false);
                    return true;
                }
            } else {
                this.i = pointerId;
                jVar2.r(x);
                jVar.r(y);
                if (z) {
                    ((PointerPathView) view).v(x, y, true);
                    return true;
                }
            }
        }
        return true;
        return false;
    }

    public final void y(int i, int i2) {
        this.w = kq2.D(i, 3.0f);
        this.c = kq2.D(i2, 5.0f) / 24.0f;
    }
}
