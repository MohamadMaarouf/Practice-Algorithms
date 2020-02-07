/*
Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
*/
class RomanToInteger {
    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int result = 0;
        int i = 0;
        for (char ch : chars) {
            if (ch == 'I'){
                result = result+1;
            }
            else if(ch == 'V'){
                result = result +5;
                if(i>0){
                    if(chars[i-1]=='I'){
                        result=result-2;
                    }
                }
                
            }
            else if(ch == 'X'){
                result=result+10;
                if(i>0){
                    if(chars[i-1]=='I'){
                        result=result-2;
                    }
                }
            }
            else if(ch == 'L'){
                result = result +50;
                if(i>0){
                    if(chars[i-1]=='X'){
                        result=result-20;
                    }
                }
            }
            else if(ch == 'C'){
                result = result + 100;
                if(i>0){
                    if(chars[i-1]=='X'){
                        result=result-20;
                    }
                }
                
            }
            else if(ch == 'D'){
                if(i>0){
                    if(chars[i-1]=='C'){
                        result=result-200;
                    }
                }
                result=result+500;
            }
            else{
                if(i>0){
                    if(chars[i-1]=='C'){
                        result=result-200;
                    }
                }
                result=result+1000;
            }
            i++;
        }
        return result;
    }
    public static void main(String []args) {
        RomanToInteger mysolution = new RomanToInteger();
        System.out.println(mysolution.romanToInt("MVI"));
    }
}
