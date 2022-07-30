package com;

import java.util.Comparator;

public class SortCricketersByMatches implements Comparator<Cricketers>{
@Override
public int compare(Cricketers x,Cricketers y) {
	return y.getMatches()-x.getMatches();
}
}
