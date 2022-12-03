package dk.cphbusiness.tog.datastructures.range;

import java.util.Iterator;

public class Range implements Iterable<Integer>
{
	private final Integer begin;
	private final Integer end;

	public Range(Integer begin, Integer end)
	{
		this.begin = begin;
		this.end = end;
	}


	@Override
	public Iterator<Integer> iterator()
	{
		return new RangeIterator(begin);
	}

	private class RangeIterator implements Iterator<Integer>
	{
		private Integer current;

		public RangeIterator(Integer begin)
		{
			this.current = begin;
		}

		@Override
		public boolean hasNext()
		{
			return current <= end;
		}

		@Override
		public Integer next()
		{
			return current++;
		}
	}
}
