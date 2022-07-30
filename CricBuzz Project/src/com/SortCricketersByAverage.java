package com;

import java.util.Comparator;

public class SortCricketersByAverage implements Comparator<Cricketers> {
@Override
public int compare(Cricketers x,Cricketers y) {
	return y.getAverage().compareTo(x.getAverage());
}
}
