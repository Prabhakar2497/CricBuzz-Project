package com;

import java.util.Comparator;

public class SortCricketersByWickets implements Comparator<Cricketers> {
@Override
public int compare(Cricketers x,Cricketers y) {
	return y.getWickets()-x.getWickets();
}
}
