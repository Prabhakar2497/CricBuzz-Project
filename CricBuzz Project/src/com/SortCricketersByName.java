package com;

import java.util.Comparator;

public class SortCricketersByName implements Comparator<Cricketers>{
@Override
public int compare(Cricketers x,Cricketers y) {
	return x.getName().compareTo(y.getName());
}
}

