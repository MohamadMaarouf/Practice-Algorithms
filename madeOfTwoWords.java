public class InterviewProgramTwo {

	public boolean isWholeWordMadeUpOfTwoWords(String word) {
	    int count = 0;
	    String testWord = "";
        for(char x : word.toCharArray()){
            testWord += x;
            if(Dictionary.isWord(testWord)){
                count++;
                testWord="";
            }
        }
        if(count==1){
            return true;
        }else{
            return false;
        }
    }
    public static void main (String [] args){
        InterviewProgramTwo mysolution = new InterviewProgramTwo();
        System.out.println(mysolution.isWholeWordMadeUpOfTwoWords("newspaper"));
    }
	
}