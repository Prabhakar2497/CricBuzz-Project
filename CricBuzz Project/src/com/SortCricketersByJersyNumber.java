package com;

import java.util.Comparator;

public class SortCricketersByJersyNumber implements Comparator<Cricketers> {
@Override
public int compare(Cricketers x,Cricketers y) {
	 return y.getJersyNumber()-x.getJersyNumber();
}
}
