var idade, classificacao;

idade = parseInt(prompt("Insira a idade em questão: "));

if (idade > 0)
{
    if (idade > 18)
    {
        if (idade < 65)
        {
            classificacao = "Adulto-Jovem";
        }
        else
        {
            classificacao = "Idoso";
        }
    }
    else
    {
        classificacao = "Criança";
    }
}
else
{
    classificacao = "Não-Nascido";
}

console.log("Classificação: " + classificacao);