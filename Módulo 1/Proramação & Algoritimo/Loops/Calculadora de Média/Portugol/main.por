programa
{
	
	funcao inicio()
	{
		real soma_total_notas = 0.0
		real media = 0.0
		cadeia situacao
		
		para (inteiro i = 0; i < 4; i++) {
		    real nota_atual
		    escreva("Insira a nota " + (i + 1) + ": ")
		    leia(nota_atual)
		    se (nota_atual <= 10 e nota_atual > 0) {
		        soma_total_notas += nota_atual
		    }
		    senao {
		        escreva("Nota inválida.\n")
		        i -= 1
		    }
		}
		
		media = soma_total_notas / 4
		escreva("Média final: " + media)

		se (media >= 7) {
			situacao = "Aprovado"
		}
		senao {
			situacao = "Reprovado"
		}

		escreva("\n\nSituação: " + situacao + "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 615; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */