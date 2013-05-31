package com.gs.collections.impl.math;

public class MutableInteger extends Number implements Comparable<MutableInteger>
{
    private static final long serialVersionUID = 1L;
    private int value = 0;

    public MutableInteger(int value)
    {
        this.value = value;
    }

    public MutableInteger()
    {
        this(0);
    }

    @Override
    public boolean equals(Object other)
    {
        if (this == other)
        {
            return true;
        }
        if (other == null || this.getClass() != other.getClass())
        {
            return false;
        }
        return this.value == ((MutableInteger) other).value;
    }

    @Override
    public int hashCode()
    {
        return this.value;
    }

    public int compareTo(MutableInteger other)
    {
        return Integer.compare(this.value, other.value);
    }

    public void setValue(int value)
    {
        this.value = value;
    }

    public MutableInteger add(int number)
    {
        this.value += number;
        return this;
    }

    public MutableInteger subtract(int number)
    {
        this.value -= number;
        return this;
    }

    public MutableInteger multiply(int number)
    {
        this.value *= number;
        return this;
    }

    public MutableInteger divide(int number)
    {
        this.value /= number;
        return this;
    }

    public MutableInteger min(int number)
    {
        this.value = Math.min(this.value, number);
        return this;
    }

    public MutableInteger max(int number)
    {
        this.value = Math.max(this.value, number);
        return this;
    }

    public MutableInteger abs()
    {
        this.value = Math.abs(this.value);
        return this;
    }

    public Integer toInteger()
    {
        return Integer.valueOf(this.value);
    }

    @Override
    public int intValue()
    {
        return this.value;
    }

    @Override
    public long longValue()
    {
        return (long) this.value;
    }

    @Override
    public float floatValue()
    {
        return (float) this.value;
    }

    @Override
    public double doubleValue()
    {
        return (double) this.value;
    }
}
