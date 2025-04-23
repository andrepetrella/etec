programa
{
	
	funcao inicio()
	{
		inteiro velocidade_max = 50
		inteiro multa = 0
		real total = 0.0
		real velocidade
		escreva("Velocidade (km/h): ")
		leia(velocidade)
		
		checarVelocidade(velocidade)
		
		funcao checarVelocidade(vel) {
		    se (vel > 0) {
		        se (vel > velocidade_max) {
		            inteiro casoS
		            
		            se (vel <= (velocidade_max + 10)) {
		                casoS = 1
		            }
		            senao se (vel <= (velocidade_max + 20)) {
		                casoS = 2
		            }
		            senao se (vel <= (velocidade_max + 30)) {
		                casoS = 3
		            }
		
		            escolha (casoS) {
		                caso 1:
		                    multa = 15
		                pare
		                caso 2:
		                    multa = 25
		                pare
		                caso 3:
		                    multa = 35
		                pare
		                caso contrario:
		                    multa = 50
		                pare
		            }
		
		            total = 250 + (250 * (multa / 100))
		            escreva("Multa: $" + total)
		
		        }
		        senao { // Ok
		            escreva("Tudo OK.")
		        }
		        
		    }
		    senao { // Erro
	            escreva("Erro. Velocidade precisa ser maior do que 0.")
	            retorne 0
	        }
		}
	}
}
