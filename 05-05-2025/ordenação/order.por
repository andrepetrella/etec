programa
{
	
	funcao inicio()
	{
		inteiro a, b, c
		escreva("Digite número 1: ")
		leia(a)
		escreva("Digite número 2: ")
		leia(b)
		escreva("Digite número 3: ")
		leia(c)
		
		// a = 1 -- b = 1 -- c = 2
	    se ((a < b || a == b) && (a < c || a == c)) {
	        se (b > c) {
	        	  se (a == c) {
	        	  	escreva(a + " " + c + " " + b)
	        	  }
	        	  senao {
	            	escreva(a + " " + c + " " + b)
	        	  }
	        }
	        senao se (c > b) {
	        	  se (a == b) {
	        	  	escreva(a + " " + b + " " + c)
	        	  }
	        	  senao {
	            	escreva(a + " " + b + " " + c)
	        	  }
	        }
	        senao {
	        	  escreva(a + " " + b + " " + c)
	        }
	    }
	    senao se ((b < a || b == a) && (b < c || b == c)) {
	        se (a > c) {
	        	  se (b == c) {
	        	  	escreva(b + " " + c + " " + a)
	        	  }
	        	  senao {
	            	escreva(b + " " + c + " " + a)
	        	  }
	        }
	        senao se (a < c) {
	        	  se (b == a) {
	        	  	escreva(b + " " + a + " " + c)
	        	  }
	        	  senao {
	            	escreva(b + " " + a + " " + c)
	        	  }
	        }
	        senao {
	        	escreva(a + " " + b + " " + c)
	        }
	    }
	    senao se ((c < a || c == a) && (c < b || c == b)) {
	        se (a > b) {
	        	  se (c == a) {
	            	escreva(c + " " + b + " " + a)
	        	  }
	        	  senao {
	        	  	escreva(c + " " + b + " " + a)
	        	  }
	        }
	        senao se (a < b) {
	        	  se (c == b) {
	        	  	escreva(c + " " + a + " " + b)
	        	  }
	        	  senao {
	             escreva(c + " " + a + " " + b)
	        	  }
	        }
	        senao {
	        	escreva(a + " " + b + " " + c)
	        }
	    }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 282; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */