package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class cj0 extends hj0 {
    public static List A0(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List listH0 = H0(iterable);
            if (((ArrayList) listH0).size() > 1) {
                Collections.sort(listH0);
            }
            return listH0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return F0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        comparableArr.getClass();
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        array.getClass();
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        return listAsList;
    }

    public static List B0(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List listH0 = H0(iterable);
            gj0.Z(listH0, comparator);
            return listH0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return F0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        array.getClass();
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        return listAsList;
    }

    public static List C0(Iterable iterable, int i) {
        iterable.getClass();
        if (i < 0) {
            l0.t(du4.w(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return pi1.j;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return F0(iterable);
            }
            if (i == 1) {
                return pw5.k(i0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return pw5.C(arrayList);
    }

    public static final void D0(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] E0(Collection collection) {
        collection.getClass();
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List F0(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            return pw5.C(H0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return pi1.j;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return pw5.k(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList G0(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static final List H0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        D0(iterable, arrayList);
        return arrayList;
    }

    public static Set I0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        D0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set J0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return js2.h(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(v13.h(collection.size()));
                D0(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            D0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : js2.h(linkedHashSet2.iterator().next());
            }
        }
        return vi1.j;
    }

    public static boolean f0(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        return n0(iterable, obj) >= 0;
    }

    public static List g0(List list) {
        int size = list.size() - 1;
        if (size <= 0) {
            return pi1.j;
        }
        if (size == 1) {
            return pw5.k(r0(list));
        }
        ArrayList arrayList = new ArrayList(size);
        if (list instanceof RandomAccess) {
            int size2 = list.size();
            for (int i = 1; i < size2; i++) {
                arrayList.add(list.get(i));
            }
        } else {
            ListIterator listIterator = list.listIterator(1);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static List h0(List list) {
        list.getClass();
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return C0(list, size);
    }

    public static Object i0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return j0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        l0.s("Collection is empty.");
        return null;
    }

    public static Object j0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        l0.s("List is empty.");
        return null;
    }

    public static Object k0(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object l0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object m0(int i, List list) {
        list.getClass();
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static int n0(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                pw5.R();
                throw null;
            }
            if (yf2.p(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final void o0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, xy1 xy1Var) {
        iterable.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            sp2.n(sb, obj, xy1Var);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void p0(List list, StringBuilder sb, h hVar, int i) {
        if ((i & 64) != 0) {
            hVar = null;
        }
        o0(list, sb, "\n", "", "", "...", hVar);
    }

    public static String q0(Iterable iterable, String str, String str2, String str3, xy1 xy1Var, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            xy1Var = null;
        }
        iterable.getClass();
        StringBuilder sb = new StringBuilder();
        o0(iterable, sb, str4, str5, str6, "...", xy1Var);
        return sb.toString();
    }

    public static Object r0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        l0.s("List is empty.");
        return null;
    }

    public static Object s0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable t0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Comparable u0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList v0(List list, Object obj) {
        list.getClass();
        ArrayList arrayList = new ArrayList(dj0.Y(list, 10));
        boolean z = false;
        for (Object obj2 : list) {
            boolean z2 = true;
            if (!z && yf2.p(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static ArrayList w0(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            hj0.a0(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList x0(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List y0(Iterable iterable) {
        iterable.getClass();
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return F0(iterable);
        }
        List listH0 = H0(iterable);
        Collections.reverse(listH0);
        return listH0;
    }

    public static Object z0(List list) {
        int size = list.size();
        if (size == 0) {
            l0.s("List is empty.");
            return null;
        }
        if (size == 1) {
            return list.get(0);
        }
        l0.u("List has more than one element.");
        return null;
    }
}
