# Variáveis
media = 0.0
soma_das_notas = 0.0
situacao = ""

# Loop para pegar as notas
for i in range(4):
    nota = float(input("Insira a nota " + i + ": "))
    if (nota <= 10 and nota > 0):
        soma_das_notas += nota
    else:
        print("Nota inválida...")
        i -= 1

# Calculando valores
media = soma_das_notas / 4
if (media >= 7):
    situacao = "Aprovado"
else:
    situacao = "Reprovado"