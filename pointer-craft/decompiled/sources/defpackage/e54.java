package defpackage;

import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class e54 {
    public final ArrayList g;
    public final /* synthetic */ RecyclerView j;
    public d54 l;
    public final List n;
    public final ArrayList r;
    public int v;
    public int x;
    public ArrayList y;

    public e54(RecyclerView recyclerView) {
        this.j = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.g = arrayList;
        this.y = null;
        this.r = new ArrayList();
        this.n = Collections.unmodifiableList(arrayList);
        this.v = 2;
        this.x = 2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:48:0x0097  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b7 A[LOOP:2: B:51:0x00aa->B:55:0x00b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x00ba A[EDGE_INSN: B:84:0x00ba->B:56:0x00ba BREAK  A[LOOP:1: B:47:0x0095->B:54:0x00b4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00ba A[EDGE_INSN: B:85:0x00ba->B:56:0x00ba BREAK  A[LOOP:1: B:47:0x0095->B:54:0x00b4, LOOP_LABEL: LOOP:1: B:47:0x0095->B:54:0x00b4], SYNTHETIC] */
    public final void a(n54 n54Var) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        RecyclerView recyclerView = this.j;
        si0 si0Var = recyclerView.n0;
        boolean zM = n54Var.m();
        View view = n54Var.g;
        boolean z3 = false;
        boolean z4 = true;
        if (zM || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(n54Var.m());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.C());
            throw new IllegalArgumentException(sb.toString());
        }
        if (n54Var.q()) {
            StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb2.append(n54Var);
            l0.i(sb2, recyclerView.C());
            return;
        }
        if (n54Var.s()) {
            l0.u("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(recyclerView.C()));
            return;
        }
        if ((n54Var.a & 16) == 0) {
            WeakHashMap weakHashMap = xk5.g;
            if (view.hasTransientState()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        boolean z5 = RecyclerView.J0;
        ArrayList arrayList = this.r;
        if (z5 && arrayList.contains(n54Var)) {
            StringBuilder sb3 = new StringBuilder("cached view received recycle internal? ");
            sb3.append(n54Var);
            l0.i(sb3, recyclerView.C());
            return;
        }
        if (n54Var.t()) {
            if (this.x <= 0 || (n54Var.a & 526) != 0) {
                z2 = false;
            } else {
                int size = arrayList.size();
                if (size >= this.x && size > 0) {
                    j(0);
                    size--;
                }
                if (RecyclerView.O0 && size > 0) {
                    int i5 = n54Var.r;
                    if (((int[]) si0Var.v) != null) {
                        int i6 = si0Var.n * 2;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= i6) {
                                i = size - 1;
                                loop1: while (i >= 0) {
                                    i2 = ((n54) arrayList.get(i)).r;
                                    if (((int[]) si0Var.v) != null) {
                                        break;
                                    }
                                    i3 = si0Var.n * 2;
                                    i4 = 0;
                                    while (true) {
                                        if (i4 < i3) {
                                            break loop1;
                                        } else if (((int[]) si0Var.v)[i4] == i2) {
                                            break;
                                        } else {
                                            i4 += 2;
                                        }
                                    }
                                    i--;
                                }
                                size = i + 1;
                            } else if (((int[]) si0Var.v)[i7] != i5) {
                                i7 += 2;
                            }
                        }
                    } else {
                        i = size - 1;
                        loop1: while (i >= 0) {
                            i2 = ((n54) arrayList.get(i)).r;
                            if (((int[]) si0Var.v) != null) {
                                break;
                                break;
                            }
                            i3 = si0Var.n * 2;
                            i4 = 0;
                            while (true) {
                                if (i4 < i3) {
                                    break loop1;
                                    break loop1;
                                } else if (((int[]) si0Var.v)[i4] == i2) {
                                    break;
                                } else {
                                    i4 += 2;
                                }
                            }
                            i--;
                        }
                        size = i + 1;
                    }
                }
                arrayList.add(size, n54Var);
                z2 = true;
            }
            if (z2) {
                z4 = false;
            } else {
                g(n54Var, true);
            }
            z3 = z2;
        } else {
            if (RecyclerView.K0) {
                Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists".concat(recyclerView.C()));
            }
            z4 = false;
        }
        recyclerView.c.I(n54Var);
        if (z3 || z4 || !z) {
            return;
        }
        br2.l(view);
        n54Var.u = null;
        n54Var.p = null;
    }

    public final void c() {
        g gVar = this.j.h;
        this.x = this.v + (gVar != null ? gVar.s : 0);
        ArrayList arrayList = this.r;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.x; size--) {
            j(size);
        }
    }

    public final void g(n54 n54Var, boolean z) {
        RecyclerView.q(n54Var);
        View view = n54Var.g;
        RecyclerView recyclerView = this.j;
        p54 p54Var = recyclerView.v0;
        if (p54Var != null) {
            o54 o54Var = p54Var.q;
            xk5.q(view, o54Var != null ? (s1) o54Var.q.remove(view) : null);
        }
        if (z) {
            ArrayList arrayList = recyclerView.o;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                uo1.B();
                return;
            }
            if (recyclerView.o0 != null) {
                recyclerView.c.I(n54Var);
            }
            if (RecyclerView.K0) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + n54Var);
            }
        }
        n54Var.u = null;
        n54Var.p = null;
        d54 d54VarR = r();
        d54VarR.getClass();
        int i = n54Var.x;
        ArrayList arrayList2 = d54VarR.g(i).g;
        ((c54) d54VarR.g.get(i)).getClass();
        if (5 <= arrayList2.size()) {
            br2.l(view);
        } else if (RecyclerView.J0 && arrayList2.contains(n54Var)) {
            l0.u("this scrap item already exists");
        } else {
            n54Var.i();
            arrayList2.add(n54Var);
        }
    }

    public final void j(int i) {
        if (RecyclerView.K0) {
            Log.d("RecyclerView", "Recycling cached view at index " + i);
        }
        ArrayList arrayList = this.r;
        n54 n54Var = (n54) arrayList.get(i);
        if (RecyclerView.K0) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + n54Var);
        }
        g(n54Var, true);
        arrayList.remove(i);
    }

    public final void l() {
        ArrayList arrayList = this.r;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            j(size);
        }
        arrayList.clear();
        if (RecyclerView.O0) {
            si0 si0Var = this.j.n0;
            int[] iArr = (int[]) si0Var.v;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            si0Var.n = 0;
        }
    }

    public final void m(View view) {
        v44 v44Var;
        n54 n54VarO = RecyclerView.O(view);
        int i = n54VarO.a & 12;
        RecyclerView recyclerView = this.j;
        if (i == 0 && n54VarO.w() && (v44Var = recyclerView.T) != null) {
            j21 j21Var = (j21) v44Var;
            if (n54VarO.v().isEmpty() && j21Var.l && !n54VarO.j()) {
                ArrayList arrayList = this.y;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.y = arrayList;
                }
                n54VarO.c = this;
                n54VarO.i = true;
                arrayList.add(n54VarO);
                return;
            }
        }
        if (n54VarO.j() && !n54VarO.a() && !recyclerView.z.y) {
            l0.u("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.C()));
            return;
        }
        n54VarO.c = this;
        n54VarO.i = false;
        this.g.add(n54VarO);
    }

    public final View n(int i) {
        return q(i, Long.MAX_VALUE).g;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:112:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:120:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:127:0x0205  */
    /* JADX WARN: Code duplicated, block: B:129:0x020f  */
    /* JADX WARN: Code duplicated, block: B:130:0x021a  */
    /* JADX WARN: Code duplicated, block: B:132:0x0220  */
    /* JADX WARN: Code duplicated, block: B:134:0x022b  */
    /* JADX WARN: Code duplicated, block: B:137:0x0249  */
    /* JADX WARN: Code duplicated, block: B:140:0x0254  */
    /* JADX WARN: Code duplicated, block: B:142:0x025c  */
    /* JADX WARN: Code duplicated, block: B:144:0x0266  */
    /* JADX WARN: Code duplicated, block: B:146:0x0274  */
    /* JADX WARN: Code duplicated, block: B:148:0x0280  */
    /* JADX WARN: Code duplicated, block: B:161:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:165:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:176:0x0309  */
    /* JADX WARN: Code duplicated, block: B:178:0x030f  */
    /* JADX WARN: Code duplicated, block: B:180:0x0313  */
    /* JADX WARN: Code duplicated, block: B:183:0x0337  */
    /* JADX WARN: Code duplicated, block: B:185:0x033f  */
    /* JADX WARN: Code duplicated, block: B:187:0x0347  */
    /* JADX WARN: Code duplicated, block: B:190:0x035a A[LOOP:4: B:186:0x0345->B:190:0x035a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:191:0x035d A[EDGE_INSN: B:191:0x035d->B:192:0x035e BREAK  A[LOOP:4: B:186:0x0345->B:190:0x035a]] */
    /* JADX WARN: Code duplicated, block: B:193:0x0360  */
    /* JADX WARN: Code duplicated, block: B:196:0x0368  */
    /* JADX WARN: Code duplicated, block: B:198:0x0370  */
    /* JADX WARN: Code duplicated, block: B:208:0x0390 A[Catch: all -> 0x03f0, TryCatch #0 {all -> 0x03f0, blocks: (B:206:0x038a, B:208:0x0390, B:209:0x03a1, B:211:0x03ad, B:224:0x03e8, B:225:0x03ef), top: B:361:0x038a }] */
    /* JADX WARN: Code duplicated, block: B:211:0x03ad A[Catch: all -> 0x03f0, TRY_LEAVE, TryCatch #0 {all -> 0x03f0, blocks: (B:206:0x038a, B:208:0x0390, B:209:0x03a1, B:211:0x03ad, B:224:0x03e8, B:225:0x03ef), top: B:361:0x038a }] */
    /* JADX WARN: Code duplicated, block: B:220:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:223:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:224:0x03e8 A[Catch: all -> 0x03f0, TRY_ENTER, TryCatch #0 {all -> 0x03f0, blocks: (B:206:0x038a, B:208:0x0390, B:209:0x03a1, B:211:0x03ad, B:224:0x03e8, B:225:0x03ef), top: B:361:0x038a }] */
    /* JADX WARN: Code duplicated, block: B:231:0x0417  */
    /* JADX WARN: Code duplicated, block: B:238:0x0429  */
    /* JADX WARN: Code duplicated, block: B:240:0x0431  */
    /* JADX WARN: Code duplicated, block: B:246:0x0454  */
    /* JADX WARN: Code duplicated, block: B:248:0x045a  */
    /* JADX WARN: Code duplicated, block: B:257:0x0473  */
    /* JADX WARN: Code duplicated, block: B:264:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:266:0x04af  */
    /* JADX WARN: Code duplicated, block: B:270:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:272:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:273:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:276:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:277:0x04db  */
    /* JADX WARN: Code duplicated, block: B:279:0x04de  */
    /* JADX WARN: Code duplicated, block: B:281:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:284:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:287:0x0511  */
    /* JADX WARN: Code duplicated, block: B:289:0x0517  */
    /* JADX WARN: Code duplicated, block: B:296:0x0554  */
    /* JADX WARN: Code duplicated, block: B:303:0x056d  */
    /* JADX WARN: Code duplicated, block: B:305:0x0571  */
    /* JADX WARN: Code duplicated, block: B:308:0x0582  */
    /* JADX WARN: Code duplicated, block: B:311:0x058d  */
    /* JADX WARN: Code duplicated, block: B:315:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:318:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:339:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:342:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:347:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:348:0x0609  */
    /* JADX WARN: Code duplicated, block: B:350:0x060f  */
    /* JADX WARN: Code duplicated, block: B:351:0x0619  */
    /* JADX WARN: Code duplicated, block: B:354:0x061f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:356:0x0623  */
    /* JADX WARN: Code duplicated, block: B:35:0x007c A[EDGE_INSN: B:35:0x007c->B:36:0x007d BREAK  A[LOOP:0: B:14:0x0024->B:20:0x003e]] */
    /* JADX WARN: Code duplicated, block: B:368:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:373:0x02dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:377:0x0302 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:381:0x035d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:382:0x0353 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:388:0x01ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x008b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:70:0x0103  */
    /* JADX WARN: Code duplicated, block: B:72:0x0109  */
    /* JADX WARN: Code duplicated, block: B:77:0x0125  */
    /* JADX WARN: Code duplicated, block: B:80:0x012e A[EDGE_INSN: B:80:0x012e->B:101:0x01af BREAK  A[LOOP:1: B:43:0x0090->B:55:0x00bc]] */
    /* JADX WARN: Code duplicated, block: B:81:0x013e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0150  */
    /* JADX WARN: Code duplicated, block: B:85:0x0164  */
    /* JADX WARN: Code duplicated, block: B:87:0x016a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0171  */
    /* JADX WARN: Instruction removed from duplicated block: B:180:0x0313, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:83:0x0150, please report this as an issue */
    public final n54 q(int i, long j) {
        n54 n54VarV;
        boolean z;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z2;
        long j2;
        long j3;
        View view;
        boolean z3;
        int iX;
        int i2;
        long nanoTime;
        boolean z4;
        p44 p44Var;
        boolean z5;
        long nanoTime2;
        long j4;
        AccessibilityManager accessibilityManager;
        boolean z6;
        boolean z7;
        s1 s1Var;
        ArrayList arrayList3;
        ViewGroup.LayoutParams layoutParams;
        boolean z8;
        long j5;
        ViewGroup.LayoutParams layoutParams2;
        y44 y44Var;
        boolean z9;
        int i3;
        int iX2;
        int iR;
        p44 p44Var2;
        long nanoTime3;
        View view2;
        long nanoTime4;
        long j6;
        RecyclerView recyclerViewI;
        long j7;
        c54 c54Var;
        n54 n54Var;
        ArrayList arrayList4;
        int size;
        long jY;
        int size2;
        int size3;
        n54 n54Var2;
        ArrayList arrayList5;
        long j8;
        ArrayList arrayList6;
        int size4;
        int i4;
        ArrayList arrayList7;
        int size5;
        int i5;
        View view3;
        int size6;
        int i6;
        n54 n54Var3;
        n54 n54VarO;
        ee0 ee0Var;
        de0 de0Var;
        int iIndexOfChild;
        de0 de0Var2;
        int iIndexOfChild2;
        int iY;
        n54 n54VarO2;
        int i7;
        boolean z10;
        n54 n54Var4;
        int size7;
        int iX3;
        RecyclerView recyclerView = this.j;
        j54 j54Var = recyclerView.o0;
        if (i < 0 || i >= j54Var.y()) {
            StringBuilder sbS = du4.s(i, i, "Invalid item position ", "(", "). Item count:");
            sbS.append(j54Var.y());
            sbS.append(recyclerView.C());
            throw new IndexOutOfBoundsException(sbS.toString());
        }
        if (j54Var.l) {
            ArrayList arrayList8 = this.y;
            if (arrayList8 != null && (size7 = arrayList8.size()) != 0) {
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        if (recyclerView.z.y && (iX3 = recyclerView.q.x(i, 0)) > 0 && iX3 < recyclerView.z.g()) {
                            long jY2 = recyclerView.z.y(iX3);
                            int i9 = 0;
                            while (true) {
                                if (i9 >= size7) {
                                    n54VarV = null;
                                    break;
                                }
                                n54 n54Var5 = (n54) this.y.get(i9);
                                if (!n54Var5.p() && n54Var5.v == jY2) {
                                    n54Var5.g(32);
                                    n54VarV = n54Var5;
                                    break;
                                }
                                i9++;
                            }
                        } else {
                            n54VarV = null;
                            break;
                        }
                    } else {
                        n54VarV = (n54) this.y.get(i8);
                        if (!n54VarV.p() && n54VarV.n() == i) {
                            n54VarV.g(32);
                            break;
                        }
                        i8++;
                    }
                }
            } else {
                n54VarV = null;
                break;
            }
            if (n54VarV != null) {
                z = true;
            }
            arrayList = this.g;
            arrayList2 = this.r;
            if (n54VarV == null) {
                size4 = arrayList.size();
                i4 = 0;
                while (true) {
                    if (i4 < size4) {
                        arrayList7 = recyclerView.w.r;
                        size5 = arrayList7.size();
                        i5 = 0;
                        while (true) {
                            if (i5 < size5) {
                                z2 = true;
                                view3 = null;
                                break;
                            }
                            view3 = (View) arrayList7.get(i5);
                            n54VarO2 = RecyclerView.O(view3);
                            z2 = true;
                            if (n54VarO2.n() != i && !n54VarO2.j() && !n54VarO2.a()) {
                                break;
                            }
                            i5++;
                        }
                        if (view3 != null) {
                            size6 = arrayList2.size();
                            i6 = 0;
                            while (true) {
                                if (i6 < size6) {
                                    n54VarV = null;
                                    break;
                                }
                                n54Var3 = (n54) arrayList2.get(i6);
                                if (n54Var3.j() && n54Var3.n() == i && !n54Var3.x()) {
                                    arrayList2.remove(i6);
                                    if (RecyclerView.K0) {
                                        Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i + ") found match in cache: " + n54Var3);
                                    }
                                    n54VarV = n54Var3;
                                    break;
                                }
                                i6++;
                            }
                        } else {
                            n54VarO = RecyclerView.O(view3);
                            ee0Var = recyclerView.w;
                            de0Var = ee0Var.y;
                            iIndexOfChild = ee0Var.g.g.indexOfChild(view3);
                            if (iIndexOfChild >= 0) {
                                l0.m(view3, "view is not a child, cannot hide ");
                                return null;
                            }
                            if (de0Var.n(iIndexOfChild)) {
                                throw new RuntimeException("trying to unhide a view that was not hidden" + view3);
                            }
                            de0Var.g(iIndexOfChild);
                            ee0Var.m(view3);
                            ee0 ee0Var2 = recyclerView.w;
                            de0Var2 = ee0Var2.y;
                            iIndexOfChild2 = ee0Var2.g.g.indexOfChild(view3);
                            if (iIndexOfChild2 == -1 && !de0Var2.n(iIndexOfChild2)) {
                                iY = iIndexOfChild2 - de0Var2.y(iIndexOfChild2);
                            } else {
                                iY = -1;
                            }
                            if (iY != -1) {
                                StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                sb.append(n54VarO);
                                uo1.i(sb, recyclerView.C());
                                return null;
                            }
                            recyclerView.w.r(iY);
                            m(view3);
                            n54VarO.g(8224);
                            n54VarV = n54VarO;
                            break;
                        }
                    } else {
                        n54Var4 = (n54) arrayList.get(i4);
                        if (n54Var4.p() && n54Var4.n() == i && !n54Var4.j() && (j54Var.l || !n54Var4.a())) {
                            n54Var4.g(32);
                            n54VarV = n54Var4;
                            z2 = true;
                            break;
                        }
                        i4++;
                    }
                }
                if (n54VarV != null) {
                    if (n54VarV.a()) {
                        i7 = n54VarV.r;
                        if (i7 >= 0 || i7 >= recyclerView.z.g()) {
                            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + n54VarV + recyclerView.C());
                        }
                        if (j54Var.l || recyclerView.z.r(n54VarV.r) == n54VarV.x) {
                            p44 p44Var3 = recyclerView.z;
                            if (!p44Var3.y || n54VarV.v == p44Var3.y(n54VarV.r)) {
                                z10 = z2;
                            } else {
                                z10 = false;
                            }
                        } else {
                            z10 = false;
                        }
                    } else {
                        if (!RecyclerView.J0 && !j54Var.l) {
                            l0.z("should not receive a removed view unless it is pre layout".concat(recyclerView.C()));
                            return null;
                        }
                        z10 = j54Var.l;
                    }
                    if (z10) {
                        z = z2;
                    } else {
                        n54VarV.g(4);
                        if (n54VarV.m()) {
                            recyclerView.removeDetachedView(n54VarV.g, false);
                            n54VarV.c.w(n54VarV);
                        } else if (n54VarV.p()) {
                            n54VarV.a &= -33;
                        }
                        a(n54VarV);
                        n54VarV = null;
                    }
                }
            } else {
                z2 = true;
            }
            if (n54VarV == null) {
                iX2 = recyclerView.q.x(i, 0);
                if (iX2 >= 0) {
                    j2 = 3;
                    if (iX2 < recyclerView.z.g()) {
                        iR = recyclerView.z.r(iX2);
                        p44Var2 = recyclerView.z;
                        j3 = 4;
                        if (p44Var2.y) {
                            jY = p44Var2.y(iX2);
                            size2 = arrayList.size() - 1;
                            while (true) {
                                if (size2 >= 0) {
                                    size3 = arrayList2.size() - 1;
                                    while (true) {
                                        if (size3 >= 0) {
                                            n54Var2 = (n54) arrayList2.get(size3);
                                            if (n54Var2.v == jY || n54Var2.x()) {
                                                size3--;
                                            } else if (iR == n54Var2.x) {
                                                arrayList2.remove(size3);
                                            } else {
                                                j(size3);
                                            }
                                        }
                                        n54VarV = null;
                                        break;
                                    }
                                }
                                n54Var2 = (n54) arrayList.get(size2);
                                arrayList5 = arrayList;
                                j8 = n54Var2.v;
                                View view4 = n54Var2.g;
                                if (j8 == jY || n54Var2.p()) {
                                    arrayList6 = arrayList5;
                                } else if (iR == n54Var2.x) {
                                    n54Var2.g(32);
                                    if (n54Var2.a() && !j54Var.l) {
                                        n54Var2.a = (n54Var2.a & (-15)) | 2;
                                    }
                                } else {
                                    arrayList6 = arrayList5;
                                    arrayList6.remove(size2);
                                    recyclerView.removeDetachedView(view4, false);
                                    n54 n54VarO3 = RecyclerView.O(view4);
                                    n54VarO3.c = null;
                                    n54VarO3.i = false;
                                    n54VarO3.a &= -33;
                                    a(n54VarO3);
                                }
                                size2--;
                                arrayList = arrayList6;
                                n54VarV = n54Var2;
                                break;
                            }
                            if (n54VarV != null) {
                                n54VarV.r = iX2;
                                z = z2;
                            }
                        }
                        if (n54VarV == null) {
                            if (RecyclerView.K0) {
                                Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i + ") fetching from shared pool");
                            }
                            c54Var = (c54) r().g.get(iR);
                            if (c54Var != null) {
                                n54Var = null;
                                break;
                            }
                            arrayList4 = c54Var.g;
                            if (arrayList4.isEmpty()) {
                                size = arrayList4.size() - 1;
                                while (true) {
                                    if (size >= 0) {
                                        n54Var = null;
                                        break;
                                    }
                                    if (!((n54) arrayList4.get(size)).x()) {
                                        n54Var = (n54) arrayList4.remove(size);
                                        break;
                                    }
                                    size--;
                                }
                            } else {
                                n54Var = null;
                                break;
                            }
                            if (n54Var != null) {
                                n54Var.i();
                                boolean z11 = RecyclerView.J0;
                            }
                            n54VarV = n54Var;
                        }
                        if (n54VarV == null) {
                            nanoTime3 = recyclerView.getNanoTime();
                            if (j != Long.MAX_VALUE) {
                                j7 = this.l.g(iR).y;
                                if (j7 != 0 && j7 + nanoTime3 >= j) {
                                    return null;
                                }
                            }
                            p44 p44Var4 = recyclerView.z;
                            p44Var4.getClass();
                            try {
                                if (ib5.g()) {
                                    Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(iR)));
                                }
                                n54VarV = p44Var4.v(recyclerView, iR);
                                view2 = n54VarV.g;
                                if (view2.getParent() == null) {
                                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                                }
                                n54VarV.x = iR;
                                Trace.endSection();
                                if (RecyclerView.O0 && (recyclerViewI = RecyclerView.I(view2)) != null) {
                                    n54VarV.y = new WeakReference(recyclerViewI);
                                }
                                nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                                c54 c54VarG = this.l.g(iR);
                                j6 = c54VarG.y;
                                if (j6 != 0) {
                                    nanoTime4 = (nanoTime4 / 4) + ((j6 / 4) * 3);
                                }
                                c54VarG.y = nanoTime4;
                                if (RecyclerView.K0) {
                                    Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                                }
                            } catch (Throwable th) {
                                Trace.endSection();
                                throw th;
                            }
                        }
                    }
                }
                StringBuilder sbS2 = du4.s(i, iX2, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
                sbS2.append(j54Var.y());
                sbS2.append(recyclerView.C());
                throw new IndexOutOfBoundsException(sbS2.toString());
            }
            j2 = 3;
            j3 = 4;
            view = n54VarV.g;
            if (z && !j54Var.l) {
                i3 = n54VarV.a;
                if ((i3 & 8192) != 0) {
                    n54VarV.a = i3 & (-8193);
                    if (j54Var.a) {
                        v44.y(n54VarV);
                        v44 v44Var = recyclerView.T;
                        n54VarV.v();
                        v44Var.getClass();
                        u44 u44Var = new u44();
                        u44Var.g(n54VarV);
                        recyclerView.c0(n54VarV, u44Var);
                    }
                }
            }
            if (j54Var.l || !n54VarV.l()) {
                if (n54VarV.l() || (n54VarV.a & 2) != 0 || n54VarV.j()) {
                    if (!RecyclerView.J0 && n54VarV.a()) {
                        StringBuilder sb2 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                        sb2.append(n54VarV);
                        uo1.i(sb2, recyclerView.C());
                        return null;
                    }
                    z3 = false;
                    iX = recyclerView.q.x(i, 0);
                    n54VarV.u = null;
                    n54VarV.p = recyclerView;
                    i2 = n54VarV.x;
                    nanoTime = recyclerView.getNanoTime();
                    if (j != Long.MAX_VALUE) {
                        j5 = this.l.g(i2).r;
                        if (j5 != 0 || j5 + nanoTime < j) {
                            if (n54VarV.q()) {
                                recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                                z4 = z2;
                            } else {
                                z4 = false;
                            }
                            p44Var = recyclerView.z;
                            p44Var.getClass();
                            if (n54VarV.u == null) {
                                z5 = z2;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                                n54VarV.r = iX;
                                if (p44Var.y) {
                                    n54VarV.v = p44Var.y(iX);
                                }
                                n54VarV.a = (n54VarV.a & (-520)) | 1;
                                if (ib5.g()) {
                                    Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(n54VarV.x)));
                                }
                            }
                            n54VarV.u = p44Var;
                            if (RecyclerView.J0) {
                                if (view.getParent() != null && view.isAttachedToWindow() != n54VarV.q()) {
                                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + n54VarV.q() + ", attached to window: " + view.isAttachedToWindow() + ", holder: " + n54VarV);
                                }
                                if (view.getParent() == null && view.isAttachedToWindow()) {
                                    uo1.j(n54VarV, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                                    return null;
                                }
                            }
                            n54VarV.v();
                            p44Var.n(n54VarV, iX);
                            if (z5) {
                                arrayList3 = n54VarV.m;
                                if (arrayList3 != null) {
                                    arrayList3.clear();
                                }
                                n54VarV.a &= -1025;
                                layoutParams = view.getLayoutParams();
                                if (layoutParams instanceof y44) {
                                    ((y44) layoutParams).a = z2;
                                }
                                Trace.endSection();
                            }
                            if (z4) {
                                recyclerView.detachViewFromParent(view);
                            }
                            nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                            c54 c54VarG2 = this.l.g(n54VarV.x);
                            j4 = c54VarG2.r;
                            if (j4 != 0) {
                                nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                            }
                            c54VarG2.r = nanoTime2;
                            accessibilityManager = recyclerView.I;
                            if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                                z6 = true;
                                if (view.getImportantForAccessibility() == 0) {
                                    view.setImportantForAccessibility(1);
                                }
                                p54 p54Var = recyclerView.v0;
                                if (p54Var != null) {
                                    o54 o54Var = p54Var.q;
                                    if (o54Var != null) {
                                        View.AccessibilityDelegate accessibilityDelegateR = xk5.r(view);
                                        if (accessibilityDelegateR == null) {
                                            s1Var = null;
                                        } else {
                                            s1Var = accessibilityDelegateR instanceof r1 ? ((r1) accessibilityDelegateR).g : new s1(accessibilityDelegateR);
                                        }
                                        if (s1Var != null && s1Var != o54Var) {
                                            o54Var.q.put(view, s1Var);
                                        }
                                    }
                                    xk5.q(view, o54Var);
                                }
                            } else {
                                z6 = true;
                            }
                            if (j54Var.l) {
                                n54VarV.l = i;
                            }
                            z7 = z6;
                        } else {
                            z7 = false;
                            z6 = z2;
                        }
                    } else {
                        if (n54VarV.q()) {
                            recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                            z4 = z2;
                        } else {
                            z4 = false;
                        }
                        p44Var = recyclerView.z;
                        p44Var.getClass();
                        if (n54VarV.u == null) {
                            z5 = z2;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            n54VarV.r = iX;
                            if (p44Var.y) {
                                n54VarV.v = p44Var.y(iX);
                            }
                            n54VarV.a = (n54VarV.a & (-520)) | 1;
                            if (ib5.g()) {
                                Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(n54VarV.x)));
                            }
                        }
                        n54VarV.u = p44Var;
                        if (RecyclerView.J0) {
                            if (view.getParent() != null) {
                            }
                            if (view.getParent() == null) {
                                uo1.j(n54VarV, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                                return null;
                            }
                        }
                        n54VarV.v();
                        p44Var.n(n54VarV, iX);
                        if (z5) {
                            arrayList3 = n54VarV.m;
                            if (arrayList3 != null) {
                                arrayList3.clear();
                            }
                            n54VarV.a &= -1025;
                            layoutParams = view.getLayoutParams();
                            if (layoutParams instanceof y44) {
                                ((y44) layoutParams).a = z2;
                            }
                            Trace.endSection();
                        }
                        if (z4) {
                            recyclerView.detachViewFromParent(view);
                        }
                        nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                        c54 c54VarG3 = this.l.g(n54VarV.x);
                        j4 = c54VarG3.r;
                        if (j4 != 0) {
                            nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                        }
                        c54VarG3.r = nanoTime2;
                        accessibilityManager = recyclerView.I;
                        if (accessibilityManager == null) {
                            z6 = true;
                        } else {
                            z6 = true;
                        }
                        if (j54Var.l) {
                            n54VarV.l = i;
                        }
                        z7 = z6;
                    }
                    z8 = z7;
                }
                layoutParams2 = view.getLayoutParams();
                if (layoutParams2 == null) {
                    y44Var = (y44) recyclerView.generateDefaultLayoutParams();
                    view.setLayoutParams(y44Var);
                } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                    y44Var = (y44) layoutParams2;
                } else {
                    y44Var = (y44) recyclerView.generateLayoutParams(layoutParams2);
                    view.setLayoutParams(y44Var);
                }
                y44Var.j = n54VarV;
                if (z || !z8) {
                    z9 = z3;
                } else {
                    z9 = z6;
                }
                y44Var.m = z9;
                return n54VarV;
            }
            n54VarV.l = i;
            z6 = z2;
            z3 = false;
            z8 = false;
            layoutParams2 = view.getLayoutParams();
            if (layoutParams2 == null) {
                y44Var = (y44) recyclerView.generateDefaultLayoutParams();
                view.setLayoutParams(y44Var);
            } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                y44Var = (y44) recyclerView.generateLayoutParams(layoutParams2);
                view.setLayoutParams(y44Var);
            } else {
                y44Var = (y44) layoutParams2;
            }
            y44Var.j = n54VarV;
            if (z) {
                z9 = z3;
            } else {
                z9 = z3;
            }
            y44Var.m = z9;
            return n54VarV;
        }
        n54VarV = null;
        z = false;
        arrayList = this.g;
        arrayList2 = this.r;
        if (n54VarV == null) {
            size4 = arrayList.size();
            i4 = 0;
            while (true) {
                if (i4 < size4) {
                    arrayList7 = recyclerView.w.r;
                    size5 = arrayList7.size();
                    i5 = 0;
                    while (true) {
                        if (i5 < size5) {
                            z2 = true;
                            view3 = null;
                            break;
                        }
                        view3 = (View) arrayList7.get(i5);
                        n54VarO2 = RecyclerView.O(view3);
                        z2 = true;
                        if (n54VarO2.n() != i) {
                        }
                        i5++;
                    }
                    if (view3 != null) {
                        size6 = arrayList2.size();
                        i6 = 0;
                        while (true) {
                            if (i6 < size6) {
                                n54VarV = null;
                                break;
                            }
                            n54Var3 = (n54) arrayList2.get(i6);
                            if (n54Var3.j()) {
                            }
                            i6++;
                        }
                    } else {
                        n54VarO = RecyclerView.O(view3);
                        ee0Var = recyclerView.w;
                        de0Var = ee0Var.y;
                        iIndexOfChild = ee0Var.g.g.indexOfChild(view3);
                        if (iIndexOfChild >= 0) {
                            l0.m(view3, "view is not a child, cannot hide ");
                            return null;
                        }
                        if (de0Var.n(iIndexOfChild)) {
                            throw new RuntimeException("trying to unhide a view that was not hidden" + view3);
                        }
                        de0Var.g(iIndexOfChild);
                        ee0Var.m(view3);
                        ee0 ee0Var3 = recyclerView.w;
                        de0Var2 = ee0Var3.y;
                        iIndexOfChild2 = ee0Var3.g.g.indexOfChild(view3);
                        if (iIndexOfChild2 == -1) {
                            iY = -1;
                        } else {
                            iY = iIndexOfChild2 - de0Var2.y(iIndexOfChild2);
                        }
                        if (iY != -1) {
                            StringBuilder sb3 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                            sb3.append(n54VarO);
                            uo1.i(sb3, recyclerView.C());
                            return null;
                        }
                        recyclerView.w.r(iY);
                        m(view3);
                        n54VarO.g(8224);
                        n54VarV = n54VarO;
                        break;
                    }
                } else {
                    n54Var4 = (n54) arrayList.get(i4);
                    if (n54Var4.p()) {
                    }
                    i4++;
                }
            }
            if (n54VarV != null) {
                if (n54VarV.a()) {
                    i7 = n54VarV.r;
                    if (i7 >= 0) {
                    }
                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + n54VarV + recyclerView.C());
                }
                if (!RecyclerView.J0) {
                }
                z10 = j54Var.l;
                if (z10) {
                    n54VarV.g(4);
                    if (n54VarV.m()) {
                        recyclerView.removeDetachedView(n54VarV.g, false);
                        n54VarV.c.w(n54VarV);
                    } else if (n54VarV.p()) {
                        n54VarV.a &= -33;
                    }
                    a(n54VarV);
                    n54VarV = null;
                } else {
                    z = z2;
                }
            }
        } else {
            z2 = true;
        }
        if (n54VarV == null) {
            iX2 = recyclerView.q.x(i, 0);
            if (iX2 >= 0) {
                j2 = 3;
                if (iX2 < recyclerView.z.g()) {
                    iR = recyclerView.z.r(iX2);
                    p44Var2 = recyclerView.z;
                    j3 = 4;
                    if (p44Var2.y) {
                        jY = p44Var2.y(iX2);
                        size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                size3 = arrayList2.size() - 1;
                                while (true) {
                                    if (size3 >= 0) {
                                        n54Var2 = (n54) arrayList2.get(size3);
                                        if (n54Var2.v == jY) {
                                        }
                                        size3--;
                                    }
                                    n54VarV = null;
                                    break;
                                }
                            }
                            n54Var2 = (n54) arrayList.get(size2);
                            arrayList5 = arrayList;
                            j8 = n54Var2.v;
                            View view5 = n54Var2.g;
                            if (j8 == jY) {
                                arrayList6 = arrayList5;
                            } else {
                                arrayList6 = arrayList5;
                            }
                            size2--;
                            arrayList = arrayList6;
                            n54VarV = n54Var2;
                            break;
                        }
                        if (n54VarV != null) {
                            n54VarV.r = iX2;
                            z = z2;
                        }
                    }
                    if (n54VarV == null) {
                        if (RecyclerView.K0) {
                            Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i + ") fetching from shared pool");
                        }
                        c54Var = (c54) r().g.get(iR);
                        if (c54Var != null) {
                            n54Var = null;
                            break;
                        }
                        arrayList4 = c54Var.g;
                        if (arrayList4.isEmpty()) {
                            n54Var = null;
                            break;
                        }
                        size = arrayList4.size() - 1;
                        while (true) {
                            if (size >= 0) {
                                n54Var = null;
                                break;
                            }
                            if (!((n54) arrayList4.get(size)).x()) {
                                n54Var = (n54) arrayList4.remove(size);
                                break;
                            }
                            size--;
                        }
                        if (n54Var != null) {
                            n54Var.i();
                            boolean z12 = RecyclerView.J0;
                        }
                        n54VarV = n54Var;
                    }
                    if (n54VarV == null) {
                        nanoTime3 = recyclerView.getNanoTime();
                        if (j != Long.MAX_VALUE) {
                            j7 = this.l.g(iR).y;
                            if (j7 != 0) {
                                return null;
                            }
                        }
                        p44 p44Var5 = recyclerView.z;
                        p44Var5.getClass();
                        if (ib5.g()) {
                            Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(iR)));
                        }
                        n54VarV = p44Var5.v(recyclerView, iR);
                        view2 = n54VarV.g;
                        if (view2.getParent() == null) {
                            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                        }
                        n54VarV.x = iR;
                        Trace.endSection();
                        if (RecyclerView.O0) {
                            n54VarV.y = new WeakReference(recyclerViewI);
                        }
                        nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                        c54 c54VarG4 = this.l.g(iR);
                        j6 = c54VarG4.y;
                        if (j6 != 0) {
                            nanoTime4 = (nanoTime4 / 4) + ((j6 / 4) * 3);
                        }
                        c54VarG4.y = nanoTime4;
                        if (RecyclerView.K0) {
                            Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                        }
                    }
                }
            }
            StringBuilder sbS3 = du4.s(i, iX2, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
            sbS3.append(j54Var.y());
            sbS3.append(recyclerView.C());
            throw new IndexOutOfBoundsException(sbS3.toString());
        }
        j2 = 3;
        j3 = 4;
        view = n54VarV.g;
        if (z) {
            i3 = n54VarV.a;
            if ((i3 & 8192) != 0) {
                n54VarV.a = i3 & (-8193);
                if (j54Var.a) {
                    v44.y(n54VarV);
                    v44 v44Var2 = recyclerView.T;
                    n54VarV.v();
                    v44Var2.getClass();
                    u44 u44Var2 = new u44();
                    u44Var2.g(n54VarV);
                    recyclerView.c0(n54VarV, u44Var2);
                }
            }
        }
        if (j54Var.l) {
            if (n54VarV.l()) {
            }
            if (!RecyclerView.J0) {
            }
            z3 = false;
            iX = recyclerView.q.x(i, 0);
            n54VarV.u = null;
            n54VarV.p = recyclerView;
            i2 = n54VarV.x;
            nanoTime = recyclerView.getNanoTime();
            if (j != Long.MAX_VALUE) {
                j5 = this.l.g(i2).r;
                if (j5 != 0) {
                    if (n54VarV.q()) {
                        recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                        z4 = z2;
                    } else {
                        z4 = false;
                    }
                    p44Var = recyclerView.z;
                    p44Var.getClass();
                    if (n54VarV.u == null) {
                        z5 = z2;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        n54VarV.r = iX;
                        if (p44Var.y) {
                            n54VarV.v = p44Var.y(iX);
                        }
                        n54VarV.a = (n54VarV.a & (-520)) | 1;
                        if (ib5.g()) {
                            Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(n54VarV.x)));
                        }
                    }
                    n54VarV.u = p44Var;
                    if (RecyclerView.J0) {
                        if (view.getParent() != null) {
                        }
                        if (view.getParent() == null) {
                            uo1.j(n54VarV, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                            return null;
                        }
                    }
                    n54VarV.v();
                    p44Var.n(n54VarV, iX);
                    if (z5) {
                        arrayList3 = n54VarV.m;
                        if (arrayList3 != null) {
                            arrayList3.clear();
                        }
                        n54VarV.a &= -1025;
                        layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof y44) {
                            ((y44) layoutParams).a = z2;
                        }
                        Trace.endSection();
                    }
                    if (z4) {
                        recyclerView.detachViewFromParent(view);
                    }
                    nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    c54 c54VarG5 = this.l.g(n54VarV.x);
                    j4 = c54VarG5.r;
                    if (j4 != 0) {
                        nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                    }
                    c54VarG5.r = nanoTime2;
                    accessibilityManager = recyclerView.I;
                    if (accessibilityManager == null) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    if (j54Var.l) {
                        n54VarV.l = i;
                    }
                    z7 = z6;
                } else {
                    if (n54VarV.q()) {
                        recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                        z4 = z2;
                    } else {
                        z4 = false;
                    }
                    p44Var = recyclerView.z;
                    p44Var.getClass();
                    if (n54VarV.u == null) {
                        z5 = z2;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        n54VarV.r = iX;
                        if (p44Var.y) {
                            n54VarV.v = p44Var.y(iX);
                        }
                        n54VarV.a = (n54VarV.a & (-520)) | 1;
                        if (ib5.g()) {
                            Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(n54VarV.x)));
                        }
                    }
                    n54VarV.u = p44Var;
                    if (RecyclerView.J0) {
                        if (view.getParent() != null) {
                        }
                        if (view.getParent() == null) {
                            uo1.j(n54VarV, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                            return null;
                        }
                    }
                    n54VarV.v();
                    p44Var.n(n54VarV, iX);
                    if (z5) {
                        arrayList3 = n54VarV.m;
                        if (arrayList3 != null) {
                            arrayList3.clear();
                        }
                        n54VarV.a &= -1025;
                        layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof y44) {
                            ((y44) layoutParams).a = z2;
                        }
                        Trace.endSection();
                    }
                    if (z4) {
                        recyclerView.detachViewFromParent(view);
                    }
                    nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    c54 c54VarG6 = this.l.g(n54VarV.x);
                    j4 = c54VarG6.r;
                    if (j4 != 0) {
                        nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                    }
                    c54VarG6.r = nanoTime2;
                    accessibilityManager = recyclerView.I;
                    if (accessibilityManager == null) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    if (j54Var.l) {
                        n54VarV.l = i;
                    }
                    z7 = z6;
                }
            } else {
                if (n54VarV.q()) {
                    recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                    z4 = z2;
                } else {
                    z4 = false;
                }
                p44Var = recyclerView.z;
                p44Var.getClass();
                if (n54VarV.u == null) {
                    z5 = z2;
                } else {
                    z5 = false;
                }
                if (z5) {
                    n54VarV.r = iX;
                    if (p44Var.y) {
                        n54VarV.v = p44Var.y(iX);
                    }
                    n54VarV.a = (n54VarV.a & (-520)) | 1;
                    if (ib5.g()) {
                        Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(n54VarV.x)));
                    }
                }
                n54VarV.u = p44Var;
                if (RecyclerView.J0) {
                    if (view.getParent() != null) {
                    }
                    if (view.getParent() == null) {
                        uo1.j(n54VarV, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                        return null;
                    }
                }
                n54VarV.v();
                p44Var.n(n54VarV, iX);
                if (z5) {
                    arrayList3 = n54VarV.m;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    n54VarV.a &= -1025;
                    layoutParams = view.getLayoutParams();
                    if (layoutParams instanceof y44) {
                        ((y44) layoutParams).a = z2;
                    }
                    Trace.endSection();
                }
                if (z4) {
                    recyclerView.detachViewFromParent(view);
                }
                nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                c54 c54VarG7 = this.l.g(n54VarV.x);
                j4 = c54VarG7.r;
                if (j4 != 0) {
                    nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                }
                c54VarG7.r = nanoTime2;
                accessibilityManager = recyclerView.I;
                if (accessibilityManager == null) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (j54Var.l) {
                    n54VarV.l = i;
                }
                z7 = z6;
            }
            z8 = z7;
        } else {
            if (n54VarV.l()) {
            }
            if (!RecyclerView.J0) {
            }
            z3 = false;
            iX = recyclerView.q.x(i, 0);
            n54VarV.u = null;
            n54VarV.p = recyclerView;
            i2 = n54VarV.x;
            nanoTime = recyclerView.getNanoTime();
            if (j != Long.MAX_VALUE) {
                j5 = this.l.g(i2).r;
                if (j5 != 0) {
                    if (n54VarV.q()) {
                        recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                        z4 = z2;
                    } else {
                        z4 = false;
                    }
                    p44Var = recyclerView.z;
                    p44Var.getClass();
                    if (n54VarV.u == null) {
                        z5 = z2;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        n54VarV.r = iX;
                        if (p44Var.y) {
                            n54VarV.v = p44Var.y(iX);
                        }
                        n54VarV.a = (n54VarV.a & (-520)) | 1;
                        if (ib5.g()) {
                            Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(n54VarV.x)));
                        }
                    }
                    n54VarV.u = p44Var;
                    if (RecyclerView.J0) {
                        if (view.getParent() != null) {
                        }
                        if (view.getParent() == null) {
                            uo1.j(n54VarV, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                            return null;
                        }
                    }
                    n54VarV.v();
                    p44Var.n(n54VarV, iX);
                    if (z5) {
                        arrayList3 = n54VarV.m;
                        if (arrayList3 != null) {
                            arrayList3.clear();
                        }
                        n54VarV.a &= -1025;
                        layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof y44) {
                            ((y44) layoutParams).a = z2;
                        }
                        Trace.endSection();
                    }
                    if (z4) {
                        recyclerView.detachViewFromParent(view);
                    }
                    nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    c54 c54VarG8 = this.l.g(n54VarV.x);
                    j4 = c54VarG8.r;
                    if (j4 != 0) {
                        nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                    }
                    c54VarG8.r = nanoTime2;
                    accessibilityManager = recyclerView.I;
                    if (accessibilityManager == null) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    if (j54Var.l) {
                        n54VarV.l = i;
                    }
                    z7 = z6;
                } else {
                    if (n54VarV.q()) {
                        recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                        z4 = z2;
                    } else {
                        z4 = false;
                    }
                    p44Var = recyclerView.z;
                    p44Var.getClass();
                    if (n54VarV.u == null) {
                        z5 = z2;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        n54VarV.r = iX;
                        if (p44Var.y) {
                            n54VarV.v = p44Var.y(iX);
                        }
                        n54VarV.a = (n54VarV.a & (-520)) | 1;
                        if (ib5.g()) {
                            Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(n54VarV.x)));
                        }
                    }
                    n54VarV.u = p44Var;
                    if (RecyclerView.J0) {
                        if (view.getParent() != null) {
                        }
                        if (view.getParent() == null) {
                            uo1.j(n54VarV, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                            return null;
                        }
                    }
                    n54VarV.v();
                    p44Var.n(n54VarV, iX);
                    if (z5) {
                        arrayList3 = n54VarV.m;
                        if (arrayList3 != null) {
                            arrayList3.clear();
                        }
                        n54VarV.a &= -1025;
                        layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof y44) {
                            ((y44) layoutParams).a = z2;
                        }
                        Trace.endSection();
                    }
                    if (z4) {
                        recyclerView.detachViewFromParent(view);
                    }
                    nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    c54 c54VarG9 = this.l.g(n54VarV.x);
                    j4 = c54VarG9.r;
                    if (j4 != 0) {
                        nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                    }
                    c54VarG9.r = nanoTime2;
                    accessibilityManager = recyclerView.I;
                    if (accessibilityManager == null) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    if (j54Var.l) {
                        n54VarV.l = i;
                    }
                    z7 = z6;
                }
            } else {
                if (n54VarV.q()) {
                    recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                    z4 = z2;
                } else {
                    z4 = false;
                }
                p44Var = recyclerView.z;
                p44Var.getClass();
                if (n54VarV.u == null) {
                    z5 = z2;
                } else {
                    z5 = false;
                }
                if (z5) {
                    n54VarV.r = iX;
                    if (p44Var.y) {
                        n54VarV.v = p44Var.y(iX);
                    }
                    n54VarV.a = (n54VarV.a & (-520)) | 1;
                    if (ib5.g()) {
                        Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(n54VarV.x)));
                    }
                }
                n54VarV.u = p44Var;
                if (RecyclerView.J0) {
                    if (view.getParent() != null) {
                    }
                    if (view.getParent() == null) {
                        uo1.j(n54VarV, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                        return null;
                    }
                }
                n54VarV.v();
                p44Var.n(n54VarV, iX);
                if (z5) {
                    arrayList3 = n54VarV.m;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    n54VarV.a &= -1025;
                    layoutParams = view.getLayoutParams();
                    if (layoutParams instanceof y44) {
                        ((y44) layoutParams).a = z2;
                    }
                    Trace.endSection();
                }
                if (z4) {
                    recyclerView.detachViewFromParent(view);
                }
                nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                c54 c54VarG10 = this.l.g(n54VarV.x);
                j4 = c54VarG10.r;
                if (j4 != 0) {
                    nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                }
                c54VarG10.r = nanoTime2;
                accessibilityManager = recyclerView.I;
                if (accessibilityManager == null) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (j54Var.l) {
                    n54VarV.l = i;
                }
                z7 = z6;
            }
            z8 = z7;
        }
        layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            y44Var = (y44) recyclerView.generateDefaultLayoutParams();
            view.setLayoutParams(y44Var);
        } else if (recyclerView.checkLayoutParams(layoutParams2)) {
            y44Var = (y44) recyclerView.generateLayoutParams(layoutParams2);
            view.setLayoutParams(y44Var);
        } else {
            y44Var = (y44) layoutParams2;
        }
        y44Var.j = n54VarV;
        if (z) {
            z9 = z3;
        } else {
            z9 = z3;
        }
        y44Var.m = z9;
        return n54VarV;
    }

    public final d54 r() {
        if (this.l == null) {
            d54 d54Var = new d54();
            d54Var.g = new SparseArray();
            d54Var.y = 0;
            d54Var.r = Collections.newSetFromMap(new IdentityHashMap());
            this.l = d54Var;
            v();
        }
        return this.l;
    }

    public final void t(View view) {
        n54 n54VarO = RecyclerView.O(view);
        boolean zQ = n54VarO.q();
        RecyclerView recyclerView = this.j;
        if (zQ) {
            recyclerView.removeDetachedView(view, false);
        }
        if (n54VarO.m()) {
            n54VarO.c.w(n54VarO);
        } else if (n54VarO.p()) {
            n54VarO.a &= -33;
        }
        a(n54VarO);
        if (recyclerView.T == null || n54VarO.t()) {
            return;
        }
        recyclerView.T.n(n54VarO);
    }

    public final void v() {
        RecyclerView recyclerView;
        p44 p44Var;
        d54 d54Var = this.l;
        if (d54Var == null || (p44Var = (recyclerView = this.j).z) == null || !recyclerView.e) {
            return;
        }
        d54Var.r.add(p44Var);
    }

    public final void w(n54 n54Var) {
        if (n54Var.i) {
            this.y.remove(n54Var);
        } else {
            this.g.remove(n54Var);
        }
        n54Var.c = null;
        n54Var.i = false;
        n54Var.a &= -33;
    }

    public final void x(p44 p44Var, boolean z) {
        d54 d54Var = this.l;
        if (d54Var != null) {
            SparseArray sparseArray = d54Var.g;
            Set set = d54Var.r;
            set.remove(p44Var);
            if (set.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < sparseArray.size(); i++) {
                ArrayList arrayList = ((c54) sparseArray.get(sparseArray.keyAt(i))).g;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    br2.l(((n54) arrayList.get(i2)).g);
                }
            }
        }
    }

    public final int y(int i) {
        RecyclerView recyclerView = this.j;
        j54 j54Var = recyclerView.o0;
        if (i >= 0 && i < j54Var.y()) {
            return !j54Var.l ? i : recyclerView.q.x(i, 0);
        }
        StringBuilder sbP = du4.p(i, "invalid position ", ". State item count is ");
        sbP.append(j54Var.y());
        sbP.append(recyclerView.C());
        throw new IndexOutOfBoundsException(sbP.toString());
    }
}
