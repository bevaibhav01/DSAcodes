package Myjava;

public class Postfix {
    public static void main(String[] args) {
        String r="a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPostfix(r));
        //ans= abcd^e-fgh*+^*+i-
        
    }
     static String infixToPostfix(String exp) {
        Stack<Character> list=new Stack<>();
        // Your code here
        String result="";
        for(int i=0;i<exp.length();i++){
            char r=exp.charAt(i);
            if(r=='('){
                list.push(r);
            }
          else if((r>='a' && r<='z')||(r>='A'&&r<='Z')){
                result+=r;
            }
          else if(r=='+'||r=='-'){
                
                    if(!list.isEmpty()){
                    char a=list.peek();
                    if(a=='^'||a=='*'||a=='/'||a=='+'||a=='-'){
                        result+=list.pop();
                        list.push(r);
                        
                    }
                    }
                    else 
                      list.push(r);
                    
                  
                
                
            }
            
            else if(r=='*'||r=='/'){
                if((!list.isEmpty())&&(list.peek()=='^'||list.peek()=='*'||list.peek()=='/'))
                {
                    result+=list.pop();
                    list.push(r);
                }
                else 
                list.push(r);
            }
            else if(r==')'){
                while(!list.isEmpty()){
                char c=list.pop();
                if(c=='(')
                 break;
                 else
                result+=c;
                }
            }
            else if(r=='^')
              list.push(r);
            
            
            
        }
        while(!list.isEmpty()){
            result+=list.pop();
        }
        return result;
    }
    
}
