package defpackage;

import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import io.appground.blek.utils.PointerPathView;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class yh implements gr1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object t;

    public /* synthetic */ yh(Object obj, Object obj2, Object obj3, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
        this.m = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:9:0x002f  */
    @Override // defpackage.gr1
    public final Object c(Object obj, mu0 mu0Var) {
        as1 as1Var;
        ys1 ys1Var;
        gr1 gr1Var;
        Object obj2 = obj;
        byte b = this.j;
        px0 px0Var = px0.j;
        final byte b2 = 3;
        final byte b3 = 1;
        final byte b4 = 2;
        og5 og5Var = og5.g;
        Object obj3 = this.m;
        Object obj4 = this.a;
        Object obj5 = this.t;
        mu0 mu0Var2 = null;
        switch (b) {
            case 0:
                nc5 nc5Var = (nc5) obj4;
                ((dz3) obj5).setValue(Boolean.valueOf(((Boolean) obj2).booleanValue() ? ((Boolean) ((bz1) ((ob3) obj3).getValue()).l(nc5Var.g.n(), nc5Var.n.getValue())).booleanValue() : false));
                return og5Var;
            case 1:
                fp3 fp3Var = (fp3) obj2;
                ql4 ql4Var = (ql4) fp3Var.j;
                boolean zBooleanValue = ((Boolean) fp3Var.t).booleanValue();
                av0 av0Var = (av0) obj5;
                bv0 bv0Var = (bv0) obj4;
                v04 v04VarD = ((r04) obj3).d();
                v04VarD.getClass();
                v04VarD.m = ql4Var != null ? ql4Var.w : false;
                v04VarD.a = ql4Var != null ? ql4Var.i : true;
                boolean z = v04VarD.t;
                boolean z2 = !z;
                if (v04VarD.s && ql4Var != null) {
                    Set set = ql4Var.n;
                    boolean z3 = ql4Var.y;
                    boolean z4 = ql4Var.r;
                    v04VarD.q = set.contains("left");
                    v04VarD.w = set.contains("middle");
                    v04VarD.c = set.contains("right");
                    v04VarD.i = ql4Var.v;
                    v04VarD.b = ql4Var.x;
                    z = z3;
                    z2 = z4;
                }
                j83 j83Var = bv0Var.v;
                ShapeableImageView shapeableImageView = bv0Var.y;
                LinearLayout linearLayout = j83Var.g;
                MaterialButton materialButton = j83Var.n;
                MaterialButton materialButton2 = j83Var.r;
                MaterialButton materialButton3 = j83Var.y;
                linearLayout.setVisibility((z && (v04VarD.q || v04VarD.w || v04VarD.c)) ? 0 : 8);
                materialButton3.setVisibility(v04VarD.q ? 0 : 8);
                materialButton2.setVisibility(v04VarD.w ? 0 : 8);
                materialButton.setVisibility(v04VarD.c ? 0 : 8);
                final ru0 ru0Var = new ru0(av0Var, b3);
                materialButton3.setOnTouchListener(new View.OnTouchListener() { // from class: pu0
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        byte b5 = b4;
                        ru0 ru0Var2 = ru0Var;
                        switch (b5) {
                            case 0:
                                break;
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                        }
                        return ((Boolean) ru0Var2.l(view, motionEvent)).booleanValue();
                    }
                });
                final byte b5 = 4;
                final ru0 ru0Var2 = new ru0(av0Var, b5);
                materialButton2.setOnTouchListener(new View.OnTouchListener() { // from class: pu0
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        byte b6 = b2;
                        ru0 ru0Var3 = ru0Var2;
                        switch (b6) {
                            case 0:
                                break;
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                        }
                        return ((Boolean) ru0Var3.l(view, motionEvent)).booleanValue();
                    }
                });
                final ru0 ru0Var3 = new ru0(av0Var, b4);
                materialButton.setOnTouchListener(new View.OnTouchListener() { // from class: pu0
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        byte b6 = b5;
                        ru0 ru0Var4 = ru0Var3;
                        switch (b6) {
                            case 0:
                                break;
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                        }
                        return ((Boolean) ru0Var4.l(view, motionEvent)).booleanValue();
                    }
                });
                j83 j83Var2 = bv0Var.n;
                LinearLayout linearLayout2 = j83Var2.g;
                MaterialButton materialButton4 = j83Var2.n;
                MaterialButton materialButton5 = j83Var2.r;
                MaterialButton materialButton6 = j83Var2.y;
                linearLayout2.setVisibility((z2 && (v04VarD.q || v04VarD.w || v04VarD.c)) ? 0 : 8);
                materialButton6.setVisibility(v04VarD.q ? 0 : 8);
                materialButton5.setVisibility(v04VarD.w ? 0 : 8);
                materialButton4.setVisibility(v04VarD.c ? 0 : 8);
                final ru0 ru0Var4 = new ru0(av0Var, b3);
                final byte b6 = 5;
                materialButton6.setOnTouchListener(new View.OnTouchListener() { // from class: pu0
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        byte b7 = b6;
                        ru0 ru0Var5 = ru0Var4;
                        switch (b7) {
                            case 0:
                                break;
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                        }
                        return ((Boolean) ru0Var5.l(view, motionEvent)).booleanValue();
                    }
                });
                final ru0 ru0Var5 = new ru0(av0Var, b5);
                final byte b7 = 0;
                materialButton5.setOnTouchListener(new View.OnTouchListener() { // from class: pu0
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        byte b8 = b7;
                        ru0 ru0Var6 = ru0Var5;
                        switch (b8) {
                            case 0:
                                break;
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                        }
                        return ((Boolean) ru0Var6.l(view, motionEvent)).booleanValue();
                    }
                });
                final ru0 ru0Var6 = new ru0(av0Var, b4);
                materialButton4.setOnTouchListener(new View.OnTouchListener() { // from class: pu0
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        byte b8 = b3;
                        ru0 ru0Var7 = ru0Var6;
                        switch (b8) {
                            case 0:
                                break;
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                        }
                        return ((Boolean) ru0Var7.l(view, motionEvent)).booleanValue();
                    }
                });
                bv0Var.x.setVisibility(v04VarD.i ? 0 : 8);
                bv0Var.l.setVisibility(v04VarD.b ? 0 : 8);
                shapeableImageView.setVisibility((ql4Var == null || !ql4Var.t) ? 8 : 0);
                shapeableImageView.setActivated(zBooleanValue);
                wm4 wm4VarW = av0Var.W();
                int i = rp2.g;
                shapeableImageView.setOnTouchListener(new qu0(new f(wm4VarW, (byte) 20), (byte) 0));
                o83 o83Var = new o83(new ro((Object) av0Var, (Object) v04VarD, (Object) bv0Var, (byte) 10));
                o83Var.q = v04VarD.a;
                o83Var.t = v04VarD.i;
                o83Var.a = v04VarD.b;
                if (ql4Var != null) {
                    o83Var.m = ql4Var.c;
                    o83Var.y(ql4Var.b, ql4Var.s);
                }
                PointerPathView pointerPathView = bv0Var.j;
                pointerPathView.setOnTouchListener(o83Var);
                pointerPathView.setOnHoverListener(o83Var);
                if (Build.VERSION.SDK_INT >= 26) {
                    pointerPathView.setOnCapturedPointerListener(new m83(o83Var));
                }
                pointerPathView.setOnKeyListener((View.OnKeyListener) av0Var.r0.getValue());
                pointerPathView.setOnPointerCaptureChange(new z6(bv0Var, (byte) 11));
                bv0Var.r.setOnClickListener(new su0(bv0Var, (byte) 0));
                return og5Var;
            case 2:
                ue2 ue2Var = (ue2) obj2;
                ArrayList arrayList = (ArrayList) obj5;
                if (ue2Var instanceof p72) {
                    arrayList.add(ue2Var);
                } else if (ue2Var instanceof q72) {
                    arrayList.remove(((q72) ue2Var).g());
                } else if (ue2Var instanceof gt1) {
                    arrayList.add(ue2Var);
                } else if (ue2Var instanceof ht1) {
                    arrayList.remove(((ht1) ue2Var).g());
                } else if (ue2Var instanceof mx3) {
                    arrayList.add(ue2Var);
                } else if (ue2Var instanceof nx3) {
                    arrayList.remove(((nx3) ue2Var).g());
                } else if (ue2Var instanceof lx3) {
                    arrayList.remove(((lx3) ue2Var).g());
                }
                m50.T((ox0) obj4, null, new q((qq1) obj3, (ue2) cj0.s0(arrayList), mu0Var2, (byte) 27), 3);
                return og5Var;
            case 3:
                gr1 gr1Var2 = (gr1) obj4;
                q54 q54Var = (q54) obj5;
                if (mu0Var instanceof as1) {
                    as1Var = (as1) mu0Var;
                    int i2 = as1Var.c;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        as1Var.c = i2 - Integer.MIN_VALUE;
                    } else {
                        as1Var = new as1(this, mu0Var);
                    }
                } else {
                    as1Var = new as1(this, mu0Var);
                }
                Object objL = as1Var.q;
                int i3 = as1Var.c;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            obj2 = as1Var.m;
                            js2.o(objL);
                            if (!((Boolean) objL).booleanValue()) {
                                q54Var.j = true;
                                as1Var.m = null;
                                as1Var.c = 3;
                                if (gr1Var2.c(obj2, as1Var) == px0Var) {
                                    return px0Var;
                                }
                            }
                        } else if (i3 != 3) {
                            l0.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    js2.o(objL);
                } else {
                    js2.o(objL);
                    if (q54Var.j) {
                        as1Var.m = null;
                        as1Var.c = 1;
                        if (gr1Var2.c(obj2, as1Var) == px0Var) {
                            return px0Var;
                        }
                    } else {
                        as1Var.m = obj2;
                        as1Var.c = 2;
                        objL = ((bz1) obj3).l(obj2, as1Var);
                        if (objL == px0Var) {
                            return px0Var;
                        }
                        if (!((Boolean) objL).booleanValue()) {
                            q54Var.j = true;
                            as1Var.m = null;
                            as1Var.c = 3;
                            if (gr1Var2.c(obj2, as1Var) == px0Var) {
                                return px0Var;
                            }
                        }
                    }
                }
                return og5Var;
            default:
                if (mu0Var instanceof ys1) {
                    ys1Var = (ys1) mu0Var;
                    int i4 = ys1Var.q;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        ys1Var.q = i4 - Integer.MIN_VALUE;
                    } else {
                        ys1Var = new ys1(this, mu0Var);
                    }
                } else {
                    ys1Var = new ys1(this, mu0Var);
                }
                Object obj6 = ys1Var.m;
                int i5 = ys1Var.q;
                if (i5 != 0) {
                    if (i5 == 1) {
                        gr1Var = ys1Var.w;
                        js2.o(obj6);
                    } else {
                        if (i5 != 2) {
                            l0.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        js2.o(obj6);
                    }
                    return og5Var;
                }
                js2.o(obj6);
                gr1 gr1Var3 = (gr1) obj5;
                ys1Var.w = gr1Var3;
                ys1Var.q = 1;
                Object objF = pw5.F(ys1Var, (xy1) obj3, (x94) obj4, true, false);
                if (objF == px0Var) {
                    return px0Var;
                }
                gr1Var = gr1Var3;
                obj6 = objF;
                ys1Var.w = null;
                ys1Var.q = 2;
                if (gr1Var.c(obj6, ys1Var) == px0Var) {
                    return px0Var;
                }
                return og5Var;
        }
    }
}
