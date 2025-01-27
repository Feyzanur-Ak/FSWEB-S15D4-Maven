package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList<E extends Comparable<E>> extends ArrayList<E> {

    @Override
    public boolean add(E element) {
        if (!this.contains(element)) { // Eğer eleman zaten yoksa ekle
            super.add(element);
            return true;
        }
        return false; // Eğer eleman zaten varsa ekleme
    }

    @Override
    public boolean remove(Object element) {
        boolean isRemoved = super.remove(element); // Elemanı listeden sil
        if (isRemoved) {
            this.sort(); // Eğer eleman silindiyse listeyi sıralıyoruz
        }
        return isRemoved; // Elemanın silinip silinmediğini döndür
    }


    public void sort() {
        Collections.sort(this); // Listeyi sıralıyoruz
    }
}
