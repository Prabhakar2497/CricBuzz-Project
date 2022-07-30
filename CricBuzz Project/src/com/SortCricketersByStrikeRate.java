package com;

import java.util.Comparator;

public class SortCricketersByStrikeRate implements Comparator<Cricketers>{
@Override
public int compare(Cricketers x,Cricketers y) {
	return y.getStrikeRate().compareTo(x.getStrikeRate());
}
}
