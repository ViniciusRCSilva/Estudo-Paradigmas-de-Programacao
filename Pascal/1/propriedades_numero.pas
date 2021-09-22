// 1-Determinar se um número é par ou ímpar e positivo ou negativo.

Program Number;
var 
    num : integer;
Begin
    writeln ('Digite um numero: ');
    readln(num);
    
    if (num MOD 2 = 0) and (num >= 0) then
    	writeln('Par e positivo')
	else 
	    if (num MOD 2 = 0) and (num < 0) then
    		writeln('Par e negativo')
    	else 
	        if (num MOD 2 <> 0) and (num > 0) then
        		writeln('Impar positivo')
        	else 
            	if (num MOD 2 <> 0) and (num < 0) then
            		writeln('Impar e negativo');
End.
