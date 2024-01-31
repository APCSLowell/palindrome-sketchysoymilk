

public class Main {
 
	public static void main(final String[] args) {
		PalindromeChecker sim = new PalindromeChecker();
        	sim.tester();
	}
	public void setup()
{
  String lines[] = loadStrings("palindromes.txt");
  System.out.println("there are " + lines.length + " lines");
  for (int i=0; i < lines.length; i++) 
  {
    if (palindrome(lines[i])==true)
    {
      System.out.println(lines[i] + " IS a palindrome.");
    } else
    {
      System.out.println(lines[i] + " is NOT a palindrome.");
    }
  }
}
public String noSpaces(String sWord) {
  String nS = "";
  for (int i = 0; i < sWord.length(); i++) {
    if (sWord.charAt(i) == ' ')
      nS = nS + "";
    else
      nS = nS + sWord.charAt(i);
  }
  return nS;
}
public String onlyLetters(String sString) {
  String oL = "";
  for (int i = 0; i < sString.length(); i++) {
    if (Character.isLetter(sString.charAt(i)))
      oL = oL + sString.charAt(i);
  }
  return oL;
}
public String noCaps(String sWord){
  return sWord.toLowerCase();
}

public boolean palindrome(String word) {
  word = noSpaces(word);
  word = onlyLetters(word);
  word = noCaps(word);
  String hi = "";
  for (int i = word.length(); i > 0; i--) {
    hi = hi + word.substring(i-1, i);
  }
  if (hi.equals(word))
    return true;
  return false;
}
public String reverse(String str)
{
  String sNew = new String();
  for (int i = str.length(); i > 0; i--) {
    sNew = sNew + str.substring(i-1, i);
  }
  return sNew;
}


}

