/**
 * Word class : methods on Words (tp3) licence S4 - UE POO
 * 
 * @author : 
 */

public class Word {

	// ATTRIBUTS
        /* contains the string that represents the charcter of this word */
	private String value;

	// CONSTRUCTEURS
	public Word(String s) {
		this.value = s;
	}

	// METHODES
        /**
	 * main function
	 *
	 */
        public static void main(String[] args){
	    Word word = new Word(args[0]);
	    System.out.println(word);
	    System.out.println(word.nbOfChars());
	    System.out.println(word.nbOccurrencesOfChar('i'));
	    System.out.println(word.reverse());
	}

    
	/**
	 * returns <code>true</code> if <code>o</code> is equals to this word object, ie if
	 * <code>o</code> is a Word and its value is the same as this word's value
	 * 
	 * @param o
	 *            the object to be compared with this Word
	 * @return <code>true</code> iff <code>o</code> is a Word with the same value as this word.
	 */
	public boolean equals(Object o) {
		if (o instanceof Word) {
			Word theOther = (Word) o;
			return this.value.equals(theOther.value);
		} else {
			return false;
		}
	}

	/**
	 * returns the number of characters in this word object
	 *
	 * @return the number of characters in this word
	 */
	public int nbOfChars() {
	    return value.length();
	}

	/**
	 * return a String representation of this word
	 *
	 * @return the String representation
	 */
	public String toString() {
		return this.value;
	}

	/**
	 * return the number of occurence of a character in this word
	 *
	 * @param c
	 *         the character to count the occurence in this word
	 * @return the number of occurence of the carracter <code>c</code>
	 */
	public int nbOccurrencesOfChar(char c) {
	    int nb=0;
	    int index= this.value.indexOf(c);
	    System.out.println(index);
	    while (index!=-1){
		nb+=1;
		index= this.value.indexOf(c,index+1);
	    }
	    return nb;
	} // nbOccurrencesOfChar

	/**
	 * return a new Word whose value is reverse this word
	 *
	 *@return a new Word reverse of this word
	 *
	 */
	public Word reverse() {
	    String value="";
	    for (int i=(this.nbOfChars()-1); i>=0;i--){
		value+=this.value.charAt(i);
	    }
	    Word word= new Word(value);
	    return word;
	}

	/**
	 * TODO
	 * 
	 */
	public boolean isPalindrome() {
		return false;
	} // estPalindrome

	/**
	 * TODO Word
	 * 
	 */
	public boolean contains(Word m) {
		return false;
	}

	/**
	 * TODO
	 * 
	 */
	public boolean rhymesWith(Word m) {
		return false;
	}

	/**
	 * TODO
	 */
	public boolean isProperNoun() {
		return false;
	}

	/**
	 * TODO
	 * 
	 */
	public boolean isAnagram(Word m) {
		return false;
	}

	/**
	 * TODO
	 * 
	 */
	public Word[] extractBefore(char c) {
		return null;
	}

}
