public class MyString {
	
	/** The value is used for character storage. */
	public final char value[];
	
	/**
     * Allocates a new {@code String} so that it represents the sequence of
     * characters currently contained in the character array argument. The
     * contents of the character array are copied; subsequent modification of
     * the character array does not affect the newly created string.
     *
     * @param  value
     *         The initial value of the string
     */
    public MyString(char value[]) {
        this.value = new char[value.length];
        for (int i = 0; i < value.length; i++)
        	this.value[i] = value[i];
    }
    
    /**
     * Allocates a new string that contains the sequence of characters
     * currently contained in the string buffer argument. The contents of the
     * string buffer are copied; subsequent modification of the string buffer
     * does not affect the newly created string.
     *
     * @param  buffer
     *         A {@code StringBuffer}
     */
    public MyString(StringBuffer buffer) {
        this.value = new char[buffer.length()];
        for (int i = 0; i < buffer.length(); i++)
        	this.value[i] = buffer.charAt(i);
    }
    
    /**
     * Returns the length of this string.
     *
     * @return  the length of the sequence of characters represented by this
     *          object.
     */
    public int length() {
        return value.length;
    }
    
    /**
     * Returns <tt>true</tt> if, and only if, {@link #length()} is <tt>0</tt>.
     *
     * @return <tt>true</tt> if {@link #length()} is <tt>0</tt>, otherwise
     * <tt>false</tt>
     *
     * @since 1.6
     */
    public boolean isEmpty() {
        return length() == 0;
    }
    
    /**
     * Returns the <code>char</code> value at the
     * specified index. An index ranges from <code>0</code> to
     * <code>length() - 1</code>. The first <code>char</code> value of the sequence
     * is at index <code>0</code>, the next at index <code>1</code>,
     * and so on, as for array indexing.
     *
     * @param      index   the index of the <code>char</code> value.
     * @return     the <code>char</code> value at the specified index of this string.
     *             The first <code>char</code> value is at index <code>0</code>.
     * @exception  IndexOutOfBoundsException  if the <code>index</code>
     *             argument is negative or not less than the length of this
     *             string.
     */
    public char charAt(int index) {
    	if ((index < 0) || (index >= value.length)) {
    		throw new StringIndexOutOfBoundsException(index);
    	}
    	return value[index];
    }
    
    /**
     * Compares this string to the specified object.  The result is {@code
     * true} if and only if the argument is not {@code null} and is a {@code
     * String} object that represents the same sequence of characters as this
     * object.
     *
     * @param  anObject
     *         The object to compare this {@code String} against
     *
     * @return  {@code true} if the given object represents a {@code String}
     *          equivalent to this string, {@code false} otherwise
     *
     * @see  #compareTo(String)
     * @see  #equalsIgnoreCase(String)
     */
    public boolean equals(Object anObject) {
    	if (this == anObject) {
    		return true;
    	}
    	if (anObject instanceof MyString) {
    		MyString anotherString = (MyString)anObject;
    		if (length() == anotherString.length()) {
    			char v1[] = value;
    			char v2[] = anotherString.value;
    			int n = length()-1;
    			while (n-- != 0) {
    				if (v1[n] != v2[n])
    					return false;
    			}
    			return true;
    		}
    	}
    	return false;
    }
    
    /**
     * Returns the index within this string of the first occurrence of
     * the specified character. If a character with value
     * <code>ch</code> occurs in the character sequence represented by
     * this <code>String</code> object, then the index (in Unicode
     * code units) of the first such occurrence is returned. For
     * values of <code>ch</code> in the range from 0 to 0xFFFF
     * (inclusive), this is the smallest value <i>k</i> such that:
     * <blockquote><pre>
     * this.charAt(<i>k</i>) == ch
     * </pre></blockquote>
     * is true. For other values of <code>ch</code>, it is the
     * smallest value <i>k</i> such that:
     * <blockquote><pre>
     * this.codePointAt(<i>k</i>) == ch
     * </pre></blockquote>
     * is true. In either case, if no such character occurs in this
     * string, then <code>-1</code> is returned.
     *
     * @param   ch   a character (Unicode code point).
     * @return  the index of the first occurrence of the character in the
     *          character sequence represented by this object, or
     *          <code>-1</code> if the character does not occur.
     */
    public int indexOf(int ch) {
    	for (int i = 0; i < value.length ; i++) {
            if (value[i] == ch) {
                return i;
            }
        }
    	return -1;
    }

    /**
     * Returns the index within this string of the last occurrence of
     * the specified character. For values of <code>ch</code> in the
     * range from 0 to 0xFFFF (inclusive), the index (in Unicode code
     * units) returned is the largest value <i>k</i> such that:
     * <blockquote><pre>
     * this.charAt(<i>k</i>) == ch
     * </pre></blockquote>
     * is true. For other values of <code>ch</code>, it is the
     * largest value <i>k</i> such that:
     * <blockquote><pre>
     * this.codePointAt(<i>k</i>) == ch
     * </pre></blockquote>
     * is true.  In either case, if no such character occurs in this
     * string, then <code>-1</code> is returned.  The
     * <code>String</code> is searched backwards starting at the last
     * character.
     *
     * @param   ch   a character (Unicode code point).
     * @return  the index of the last occurrence of the character in the
     *          character sequence represented by this object, or
     *          <code>-1</code> if the character does not occur.
     */
    public int lastIndexOf(int ch) {
    	for (int i = value.length-1; i >= 0 ; i--) {
            if (value[i] == ch) {
                return i;
            }
        }
    	return -1;
    }
    
    /**
     * Concatenates the specified string to the end of this string.
     * <p>
     * If the length of the argument string is <code>0</code>, then this
     * <code>String</code> object is returned. Otherwise, a new
     * <code>String</code> object is created, representing a character
     * sequence that is the concatenation of the character sequence
     * represented by this <code>String</code> object and the character
     * sequence represented by the argument string.<p>
     * Examples:
     * <blockquote><pre>
     * "cares".concat("s") returns "caress"
     * "to".concat("get").concat("her") returns "together"
     * </pre></blockquote>
     *
     * @param   str   the <code>String</code> that is concatenated to the end
     *                of this <code>String</code>.
     * @return  a string that represents the concatenation of this object's
     *          characters followed by the string argument's characters.
     */
    public MyString concat(MyString str) {
        if (str.length() == 0) {
            return this;
        }
        char[] concatenation = new char[length() + str.length()];
        for (int i = 0; i < length(); i++) {
        	concatenation[i] = value[i];
        }
        for (int i = 0; i < str.length(); i++) {
        	concatenation[length()+i] = str.value[i];
        }
        return new MyString(concatenation);
    }

    /**
     * Returns a new string that is a substring of this string. The
     * substring begins at the specified <code>beginIndex</code> and
     * extends to the character at index <code>endIndex - 1</code>.
     * Thus the length of the substring is <code>endIndex-beginIndex</code>.
     * <p>
     * Examples:
     * <blockquote><pre>
     * "hamburger".substring(4, 8) returns "urge"
     * "smiles".substring(1, 5) returns "mile"
     * </pre></blockquote>
     *
     * @param      beginIndex   the beginning index, inclusive.
     * @param      endIndex     the ending index, exclusive.
     * @return     the specified substring.
     * @exception  IndexOutOfBoundsException  if the
     *             <code>beginIndex</code> is negative, or
     *             <code>endIndex</code> is larger than the length of
     *             this <code>String</code> object, or
     *             <code>beginIndex</code> is larger than
     *             <code>endIndex</code>.
     */
    public MyString substring(int beginIndex, int endIndex) {
    	if (beginIndex < 0) {
    		throw new StringIndexOutOfBoundsException(beginIndex);
    	}
    	if (endIndex > value.length) {
    		throw new StringIndexOutOfBoundsException(endIndex);
    	}
    	if (beginIndex > endIndex) {
    		throw new StringIndexOutOfBoundsException(endIndex - beginIndex);
    	}
    	if ((beginIndex == 0) && (endIndex == value.length)) {
    		return this;
    	}
    	char[] substringString = new char[endIndex-beginIndex];
    	for (int i = 0; i < endIndex-beginIndex; i++) {
    		substringString[i] = value[beginIndex+i];
    	}
    	return new MyString(substringString);
    }
}
