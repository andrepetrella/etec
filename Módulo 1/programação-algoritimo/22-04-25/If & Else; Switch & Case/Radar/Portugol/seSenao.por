programa
{
	
	funcao inicio()
	{
		inteiro valocidade_max = 50 // km/h
		inteiro multa = 0 // porcentagem
		real velocidade
		real total = 0.0
		cadeia mensagem = ("Multa: $" + total)
		escreva("Velocidade (km/h): ")
		leia(velocidade)
		
		se (velocidade > 0) {
		    se (velocidade > valocidade_max) {
		        se (velocidade <= (valocidade_max + 10)) { // 60
		            multa = 15
		        }
		        senao se (velocidade <= (valocidade_max + 20)) {
		            multa = 25
		        }
		        senao se (velocidade <= (valocidade_max + 30)) {
		            multa = 35
		        }
		        senao {
		            multa = 50
		        }
		        
		        total = (250 + ((250 * (multa / 100)))
		        escreva(mensagem)
		    }
		    senao {
		        escreva("Tudo OK. :)")
		    }
		}
		senao {
		    escreva("Erro. Velocidade precisa ser maior que 0.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 722; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */